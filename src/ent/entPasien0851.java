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
public class entPasien0851 {
    private String atKdPasien0851 = "";
    public String atNmPasien0851 = "";
    public String atAlamat0851 = "";
    public String atNoTelp0851 = "";
    public String atNamaAyah0851 = "";
    
    public void setKdPasien0851(String pKdPasien0851){
        this.atKdPasien0851 = pKdPasien0851;
    }
    
    public String getKdPasien0851(){
        return this.atKdPasien0851;
    }
    
    public void cariPasien0851(){
        String vSql =   "SELECT pasien0851.KdPasien0851, pasien0851.NmPasien0851, pasien0851.Alamat0851, pasien0851.NoTelp0851, pasien0851.NamaAyah0851 " +
                        "FROM pasien0851 " +
                        "WHERE pasien0851.KdPasien0851='"+ this.atKdPasien0851 +"'";
        dbConnection0851 db = new dbConnection0851();
        Connection con = db.koneksiDB();
        PreparedStatement stat = null;
        try{
            stat = con.prepareStatement(vSql);
            ResultSet rs = stat.executeQuery();
            if(rs.next()){
                this.atKdPasien0851=rs.getString("KdPasien0851");
                this.atNmPasien0851=rs.getString("NmPasien0851");
                this.atAlamat0851=rs.getString("Alamat0851");
                this.atNoTelp0851=rs.getString("NoTelp0851");  
                this.atNamaAyah0851=rs.getString("NamaAyah0851");  
            }else{
                this.atNmPasien0851 = "";
                this.atAlamat0851 = "";
                this.atNoTelp0851 = "";
                this.atNamaAyah0851 = "";
            }
                      
        } catch (SQLException e){
            System.out.println("error----->"+e.toString());
        } 
    }
    
    public boolean checkPasien0851(){
        String vSql =   "SELECT pasien0851.KdPasien0851 " +
                        "FROM pasien0851 " +
                        "WHERE pasien0851.KdPasien0851='"+ this.atKdPasien0851 +"'";
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
    
    public void insert0851() {
       
        String vSql =   "INSERT INTO pasien0851 " +
                        "(pasien0851.KdPasien0851, pasien0851.NmPasien0851, pasien0851.Alamat0851, pasien0851.NoTelp0851, pasien0851.NamaAyah0851) " +
                        "VALUES ('"+ this.atKdPasien0851 +"', '"+ this.atNmPasien0851 +"', '"+ this.atAlamat0851 +"', '"+ this.atNoTelp0851 +"', '"+ this.atNamaAyah0851 +"')";
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
    
    public void update0851() {
        String vSql =   "UPDATE pasien0851 SET " +
                        "pasien0851.NmPasien0851='"+ this.atNmPasien0851 +"', pasien0851.Alamat0851='"+ this.atAlamat0851 +"', " +
                        "pasien0851.NoTelp0851='"+ this.atNoTelp0851 +"', pasien0851.NamaAyah0851='"+ this.atNamaAyah0851 +"' " +
                        "WHERE pasien0851.KdPasien0851='"+ this.atKdPasien0851 +"'";
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
    
    public void delete0851() {
        String vSql="DELETE FROM pasien0851 WHERE pasien0851.KdPasien0851='"+this.atKdPasien0851+"'";
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
        entPasien0851 o = new entPasien0851();
//        o.setKdPasien0851("003");
//        o.delete();
        
//        o.setKdPasien0851("003");
//        o.atNmPasien0851="ABC";
//        o.atAlamat0851="Jln Tentara Pelajar muda mudi";
//        o.atNoTelp0851="0813561263";
//        o.atNamaAyah0851="BCA";
//        o.update();

//        o.setKdPasien0851("003");
//        o.atNmPasien0851="Satya";
//        o.atAlamat0851="Jakarta Selatan";
//        o.atNoTelp0851="083625461324";
//        o.atNamaAyah0851="Ananta";
//        o.insert();

//        o.setKdPasien0851("001");
//        o.cariPasien0851();
//        System.out.println("Kd Pasien : "+o.getKdPlg());
//        System.out.println("Nama Pasien : "+o.atNmPasien0851);
//        System.out.println("Alamat : "+o.atAlamat0851);
//        System.out.println("Telp :"+o.atNoTelp0851);
//        System.out.println("Nama Ayah :"+o.atNamaAyah0851);
    }
}
