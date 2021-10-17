CREATE TABLE country (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    PRIMARY KEY (id)
);
insert into country values (1, 'España');
insert into country values (2, 'Alemania');

select * from country;