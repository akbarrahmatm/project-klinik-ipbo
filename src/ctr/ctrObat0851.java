/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctr;

import ent.entObat0851;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class ctrObat0851 {
    entObat0851 o = new entObat0851();
    
    public void setKdObat0851(String p){
        o.setKdObat0851(p);
        o.cariObat0851();
    }
    
    public String[] getDataObat0851(){
        String[] vAPasien = new String[6];
        vAPasien[0] = o.getKdObat0851();
        vAPasien[1] = o.atNmObat0851;
        vAPasien[2] = o.atSatuan0851;
        vAPasien[3] = o.atDosis0851;
        vAPasien[4] = String.valueOf(o.atHarga0851);
        vAPasien[5] = String.valueOf(o.atStok0851);
        return vAPasien;
    }
    
    public void setDataPelanggan0851(String[] p){
        o.setKdObat0851(p[0]);
        o.atNmObat0851=p[1];
        o.atSatuan0851=p[2];
        o.atDosis0851=p[3];
        o.atHarga0851=Integer.valueOf(p[4]);
        o.atStok0851=Integer.valueOf(p[5]);
    }
    
    public void simpan0851(){
        if(o.checkObat0851()){
            o.updateObat0851();
            JOptionPane.showMessageDialog(null, "Update data berhasil");
        } else {
            o.insertObat0851();
            JOptionPane.showMessageDialog(null, "Insert data berhasil");
        }
    }
    
    public void hapus0851(){
        o.deleteObat0851();
        JOptionPane.showMessageDialog(null, "Hapus data berhasil");
    }
}
