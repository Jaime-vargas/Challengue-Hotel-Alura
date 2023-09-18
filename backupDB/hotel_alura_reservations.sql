-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: hotel_alura
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `reservations`
--

DROP TABLE IF EXISTS `reservations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservations` (
  `id` int NOT NULL AUTO_INCREMENT,
  `checkInDate` date NOT NULL,
  `checkOutDate` date NOT NULL,
  `totalCost` decimal(8,2) DEFAULT NULL,
  `paymentMethod` set('Cash','Credit') DEFAULT NULL,
  `guestId` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `guestId` (`guestId`),
  CONSTRAINT `reservations_ibfk_1` FOREIGN KEY (`guestId`) REFERENCES `guests` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservations`
--

LOCK TABLES `reservations` WRITE;
/*!40000 ALTER TABLE `reservations` DISABLE KEYS */;
INSERT INTO `reservations` VALUES (1,'2023-08-20','2023-08-25',1580.00,'Cash',4),(5,'2023-07-21','2023-09-25',45000.00,'Credit',8),(6,'2023-08-28','2023-08-28',899.00,'Credit',8),(7,'2023-08-29','2023-08-28',1259.00,'Credit',8),(8,'2023-08-29','2023-08-28',1259.25,'Credit',8),(9,'2023-10-20','2023-09-15',766.99,'Credit',8),(11,'2023-09-15','2023-09-20',256.32,'Credit',4),(12,'2023-09-20','2023-09-15',66.66,'Credit',4),(13,'2023-07-21','2023-09-25',32980.00,'Credit',8),(14,'2023-09-17','2023-09-18',89.00,'Cash',11),(15,'2023-09-17','2023-09-18',89.00,'Cash',4),(16,'2023-09-17','2023-09-30',1157.00,'Cash',8),(17,'2023-09-17','2023-10-09',1958.00,'Cash',9),(18,'2023-09-17','2023-09-27',890.00,'Cash',12),(19,'2023-09-17','2023-09-30',2067.00,'Credit',12),(20,'2023-09-26','2023-09-29',477.00,'Cash',24),(21,'2023-09-17','2023-09-19',318.00,'Cash',26),(22,'2023-10-09','2023-10-18',1431.00,'Credit',24),(23,'2023-09-17','2023-09-28',979.00,'Cash',27),(24,'2023-09-19','2023-09-20',89.00,'Cash',4),(25,'2023-09-19','2023-09-22',477.00,'Credit',23);
/*!40000 ALTER TABLE `reservations` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-18 15:43:32
