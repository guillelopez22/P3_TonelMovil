/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import Classes.Lista_Relacion;
import Classes.Lugar;
import Classes.Matrices;
import Classes.Relacion_Destinos;
import Classes.lista_lugares;
import static Windows.Dijskstra.cb_origen;
import static Windows.EliminarNodo.cb_eliminar;
import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.UndirectedSparseMultigraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import java.awt.Dimension;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Memo
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public static Matrices matrices = new Matrices();
    public static int ContadorNodos = 0;
    
    public MainWindow() {
        initComponents();
        Scanner sc = null;
        File archivo = null;
        try {
            archivo = new File("./mapa.txt");
            sc = new Scanner(archivo);
            sc.useDelimiter(",");
            while (sc.hasNext()) {
                int distancia = sc.nextInt();
                Lugar lugar1 = new Lugar(sc.next());
                Lugar lugar2 = new Lugar(sc.next());
                if (size == 0) {
                    Relacion_Destinos m = new Relacion_Destinos(distancia, lugar1, lugar2);
                    relaciones.insert(m, size);
                    size++;
                } else if (relaciones.get(size - 1).getPunto1().getNombre().equals(lugar1.getNombre())) {
                    Relacion_Destinos m = new Relacion_Destinos(distancia, relaciones.get(size - 1).getPunto1(), lugar2);
                    relaciones.insert(m, size);
                    size++;
                } else if (relaciones.get(size - 1).getPunto2().getNombre().equals(lugar1.getNombre())) {
                    Relacion_Destinos m = new Relacion_Destinos(distancia, relaciones.get(size - 1).getPunto2(), lugar2);
                    relaciones.insert(m, size);
                    size++;
                } else if (relaciones.get(size - 1).getPunto1().getNombre().equals(lugar2.getNombre())) {
                    Relacion_Destinos m = new Relacion_Destinos(distancia, relaciones.get(size - 1).getPunto1(), lugar1);
                    relaciones.insert(m, size);
                    size++;
                } else if (relaciones.get(size - 1).getPunto2().getNombre().equals(lugar2.getNombre())) {
                    Relacion_Destinos m = new Relacion_Destinos(distancia, relaciones.get(size - 1).getPunto2(), lugar1);
                    relaciones.insert(m, size);
                    size++;
                }                
            }
        } catch (Exception e) {
        } finally {
            sc.close();
        }
                Scanner sc1 = null;
        File archivo2 = null;
        try {
            archivo2 = new File("./lugares.txt");
            sc = new Scanner(archivo2);
            sc.useDelimiter(",");
            while (sc.hasNext()) {
                Lugar lugar1 = new Lugar(sc.next());
                lugares.insert(lugar1, size2);
                size2++;
            }
        } catch (Exception e) {
        } finally {
            sc.close();
        }
      lugares.Print_Lista();
        
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jd_crear_relacion = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_distancia = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cb_lugar1 = new javax.swing.JComboBox();
        cb_lugar2 = new javax.swing.JComboBox();
        jd_crear_lugar = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nom_lugar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        ViewMap = new javax.swing.JMenuItem();
        DijkstraMenuItem = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jLabel1.setText("Crear Nueva Ruta");

        jLabel2.setText("Nuevo Lugar:");

        jLabel3.setText("Lugar que esta conectado:");

        jLabel4.setText("Distancia entre ambos:");

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_crear_relacionLayout = new javax.swing.GroupLayout(jd_crear_relacion.getContentPane());
        jd_crear_relacion.getContentPane().setLayout(jd_crear_relacionLayout);
        jd_crear_relacionLayout.setHorizontalGroup(
            jd_crear_relacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crear_relacionLayout.createSequentialGroup()
                .addGroup(jd_crear_relacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_crear_relacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_crear_relacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(jd_crear_relacionLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGroup(jd_crear_relacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jd_crear_relacionLayout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel1))
                                    .addGroup(jd_crear_relacionLayout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addGroup(jd_crear_relacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_distancia)
                                            .addComponent(cb_lugar1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cb_lugar2, 0, 140, Short.MAX_VALUE)))))))
                    .addGroup(jd_crear_relacionLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jButton1)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jd_crear_relacionLayout.setVerticalGroup(
            jd_crear_relacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crear_relacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_crear_relacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_lugar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_crear_relacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_lugar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_crear_relacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_distancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        jLabel5.setText("Crear Nuevo Lugar");

        jLabel6.setText("Nombre:");

        jButton2.setText("Agregar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_crear_lugarLayout = new javax.swing.GroupLayout(jd_crear_lugar.getContentPane());
        jd_crear_lugar.getContentPane().setLayout(jd_crear_lugarLayout);
        jd_crear_lugarLayout.setHorizontalGroup(
            jd_crear_lugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crear_lugarLayout.createSequentialGroup()
                .addGroup(jd_crear_lugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_crear_lugarLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel5))
                    .addGroup(jd_crear_lugarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(26, 26, 26)
                        .addComponent(txt_nom_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_crear_lugarLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jButton2)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jd_crear_lugarLayout.setVerticalGroup(
            jd_crear_lugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crear_lugarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_crear_lugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_nom_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu3.setText("File");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");

        jMenuItem5.setText("Crear Lugar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem2.setText("Crear Ruta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem4.setText("Eliminar Ciudad");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("View");

        ViewMap.setText("Mapa..");
        ViewMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewMapActionPerformed(evt);
            }
        });
        jMenu5.add(ViewMap);

        DijkstraMenuItem.setText("Dijkstra");
        DijkstraMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DijkstraMenuItemMouseClicked(evt);
            }
        });
        DijkstraMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DijkstraMenuItemActionPerformed(evt);
            }
        });
        jMenu5.add(DijkstraMenuItem);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        jd_crear_lugar.setModal(true);
        jd_crear_lugar.pack();
        jd_crear_lugar.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        DefaultComboBoxModel modelo1 = new DefaultComboBoxModel();
        for (int i = 0; i <= size2 - 1; i++) {
            //System.out.println(lugares.get(i).getNombre());
            modelo.addElement(lugares.get(i).toString());
            modelo1.addElement(lugares.get(i).toString());
            //modelo.addElement(relaciones.get(i).getPunto1().toString());
            //modelo.addElement(relaciones.get(i).getPunto2().toString());
        }
        cb_lugar1.setModel(modelo);
        cb_lugar2.setModel(modelo1);
        this.jd_crear_relacion.setModal(true);
        this.jd_crear_relacion.pack();
        this.jd_crear_relacion.setVisible(true);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        EliminarNodo window = new EliminarNodo();
        DefaultComboBoxModel  model = new DefaultComboBoxModel();
        for (int i = 0; i < size2; i++) {
            model.addElement(lugares.get(i));
        }
        cb_eliminar.setModel(model);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void ViewMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewMapActionPerformed
        // TODO add your handling code here:
        
        for (int i = 0; i < size; i++) {
            grafo.addEdge(relaciones.get(i), relaciones.get(i).getPunto1(), relaciones.get(i).getPunto2(), EdgeType.UNDIRECTED);
        }
        Layout<Integer, String> layout = new CircleLayout(grafo);
        layout.setSize(new Dimension(550, 550));
        BasicVisualizationServer<Integer, String> visualization = new BasicVisualizationServer<Integer, String>(layout);
        visualization.setPreferredSize(new Dimension(600, 600));
        visualization.getRenderContext().setLabelOffset(20);
        visualization.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
        visualization.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
        JFrame frame = new JFrame("Honduras");
        frame.getContentPane().add(visualization);
        
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_ViewMapActionPerformed

    private void DijkstraMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DijkstraMenuItemMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_DijkstraMenuItemMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        Lugar NuevoLugar = new Lugar(cb_lugar1.getSelectedItem().toString());
        Lugar lugarconectado = new Lugar(cb_lugar2.getSelectedItem().toString());
        int distancia = Integer.parseInt(txt_distancia.getText());
        Relacion_Destinos z = new Relacion_Destinos(distancia, NuevoLugar, lugarconectado);
        boolean existe = false;
        for (int i = 0; i <= size - 1; i++) {
            if (NuevoLugar.getNombre().contentEquals(lugarconectado.getNombre())) {
                existe = true;
            } else if ((z.getPunto1().getNombre().contentEquals(relaciones.get(i).getPunto1().getNombre())) && (z.getPunto2().getNombre().contentEquals(relaciones.get(i).getPunto2().getNombre()))) {//.equals(relaciones.get(i).getPunto1())&&z.getPunto2().equals(relaciones.get(i).getPunto2()))
                existe = true;
            }
            
        }
        relaciones.Print_Lista();
        if (existe) {
            JOptionPane.showMessageDialog(this, "Ya Existe o mismo destino entre ambos");
            txt_distancia.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "No existe, sera agregado");
            relaciones.insert(z, size);
            size++;
            relaciones.Print_Lista();
            File archivo;
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                archivo = new File("./mapa.txt");
                fw = new FileWriter(archivo, true);
                bw = new BufferedWriter(fw);
                bw.write(distancia + ",");
                bw.write(NuevoLugar + ",");
                bw.write(lugarconectado + ",");
                bw.flush();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    bw.close();
                    fw.close();
                } catch (IOException ex) {
                }
                
            }
            txt_distancia.setText("");
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Lugar nom = new Lugar(txt_nom_lugar.getText());
        txt_nom_lugar.setText("");
        boolean existe = false;
        for (int i = 0; i <= size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (nom.getNombre().equals(relaciones.get(i).getPunto1().getNombre())) {
                    existe = true;
                }
                if (nom.getNombre().equals(relaciones.get(j).getPunto2().getNombre())) {
                    existe = true;
                }
            }
        }
        for (int i = 0; i <= size2 - 1; i++) {
            if (nom.getNombre().contentEquals(lugares.get(i).getNombre())) {
                existe = true;
            }
        }
        txt_nom_lugar.setText("");
        if (existe) {
            JOptionPane.showMessageDialog(this, "Ya Existe");
        } else {
            grafo.addVertex(nom);
            lugares.insert(nom, size2);
            size2++;
            File archivo;
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                archivo = new File("./lugares.txt");
                fw = new FileWriter(archivo, true);
                bw = new BufferedWriter(fw);
                bw.write(nom + ",");
                
                bw.flush();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    bw.close();
                    fw.close();
                } catch (IOException ex) {
                }
                
            }
            
            lugares.Print_Lista();
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DijkstraMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DijkstraMenuItemActionPerformed
        // TODO add your handling code here:
        Dijskstra d = new Dijskstra();
        d.setVisible(true);
        d.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (int i = 0; i < size2; i++) {
            model.addElement(lugares.get(i));
        }
        cb_origen.setModel(model);
    }//GEN-LAST:event_DijkstraMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DijkstraMenuItem;
    private javax.swing.JMenuItem ViewMap;
    private javax.swing.JComboBox cb_lugar1;
    private javax.swing.JComboBox cb_lugar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JDialog jd_crear_lugar;
    private javax.swing.JDialog jd_crear_relacion;
    private javax.swing.JTextField txt_distancia;
    private javax.swing.JTextField txt_nom_lugar;
    // End of variables declaration//GEN-END:variables
    public static UndirectedSparseMultigraph grafo = new UndirectedSparseMultigraph<Lugar, Relacion_Destinos>();
    public static Lista_Relacion relaciones = new Lista_Relacion();
    public static lista_lugares lugares = new lista_lugares();
    
    public static int size = 0;
    public static int size2 = 0;
}
