/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fikri.peminjaman.service.Repository;

import com.fikri.peminjaman.service.Entity.Peminjaman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author acer
 */
@Repository
public interface PeminjamanRepository extends JpaRepository<Peminjaman, Long>{

    public Peminjaman findByPeminjamanId(Long peminjamanId);
    
}