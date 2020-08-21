drop table if exists persona;
drop database if exists dbarnaldobarriosapp;

create database if not exists dbarnaldobarriosapp;
use dbarnaldobarriosapp;

create table if not exists persona(
   idPersona long not null auto_increment primary key,
   identificacion varchar(20) not null unique,
   tipo_identificacion varchar(20) not null,
   nombres varchar(60) not null,
   apellidos varchar(60) not null,
   telefono varchar(20) not null unique,
   correo_electronico varchar(60) not null unique,
   edad varchar(3) not null,
   ciudad varchar(60) not null,
   ocupacion varchar(100) not null
);