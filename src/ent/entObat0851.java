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
public class entObat0851 {   
    public String atKdObat0851 = "";
    public String atNmObat0851 = "";
    public String atSatuan0851 = "";
    public String atDosis0851 = "";
    public int atHarga0851;    
    public int atStok0851;

    
    public void setKdObat0851(String pkKdObat0851){
        this.atKdObat0851 = pkKdObat0851;
    }
    
    public String getKdObat0851(){
        return this.atKdObat0851;
    }
    
    public void cariObat0851(){
        String vSql =   "SELECT obat0851.KdObat0851, obat0851.NmObat0851, obat0851.Satuan0851, obat0851.Dosis0851, obat0851.Harga0851, obat0851.Stok0851 " +
                        "FROM obat0851 " +
                        "WHERE obat0851.KdObat0851='"+ this.atKdObat0851 +"'";
        dbConnection0851 db = new dbConnection0851();
        Connection con = db.koneksiDB();
        PreparedStatement stat = null;
        try{
            stat = con.prepareStatement(vSql);
            ResultSet rs = stat.executeQuery();
            if(rs.next()){
                this.atKdObat0851=rs.getString("KdObat0851");
                this.atNmObat0851=rs.getString("NmObat0851");
                this.atSatuan0851=rs.getString("Satuan0851");
                this.atDosis0851=rs.getString("Dosis0851");  
                this.atHarga0851=rs.getInt("Harga0851");
                this.atStok0851=rs.getInt("Stok0851");  

            }else{
                this.atNmObat0851 = "";
                this.atSatuan0851 = "";
                this.atDosis0851 = "";
                this.atHarga0851 = 0;
                this.atStok0851 = 0;
            }
                      
        } catch (SQLException e){
            System.out.println("error----->"+e.toString());
        } 
    }
    
    public boolean checkObat0851(){
        String vSql =   "SELECT obat0851.KdObat0851 " +
                        "FROM obat0851 " +
                        "WHERE obat0851.KdObat0851='"+ this.atKdObat0851 +"'";
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
    
    
    public void insertObat0851(){
        String vSql =   "INSERT INTO obat0851 " +
                        "(obat0851.KdObat0851, obat0851.NmObat0851, obat0851.Satuan0851, obat0851.Dosis0851, obat0851.Harga0851, obat0851.Stok0851) " +
                        "VALUES ('"+ this.atKdObat0851 +"', '"+ this.atNmObat0851 +"', '"+ this.atSatuan0851 +"', '"+ this.atDosis0851 +"', "+ this.atHarga0851 +", "+ this.atStok0851 +")";
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
    
    public void updateObat0851(){
        String vSql =   "UPDATE obat0851 " +
                        "SET obat0851.NmObat0851='"+ this.atNmObat0851 +"', obat0851.Satuan0851='"+ this.atSatuan0851 +"', obat0851.Dosis0851='"+ this.atDosis0851 +"', obat0851.Harga0851='"+ this.atHarga0851 +"', obat0851.Stok0851='"+ this.atStok0851 +"' " +
                        "WHERE obat0851.KdObat0851='"+ this.atKdObat0851 +"'";
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
    
    public void deleteObat0851(){
        String vSql =   "DELETE FROM obat0851 WHERE obat0851.KdObat0851='"+ this.atKdObat0851 +"'";
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
        entObat0851 o = new entObat0851();
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
