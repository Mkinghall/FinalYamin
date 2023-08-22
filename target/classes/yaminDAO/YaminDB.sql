create database 'zumba2';
use zumba2;

GRANT CREATE, ALTER, DROP, INSERT, UPDATE, DELETE, SELECT, REFERENCES, RELOAD on *.* TO 'Master'@'localhost' WITH GRANT OPTION;

create table students (
sid int(11) NOT NULL AUTO_INCREMENT,
name varchar(25) NOT NULL,
email varchar(25) NOT NULL,
age int(11),
skill varchar(25),
PRIMARY KEY(sid)
);

create table batch(
bid int (11) NOT NULL,
batchName varchar(25) NOT NULL,
studentName varchar(256) NOT NULL,
skill varchar(25)

);

INSERT INTO students (name, email, age, skill) VALUES ('matt', 'matt@email.com', '7', 'Adept');