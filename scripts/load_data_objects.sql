use qsystemDB;

SET IDENTITY_INSERT production.persona ON;  

INSERT INTO production.persona(persona_id,dni,apellido_paterno,apellido_materno) VALUES(1,'40506080','Guerrero','Gonzales')
INSERT INTO production.persona(persona_id,dni,apellido_paterno,apellido_materno) VALUES(2,'40414243','Farfan','Guadalupe')
INSERT INTO production.persona(persona_id,dni,apellido_paterno,apellido_materno) VALUES(3,'43424140','Vargas','Risco')
INSERT INTO production.persona(persona_id,dni,apellido_paterno,apellido_materno) VALUES(4,'41516181','Pizarro','Bossio')

SET IDENTITY_INSERT production.persona OFF;  

SET IDENTITY_INSERT production.centro ON;  

INSERT INTO production.centro(centro_id,nombre) VALUES(1,'LURIN')
INSERT INTO production.centro(centro_id,nombre) VALUES(2,'ICA')
INSERT INTO production.centro(centro_id,nombre) VALUES(3,'TRUJILLO')
INSERT INTO production.centro(centro_id,nombre) VALUES(4,'HUANUCO')

SET IDENTITY_INSERT production.centro OFF;  

SET IDENTITY_INSERT production.firma ON;  

INSERT INTO firma (firma_id, firma_imagen, persona_id) 
SELECT 1, BulkColumn 
FROM Openrowset(Bulk 'C:\firmas\firma_paolo.jpg', Single_Blob) as image

INSERT INTO firma (firma_id, firma_imagen, persona_id) 
SELECT 2, BulkColumn 
FROM Openrowset(Bulk 'C:\firmas\firma_jefferson.jpg', Single_Blob) as image

INSERT INTO firma (firma_id, firma_imagen, persona_id) 
SELECT 3, BulkColumn 
FROM Openrowset(Bulk 'C:\firmas\firma_juan.jpg', Single_Blob) as image

INSERT INTO firma (firma_id, firma_imagen, persona_id) 
SELECT 4, BulkColumn 
FROM Openrowset(Bulk 'C:\firmas\firma_claudio.jpg', Single_Blob) as image

SET IDENTITY_INSERT production.firma OFF;

SET IDENTITY_INSERT production.comportamiento ON;  

INSERT INTO production.comportamiento(comportamiento_id,descripcion,centro_id,firma_id) VALUES(1,'Tomar la panamericana sur hasta Yanbal',1,1)
INSERT INTO production.comportamiento(comportamiento_id,descripcion,centro_id,firma_id) VALUES(2,'Irse toda la panamericana sur hasta el hotel Las Dunas',2,1)
INSERT INTO production.comportamiento(comportamiento_id,descripcion,centro_id,firma_id) VALUES(3,'Irse toda la panamericana norte hasta el balneario de Huanchaco',3,2)
INSERT INTO production.comportamiento(comportamiento_id,descripcion,centro_id,firma_id) VALUES(4,'Tomar la panamericana norte hasta Huaraz',4,2)

SET IDENTITY_INSERT production.comportamiento OFF;