/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package person;

/**
 *
 * @author Farida Prasetyaning
 */
public class Person {
 
    String nama ;
    String jenisKelamin;
    int umur;
    
    //setter
    public void setNama (String nama){
        this.nama = nama ;
    }
    public void setJnsKelamin (String jenisKelamin){
        this.jenisKelamin = jenisKelamin ;
    }
    
    public void setUmur (int umur){
        this.umur= umur ;
    }

    
    //getter
    String getJnsKelamin() {
        return this.jenisKelamin ;
    }

    String getNama() {
        return this.nama;
    }
    
   

    public int getUmur() {
        return this.umur;
    }
   
   

}
