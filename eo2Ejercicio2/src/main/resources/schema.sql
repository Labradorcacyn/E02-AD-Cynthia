CREATE TABLE product (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    price REAL        NOT NULL,
    image TEXT,
    description TEXT,
    PRIMARY KEY (id)
);

insert into product values(1, 'Gel', 2.50, 'img', 'Gel de baño');

select * from product;