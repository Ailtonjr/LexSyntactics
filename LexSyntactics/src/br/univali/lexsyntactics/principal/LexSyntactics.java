
package br.univali.lexsyntactics.principal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

public class LexSyntactics extends javax.swing.JFrame {

    public static String html = "<html>\n";
    private String htmlGravacao = "";

    public LexSyntactics() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelGeral = new javax.swing.JPanel();
        buttonVisualizar = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        labelPreview = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaTexto = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        buttonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LexSyntactics");
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {1};
        layout.rowHeights = new int[] {1};
        layout.columnWeights = new double[] {1.0};
        layout.rowWeights = new double[] {1.0};
        getContentPane().setLayout(layout);

        java.awt.GridBagLayout panelGeralLayout = new java.awt.GridBagLayout();
        panelGeralLayout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0};
        panelGeralLayout.rowHeights = new int[] {0, 5, 0, 5, 0};
        panelGeralLayout.columnWeights = new double[] {1.0};
        panelGeralLayout.rowWeights = new double[] {1.0};
        panelGeral.setLayout(panelGeralLayout);

        buttonVisualizar.setText("Visualizar");
        buttonVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVisualizarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 718, 12, 0);
        panelGeral.add(buttonVisualizar, gridBagConstraints);

        jSplitPane1.setDividerLocation(500);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        labelPreview.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jScrollPane2.setViewportView(labelPreview);

        jSplitPane1.setRightComponent(jScrollPane2);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        textAreaTexto.setColumns(20);
        textAreaTexto.setRows(5);
        jScrollPane1.setViewportView(textAreaTexto);

        jSplitPane1.setLeftComponent(jScrollPane1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 801;
        gridBagConstraints.ipady = 516;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(12, 11, 0, 11);
        panelGeral.add(jSplitPane1, gridBagConstraints);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        panelGeral.add(jPanel1, gridBagConstraints);

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 8;
        panelGeral.add(buttonSalvar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(panelGeral, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVisualizarActionPerformed
        try {
            Lexico lex = new Lexico(textAreaTexto.getText());
            Sintatico sin = new Sintatico();
            Semantico sen = new Semantico();
            sin.parse(lex, sen);
        } catch (Exception ex) {
            System.err.println(ex);
        }
        htmlGravacao = html;
        labelPreview.setText(html);
        html = "<html>\n";
    }//GEN-LAST:event_buttonVisualizarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if (!htmlGravacao.equals("")) {
            try {
                JFileChooser fileChooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Pagina HTML", "html");
                fileChooser.setFileFilter(filter);
                
                int option = fileChooser.showSaveDialog(null);
                if (option == JFileChooser.APPROVE_OPTION) {
                    FileWriter fw = new FileWriter(fileChooser.getSelectedFile() + ".html");
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(htmlGravacao);
                    
                    bw.close();
                    fw.close();
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar arquivo");
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "É necessário escrever um texto para salvar.");
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LexSyntactics.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(LexSyntactics.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(LexSyntactics.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LexSyntactics.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LexSyntactics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JButton buttonVisualizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel labelPreview;
    private javax.swing.JPanel panelGeral;
    private javax.swing.JTextArea textAreaTexto;
    // End of variables declaration//GEN-END:variables
}
