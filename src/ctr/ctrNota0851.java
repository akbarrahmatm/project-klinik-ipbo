/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctr;

import ent.entNota0851;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class ctrNota0851 {
    entNota0851 o = new entNota0851();
    
    public void setKdNota0851(String p){
        o.setKdNota0851(p);
        o.cariNota0851();
    }
    
    public String[] getDataNota0851(){
        String[] vANota = new String[3];
        vANota[0] = o.getKdNota0851();
        vANota[1] = o.atTglNota0851;
        vANota[2] = o.atKdPasien0851;
        return vANota;
    }
    
    public void setDataNota0851(String[] p){
        o.setKdNota0851(p[0]);
        o.atTglNota0851=p[1];
        o.atKdPasien0851=p[2];
    }
    
    public void simpan0851(){
        if(o.checkNota0851()){
            o.updateNota0851();
            JOptionPane.showMessageDialog(null, "Update data berhasil");
        } else {
            o.insertNota0851();
            JOptionPane.showMessageDialog(null, "Insert data berhasil");
        }
    }
    
    public void hapus0851(){
        o.deleteNota0851();
        JOptionPane.showMessageDialog(null, "Hapus data berhasil");
    }
}
