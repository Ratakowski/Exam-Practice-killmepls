/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispratikum;

/**
 *
 * @author Lab Informatika
 */
public class Student {
    protected String nama;
    protected int NIM;
    protected String jurusan;
    
    public Student(String nama, int NIM, String jurusan){
        this.nama = nama;
        this.NIM = NIM;
        this.jurusan = jurusan;              
                
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
     public void setNIM(int NIM){
        this.NIM = NIM;
    }
    
    public int getNIM(){
        return NIM;
    }
     public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    
    public String getjurusan(){
        return jurusan;
    }
}
