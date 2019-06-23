-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: lotto
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `lotto`
--

DROP TABLE IF EXISTS `lotto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `lotto` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `numbers` varchar(100) NOT NULL,
  `round_no` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lotto`
--

LOCK TABLES `lotto` WRITE;
/*!40000 ALTER TABLE `lotto` DISABLE KEYS */;
INSERT INTO `lotto` VALUES (1,'10, 13, 17, 28, 39, 42',37),(2,'3, 9, 10, 26, 30, 44',37),(3,'6, 8, 29, 31, 34, 43',37),(4,'3, 16, 19, 24, 30, 34',0),(5,'3, 4, 7, 30, 40, 43',0),(6,'1, 2, 3, 4, 5, 6',0),(7,'1, 2, 3, 4, 5, 6',42),(8,'1, 2, 3, 4, 5, 6',0),(9,'1, 2, 3, 4, 5, 6',44),(10,'1, 2, 3, 4, 5, 6',45),(11,'5, 6, 10, 19, 20, 29',46),(12,'1, 2, 3, 4, 5, 6',47),(13,'1, 2, 3, 4, 5, 6',50),(14,'3, 5, 17, 28, 31, 38',67);
/*!40000 ALTER TABLE `lotto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-16 16:11:58