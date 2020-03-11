SELECT * FROM MULTA;
SELECT * FROM USUARIO;
SELECT * FROM vigilante;

new database clientes;

Insert Into Usuario Values(5,'Camila','Rivera','Mujer','1983-12-14','Administrativo','Inactivo');

Insert Into Multa Values(1,98,'2020-02-02','09:09:09');


SELECT COUNT(MID) AS cantidad FROM multa;

SELECT * FROM PLAN;
SELECT * FROM clientE;

insert into CLIENTE Values('10','Alexander','Rivera','alex@gmail.com','Masculino','22');
insert into CLIENTE Values('11','Sandra','Rivera','sandra@gmail.com','Femenino','34');

insert into PLAN Values('0012','Plan Popayán - Purace','Conocer el avistamiento','19','35');
insert into PLAN Values('0013','Plan Popayán - Cali','Conocer Cali','11','30');

insert into PLAN Values('2','1','1','2','2');

create table PLAN
(
	ID VARCHAR(50) not null primary key,
	NOMBRE VARCHAR(50),
	DESCRIPCION VARCHAR(50),
	RANGOEDAD1 VARCHAR(50),
	RANGOEDAD2 VARCHAR(50)
);