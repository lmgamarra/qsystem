-- create database
CREATE DATABASE qsystemDB;

-- create schema
CREATE SCHEMA production;
go


-- create tables
CREATE TABLE production.persona (
	persona_id INT IDENTITY (1, 1) PRIMARY KEY,
	dni VARCHAR (8) NOT NULL,
	apellido_paterno VARCHAR (50) NOT NULL,
	apellido_materno VARCHAR (50) NOT NULL
);

CREATE TABLE production.centro (
	centro_id INT IDENTITY (1, 1) PRIMARY KEY,
	nombre VARCHAR (100) NOT NULL
);

CREATE TABLE production.firma (
	firma_id INT IDENTITY (1, 1) PRIMARY KEY,
	firma_imagen VARBINARY(MAX)	
);

CREATE TABLE production.comportamiento (
	comportamiento_id INT IDENTITY (1, 1) PRIMARY KEY,
	descripcion VARCHAR (255) NOT NULL
	centro_id INT NOT NULL,
	firma_id INT NOT NULL,
	FOREIGN KEY (centro_id) REFERENCES production.centro (centro_id) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY (firma_id) REFERENCES production.firma (firma_id) ON DELETE CASCADE ON UPDATE CASCADE
);
