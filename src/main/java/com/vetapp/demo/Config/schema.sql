CREATE DATABASE vetapp;

USE vetapp;

CREATE TABLE customers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    phone_number VARCHAR(15) NOT NULL,
    address TEXT NOT NULL,
    visits INT NOT NULL DEFAULT 0
);

CREATE TABLE pets (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    breed VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    gender ENUM('M', 'F') NOT NULL,
    owner_id INT,
    FOREIGN KEY (owner_id) REFERENCES customers(id)
);

CREATE TABLE appointments (
    id INT AUTO_INCREMENT PRIMARY KEY,
    date_time DATETIME NOT NULL,
    customer_id INT,
    FOREIGN KEY (customer_id) REFERENCES customers(id)
);

CREATE TABLE appointment_pets (
    appointment_id INT,
    pet_id INT,
    PRIMARY KEY (appointment_id, pet_id),
    FOREIGN KEY (appointment_id) REFERENCES appointments(id),
    FOREIGN KEY (pet_id) REFERENCES pets(id)
);

CREATE TABLE medical_conditions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    pet_id INT,
    FOREIGN KEY (pet_id) REFERENCES pets(id)
);

CREATE TABLE medications (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    appointment_questionnaire_id INT
);

CREATE TABLE allergies (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    appointment_questionnaire_id INT
);

CREATE TABLE vaccinations (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    appointment_questionnaire_id INT
);

CREATE TABLE appointment_questionnaires (
    id INT AUTO_INCREMENT PRIMARY KEY,
    pet_name VARCHAR(255) NOT NULL,
    owner_name VARCHAR(255) NOT NULL,
    breed VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    gender ENUM('M', 'F') NOT NULL,
    appointment_id INT,
    pet_id INT,
    customer_id INT,
    FOREIGN KEY (appointment_id) REFERENCES appointments(id),
    FOREIGN KEY (pet_id) REFERENCES pets(id),
    FOREIGN KEY (customer_id) REFERENCES customers(id)
);

ALTER TABLE medications
ADD FOREIGN KEY (appointment_questionnaire_id) REFERENCES appointment_questionnaires(id);

ALTER TABLE allergies
ADD FOREIGN KEY (appointment_questionnaire_id) REFERENCES appointment_questionnaires(id);

ALTER TABLE vaccinations
ADD FOREIGN KEY (appointment_questionnaire_id) REFERENCES appointment_questionnaires(id);
