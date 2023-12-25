create database casamusica;
use casamusica;


create table instrumentos(id int primary key not null,nombre varchar(50),tipo varchar(50),marca varchar(50));

create table amplificadores(id int primary key not null,tipo varchar(50), marca varchar(50));

create table clientes(nombre varchar(50) not null ,dni int(8) not null,telefono int (10), email varchar(50), 
direccion varchar(50), primary key(nombre,dni));

create table pedidos(id_pedido int primary key auto_increment,cliente_nombre varchar(50),cliente_dni int(8) not null, 
id_instrumento int, id_amplificador int, foreign key(cliente_nombre,cliente_dni) references clientes(nombre,dni),
foreign key(id_instrumento) references instrumentos(id), foreign key(id_amplificador) references amplificadores(id));


show tables;


insert into instrumentos values 
(12,"guitarra","electrica","Tender"),(25,"guitarra","clasica","CasaNuñez"),(36,"piano","vertical","Yamaha"),
(65,"Bateria","percusion","Pearl");

insert into amplificadores values (76,"microfono","Shure"),(10,"parlante","JBL"),
(5,"amplificador guitarra","Marshall");

insert into clientes values ("Luis","89457632","1545901324","luis@gmail.com","av Santa fe 1345"),
("Mari
a","40911489","1547459237","maria56@gmail.com","Chile 382"),
("ALberto","09137854","1590342214","albertoY@gmail.com","av Coronel Diaz 1078"),
("Cristian","40379153","1590156602","cristian_@gmail.com","Trelles 649");


insert into pedidos values (1,'maria','40911489',12,5);
insert into pedidos values ('','luis','89457632',36,null);
insert into pedidos values ('','luis','89457632',65,null);
insert into pedidos values ('','luis','89457632',null,10);


-- querys
select*from clientes;
select*from amplificadores;
select*from instrumentos;
select*from pedidos;


select p.id_pedido as NroPedido,
       c.nombre as Cliente,
       i.nombre as instrumento,
       i.tipo as tipoinstrumento
from   pedidos p
inner  join clientes c on p.cliente_nombre = c.nombre
inner  join instrumentos i on p.id_instrumento = i.id;


select p.id_pedido as NroPedido,
       c.nombre as Cliente,
       i.nombre as instrumento,
       i.tipo as Tipoinstrumento,
       a.tipo as Amplificador
from   pedidos p
inner  join clientes c on p.cliente_nombre = c.nombre
inner  join instrumentos i on p.id_instrumento = i.id
inner  join amplificadores a on p.id_amplificador = a.id;


select  p.id_pedido as NroPedido,
        c.nombre as Cliente,
        a.tipo as Amplificador
from    pedidos p
inner   join clientes c on p.cliente_nombre = c.nombre
inner   join amplificadores a on p.id_amplificador = a.id;



drop database casamusica;
