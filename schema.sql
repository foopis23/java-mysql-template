-- this is an example schema
CREATE DATABASE IF NOT EXISTS exampledb;
use exampledb;

CREATE TABLE IF NOT EXISTS users (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO users (id, name) VALUES (1, "John Doe"), (2, "Jane Doe");
