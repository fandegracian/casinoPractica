CREATE USER casinovirtual@'localhost' IDENTIFIED BY 'casinovirtual';
GRANT ALL PRIVILEGES ON * . * TO casinovirtual@'localhost';
FLUSH PRIVILEGES;

CREATE SCHEMA casinovirtual;

CREATE TABLE registro(
	nombre varchar(45),
    usuario varchar(45),
    contraseña varchar(45),
    edad int(3),
    dinero int(6)
);

insert into registro values('pepe','pepe123','pepe123',45,344)



