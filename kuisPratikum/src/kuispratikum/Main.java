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

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends javax.swing.JFrame {
private JLabel namaLabel, NIMLabel, jurusanLabel, tataLabel, EYDLabel, kreatifLabel, strukturLabel, nilaiLabel, keteranganLabel;
private JTextField namaField, NIMField, jurusanField, tataField, EYDField, kreatifField, strukturField, nilaiField, keteranganField;
private JButton submitButton;

public Main() {
setTitle("form");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

namaLabel = new JLabel("nama:");
NIMLabel = new JLabel("NIM:");
jurusanLabel = new JLabel("jurusan;");
tataLabel = new JLabel("tata bahasa:");
EYDLabel = new JLabel("EYD;");
kreatifLabel = new JLabel("kreatifan;");
strukturLabel = new JLabel("struktur;");
nilaiLabel = new JLabel("nilai;");
keteranganLabel = new JLabel("keterangan");

namaField = new JTextField(20);
NIMField = new JTextField(20);
jurusanField = new JTextField(20);
tataField = new JTextField(20);
EYDField = new JTextField(20);
kreatifField = new JTextField(20);
strukturField = new JTextField(20);
nilaiField = new JTextField(20);
keteranganField = new JTextField(20);

submitButton = new JButton("Submit");

JPanel panel = new JPanel(new GridLayout(5,2));
    panel.add(namaLabel);
    panel.add(namaField);
    panel.add(NIMLabel);
    panel.add(NIMField);
    panel.add(jurusanLabel);
    panel.add(jurusanField);
    panel.add(tataLabel);
    panel.add(tataField);
     panel.add(EYDLabel);
      panel.add(EYDField);
       panel.add(kreatifLabel);
        panel.add(kreatifField);
         panel.add(strukturLabel);
          panel.add(strukturField);
           panel.add(nilaiField);
            panel.add(nilaiLabel);
             panel.add(keteranganLabel);
              panel.add(keteranganField);
               
    getContentPane().add(panel);
    pack();
    setVisible(true);

        }


    /**
     * Creates new form Main
     */
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        new Main();
    }
       
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
