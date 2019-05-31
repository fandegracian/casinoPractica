CREATE USER casinovirtual@'localhost' IDENTIFIED BY 'casinovirtual';
GRANT ALL PRIVILEGES ON * . * TO casinovirtual@'localhost';
FLUSH PRIVILEGES;

CREATE SCHEMA casinovirtual;
USE casinovirtual;

CREATE TABLE registro(
	nombre varchar(45),
    usuario varchar(45),
    contrasena varchar(45),
    edad int(3)
);

SELECT *
FROM registro;







