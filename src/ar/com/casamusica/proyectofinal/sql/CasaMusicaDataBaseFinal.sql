create database casamusica;
use casamusica;


create table instrumentos(id int primary key not null,nombre varchar(50),tipo varchar(50),marca varchar(50), precio double);

create table amplificadores(id int primary key not null,tipo varchar(50), marca varchar(50), precio double);

create table clientes(nombre varchar(50) not null ,dni int(8) not null,telefono int (10), email varchar(50), 
direccion varchar(50), primary key(nombre,dni));

create table pedidos(id_pedido int primary key auto_increment,cliente_nombre varchar(50),cliente_dni int(8) not null, 
id_instrumento int, id_amplificador int, foreign key(cliente_nombre,cliente_dni) references clientes(nombre,dni),
foreign key(id_instrumento) references instrumentos(id), foreign key(id_amplificador) references amplificadores(id));

create table carrito (
    id int,
    nombre varchar(50),
    tipo varchar(50),
    marca varchar(50),
    precio double,
    Total double);


select * from carrito;
UPDATE carrito
SET Total = (SELECT SUM(precio) FROM carrito);
SELECT Total FROM carrito ORDER BY id DESC LIMIT 1;


show tables;


insert into instrumentos values (101,"Guitarra","Electrica","Gibson Es335",150.0),(120,"Guitarra","Acustica","Yamaha F310tbs",125.5),
                                (105,"Teclado","Arranjador","Roland Ex20",115.7),(125,"Bateria","Export","Pearl Exx725",146.0),
                                (165,"Bombo","24''","Maxtone",139.9),(130,"Violin","Barroco","Yamaha V10y",166.4);

select * from instrumentos;

insert into amplificadores values (200,"Altavoz Companion 50","Bose",99.9),(210,"Parlante Irx 108bt","JBL",110),(205,"Amplificador Ms-4","Marshall",203.6),
				 (276,"Microfono Nt1","Rode",77.8), (255,"Microfono Cardioide Pga58","Shure",82.5),
                                 (236,"Parlante portatil Xtreme 2","JBL",82.1);
                                  
select * from amplificadores;
select * from clientes;
