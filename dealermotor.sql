-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 14, 2020 at 08:40 AM
-- Server version: 10.3.15-MariaDB
-- PHP Version: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dealermotor`
--

-- --------------------------------------------------------

--
-- Table structure for table `macam_motor`
--

CREATE TABLE `macam_motor` (
  `kode_motor` int(5) NOT NULL,
  `nama_motor` varchar(15) NOT NULL,
  `bahan_bakar` varchar(15) NOT NULL,
  `tipe` varchar(20) NOT NULL,
  `warna` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `macam_motor`
--

INSERT INTO `macam_motor` (`kode_motor`, `nama_motor`, `bahan_bakar`, `tipe`, `warna`) VALUES
(1, 'BEAT', 'bensin', 'honda', 'hitam putih'),
(2, 'VARIO', 'bensin', 'honda', 'biru'),
(3, 'scoopy', 'bensin', 'honda', 'abu abu'),
(4, 'SUPRA', 'bensin', 'honda', 'hitam merah'),
(6, 'mio', 'bensin', 'yamaha', 'merah putih'),
(7, 'ninja', 'pertamax', 'kawasaki', 'hijau');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `macam_motor`
--
ALTER TABLE `macam_motor`
  ADD PRIMARY KEY (`kode_motor`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
