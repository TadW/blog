

CREATE DATABASE  IF NOT EXISTS `blog`;
USE `blog`;


DROP TABLE IF EXISTS `post`;

CREATE TABLE `post` (
  `post_id` bigint  NOT NULL AUTO_INCREMENT,
  `author` varchar(225) DEFAULT NULL,
  `title` varchar(225) DEFAULT NULL,
  `body` TEXT(10000) DEFAULT NULL,
  `posted_on` TIMESTAMP,


  PRIMARY KEY (`post_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;



DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `user_id` bigint  NOT NULL AUTO_INCREMENT,
  `email` varchar(225) DEFAULT NULL,
  `password` varchar(225) DEFAULT NULL,
  `full_name` TEXT(10000) DEFAULT NULL,


  PRIMARY KEY (`user_id`)

) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;



DROP TABLE IF EXISTS `roles`;

CREATE TABLE `roles` (
  `role_id` bigint  NOT NULL AUTO_INCREMENT,
  `role` varchar(225) DEFAULT NULL,



  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `users_roles`;

CREATE TABLE  IF NOT EXISTS `users_roles` (
  `user_id` bigint    REFERENCES users (user_id),
  `role_id` bigint    REFERENCES roles (role_id),

  PRIMARY KEY (user_id, role_id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;





