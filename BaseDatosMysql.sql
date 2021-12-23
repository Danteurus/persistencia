CREATE DATABASE IF NOT EXISTS PDocker;

USE PDocker;

## CREACIÓN DE TABLA
CREATE TABLE IF NOT EXISTS libro(
	id SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    titulo varchar(40) NOT NULL,
    autor varchar(30) NOT NULL,
    descripcion varchar(200) NOT NULL
);

INSERT into libro
values(1,"Shadow Hunters","Cassandra Clare","Primera Entrega Version 1 de Shadow Hunters");

INSERT into libro
values(2,"Los cinco Anillos","Miyamoto Musashi","Relatos de la experiencia y conocimiento del unico samurai que murio de vejez");

CREATE USER 'admin'@'172.17.0.1' IDENTIFIED BY 'admin';
GRANT ALL PRIVILEGES ON *.* TO 'admin'@'172.17.0.1' WITH GRANT OPTION;

SELECT * FROM libro;