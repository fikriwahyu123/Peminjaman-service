/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fikri.peminjaman.service.Vo;

import com.fikri.peminjaman.service.Entity.Peminjaman;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author acer
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVo {
    private Peminjaman peminjaman;
    private Anggota anggota;
    private Buku buku;
}
