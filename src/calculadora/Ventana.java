/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;


/**
 *
 * @author raulvelascoreyes
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Barra = new javax.swing.JTextField();
        Cero = new javax.swing.JButton();
        Uno = new javax.swing.JButton();
        Dos = new javax.swing.JButton();
        Tres = new javax.swing.JButton();
        ParenIzquierdo = new javax.swing.JButton();
        Punto = new javax.swing.JButton();
        Igual = new javax.swing.JButton();
        ParenDerecho = new javax.swing.JButton();
        Cuatro = new javax.swing.JButton();
        Siete = new javax.swing.JButton();
        Cinco = new javax.swing.JButton();
        Ocho = new javax.swing.JButton();
        Nueve = new javax.swing.JButton();
        Seis = new javax.swing.JButton();
        Menos = new javax.swing.JButton();
        Por = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Entre = new javax.swing.JButton();
        Suma = new javax.swing.JButton();
        Potencia = new javax.swing.JButton();

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        jButton2.setText("1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));

        Barra.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        Barra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarraActionPerformed(evt);
            }
        });

        Cero.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        Cero.setText("0");
        Cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CeroActionPerformed(evt);
            }
        });

        Uno.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        Uno.setText("1");
        Uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnoActionPerformed(evt);
            }
        });

        Dos.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        Dos.setText("2");
        Dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DosActionPerformed(evt);
            }
        });

        Tres.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        Tres.setText("3");
        Tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TresActionPerformed(evt);
            }
        });

        ParenIzquierdo.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        ParenIzquierdo.setText("(");
        ParenIzquierdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParenIzquierdoActionPerformed(evt);
            }
        });

        Punto.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        Punto.setText(".");
        Punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntoActionPerformed(evt);
            }
        });

        Igual.setFont(new java.awt.Font("Helvetica Neue", 0, 45)); // NOI18N
        Igual.setText("=");
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });

        ParenDerecho.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        ParenDerecho.setText(")");
        ParenDerecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParenDerechoActionPerformed(evt);
            }
        });

        Cuatro.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        Cuatro.setText("4");
        Cuatro.setToolTipText("");
        Cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuatroActionPerformed(evt);
            }
        });

        Siete.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        Siete.setText("7");
        Siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SieteActionPerformed(evt);
            }
        });

        Cinco.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        Cinco.setText("5");
        Cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CincoActionPerformed(evt);
            }
        });

        Ocho.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        Ocho.setText("8");
        Ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OchoActionPerformed(evt);
            }
        });

        Nueve.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        Nueve.setText("9");
        Nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NueveActionPerformed(evt);
            }
        });

        Seis.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        Seis.setText("6");
        Seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeisActionPerformed(evt);
            }
        });

        Menos.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        Menos.setText("-");
        Menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenosActionPerformed(evt);
            }
        });

        Por.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        Por.setText("x");
        Por.setToolTipText("");
        Por.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorActionPerformed(evt);
            }
        });

        Eliminar.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        Eliminar.setText("c");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Entre.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        Entre.setText("/");
        Entre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntreActionPerformed(evt);
            }
        });

        Suma.setFont(new java.awt.Font("Helvetica Neue", 0, 45)); // NOI18N
        Suma.setText("+");
        Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaActionPerformed(evt);
            }
        });

        Potencia.setFont(new java.awt.Font("Helvetica Neue", 0, 45)); // NOI18N
        Potencia.setText("^");
        Potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PotenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Barra)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Siete, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Seis, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Por, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Entre, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Uno, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Dos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Tres, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Menos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Cero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Punto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ParenDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ParenIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Barra, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Siete, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Seis, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Entre, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Por, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Uno, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tres, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ParenIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Menos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Cero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Punto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ParenDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BarraActionPerformed

    private void PuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntoActionPerformed
        Barra.setText(Barra.getText()+".");
    }//GEN-LAST:event_PuntoActionPerformed

    private void CeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CeroActionPerformed
        Barra.setText(Barra.getText()+"0");
    }//GEN-LAST:event_CeroActionPerformed

    private void UnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnoActionPerformed
        Barra.setText(Barra.getText()+"1");
    }//GEN-LAST:event_UnoActionPerformed

    private void DosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DosActionPerformed
        Barra.setText(Barra.getText()+"2");
    }//GEN-LAST:event_DosActionPerformed

    private void TresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TresActionPerformed
        Barra.setText(Barra.getText()+"3");
    }//GEN-LAST:event_TresActionPerformed

    private void CuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuatroActionPerformed
        Barra.setText(Barra.getText()+"4");
    }//GEN-LAST:event_CuatroActionPerformed

    private void CincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CincoActionPerformed
        Barra.setText(Barra.getText()+"5");
    }//GEN-LAST:event_CincoActionPerformed

    private void SeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeisActionPerformed
        Barra.setText(Barra.getText()+"6");
    }//GEN-LAST:event_SeisActionPerformed

    private void SieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SieteActionPerformed
        Barra.setText(Barra.getText()+"7");
    }//GEN-LAST:event_SieteActionPerformed

    private void OchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OchoActionPerformed
        Barra.setText(Barra.getText()+"8");
    }//GEN-LAST:event_OchoActionPerformed

    private void NueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NueveActionPerformed
        Barra.setText(Barra.getText()+"9");
    }//GEN-LAST:event_NueveActionPerformed

    private void PotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PotenciaActionPerformed
        Barra.setText(Barra.getText()+"^");
    }//GEN-LAST:event_PotenciaActionPerformed

    private void PorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorActionPerformed
        Barra.setText(Barra.getText()+"x");
    }//GEN-LAST:event_PorActionPerformed

    private void MenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenosActionPerformed
        Barra.setText(Barra.getText()+"-");
    }//GEN-LAST:event_MenosActionPerformed

    private void SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaActionPerformed
        Barra.setText(Barra.getText()+"+");
    }//GEN-LAST:event_SumaActionPerformed

    private void ParenDerechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParenDerechoActionPerformed
        Barra.setText(Barra.getText()+")");
    }//GEN-LAST:event_ParenDerechoActionPerformed

    private void ParenIzquierdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParenIzquierdoActionPerformed
        Barra.setText(Barra.getText()+"(");
    }//GEN-LAST:event_ParenIzquierdoActionPerformed

    private void EntreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntreActionPerformed
        Barra.setText(Barra.getText()+"/");
    }//GEN-LAST:event_EntreActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        Barra.setText("");
    }//GEN-LAST:event_EliminarActionPerformed

    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
        String infijo = Barra.getText();
        
        Calculadora calculadora=new Calculadora(infijo);
        int res = calculadora.calcular();
        Barra.setText("" + res);
        System.out.println("infijo: "+ calculadora.getCadena());
        System.out.println("postijo: " + Calculadora.infixToPostfix(infijo));
        System.out.println("calculado: "+ calculadora.calcular());
    }//GEN-LAST:event_IgualActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Barra;
    private javax.swing.JButton Cero;
    private javax.swing.JButton Cinco;
    private javax.swing.JButton Cuatro;
    private javax.swing.JButton Dos;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Entre;
    private javax.swing.JButton Igual;
    private javax.swing.JButton Menos;
    private javax.swing.JButton Nueve;
    private javax.swing.JButton Ocho;
    private javax.swing.JButton ParenDerecho;
    private javax.swing.JButton ParenIzquierdo;
    private javax.swing.JButton Por;
    private javax.swing.JButton Potencia;
    private javax.swing.JButton Punto;
    private javax.swing.JButton Seis;
    private javax.swing.JButton Siete;
    private javax.swing.JButton Suma;
    private javax.swing.JButton Tres;
    private javax.swing.JButton Uno;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
