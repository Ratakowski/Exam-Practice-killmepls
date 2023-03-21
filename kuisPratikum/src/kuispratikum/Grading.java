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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class Grading extends Student{
    private int tata;
    private int EYD;
    private int struktur;
    private int kreatif;
    private int nilai;
    private String keterangan;

    public Grading(String nama, int NIM, String jurusan) {
        super(nama, NIM, jurusan);
        this.tata = tata;
        this.EYD = EYD;
        this.kreatif = kreatif;
        this.struktur = struktur;
        this.nilai = nilai;
        this.keterangan = keterangan;
        
    }
    
    public void  setTata (int tata){
    this.tata = tata;
            }
    public int setTata(){
        return tata;
    }
    
    public void  setEYD (int EYD){
    this.EYD = EYD;
            }
     public int EYD(){
        return EYD;
    }
     
    public void  setStruktur (int struktur){
    this.struktur = struktur;
            }
     public int setStruktur(){
        return struktur;
    }
     
    public void  setKeratif (int kreatif){
    this.kreatif = kreatif;
            }
     public int setKeratif(){
        return kreatif;
     }
     
    public void  setNilai (int nilai){
    this.nilai = nilai;
            }
     public int  setNilai(){
        return nilai;
    }
     
    public void  setKerangan (String keterangan){
    this.keterangan = keterangan;
            }
     public String setKeterangan(){
        return keterangan;
    }
   
}

@Override
public void displayInfo(){
    Jframe frame = new JFrame("input")
    Jpanel panel = new JPanel (new GridLayout(4,2));

panel.add(new JLabel("nama:"));
panel.add(new JLabel(nama));

panel.add(new JLabel("NIM:"));
panel.add(new JLabel(NIM));

panel.add(new JLabel("Jurusan:"));
panel.add(new JLabel(jurusan));

panel.add(new JLabel("Tata Bahasa:"));
panel.add(new JLabel(tata));

panel.add(new JLabel("EYD:"));
panel.add(new JLabel(EYD));

panel.add(new JLabel("Struktur"));
panel.add(new JLabel(struktur));

panel.add(new JLabel("Kreativitas"));
panel.add(new JLabel(kreatif));

panel.add(new JLabel("Nilai Akhir;"));
panel.add(new JLabel(nilai));

panel.add(new JLabel("Keterangan"));
panel.add(new JLabel(keterangan));

frame.getContentPane().add(panel);
frame.pack();
frae.setvisible(true);


}
