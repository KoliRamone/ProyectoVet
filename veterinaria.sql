-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-10-2023 a las 16:54:38
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `veterinaria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `apellido` varchar(60) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `dirección` varchar(60) NOT NULL,
  `telefono` bigint(20) NOT NULL,
  `nombreAlt` varchar(60) NOT NULL,
  `telefonoAlt` bigint(20) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `dni`, `apellido`, `nombre`, `dirección`, `telefono`, `nombreAlt`, `telefonoAlt`, `estado`) VALUES
(1, 26785471, 'Gomez', 'Paula', 'san martin 333', 1123432453, 'Ruben caffieri', 1187689534, 1),
(2, 22656837, 'Lopez', 'Walter', 'asd 23', 1123435643, 'Ruben  cuevas', 115643786, 1),
(3, 23123213, 'lopez', 'pedro', 'asd', 11234, 'asd', 23132, 1),
(4, 34582953, 'Fernandez', 'Ezequiel', 'tunez 341', 1162515094, 'Ramon', 1154865798, 1),
(5, 40123432, 'Lozano', 'Daniela', 'San martin 767', 1145856545, 'Mariela Lozano', 1165859545, 1),
(6, 39586746, 'Figazzi', 'Antonella', 'Alberdi 2232', 1154852564, 'Matias', 1174895213, 1),
(7, 37564987, 'Scliar', 'Tobias', 'Alvarez thomas 231', 1154857744, 'Sofia', 1174897989, 1),
(8, 36569789, 'Galan', 'Macarena', 'Azcuenaga', 1146555879, 'Johana', 1166879911, 1),
(9, 28456654, 'ansalbo', 'Julian', 'Lacroze 453', 114522132, 'Federico', 1177874545, 1),
(10, 31525645, 'San Salvador', 'Rogelio', 'Jujuy 32', 1145889788, 'Walter', 1145752213, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascota`
--

CREATE TABLE `mascota` (
  `idMascota` int(11) NOT NULL,
  `alias` varchar(30) NOT NULL,
  `sexo` varchar(30) NOT NULL,
  `especie` varchar(30) NOT NULL,
  `raza` varchar(30) NOT NULL,
  `pelaje` varchar(30) NOT NULL,
  `fechaNac` date NOT NULL,
  `idCliente` int(11) NOT NULL,
  `estado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `mascota`
--

INSERT INTO `mascota` (`idMascota`, `alias`, `sexo`, `especie`, `raza`, `pelaje`, `fechaNac`, `idCliente`, `estado`) VALUES
(1, 'cachita', 'Hembra', 'Perro', 'pitbull', 'marron', '2021-10-02', 1, 0),
(2, 'cacho', 'Macho', 'Loro', 'guacamayo', 'verde', '2022-10-01', 2, 0),
(3, 'pepe', 'Macho', 'Loro', 'loro rey', 'dorado', '2018-10-06', 2, 0),
(4, 'neko', 'Hembra', 'Gato', 'siames', 'tricolor', '2014-10-05', 1, 1),
(5, 'tomas', 'Macho', 'Gato', 'siames', 'tricolor', '2012-10-06', 2, 1),
(6, 'oscarsito', 'Macho', 'Perro', 'callejero', 'negro', '2015-10-15', 1, 1),
(7, 'kala', 'Hembra', 'Perro', 'montes', 'naranja', '2020-10-16', 2, 1),
(9, 'nito', 'Macho', 'Hamster', 'peque', 'amarillo', '2023-10-05', 1, 1),
(11, 'sergio', 'Macho', 'Loro', 'OroVerde', 'verde', '2019-10-04', 4, 1),
(12, 'Pepito', 'Macho', 'Hamster', 'Ruso Enano', 'Naranja', '2022-06-02', 3, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamiento`
--

CREATE TABLE `tratamiento` (
  `idTrat` int(11) NOT NULL,
  `tipoTrat` varchar(30) NOT NULL,
  `descripcion` varchar(120) NOT NULL,
  `importe` double NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tratamiento`
--

INSERT INTO `tratamiento` (`idTrat`, `tipoTrat`, `descripcion`, `importe`, `estado`) VALUES
(1, 'Vacuna_rabia', 'Para vitar la enfermedad de la rabia', 5000, 1),
(2, 'Vacuna para parasitos', 'Para evitar parasitos', 4500, 1),
(3, 'Peinado', 'Peinar a la mascota\n', 2500, 1),
(4, 'Baño de mascota', 'Limpieza total y secado de la mascota', 7500, 1),
(5, 'Vacuna_Quintuple', 'Proteccion contra distintas enfermedades', 10000, 1),
(7, 'Corte de Pelo', 'Diferentes cortes de pelo para mascota', 3500, 1),
(8, 'Castracion', 'Castracion para hembras y machos', 25000, 1),
(9, 'Aplicacion de vitaminas', 'Diferentes compuestos para reforzar el organismo de la mascota', 7500, 1),
(10, 'Aplicacion de Pipeta', 'Control de pulgas y diferentes garrapatas', 6600, 1),
(11, 'Tratamiento Obesidad', 'DIferentes dietas y ejercicios para la salud de la mascota', 5000, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `visitamacostas`
--

CREATE TABLE `visitamacostas` (
  `idVisita` int(11) NOT NULL,
  `idMascota` int(11) NOT NULL,
  `fechaVisita` date NOT NULL,
  `peso` double NOT NULL,
  `Descripcion` varchar(200) NOT NULL,
  `idTrat` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `Enfermedad` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `visitamacostas`
--

INSERT INTO `visitamacostas` (`idVisita`, `idMascota`, `fechaVisita`, `peso`, `Descripcion`, `idTrat`, `estado`, `Enfermedad`) VALUES
(1, 4, '2023-10-12', 12, 'ddddddddddd', 5, 1, 0),
(2, 6, '2023-10-18', 10, 'tiene resfrio severo', 5, 1, 1),
(3, 5, '2023-10-18', 5, 'limpieza', 3, 1, 0),
(4, 4, '2023-10-24', 22, 'dasdadsd', 3, 1, 1),
(5, 6, '2023-10-26', 11, 'Esta muy saludable solo se le aplico vacuna', 5, 1, 0),
(6, 4, '2023-10-27', 11, 'Ejercicios breves y aplicacion de vitaminas', 11, 1, 1),
(7, 4, '2023-10-27', 10, 'Ejercicios mixtos de frecuencia lenta', 11, 1, 1),
(8, 4, '2023-10-27', 9, 'ejercicios mixtos de frecuencia media', 11, 1, 1),
(9, 4, '2023-10-27', 8.5, 'Control de estres por dificultad de hormonas', 11, 1, 1),
(10, 4, '2023-10-27', 8, 'ejercicios moderados ya que presenta buenos resultados', 11, 1, 1),
(11, 4, '2023-10-27', 7, 'muestra mejoras ya puede proceder a ejercicios rapidos', 11, 1, 1),
(12, 4, '2023-10-27', 6, 'Mejora muy rapido ya el gato es mas liviano', 11, 1, 0),
(13, 4, '2023-10-27', 4, 'El gato esta dentro de un peso normal se finaliza tratamiento', 11, 1, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD PRIMARY KEY (`idMascota`),
  ADD KEY `idCliente` (`idCliente`);

--
-- Indices de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  ADD PRIMARY KEY (`idTrat`);

--
-- Indices de la tabla `visitamacostas`
--
ALTER TABLE `visitamacostas`
  ADD PRIMARY KEY (`idVisita`),
  ADD KEY `idMascota` (`idMascota`),
  ADD KEY `idTrat` (`idTrat`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `mascota`
--
ALTER TABLE `mascota`
  MODIFY `idMascota` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  MODIFY `idTrat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `visitamacostas`
--
ALTER TABLE `visitamacostas`
  MODIFY `idVisita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD CONSTRAINT `mascota_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`);

--
-- Filtros para la tabla `visitamacostas`
--
ALTER TABLE `visitamacostas`
  ADD CONSTRAINT `visitamacostas_ibfk_1` FOREIGN KEY (`idMascota`) REFERENCES `mascota` (`idMascota`),
  ADD CONSTRAINT `visitamacostas_ibfk_2` FOREIGN KEY (`idTrat`) REFERENCES `tratamiento` (`idTrat`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
