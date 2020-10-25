create table categories(
    category_id serial not null,
    category_name varchar(255),
    category_description text,
    primary key(category_id)
);

create table products(
product_id serial not null,
product_name varchar(255),
category_id serial,
unit_price int,
description text,
company_id serial,
production_date date,
expire_date date,
volume float,
barcode int,
primary key(product_id)
);


alter table products add constraint fk1  foreign key(category_id) references categories(category_id);

create table customer(
customer_id serial not null,
customer_name varchar(255) ,
customer_email varchar(255) not null,
customer_phone varchar(255) not null,
payment_id serial ,
primary key(customer_id)
);

alter table customer
	add token varchar(255);

create unique index customer_token_uindex
	on customer (token);