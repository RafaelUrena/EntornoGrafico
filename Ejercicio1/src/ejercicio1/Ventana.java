/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author faranzabe
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }

    public Ventana(String t) {
        initComponents();
        this.setTitle(t);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etN1 = new javax.swing.JLabel();
        etN2 = new javax.swing.JLabel();
        btnMas = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnPor = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        etRes = new javax.swing.JLabel();
        txtN1 = new javax.swing.JTextField();
        txtN2 = new javax.swing.JTextField();
        txtRes = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etN1.setText("Número 1:");

        etN2.setText("Número 2:");

        btnMas.setText("+");
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });

        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        btnPor.setText("*");
        btnPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorActionPerformed(evt);
            }
        });

        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        etRes.setText("Resultado");

        txtRes.setEditable(false);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etN2)
                            .addComponent(etN1)
                            .addComponent(etRes))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtN1)
                            .addComponent(txtN2)
                            .addComponent(txtRes, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMenos, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnLimpiar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etN1)
                    .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etN2)
                    .addComponent(txtN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etRes)
                    .addComponent(txtRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMas)
                    .addComponent(btnMenos)
                    .addComponent(btnPor)
                    .addComponent(btnDiv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiar)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        this.recuperarCajas();
        int res;
        if (this.opsCorrectos) {
            res = n1 + n2;
            txtRes.setText(String.valueOf(res));
        }
    }//GEN-LAST:event_btnMasActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        this.recuperarCajas();
        int res;
        if (this.opsCorrectos) {
            res = n1 - n2;
            txtRes.setText(String.valueOf(res));
        }
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorActionPerformed
        this.recuperarCajas();
        int res;
        if (this.opsCorrectos) {
            res = n1 * n2;
            txtRes.setText(String.valueOf(res));
        }
    }//GEN-LAST:event_btnPorActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        int res;
        this.recuperarCajas();

        if (this.opsCorrectos) {
            if (n2 == 0) {
                txtRes.setText("Error al dividir por cero.");
            } else {
                res = n1 / n2;
                txtRes.setText(String.valueOf(res));
            }
        }
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtN1.setText("");
        txtN2.setText("");
        txtRes.setText("");
        txtN1.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void recuperarCajas() {
        String cad1 = txtN1.getText().trim();
        String cad2 = txtN2.getText().trim();

        try {
            n1 = Integer.parseInt(cad1);
            System.out.println("Conversión de 1 correcta");
            n2 = Integer.parseInt(cad2);
            System.out.println("Conversión de 2 correcta");
            this.opsCorrectos=true;
        } catch (Exception e) {
            //txtRes.setText("Revisa");
            javax.swing.JOptionPane.showMessageDialog(null,"Revisa los números que has puesto", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            this.opsCorrectos=false;
        }
    }

    private int n1;
    private int n2;
    private boolean opsCorrectos;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnPor;
    private javax.swing.JLabel etN1;
    private javax.swing.JLabel etN2;
    private javax.swing.JLabel etRes;
    private javax.swing.JTextField txtN1;
    private javax.swing.JTextField txtN2;
    private javax.swing.JTextField txtRes;
    // End of variables declaration//GEN-END:variables
}
