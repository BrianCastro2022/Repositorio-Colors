/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerEvent;
import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 *
 * @author migue
 */
public class interfaz extends javax.swing.JFrame {
    
    public int numeros[] = new int[100];
    public int indice = 0;

    /**
     * Creates new form interfaz
     */
    public interfaz() {
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

        jPanel4 = new javax.swing.JPanel();
        almacenarnum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Agregar = new javax.swing.JButton();
        Mostrar = new javax.swing.JButton();
        Ordene = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jlabel4 = new javax.swing.JPanel();
        resultado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setForeground(new java.awt.Color(0, 153, 153));

        almacenarnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almacenarnumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(almacenarnum)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(almacenarnum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setText("Digite el numero aqui");

        Agregar.setBackground(new java.awt.Color(52, 152, 219));
        Agregar.setText("AgregarNum");
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgregarMouseExited(evt);
            }
        });
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Mostrar.setBackground(new java.awt.Color(192, 57, 43));
        Mostrar.setText("Mostrar");
        Mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MostrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MostrarMouseExited(evt);
            }
        });
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });

        Ordene.setBackground(new java.awt.Color(52, 152, 219));
        Ordene.setText("Ordene");
        Ordene.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OrdeneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OrdeneMouseExited(evt);
            }
        });
        Ordene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdeneActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(192, 57, 43));
        salir.setText("Salir");
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Agregar)
                .addGap(18, 18, 18)
                .addComponent(Mostrar)
                .addGap(37, 37, 37)
                .addComponent(Ordene)
                .addGap(43, 43, 43)
                .addComponent(salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar)
                    .addComponent(Mostrar)
                    .addComponent(Ordene)
                    .addComponent(salir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 102));
        jTextField1.setText("INSERTE NUMERO");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jlabel4.setBackground(new java.awt.Color(153, 255, 153));

        resultado.setBackground(new java.awt.Color(0, 0, 0));
        resultado.setForeground(new java.awt.Color(153, 0, 0));
        resultado.setText("<<                   >> ");

        javax.swing.GroupLayout jlabel4Layout = new javax.swing.GroupLayout(jlabel4);
        jlabel4.setLayout(jlabel4Layout);
        jlabel4Layout.setHorizontalGroup(
            jlabel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlabel4Layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jlabel4Layout.setVerticalGroup(
            jlabel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlabel4Layout.createSequentialGroup()
                .addComponent(resultado)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jLabel3.setText("Aquí se muestra su número");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(194, 194, 194)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
         if (!validar(almacenarnum.getText().trim()))
       {
           JOptionPane.showMessageDialog(rootPane, "solo ingrese numeros ");
           almacenarnum.setText("");
       }
       else 
        JOptionPane.showMessageDialog(rootPane, "agrege otro numero");
       numeros [indice]=Integer.parseInt(almacenarnum.getText());
       indice++;
       almacenarnum.setText("");    
        
    }//GEN-LAST:event_AgregarActionPerformed
public static boolean validar(String datos)
    {
        return datos.matches("[0-9]*");
    }

    
    private void almacenarnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almacenarnumActionPerformed
        // TODO add your handling code here:
        
       
        
    }//GEN-LAST:event_almacenarnumActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        // TODO add your handling code here:
        String mensaje=" ";
        for (int i=0; i<indice; i++)
        {
            mensaje=mensaje+numeros[i]+"";  
        }
        resultado.setText(mensaje);
        
        
        
    }//GEN-LAST:event_MostrarActionPerformed

    private void OrdeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdeneActionPerformed
        // TODO add your handling code here:
        
        for(int i=0; i < (indice-1)  ;i ++)
          {
              for (int j=0;j<(indice-1);j++) 
              {
                  if (numeros[j]> numeros [j+1])
                  {
                     int aux= numeros[j];
                      numeros[j]=numeros[j+1];
                      numeros[j+1]= aux;
                  }
              }
          }
        String mensajeLista = " ";
        for (int i=0;i<indice;i++)
        {
         mensajeLista = mensajeLista + numeros [i]+"-";
        resultado.setText(mensajeLista);
        }    
    }//GEN-LAST:event_OrdeneActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_salirActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void AgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseEntered

 Agregar.setBackground(new java.awt.Color(52,152,219));        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarMouseEntered

    private void MostrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarMouseEntered
 Mostrar.setBackground(new java.awt.Color(192,57,43));        // TODO add your handling code here:
    }//GEN-LAST:event_MostrarMouseEntered

    private void OrdeneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrdeneMouseEntered
 Ordene.setBackground(new java.awt.Color(52,152,219));        // TODO add your handling code here:
    }//GEN-LAST:event_OrdeneMouseEntered

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
     salir.setBackground(new java.awt.Color(192,57,43));    // TODO add your handling code here:
    }//GEN-LAST:event_salirMouseEntered

    private void AgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseExited
 Agregar.setBackground(new java.awt.Color(51, 51,51));        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarMouseExited

    private void MostrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarMouseExited
Mostrar.setBackground(new java.awt.Color(51, 51,51));         // TODO add your handling code here:
    }//GEN-LAST:event_MostrarMouseExited

    private void OrdeneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrdeneMouseExited
Ordene.setBackground(new java.awt.Color(51, 51,51));         // TODO add your handling code here:
    }//GEN-LAST:event_OrdeneMouseExited

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
salir.setBackground(new java.awt.Color(51, 51,51));         // TODO add your handling code here:
    }//GEN-LAST:event_salirMouseExited

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Mostrar;
    private javax.swing.JButton Ordene;
    private javax.swing.JTextField almacenarnum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jlabel4;
    private javax.swing.JLabel resultado;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
