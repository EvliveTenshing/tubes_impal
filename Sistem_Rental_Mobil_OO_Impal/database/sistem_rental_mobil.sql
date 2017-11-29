-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 29, 2017 at 06:28 PM
-- Server version: 10.1.26-MariaDB
-- PHP Version: 7.1.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sistem_rental_mobil`
--

-- --------------------------------------------------------

--
-- Table structure for table `mobil`
--

CREATE TABLE `mobil` (
  `id_mobil` int(10) NOT NULL,
  `id_supplier` int(10) NOT NULL,
  `nama_mobil` varchar(50) NOT NULL,
  `merk_mobil` varchar(50) NOT NULL,
  `jumlah_mobil` int(100) NOT NULL,
  `harga_mobil` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mobil`
--

INSERT INTO `mobil` (`id_mobil`, `id_supplier`, `nama_mobil`, `merk_mobil`, `jumlah_mobil`, `harga_mobil`) VALUES
(1, 2, '458_spider', 'ferrari', 34, 1000000),
(5, 2, 'angkot', 'ferrari', 0, 122);

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `id_pegawai` int(10) NOT NULL,
  `email_pegawai` varchar(50) NOT NULL,
  `password_pegawai` varchar(50) NOT NULL,
  `nama_pegawai` varchar(50) NOT NULL,
  `alamat_pegawai` varchar(100) NOT NULL,
  `contact_pegawai` varchar(50) NOT NULL,
  `level` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`id_pegawai`, `email_pegawai`, `password_pegawai`, `nama_pegawai`, `alamat_pegawai`, `contact_pegawai`, `level`) VALUES
(1, 'admin', 'admin', 'admin', 'admin', '1234', 'pegawai'),
(2, 'tidakngulang@gmail.com', '1234', 'admin', 'admin', '1245', 'pegawai');

-- --------------------------------------------------------

--
-- Table structure for table `pelaporan_rekening`
--

CREATE TABLE `pelaporan_rekening` (
  `id_saldo` int(10) NOT NULL,
  `jumlah_saldo` int(200) NOT NULL,
  `tanggal_saldo` date NOT NULL,
  `keterangan_saldo` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pelaporan_rekening`
--

INSERT INTO `pelaporan_rekening` (`id_saldo`, `jumlah_saldo`, `tanggal_saldo`, `keterangan_saldo`) VALUES
(2, 1010000, '2017-11-30', 'null');

-- --------------------------------------------------------

--
-- Table structure for table `penyewa`
--

CREATE TABLE `penyewa` (
  `id_penyewa` int(10) NOT NULL,
  `id_transaksi_penyewa` int(10) DEFAULT NULL,
  `email_penyewa` varchar(50) NOT NULL,
  `password_penyewa` varchar(50) NOT NULL,
  `nama_penyewa` varchar(50) NOT NULL,
  `alamat_penyewa` varchar(100) NOT NULL,
  `contact_penyewa` varchar(50) NOT NULL,
  `level` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penyewa`
--

INSERT INTO `penyewa` (`id_penyewa`, `id_transaksi_penyewa`, `email_penyewa`, `password_penyewa`, `nama_penyewa`, `alamat_penyewa`, `contact_penyewa`, `level`) VALUES
(1, 6, 'rayarahadian@gmail.com', '1234', 'aa', 'zz', '111', 'penyewa');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `id_supplier` int(10) NOT NULL,
  `email_supplier` varchar(50) NOT NULL,
  `password_supplier` varchar(50) NOT NULL,
  `nama_supplier` varchar(50) NOT NULL,
  `alamat_supplier` varchar(100) NOT NULL,
  `contact_supplier` varchar(50) NOT NULL,
  `level` varchar(50) NOT NULL,
  `message` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id_supplier`, `email_supplier`, `password_supplier`, `nama_supplier`, `alamat_supplier`, `contact_supplier`, `level`, `message`) VALUES
(1, 'bugatti@bugatti.com', '1234', 'Bugatti', 'abab', '1234', 'supplier', NULL),
(2, 'ferrari@ferrari.com', '1234', 'ferrari', 'Jakarta', '1234', 'supplier', ''),
(3, 'bmw@bmw.com', '1234', 'BMW', 'Bandung', '1234', 'supplier', NULL),
(4, 'mercedes@mercedes.com', '1234', 'Mercedes', 'Yogyakarta', '1234', 'supplier', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(10) NOT NULL,
  `id_penyewa` int(10) NOT NULL,
  `id_mobil` int(10) NOT NULL,
  `nama_mobil_yang_disewa` varchar(50) NOT NULL,
  `jumlah_mobil_yang_disewa` int(50) NOT NULL,
  `harga_sewa` int(100) NOT NULL,
  `tanggal_pengembalian` date NOT NULL,
  `denda` int(30) NOT NULL,
  `status_bayar` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `id_penyewa`, `id_mobil`, `nama_mobil_yang_disewa`, `jumlah_mobil_yang_disewa`, `harga_sewa`, `tanggal_pengembalian`, `denda`, `status_bayar`) VALUES
(6, 1, 1, '458_spider', 1, 1000000, '2017-11-30', 10000, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mobil`
--
ALTER TABLE `mobil`
  ADD PRIMARY KEY (`id_mobil`),
  ADD KEY `id_supplier` (`id_supplier`);

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`id_pegawai`);

--
-- Indexes for table `pelaporan_rekening`
--
ALTER TABLE `pelaporan_rekening`
  ADD PRIMARY KEY (`id_saldo`);

--
-- Indexes for table `penyewa`
--
ALTER TABLE `penyewa`
  ADD PRIMARY KEY (`id_penyewa`),
  ADD KEY `transaksi_user` (`id_transaksi_penyewa`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id_supplier`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD KEY `id_user` (`id_penyewa`),
  ADD KEY `id_mobil` (`id_mobil`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `mobil`
--
ALTER TABLE `mobil`
  MODIFY `id_mobil` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `pegawai`
--
ALTER TABLE `pegawai`
  MODIFY `id_pegawai` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `pelaporan_rekening`
--
ALTER TABLE `pelaporan_rekening`
  MODIFY `id_saldo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `penyewa`
--
ALTER TABLE `penyewa`
  MODIFY `id_penyewa` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `supplier`
--
ALTER TABLE `supplier`
  MODIFY `id_supplier` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id_transaksi` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `mobil`
--
ALTER TABLE `mobil`
  ADD CONSTRAINT `mobil_ibfk_1` FOREIGN KEY (`id_supplier`) REFERENCES `supplier` (`id_supplier`);

--
-- Constraints for table `penyewa`
--
ALTER TABLE `penyewa`
  ADD CONSTRAINT `penyewa_ibfk_1` FOREIGN KEY (`id_transaksi_penyewa`) REFERENCES `transaksi` (`id_transaksi`) ON DELETE SET NULL ON UPDATE SET NULL;

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_penyewa`) REFERENCES `penyewa` (`id_penyewa`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `transaksi_ibfk_2` FOREIGN KEY (`id_mobil`) REFERENCES `mobil` (`id_mobil`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
