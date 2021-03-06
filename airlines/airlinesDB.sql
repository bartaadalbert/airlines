-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Mar 06, 2021 at 12:19 PM
-- Server version: 8.0.18
-- PHP Version: 7.3.24-(to be removed in future macOS)

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `airlinesDB`
--

-- --------------------------------------------------------

--
-- Table structure for table `airlines`
--

CREATE TABLE `airlines` (
  `id` int(11) NOT NULL,
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `avg_speed` int(10) NOT NULL,
  `sit_place` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `airlines`
--

INSERT INTO `airlines` (`id`, `name`, `avg_speed`, `sit_place`) VALUES
(1, 'KLM', 980, 123),
(2, 'Wideroe', 920, 95),
(3, 'Virgin Atlantic Airways', 995, 132),
(4, 'AEGEAN', 973, 112),
(5, 'Air Dolomiti', 934, 117),
(6, 'Loganair', 994, 87),
(7, 'Luxair', 952, 111),
(8, 'Sundair', 823, 92),
(9, 'Lufthansa', 841, 93),
(10, 'Wizz Air', 801, 113),
(11, 'Air Canada', 803, 119),
(12, 'Delta', 823, 79);

-- --------------------------------------------------------

--
-- Table structure for table `timetable`
--

CREATE TABLE `timetable` (
  `id` int(11) NOT NULL,
  `fromm` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `too` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `distance` int(10) DEFAULT NULL,
  `al_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `timetable`
--

INSERT INTO `timetable` (`id`, `fromm`, `too`, `distance`, `al_id`) VALUES
(1, 'Budapest', 'London', 1449, 7),
(2, 'Budapest', 'London', 1449, 8),
(3, 'Lviv', 'Kiev', 468, 1),
(5, 'Budapest', 'Amsterdam', 1146, 1),
(6, 'Toronto', 'Vancouver', 3354, 11),
(8, 'NewYork', 'Las Vegas', 3446, 12),
(9, 'Amsterdam', 'NewYork', 5789, 1),
(10, 'Budapest', 'Frankfurt', 813, 9),
(11, 'Frankfurt', 'Toronto', 6329, 9),
(12, 'NewYork', 'Las Vegas', 3446, 12),
(13, 'Berlin', 'NewYork', 6385, 10),
(14, 'Paris', 'Tokyo', 9712, 6),
(15, 'Paris', 'Amsterdam', 430, 1),
(16, 'Amsterdam', 'Tokyo', 9288, 1),
(17, 'Tokyo', 'Las Vegas', 8903, 12),
(18, 'Munich', 'Kiev', 1393, 10),
(19, 'Kiev', 'Shenzhen', 7649, 10),
(20, 'Shenzhen', 'Sydney', 7403, 5),
(21, 'Dusseldorf', 'Budapest', 981, 1),
(22, 'London', 'Kiev', 2133, 7),
(23, 'Banglades', 'Shenzhen', 2460, 7),
(24, 'Banglades', 'Sydney', 9121, 8),
(25, 'Las Vegas', 'Miami', 3504, 12),
(26, 'Banglades', 'Sydney', 9121, 8),
(27, 'London', 'Munich', 917, 4),
(28, 'Kiev', 'Banglades', 5835, 10),
(29, 'Banglades', 'Tokyo', 4713, 7),
(30, 'Lviv', 'Frankfurt', 1096, 9),
(31, 'Kiev', 'Budapest', 898, 9),
(32, 'Kiev', 'Munich', 1394, 9),
(33, 'Kiev', 'London', 2133, 9),
(34, 'Budapest', 'Paris', 1244, 9),
(35, 'Kiev', 'Paris', 2023, 8),
(36, 'Lviv', 'Paris', 1568, 1),
(37, 'Paris', 'Toronto', 5999, 3),
(38, 'Paris', 'Toronto', 5999, 1),
(39, 'Paris', 'Toronto', 5999, 10),
(40, 'Paris', 'NewYork', 5788, 10),
(41, 'Budapest', 'Istanbul', 1067, 10),
(42, 'Kiev', 'Istanbul', 1056, 9),
(43, 'Amsterdam', 'NewYork', 1056, 3);

-- --------------------------------------------------------

--
-- Table structure for table `towns`
--

CREATE TABLE `towns` (
  `id` int(11) NOT NULL,
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `population` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `towns`
--

INSERT INTO `towns` (`id`, `name`, `population`) VALUES
(3, 'Frankfurt', 753056),
(4, 'Toronto', 2930000),
(5, 'Vancouver', 675238),
(6, 'Kiev', 2884000),
(7, 'Budapest', 1752000),
(8, 'NewYork', 8399000),
(9, 'London', 8982000),
(10, 'Lviv', 721301),
(11, 'Banglades', 161400000),
(12, 'Shenzhen', 12530000),
(13, 'Tokyo', 9273000),
(14, 'Miami', 470914),
(15, 'Las Vegas', 644644),
(16, 'Amsterdam', 821752),
(17, 'Sydney', 5312000),
(18, 'Munich', 1472000),
(19, 'Berlin', 3769000),
(20, 'Dusseldorf', 612178),
(21, 'Istanbul', 15460000),
(22, 'Paris', 2187532);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `airlines`
--
ALTER TABLE `airlines`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `timetable`
--
ALTER TABLE `timetable`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `towns`
--
ALTER TABLE `towns`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `airlines`
--
ALTER TABLE `airlines`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `timetable`
--
ALTER TABLE `timetable`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- AUTO_INCREMENT for table `towns`
--
ALTER TABLE `towns`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
