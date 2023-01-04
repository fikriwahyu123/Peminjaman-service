/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fikri.peminjaman.service.Service;

import com.fikri.peminjaman.service.Entity.Peminjaman;
import com.fikri.peminjaman.service.Repository.PeminjamanRepository;
import com.fikri.peminjaman.service.Vo.Anggota;
import com.fikri.peminjaman.service.Vo.Buku;
import com.fikri.peminjaman.service.Vo.ResponseTemplateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author acer
 */
@Service
public class PeminjamanService {
    @Autowired
    private PeminjamanRepository peminjamanRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
   
    public Peminjaman savePeminjaman(Peminjaman peminjaman) {
       return peminjamanRepository.save(peminjaman); 
    }

     public ResponseTemplateVo getPeminjaman(Long peminjamanId){
        ResponseTemplateVo vo = new ResponseTemplateVo();
        Peminjaman peminjaman = peminjamanRepository.findByPeminjamanId(peminjamanId);
        Anggota anggota = restTemplate.getForObject("http://localhost:8080/anggota/" 
              + peminjaman.getAnggotaId(), Anggota.class);
        Buku buku = restTemplate.getForObject("http://localhost:8004/buku/" 
                + peminjaman.getBukuId(), Buku.class);
        vo.setPeminjaman(peminjaman);
        vo.setAnggota(anggota);
        vo.setBuku(buku);
        return vo;
    } 
}
