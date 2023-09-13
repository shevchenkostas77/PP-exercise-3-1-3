## Практическая задача 3.1.3

### Задание:
Задание:
1. Перенесите классы и зависимости из предыдущей задачи.
2. Создайте класс Role и свяжите User с ролями так, чтобы юзер мог иметь несколько ролей.
3. Имплементируйте модели Role и User интерфейсами GrantedAuthority и UserDetails соответственно. Измените настройку секьюрности с inMemory на userDetailService.
4. Все CRUD-операции и страницы для них должны быть доступны только пользователю с ролью admin по url: /admin/.
5. Пользователь с ролью user должен иметь доступ только к своей домашней странице /user, где выводятся его данные. Доступ к этой странице должен быть только у пользователей с ролью user и admin. Не забывайте про несколько ролей у пользователя!
6. Настройте logout с любой страницы с использованием возможностей thymeleaf.
7. Настройте LoginSuccessHandler так, чтобы админа после аутентификации направляло на страницу /admin, а юзера на его страницу /user.

Скриншоты готового задания:

<a href="https://ibb.co/Lgq5XHj"><img src="https://i.ibb.co/KsQwpS4/2023-09-13-19-44-38.png" alt="2023-09-13-19-44-38" border="0" /></a>
<br><br>
<a href="https://ibb.co/vq7jCrL"><img src="https://i.ibb.co/Syh3D1V/2023-09-13-19-44-46.png" alt="2023-09-13-19-44-46" border="0" /></a>
<br><br>
<a href="https://ibb.co/CM0gdq6"><img src="https://i.ibb.co/RBHfn1N/2023-09-13-19-45-04.png" alt="2023-09-13-19-45-04" border="0" /></a>
<br><br>
<a href="https://ibb.co/3RrrhS9"><img src="https://i.ibb.co/NTVVYWd/2023-09-13-19-45-56.png" alt="2023-09-13-19-45-56" border="0" /></a>
<br><br>
<a href="https://ibb.co/qd2kn6Y"><img src="https://i.ibb.co/vHMZB94/2023-09-13-19-47-47.png" alt="2023-09-13-19-47-47" border="0" /></a>
<br><br>
<a href="https://ibb.co/ncrwMdr"><img src="https://i.ibb.co/yy0NFv0/2023-09-13-19-50-27.png" alt="2023-09-13-19-50-27" border="0" /></a>
<br><br>
<a href="https://ibb.co/wLDHbb0"><img src="https://i.ibb.co/H2mvMMF/2023-09-13-19-50-34.png" alt="2023-09-13-19-50-34" border="0" /></a>
<br><br>
<a href="https://ibb.co/d7fmCWB"><img src="https://i.ibb.co/M9gBw2n/2023-09-13-19-51-21.png" alt="2023-09-13-19-51-21" border="0" /></a>
<br><br>
<a href="https://ibb.co/6JQ98vm"><img src="https://i.ibb.co/4gkv2s7/2023-09-13-19-55-47.png" alt="2023-09-13-19-55-47" border="0" /></a>