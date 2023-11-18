/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctr;

import ent.entPasien0851;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class ctrPasien0851 {
    entPasien0851 o = new entPasien0851();
    
    public void setKdPasien0851(String p){
        o.setKdPasien0851(p);
        o.cariPasien0851();
    }
    
    public String[] getDataPasien0851(){
        String[] vAPasien = new String[6];
        vAPasien[0] = o.getKdPasien0851();
        vAPasien[1] = o.atNmPasien0851;
        vAPasien[2] = o.atAlamat0851;
        vAPasien[3] = o.atNoTelp0851;
        vAPasien[4] = o.atNamaAyah0851;
        return vAPasien;
    }
    
    public void setDataPelanggan0851(String[] p){
        o.setKdPasien0851(p[0]);
        o.atNmPasien0851=p[1];
        o.atAlamat0851=p[2];
        o.atNoTelp0851=p[3];
        o.atNamaAyah0851=p[4];
    }

    public void simpan0851(){
        if(o.checkPasien0851()){
            o.update0851();
            JOptionPane.showMessageDialog(null, "Update data berhasil");
        } else {
            o.insert0851();
            JOptionPane.showMessageDialog(null, "Tambah data berhasil");
        }
    }
    
    public void hapus0851(){
        o.delete0851();
        
        JOptionPane.showMessageDialog(null, "Hapus data berhasil");
    }
}
