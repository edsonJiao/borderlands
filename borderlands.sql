create database borderlands;
use borderlands;
create table address(
	id int primary key auto_increment,
    school_name varchar(50),
    school_part varchar(50)
);
show tables;
create table admin(
	id int primary key  auto_increment,
    admin varchar(50) not null,
    password varchar(50) not null,
    name varchar(50) not null,
    address_id int,
    foreign KEY(address_id) REFERENCES address(id)
);
show tables;
create table message(
    id int primary key  auto_increment,
    date date,
    message_title varchar(100),
    content varchar(200),
    admin_id int,
    foreign key(admin_id) references admin(id)
);
create table root(
	id int primary key  auto_increment,
    admin varchar(50),
    password varchar(50)
);
show tables;
create table picture(
	id int primary key  auto_increment,
    picture mediumblob,
    message_id int,
    foreign key(message_id) references message(id)
);
create table temp_message(
    id int primary key  auto_increment,
    tag int not null DEFAULT 0,
    date date,
    message_title varchar(100),
    content varchar(200),
    admin_id int,
    foreign key(admin_id) references admin(id)
);
alter database borderlands charset utf8;
alter table admin CONVERT TO CHARACTER SET utf8;
alter table address CONVERT TO CHARACTER SET utf8;
alter table picture CONVERT TO CHARACTER SET utf8;
alter table root CONVERT TO CHARACTER SET utf8;
alter table message CONVERT TO CHARACTER SET utf8;
alter table temp_message CONVERT TO CHARACTER SET utf8;
insert into address(school_name,school_part) values('青岛大学','崂山校区');
