CREATE DATABASE IF NOT EXISTS TEST;
USE TEST;

CREATE TABLE USER(
	ID INT PRIMARY KEY,
	NAME VARCHAR(20),
	LASTNAME VARCHAR(20),
	AGE INT,
	BORN_DATE DATE
);