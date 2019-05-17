-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 17, 2019 at 06:25 AM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 7.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gapaytera`
--

-- --------------------------------------------------------

--
-- Table structure for table `aktivasikartu`
--

CREATE TABLE `aktivasikartu` (
  `ID_Kartu` varchar(9) NOT NULL,
  `Password_Kartu` varchar(6) NOT NULL,
  `Saldo` int(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `aktivasikartu`
--

INSERT INTO `aktivasikartu` (`ID_Kartu`, `Password_Kartu`, `Saldo`) VALUES
('160016001', 'hihihi', 13000),
('160016002', 'yayaya', 100000),
('160016003', 'lalala', 60000),
('160016004', 'wewewe', 80000),
('160016005', 'rikaaa', 0),
('160016006', 'tisyaa', 0),
('160016007', 'asikkk', 0);

-- --------------------------------------------------------

--
-- Table structure for table `datacivitas`
--

CREATE TABLE `datacivitas` (
  `No_Identitas` varchar(20) NOT NULL,
  `Nama` varchar(25) NOT NULL,
  `Jabatan` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `datacivitas`
--

INSERT INTO `datacivitas` (`No_Identitas`, `Nama`, `Jabatan`) VALUES
('14115012', 'Willi Agustian P.P.', 'Mahasiswa'),
('14115017', 'Rahmat Fitriadi', 'Mahasiswa'),
('14115042', 'Rizki Muhammad Farhan', 'Mahasiswa'),
('14115056', 'Cristian Ari Paulus K.', 'Mahasiswa'),
('14116051', 'Ilham', 'Mahasiswa'),
('14116069', 'Amilia Alifa', 'Mahasiswa'),
('14116165', 'Muhammad Julian', 'Mahasiswa'),
('14117005', 'Latisya', 'Mahasiswa'),
('14117016', 'Dhiko Jangjaya Putra', 'Mahasiswa'),
('14117024', 'Rika Laila', 'Mahasiswa'),
('14117025', 'Gabrella Marlika Putri', 'Mahasiswa'),
('14117035', 'Yudi Gunawan', 'Mahasiswa'),
('14117037', 'Nardiyansyah Tri Jatmiko', 'Mahasiswa'),
('14117047', 'Adila Gita Risnanda', 'Mahasiswa'),
('14117061', 'Iman Maliki', 'Mahasiswa'),
('14117065', 'Titis Prawilas Sari', 'Mahasiswa'),
('14117066', 'Agus Michael P. Sianipar', 'Mahasiswa'),
('14117067', 'Irma Safitri', 'Mahasiswa'),
('14117069', 'Mona Andhana', 'Mahasiswa'),
('14117082', 'Wahyu Wiranti', 'Mahasiswa'),
('14117086', 'Nurtias Rahayu', 'Mahasiswa'),
('14117087', 'Fatin Delfiandita', 'Mahasiswa'),
('14117091', 'Hiskia Perdamen Pulungan', 'Mahasiswa'),
('14117111', 'Anggoro Tri Legowo', 'Mahasiswa'),
('14117112', 'Muhammad Yafi Fahmi', 'Mahasiswa'),
('14117130', 'Coriza Caesarchakti', 'Mahasiswa'),
('14117131', 'Krisdiansyah', 'Mahasiswa'),
('14117136', 'Vanesha Adhelia', 'Mahasiswa'),
('14117142', 'Deniesh Nathanael V.', 'Mahasiswa'),
('14117149', 'Afdi Fauzul Bahar', 'Mahasiswa'),
('14117154', 'Pungki Resti Prabandari', 'Mahasiswa'),
('14117171', 'Rizca Putri Setianingrum', 'Mahasiswa'),
('14117181', 'Faidil Zikri', 'Mahasiswa');

-- --------------------------------------------------------

--
-- Table structure for table `loginkaryawan`
--

CREATE TABLE `loginkaryawan` (
  `ID_Karyawan` varchar(5) NOT NULL,
  `Nama_Karyawan` varchar(25) NOT NULL,
  `Password_Karyawan` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `loginkaryawan`
--

INSERT INTO `loginkaryawan` (`ID_Karyawan`, `Nama_Karyawan`, `Password_Karyawan`) VALUES
('GL001', 'Putri', 'galeri'),
('GL002', 'Sinta', 'galeri');

-- --------------------------------------------------------

--
-- Table structure for table `pendapatan`
--

CREATE TABLE `pendapatan` (
  `No_Transaksi` int(6) NOT NULL,
  `Tgl_Transaksi` varchar(10) NOT NULL,
  `Pemasukan` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pendapatan`
--

INSERT INTO `pendapatan` (`No_Transaksi`, `Tgl_Transaksi`, `Pemasukan`) VALUES
(1, '05-05-2019', 20000),
(2, '05-05-2019', 20000),
(3, '06-05-2019', 20000),
(4, '06-05-2019', 25000),
(5, '06-05-2019', 70000),
(6, '17-05-2019', 2000),
(7, '17/05/2019', 20000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `aktivasikartu`
--
ALTER TABLE `aktivasikartu`
  ADD PRIMARY KEY (`ID_Kartu`);

--
-- Indexes for table `datacivitas`
--
ALTER TABLE `datacivitas`
  ADD PRIMARY KEY (`No_Identitas`);

--
-- Indexes for table `loginkaryawan`
--
ALTER TABLE `loginkaryawan`
  ADD PRIMARY KEY (`ID_Karyawan`);

--
-- Indexes for table `pendapatan`
--
ALTER TABLE `pendapatan`
  ADD PRIMARY KEY (`No_Transaksi`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
