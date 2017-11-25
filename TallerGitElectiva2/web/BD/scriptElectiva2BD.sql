create database electiva2;
use electiva2;

create table User
  (
  id_user varchar(3) primary key not null,
  nombre varchar(30) not null,
  apellido varchar(30) not null,
  edad numeric(2,0) not null,
  password varchar(40) not null
  );

create table Product
  (
  nombreProduct varchar(30),
  costo numeric(6,0),
  url varchar(60)
  );

  insert into User
    (id_user,nombre,apellido,edad,password) values
    ("001","juan","caceres",22,md5("juan123")),
    ("002","david","lara",23,md5("david123")),
    ("003","alx","ds",21,md5("alx123")),
    ("004","gonzalo","diaz",23,md5("gonzo123")),
    ("005","juan","aponte",22,md5("juanaponte123")),
    ("006","deicy","rojas",20,md5("deicy123")),
    ("007","mireya","rosas",26,md5("mireya123")),
    ("008","laura","tinjaca",21,md5("laura123")),
    ("009","camilo","diaz",20,md5("camilo123")),
    ("010","ernesto","castellanos",25,md5("ernesto123"));

insert into Product
  (nombreProduct,costo,url) values
  ("granos",1000,"\web\imagenes\arroz.jpg"),
  ("carnes",1000,"\web\imagenes\carne.png"),
  ("motos",1000,"\web\imagenes\moto.jpg"),
  ("carros",1000,"\web\imagenes\carro.jpg");
