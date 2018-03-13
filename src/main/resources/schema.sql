

CREATE DATABASE  IF NOT EXISTS `xxxx`;
USE `xxxx`;






DROP TABLE IF EXISTS `post`;

CREATE TABLE `post` (
  `post_id` bigint  NOT NULL AUTO_INCREMENT,
  `author` varchar(225) DEFAULT NULL,
  `title` varchar(225) DEFAULT NULL,
  `body` varchar(225) DEFAULT NULL,
  `posted_on` TIMESTAMP,


  PRIMARY KEY (`post_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;