INSERT INTO users (id, email, last_name, name, password) VALUES (1, 'admin@admin.com', 'Admin', 'Admin', '$2a$12$.ygeZibfNMAeR1pbP1C5Mu0okIbToAgbi.4vZaSPQzK4ZpywrIGjG');
INSERT INTO roles (id, name) VALUES (1, 'ADMIN'), (2, 'USER');
INSERT INTO users_roles VALUES (1, 1), (1, 2);
