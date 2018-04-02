CREATE TABLE `cliente` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  `apellido` varchar(100) DEFAULT NULL,
  `genero` varchar(20) DEFAULT NULL,
  `profesion` varchar(100) DEFAULT NULL,
  `numeromovil` varchar(20) DEFAULT NULL,
  `publicidad` tinyint(1) DEFAULT NULL,
  `correo` varchar(100) DEFAULT NULL,
  `nrodoc` varchar(10) DEFAULT NULL,
  `canthijos` int(11) DEFAULT NULL,
  `fecnac` datetime DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;