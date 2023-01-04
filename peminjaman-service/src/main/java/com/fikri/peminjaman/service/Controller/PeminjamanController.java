/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fikri.peminjaman.service.Controller;

import com.fikri.peminjaman.service.Entity.Peminjaman;
import com.fikri.peminjaman.service.Service.PeminjamanService;
import com.fikri.peminjaman.service.Vo.ResponseTemplateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author acer
 */
@RestController
@RequestMapping("/peminjaman")
public class PeminjamanController {
     @Autowired
    private PeminjamanService peminjamanService;
    
    @PostMapping("/")
    public Peminjaman savePeminjaman(@RequestBody Peminjaman peminjaman){
        return peminjamanService.savePeminjaman(peminjaman);
    }
    
    @GetMapping("/{id}")
    public ResponseTemplateVo getPeminjaman(@PathVariable("id") Long peminjamanId){
        return peminjamanService.getPeminjaman(peminjamanId);
    } 
}
