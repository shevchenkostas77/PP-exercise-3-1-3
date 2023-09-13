package ru.kata.spring.boot_security.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.dao.RoleDao;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    @Override
    public List<Role> getAllRoles() {
        return roleDao.findAll();
    }

    @Override
    public List<Role> getRolesById(List<Long> selectedRoles) {
        return roleDao.findAllById(selectedRoles);
    }
}
