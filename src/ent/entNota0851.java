/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ent;

import db.dbConnection0851;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class entNota0851 {
    public String atKdNota0851 = "";
    public String atTglNota0851 = "";
    public String atKdPasien0851 = "";
    
    public void setKdNota0851(String pkKdNota0851){
        this.atKdNota0851= pkKdNota0851;
    }
    
    public String getKdNota0851(){
        return this.atKdNota0851;
    }
    
    public void cariNota0851(){
        String vSql =   "SELECT nota0851.KdNota0851, nota0851.TglNota0851, nota0851.KdPasien0851 " +
                        "FROM nota0851 WHERE nota0851.KdNota0851='"+ this.atKdNota0851 +"'";
        dbConnection0851 db = new dbConnection0851();
        Connection con = db.koneksiDB();
        PreparedStatement stat = null;
        try{
            stat = con.prepareStatement(vSql);
            ResultSet rs = stat.executeQuery();
            if(rs.next()){
                this.atKdNota0851=rs.getString("KdNota0851");
                this.atTglNota0851=rs.getString("TglNota0851");
                this.atKdPasien0851=rs.getString("KdPasien0851");  

            }else{
                this.atTglNota0851 = "";
                this.atKdPasien0851 = "";
            }
                      
        } catch (SQLException e){
            System.out.println("error----->"+e.toString());
        } 
    }
    
    public boolean checkNota0851(){
        String vSql =   "SELECT nota0851.KdNota0851 FROM nota0851 " +
                        "WHERE nota0851.KdNota0851='"+ this.atKdNota0851 +"'";
        dbConnection0851 db = new dbConnection0851();
        Connection con = db.koneksiDB();
        PreparedStatement stat = null;
        boolean flag=true;
        try{
            stat = con.prepareStatement(vSql);
            ResultSet rs = stat.executeQuery();
            
            flag = rs.next();
        } catch (SQLException e){
            System.out.println(e);
        }
        return flag;
    }
    
    
    public void insertNota0851(){
        String vSql =   "INSERT INTO nota0851 (nota0851.KdNota0851, nota0851.TglNota0851, nota0851.KdPasien0851) " +
                        "VALUES ('"+ this.atKdNota0851 +"', '"+ this.atTglNota0851 +"', '"+ this.atKdPasien0851 +"')";
        dbConnection0851 db = new dbConnection0851();
        System.out.println(vSql);
        Connection con = db.koneksiDB();
        PreparedStatement Stat = null;
        try{
            Stat = con.prepareStatement(vSql);           
            Stat.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error -> "+ex.toString());
        }

    }
    
    public void updateNota0851(){
        String vSql =   "UPDATE nota0851 " +
                        "SET nota0851.TglNota0851='"+ this.atTglNota0851 +"', nota0851.KdPasien0851='"+ this.atKdPasien0851 +"' " +
                        "WHERE nota0851.KdNota0851='"+ this.atKdNota0851 +"'";
        dbConnection0851 db = new dbConnection0851();
        Connection con = db.koneksiDB();
        PreparedStatement Stat = null;
        try{
            Stat = con.prepareStatement(vSql);                                                
            Stat.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error -> "+ex.toString());
        }
    }
    
    public void deleteNota0851(){
        String vSql =   "DELETE FROM nota0851 " +
                        "WHERE nota0851.KdNota0851='"+ this.atKdNota0851 +"'";
        dbConnection0851 db = new dbConnection0851();
        Connection con = db.koneksiDB();
        PreparedStatement Stat = null;
        try{
            Stat = con.prepareStatement(vSql);                                                
            Stat.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error -> "+ex.toString());
        }
    }

    public static void main(String[] args){
        entNota0851 o = new entNota0851();
//        o.setKdObat0851("002");
//        o.deleteObat0851();
        
//        o.setKdObat0851("003");
//        o.atNmObat0851="Bodrex";
//        o.atSatuan0851="Strip";
//        o.atDosis0851="2 Kali / Hari";
//        o.atHarga0851=20000;
//        o.atStok0851=1000;
//        o.updateObat0851();

//        o.setKdObat0851("003");
//        o.atNmObat0851="Bodrex";
//        o.atSatuan0851="Strip";
//        o.atDosis0851="2 Kali / Hari";
//        o.atHarga0851=20000;
//        o.atStok0851=1000;
//        o.insertObat0851();

//        o.setKdObat0851("001");
//        o.cariObat0851();
//        System.out.println("Kd Obat : "+o.getKdObat0851());
//        System.out.println("Nama Obat : "+o.atNmObat0851);
//        System.out.println("Satuan : "+o.atSatuan0851);
//        System.out.println("Dosis : "+o.atDosis0851);
//        System.out.println("Harga :"+o.atHarga0851);
//        System.out.println("Stok :"+o.atStok0851);
    }
}
