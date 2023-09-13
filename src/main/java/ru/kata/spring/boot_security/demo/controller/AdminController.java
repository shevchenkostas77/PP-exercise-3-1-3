package ru.kata.spring.boot_security.demo.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.RoleService;
import ru.kata.spring.boot_security.demo.service.UserService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {
    private final UserService userServiceImpl;
    private final RoleService roleServiceImpl;

    @GetMapping
    public String startPageView() {
        return "admin/admin-page";
    }

    @GetMapping("add")
    public String addUserForm(Model model, User user) {
        model.addAttribute("allRoles", roleServiceImpl.getAllRoles());
        return "admin/add";
    }

    @PostMapping
    public String createUser(User user,
                             @RequestParam(value = "selectedRoles", required = false) List<Long> selectedRoles) {

        if (selectedRoles != null) {
            List<Role> rolesToAdd = roleServiceImpl.getRolesById(selectedRoles);
            user.getRoles().addAll(rolesToAdd);
        }
        userServiceImpl.create(user);
        return "redirect:/admin/all";
    }

    @GetMapping("all")
    public String readAllUsers(Model model) {
        model.addAttribute("users", userServiceImpl.readAll());
        return "admin/all";
    }

    @GetMapping("/edit")
    public String editUsersTable(Model model) {
        model.addAttribute("users", userServiceImpl.readAll());
        return "admin/edit-table";
    }

    @GetMapping("/edit/{id}")
    public String editUserForm(@PathVariable Long id, Model model) {
        User user = userServiceImpl.read(id);
        Set<Role> userRoles = new HashSet<>(user.getRoles());
        List<Role> allRoles = roleServiceImpl.getAllRoles();

        model.addAttribute("user", user);
        model.addAttribute("userRoles", userRoles);
        model.addAttribute("allRoles", allRoles);

        return "admin/edit";
    }

    @PatchMapping("/edit/{id}")
    public String updateUser(@PathVariable Long id,
                             User user,
                             @RequestParam(value = "selectedRoles", required = false) List<Long> selectedRoles) {
        User existingUser = userServiceImpl.read(id);

        existingUser.setName(user.getName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());

        existingUser.getRoles().clear();
        if (selectedRoles != null) {
            List<Role> rolesToAdd = roleServiceImpl.getRolesById(selectedRoles);
            existingUser.getRoles().addAll(rolesToAdd);
        }

        userServiceImpl.updateUser(existingUser);

        return "redirect:/admin/edit";
    }

    @GetMapping("/delete")
    public String deleteUsersTable(Model model) {
        model.addAttribute("users", userServiceImpl.readAll());
        return "admin/delete";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable(value = "id") long id) {
        userServiceImpl.delete(id);
        return "redirect:/admin/delete";
    }
}
