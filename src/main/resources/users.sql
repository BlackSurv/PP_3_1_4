INSERT INTO roles (id, role_name) VALUES (1, 'ADMIN');
INSERT INTO roles (id, role_name) VALUES (2, 'USER');

INSERT INTO users (name, last_name, age, password, username, email) VALUES ('Ivan', 'Takaseev', 16, '$2a$12$XR.KKlxBx115y3FUqWtrC.mCi4N8Jb2rhAGAWHOqV4XdvlxAbUU5G', 'admin', 'admin@mail.com');
INSERT INTO users (name, last_name, age, password, username, email) VALUES ('Petya', 'Peterson', 32, '$2a$12$fx/dRyHFHX6990mO7L3v5e7QDXDSzgMnUJ8fWQ.xRcW.O24ip6TdW', 'user', 'user@mail.com');
INSERT INTO users (name, last_name, age, password, username, email) VALUES ('Fedorov', 'Kalashnikov', 44, 'fedor', 'fedor', 'fedor@mail.com');
INSERT INTO users (name, last_name, age, password, username, email) VALUES ('Tanya', 'Potterson', 20, 'tanya', 'tanya', 'tanya@mail.com');
INSERT INTO users (name, last_name, age, password, username, email) VALUES ('Dima', 'Pavlovsky', 25, 'dima', 'dima', 'dima@mail.com');

INSERT INTO users_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO users_roles (user_id, role_id) VALUES (1, 2);
INSERT INTO users_roles (user_id, role_id) VALUES (2, 2);
INSERT INTO users_roles (user_id, role_id) VALUES (3, 2);
INSERT INTO users_roles (user_id, role_id) VALUES (4, 2);
INSERT INTO users_roles (user_id, role_id) VALUES (5, 2);