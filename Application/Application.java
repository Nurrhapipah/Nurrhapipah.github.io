/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application ;
import data.Laptop3;

/**
 *
 * @author Nur Hapipah
 */
public class Application {
    public static void main(String[] args) {
        Laptop3 uts13 = new Laptop3("Nur Hapipah", "Lenovo", "Intel 8008", 5, "Windows X", 64, "SSD M 2",1000,"Pink","Best") ;
        System.out.println(uts13);
        Laptop3 uts23 = new Laptop3("Nur Hapipah", "Lenovo", "Intel 8008", 5, "Windows 7", 64, "SSD SATA",1000,"Biru","Good") ;
        System.out.println(uts23);
        Laptop3 uts33 = new Laptop3("Nur Hapipah", "Lenovo", "Intel 8008", 5, "Windows 8", 64, "HDD",1000,"Hitam","Middle") ;
        System.out.println(uts33);
    }
}