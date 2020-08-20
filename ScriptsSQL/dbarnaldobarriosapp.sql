drop database if exists dbarnaldobarriosapp;

create database if not exists dbarnaldobarriosapp;
use dbarnaldobarriosapp;

create table if not exists persona(
   idPersona integer not null primary key,
   nombre varchar(1000) not null,
   apellido varchar(1000) not null,
   correoElectronico varchar(1000) not null
);