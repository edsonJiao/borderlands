create database borderlands;
use borderlands;
create table address(
	id int primary key,
    school_name varchar(50),
    school_part varchar(50)
);
show tables;
create table admin(
	id int primary key,
    admin varchar(50) not null,
    password varchar(50) not null,
    name varchar(50) not null,
    address_id int,
    foreign KEY(address_id) REFERENCES address(id)
);
show tables;
create table message(
	id int primary key,
    date date,
    content varchar(200),
    admin_id int,
    foreign key(admin_id) references admin(id)
);
create table root(
	id int primary key,
    admin varchar(50),
    password varchar(50)
);
show tables;
create table picture(
	id int primary key,
    picture mediumblob,
    message_id int,
    foreign key(message_id) references message(id)
);