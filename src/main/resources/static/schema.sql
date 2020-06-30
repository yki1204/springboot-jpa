CREATE DATABASE bootstudy;

USE bootstudy;

DROP TABLE if EXISTS member;
DROP TABLE if EXISTS company;
DROP TABLE if EXISTS order_info;

CREATE TABLE `member` (
	`id` BIGINT(20)  NOT NULL PRIMARY KEY,
	`name` VARCHAR(100) NOT NULL,
	`age` INT(3),
	`company_id` BIGINT(20) NOT NULL
);

CREATE TABLE `company` (
	`id` BIGINT(20)  NOT NULL PRIMARY KEY,
	`name` VARCHAR(100) NOT NULL
);

CREATE TABLE `order_info` (
	`id` BIGINT(20)  NOT NULL PRIMARY KEY,
	`product` VARCHAR(100),
	`price` BIGINT(10),
	`member_id` BIGINT(20) NOT NULL
);