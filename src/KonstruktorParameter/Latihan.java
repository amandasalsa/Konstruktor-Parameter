/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KonstruktorParameter;

public class Latihan {
    public String nama;
    public String kelas;

    
    public Latihan(String nama, String kelas){
        this.nama = nama;
        this.kelas = kelas;
    }
        
        public static void main(String[] args){
            Latihan namakelas = new Latihan("Amanda Salsabilla", "XRPL8");
            
            System.out.println(namakelas.nama);
            System.out.println(namakelas.kelas);
            
            
        }
        
        
   
        
    }
    

