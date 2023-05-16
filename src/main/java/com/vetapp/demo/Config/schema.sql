CREATE DATABASE vetapp;

USE vetapp;

CREATE TABLE appointments (
  id INT PRIMARY KEY AUTO_INCREMENT,
  date DATE NOT NULL,
  time TIME NOT NULL,
  animal_name VARCHAR(255) NOT NULL,
  animal_type VARCHAR(255) NOT NULL,
  reason VARCHAR(255) NOT NULL
);
