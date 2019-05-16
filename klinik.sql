-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 17, 2019 at 01:20 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `klinik`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `daftar_obat`
--

CREATE TABLE `daftar_obat` (
  `id_obat` char(10) NOT NULL,
  `nama_obat` varchar(20) DEFAULT NULL,
  `harga` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `daftar_obat`
--

INSERT INTO `daftar_obat` (`id_obat`, `nama_obat`, `harga`) VALUES
('111', 'Paracetamol', 15000),
('112', 'Histaklor', 20000),
('113', 'PANADOL EXTRA', 9000),
('114', 'PANTOCAIN TETES MATA', 25000),
('115', 'Kalium Diclofenac', 30000),
('116', 'Bodrex', 5000),
('117', 'Mixagrip', 7000);

-- --------------------------------------------------------

--
-- Table structure for table `dokter`
--

CREATE TABLE `dokter` (
  `id_dokter` char(3) NOT NULL,
  `nama_dokter` varchar(20) DEFAULT NULL,
  `jam_mulai` varchar(8) NOT NULL,
  `jam_selesai` varchar(8) NOT NULL,
  `no_telp` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dokter`
--

INSERT INTO `dokter` (`id_dokter`, `nama_dokter`, `jam_mulai`, `jam_selesai`, `no_telp`) VALUES
('001', 'Andrew', '10:00:00', '15:00:00', '080880800808');

-- --------------------------------------------------------

--
-- Table structure for table `perawat`
--

CREATE TABLE `perawat` (
  `nama` varchar(20) NOT NULL,
  `jam_mulai` varchar(8) NOT NULL,
  `jam_selesai` varchar(8) NOT NULL,
  `no_telp` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `perawat`
--

INSERT INTO `perawat` (`nama`, `jam_mulai`, `jam_selesai`, `no_telp`) VALUES
('Arini', '09:00:00', '16:00:00', '098987172645');

-- --------------------------------------------------------

--
-- Table structure for table `sign_up`
--

CREATE TABLE `sign_up` (
  `nama_depan` varchar(50) DEFAULT NULL,
  `nama_belakang` varchar(50) DEFAULT NULL,
  `username` varchar(20) NOT NULL,
  `jenis_kelamin` varchar(20) DEFAULT NULL,
  `email` varchar(25) DEFAULT NULL,
  `tanggal_lahir` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sign_up`
--

INSERT INTO `sign_up` (`nama_depan`, `nama_belakang`, `username`, `jenis_kelamin`, `email`, `tanggal_lahir`) VALUES
('Muhammad', 'Affandi', 'affandi', 'Laki-laki', 'affandi@gmail.com', '1999-09-09'),
('Anas', 'Nasrull', 'anas', 'Laki-laki', 'anas@gmail.com', '1999-11-10'),
('Anas', 'Nasrull', 'anasrull', 'Laki-laki', 'anas@gmail.com', '1999-11-10'),
('Muhammad', 'Affandi', 'fandi', 'Laki-laki', 'affandi@gmail.com', '1999-09-09'),
('Junio', '', 'junio', 'Laki-laki', 'azhari@gmail.com', '1999-05-05'),
('Junio', 'Azhari', 'junioazhari', 'Laki-laki', 'junio@gmail.com', '1999-05-05');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `daftar_obat`
--
ALTER TABLE `daftar_obat`
  ADD PRIMARY KEY (`id_obat`);

--
-- Indexes for table `dokter`
--
ALTER TABLE `dokter`
  ADD PRIMARY KEY (`id_dokter`);

--
-- Indexes for table `perawat`
--
ALTER TABLE `perawat`
  ADD PRIMARY KEY (`nama`);

--
-- Indexes for table `sign_up`
--
ALTER TABLE `sign_up`
  ADD PRIMARY KEY (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
