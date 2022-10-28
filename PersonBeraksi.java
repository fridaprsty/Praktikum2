/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package person;


public class PersonBeraksi {
    public static void main(String[] args) {
        Person Anton = new Person();
        
        Anton.setNama("Anton");
        Anton.setJnsKelamin("Laki laki");
        Anton.setUmur(22);
        System.out.println("Nama : " + Anton.getNama());
        System.out.println("Jenis Kelamin : " + Anton.getJnsKelamin());
        System.out.println("Umur : " + Anton.getUmur());
                
        
        
        Person Riko = new Person();
      
        Riko.setNama("Riko");
        Riko.setJnsKelamin("Laki-laki");
        Riko.setUmur(25);
        System.out.println("Nama :" + Riko.getNama());
        System.out.println("Jenis Kelamin : " + Riko.getJnsKelamin());
        System.out.println("Umur : " + Riko.getUmur());
      
    }
    
      
        
        
    }


