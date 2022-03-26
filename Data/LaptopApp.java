/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
/**
 *
 * @author PC
 */
public class LaptopApp {
   public static void main(String[] args) {
        Laptop uts = new Laptop("Nur Hapipah", "Lenovo", "Intel 8008", 5, "Windows X", 64, "SSD",1000);
        
        System.out.println("\n Nama    : "+uts.setNama());
        System.out.println("\n Brand   : "+uts.setMerk());
        System.out.println("\n Nama Processor  : "+uts.setProsesor());
        System.out.println("\n Jumlah Core pada Processor  "+uts.setCore());
        System.out.println("\n Sistem Operasi  "+uts.setSistem());
        System.out.println("\n Ukuran RAM dalam GB : "+uts.setRAM());
        System.out.println("\n Jenis Storage    : "+uts.setStorage());
        System.out.println("\n Stok     : "+uts.setStok());
    }
}