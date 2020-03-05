/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.26 : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `test`;

/* Procedure structure for procedure `create_data_logstash` */

/*!50003 DROP PROCEDURE IF EXISTS  `create_data_logstash` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`skip-grants user`@`skip-grants host` PROCEDURE `create_data_logstash`(testcount INT)
BEGIN
DECLARE i INT DEFAULT 0;
WHILE i<testcount
DO
INSERT INTO t_blog (title, author, content)
VALUES
(
concat('我和我的spring视频',i),
concat('张三',i),
'8、Spring事务中有哪几种事务传播行为？在TransactionDefinition接口中定义了7个表示事务传播行为的常量。1、支持当前事务的情况：PROPAGATION_REQUIRED：如果当前存在事务，则加入该事务；如果当前没有事务，则创建一个新的事务。PROPAGATION_SUPPORTS： 如果当前存在事务，则加入该事务；如果当前没有事务，则以非事务的方式继续运行。PROPAGATION_MANDATORY： 如果当前存在事务，则加入该事务；如果当前没有事务，则抛出异常。（mandatory：强制性）。2、不支持当前事务的情况：PROPAGATION_REQUIRES_NEW： 创建一个新的事务，如果当前存在事务，则把当前事务挂起。PROPAGATION_NOT_SUPPORTED： 以非事务方式运行，如果当前存在事务，则把当前事务挂起。PROPAGATION_NEVER： 以非事务方式运行，如果当前存在事务，则抛出异常。3、其他情况：PROPAGATION_NESTED： 如果当前存在事务，则创建一个事务作为当前事务的嵌套事务来运行；如果当前没有事务，则该取值等价于PROPAGATION_REQUIRED。'
);
SET i=i+1;
END WHILE;
END */$$
DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
