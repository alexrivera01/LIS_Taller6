create table PLAN
(
	ID VARCHAR(50) not null primary key,
	NOMBRE VARCHAR(50),
	DESCRIPCION VARCHAR(50),
	RANGOEDAD1 VARCHAR(50),
	RANGOEDAD2 VARCHAR(50)
);

create table CLIENTE
(
    ID VARCHAR(50) not null primary key,
    NOMBRES VARCHAR(50),
    APELLIDOS VARCHAR(50),
    EMAIL VARCHAR(50),
    GENERO VARCHAR(50),
    EDAD VARCHAR(50)
);

insert into CLIENTE Values('10','Alexander','Rivera','alex@gmail.com','Masculino','22');
insert into CLIENTE Values('11','Sandra','Rivera','sandra@gmail.com','Femenino','34');

insert into PLAN Values('0012','Plan Popayán - Purace','Conocer el avistamiento','19','35');
insert into PLAN Values('0013','Plan Popayán - Cali','Conocer Cali','11','30');

select * from CLIENTE;
select * from PLAN;