CREATE DATABASE  IF NOT EXISTS `project` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `project`;
-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: project
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `transactions`
--

DROP TABLE IF EXISTS `transactions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transactions` (
  `transaction_id` int NOT NULL AUTO_INCREMENT,
  `Cust_Id` int DEFAULT NULL,
  `Acct_id` int DEFAULT NULL,
  `start_bal` decimal(20,2) DEFAULT '0.00',
  `withdraw` decimal(20,2) DEFAULT '0.00',
  `deposit` decimal(20,2) DEFAULT '0.00',
  `end_bal` decimal(20,2) NOT NULL,
  PRIMARY KEY (`transaction_id`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transactions`
--

LOCK TABLES `transactions` WRITE;
/*!40000 ALTER TABLE `transactions` DISABLE KEYS */;
INSERT INTO `transactions` VALUES (1,1,2,1000.00,50.00,0.00,950.00),(2,2,4,100.00,75.00,0.00,25.00),(3,1,2,950.00,0.00,50.00,1000.00),(4,2,3,10000.00,100.00,0.00,9900.00),(5,2,3,9900.00,100.00,0.00,9800.00),(6,2,3,9800.00,100.00,0.00,9700.00),(7,2,4,25.00,0.00,100.00,125.00),(8,1,1,5000.00,55.00,0.00,4945.00),(9,1,1,4945.00,61.00,0.00,4884.00),(10,1,1,4884.00,75.00,0.00,4809.00),(11,2,4,125.00,0.00,75.00,200.00),(15,1,1,4809.00,109.00,0.00,4700.00),(16,2,4,200.00,0.00,109.00,309.00),(17,1,1,4700.00,50.00,0.00,4650.00),(18,2,4,309.00,0.00,50.00,359.00),(19,6,5,0.00,0.00,4000.00,4000.00),(20,7,6,0.00,0.00,300.00,300.00),(21,3,7,0.00,0.00,450.00,450.00),(22,4,8,0.00,0.00,4500.00,4500.00),(23,9,9,0.00,0.00,753.00,753.00),(24,1,1,4650.00,2000.00,0.00,2650.00),(25,1,2,1000.00,0.00,1000.00,2000.00),(26,1,1,2650.00,0.00,2.00,2652.00),(27,1,1,2652.00,45.00,0.00,2607.00),(28,1,2,2000.00,0.00,45.00,2045.00),(29,1,1,2607.00,2.00,0.00,2605.00),(30,1,2,2045.00,0.00,2.00,2047.00),(31,1,1,2605.00,56.00,0.00,2549.00),(32,1,2,2047.00,0.00,56.00,2103.00),(33,1,2,2103.00,45.00,0.00,2058.00),(34,2,4,359.00,0.00,45.00,404.00),(36,11,11,0.00,0.00,120450.00,120450.00),(37,12,12,0.00,0.00,500.00,500.00),(38,11,13,0.00,0.00,500900.00,500900.00),(39,2,4,404.00,80.00,0.00,324.00),(40,2,3,9700.00,0.00,10.00,9710.00),(41,2,3,9710.00,85.00,0.00,9625.00),(42,2,4,324.00,0.00,85.00,409.00),(44,2,3,9625.00,50.00,0.00,9575.00),(45,7,6,300.00,0.00,50.00,350.00),(46,13,14,0.00,0.00,450.00,450.00),(47,9,15,0.00,0.00,650.00,650.00),(48,6,5,4000.00,60.00,0.00,3940.00),(49,6,5,3940.00,0.00,80.00,4020.00),(50,6,5,4020.00,100.00,0.00,3920.00),(51,1,2,2058.00,0.00,100.00,2158.00),(52,2,3,9575.00,56.00,0.00,9519.00),(53,2,4,409.00,0.00,56.00,465.00),(54,14,16,0.00,0.00,250.00,250.00),(55,3,17,0.00,0.00,854.00,854.00),(56,13,18,0.00,0.00,450.00,450.00),(58,13,14,450.00,100.00,0.00,350.00),(59,12,12,500.00,0.00,100.00,600.00);
/*!40000 ALTER TABLE `transactions` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-12 16:38:03