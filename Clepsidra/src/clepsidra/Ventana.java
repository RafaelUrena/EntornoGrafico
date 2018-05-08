/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clepsidra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.Timer;

/**
 *
 * @author the_d
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
       initComponents();
        tiempo = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rellenar();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bPHoras = new javax.swing.JProgressBar();
        bPMinutos = new javax.swing.JProgressBar();
        bPSegundos = new javax.swing.JProgressBar();
        eHor = new javax.swing.JLabel();
        eMin = new javax.swing.JLabel();
        eSeg = new javax.swing.JLabel();
        bStart = new javax.swing.JToggleButton();
        cTminutos = new javax.swing.JTextField();
        cThoras = new javax.swing.JTextField();
        cTsegundos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eHor.setText("Horas");

        eMin.setText("Minutos");

        eSeg.setText("Segundos");

        bStart.setText("Arrancar");
        bStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStartActionPerformed(evt);
            }
        });

        cTminutos.setEditable(false);

        cThoras.setEditable(false);

        cTsegundos.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eHor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eMin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eSeg, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bPMinutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bPSegundos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bPHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cTsegundos)
                            .addComponent(cTminutos)
                            .addComponent(cThoras, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bStart)
                        .addGap(102, 102, 102)))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(eHor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cThoras)
                            .addComponent(bPHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bPMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eMin)
                    .addComponent(cTminutos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bPSegundos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eSeg)
                    .addComponent(cTsegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bStart)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStartActionPerformed
        if(bStart.getText().equals("Arrancar")){
            tiempo.start();
            bStart.setText("Parar");
        } else {
            tiempo.stop();
            bStart.setText("Arrancar");
        }
    }//GEN-LAST:event_bStartActionPerformed

     private void rellenar() {
        Calendar calendario = Calendar.getInstance();
        
        this.bPHoras.setValue(calendario.get(Calendar.HOUR_OF_DAY));
        this.cThoras.setText(String.valueOf(this.bPHoras.getValue()));
        this.bPMinutos.setValue(calendario.get(Calendar.MINUTE));
        this.cTminutos.setText(String.valueOf(this.bPMinutos.getValue()));
        this.bPSegundos.setValue(calendario.get(Calendar.SECOND));
        this.cTsegundos.setText(String.valueOf(this.bPSegundos.getValue()));

    }
    
    private Timer tiempo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bPHoras;
    private javax.swing.JProgressBar bPMinutos;
    private javax.swing.JProgressBar bPSegundos;
    private javax.swing.JToggleButton bStart;
    private javax.swing.JTextField cThoras;
    private javax.swing.JTextField cTminutos;
    private javax.swing.JTextField cTsegundos;
    private javax.swing.JLabel eHor;
    private javax.swing.JLabel eMin;
    private javax.swing.JLabel eSeg;
    // End of variables declaration//GEN-END:variables
}
