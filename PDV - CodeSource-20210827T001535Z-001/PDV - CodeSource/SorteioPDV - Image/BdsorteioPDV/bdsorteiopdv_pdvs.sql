-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: 127.0.0.1    Database: bdsorteiopdv
-- ------------------------------------------------------
-- Server version	5.7.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `pdvs`
--

DROP TABLE IF EXISTS `pdvs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pdvs` (
  `id_pdv` int(11) NOT NULL,
  `nome_pdv` varchar(255) NOT NULL,
  `endereco` varchar(255) NOT NULL,
  `bairro` varchar(30) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `id_regional` int(11) DEFAULT NULL,
  `rota` int(5) NOT NULL,
  `cidade_pdv` varchar(45) NOT NULL,
  PRIMARY KEY (`id_pdv`),
  KEY `id_regional_idx` (`id_regional`),
  CONSTRAINT `id_regional` FOREIGN KEY (`id_regional`) REFERENCES `regional` (`id_regional`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pdvs`
--

LOCK TABLES `pdvs` WRITE;
/*!40000 ALTER TABLE `pdvs` DISABLE KEYS */;
INSERT INTO `pdvs` VALUES (1111,'Bar da Maria','Rua 1','Centro','(63) 32223-3232',1,1,''),(1122,'Bar do José','Rua 2','Nova Esperança','(63) 21321-3213',2,2,''),(3332,'Churracaria da Helo','Rua Francisco Rodrigues da Fonseca','Centro','(21) 32132-1312',5,2,'Potengi'),(3456,'Bar do Miguel','Rua Moraes Moreira','Vila União','(63) 54324-3243',3,4,''),(23212,'Yargo','Rua C161','Jardim America','(34) 73264-3827',4,2,'Goiania'),(42334,'Ramom','Rua F 63','Setor Faiçalville','(32) 42342-3423',2,4,'Goiania'),(92872,'Bar do Fabio','Rua Guapo','Centro','(32) 43243-2423',1,3,''),(98765,'Bar do Ramom','Rua 1022','Pedro','(63) 54832-7463',1,3,'Goiania'),(123456,'joao','teste ','teste','(34) 36243-2643',2,6,'teste'),(162312,'Bar da Juniette','Av. José Moraes','Centro','(36) 53653-6323',3,5,'Goiânia');
/*!40000 ALTER TABLE `pdvs` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-19 14:06:40
