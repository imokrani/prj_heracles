-- create database heracles_atelier character set UTF8;
USE heracles_atelier;
-- On

CREATE INDEX idatelierindex ON atelier(idatelier) ;
DROP TABLE IF EXISTS atelier;
CREATE TABLE atelier
(
    idatelier SMALLINT NOT NULL AUTO_INCREMENT,
    nom VARCHAR(30),
    description VARCHAR(255),
    objectif VARCHAR,
    dtcreation DATETIME,
    dtmaj DATETIME,
    PRIMARY KEY (idatelier)
);

/*select * from atelier;*/