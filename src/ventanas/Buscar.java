package ventanas;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexion.ConexionBD;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;
import tablas.Categorias;
import tablas.Fichas;
import tablas.Fuentes;
import tablas.SubCategorias1;
import tablas.SubCategorias2;
import tablas.SubCategorias3;

public class Buscar extends javax.swing.JFrame {
    
    Connection conexion = null;
    String tabla, par;
    ResultSet resultSet, resultSetId;
    
    Categorias categorias = new Categorias();
    Fichas fichas = new Fichas();
    Fuentes fuentes = new Fuentes();
    SubCategorias1 subCategorias1 = new SubCategorias1();
    SubCategorias2 subCategorias2 = new SubCategorias2();
    SubCategorias3 subCategorias3 = new SubCategorias3();
    
    public Buscar() {
        initComponents();
        setTitle("Fichero 2.0 / buscar");
        this.setLocationRelativeTo(null);
        txtFicha.setLineWrap(true);
        txtFicha.setWrapStyleWord(true);
        
        cbBuscar.setVisible(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filtros = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        cbBuscar = new javax.swing.JComboBox();
        rbuFuente = new javax.swing.JRadioButton();
        rbuCategoria = new javax.swing.JRadioButton();
        rbuTexto = new javax.swing.JRadioButton();
        rbuNoficha = new javax.swing.JRadioButton();
        rbuAvanzado = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        lblNumero = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblSub1 = new javax.swing.JLabel();
        lblSub2 = new javax.swing.JLabel();
        lblSub3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFicha = new javax.swing.JTextArea();
        btnSig = new javax.swing.JButton();
        btnAnt = new javax.swing.JButton();
        lblFuente = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        txtCategoria = new javax.swing.JTextField();
        txtSub1 = new javax.swing.JTextField();
        txtSub2 = new javax.swing.JTextField();
        txtSub3 = new javax.swing.JTextField();
        txtFuente = new javax.swing.JTextField();
        btnUltimo = new javax.swing.JButton();
        btnPrimero = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblBuscar.setText("Buscar");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        filtros.add(rbuFuente);
        rbuFuente.setText("Fuente");
        rbuFuente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbuFuenteItemStateChanged(evt);
            }
        });

        filtros.add(rbuCategoria);
        rbuCategoria.setText("Categoría");
        rbuCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbuCategoriaItemStateChanged(evt);
            }
        });

        filtros.add(rbuTexto);
        rbuTexto.setText("Texto");
        rbuTexto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbuTextoItemStateChanged(evt);
            }
        });

        filtros.add(rbuNoficha);
        rbuNoficha.setText("No. de ficha");
        rbuNoficha.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbuNofichaItemStateChanged(evt);
            }
        });

        filtros.add(rbuAvanzado);
        rbuAvanzado.setText("Avanzado");
        rbuAvanzado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbuAvanzadoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lblBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbBuscar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(rbuNoficha)
                .addGap(20, 20, 20)
                .addComponent(rbuTexto)
                .addGap(20, 20, 20)
                .addComponent(rbuCategoria)
                .addGap(20, 20, 20)
                .addComponent(rbuFuente)
                .addGap(20, 20, 20)
                .addComponent(rbuAvanzado)
                .addGap(193, 193, 193))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar)
                            .addComponent(cbBuscar))
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBuscar)
                        .addComponent(btnBuscar)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbuFuente)
                    .addComponent(rbuNoficha)
                    .addComponent(rbuTexto)
                    .addComponent(rbuCategoria)
                    .addComponent(rbuAvanzado))
                .addGap(18, 18, 18))
        );

        lblNumero.setText("No. de Ficha");

        lblCategoria.setText("Categoría");

        txtId.setEditable(false);

        lblSub1.setText("Sub Categoría 1");

        lblSub2.setText("Sub Categoría 2");

        lblSub3.setText("Sub Categoría 3");

        txtFicha.setEditable(false);
        txtFicha.setColumns(20);
        txtFicha.setRows(5);
        jScrollPane1.setViewportView(txtFicha);

        btnSig.setText(">");
        btnSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigActionPerformed(evt);
            }
        });

        btnAnt.setText("<");
        btnAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntActionPerformed(evt);
            }
        });

        lblFuente.setText("Fuente");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        txtCategoria.setEditable(false);

        txtSub1.setEditable(false);

        txtSub2.setEditable(false);

        txtSub3.setEditable(false);

        txtFuente.setEditable(false);

        btnUltimo.setText(">>");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnPrimero.setText("<<");
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });

        btnExportar.setText("Exportar");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNumero)
                    .addComponent(lblSub2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId)
                    .addComponent(txtSub2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSub3)
                    .addComponent(lblCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCategoria)
                    .addComponent(txtSub3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSub1)
                    .addComponent(lblFuente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSub1)
                    .addComponent(txtFuente))
                .addGap(30, 30, 30))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExportar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrimero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUltimo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSig, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategoria)
                    .addComponent(lblSub1)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSub3)
                    .addComponent(lblSub2)
                    .addComponent(lblFuente)
                    .addComponent(txtSub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btnSig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(74, 74, 74))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(btnAnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrimero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(79, 79, 79)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnModificar)
                    .addComponent(btnExportar))
                .addGap(48, 48, 48))
        );

        lblInfo.setText("Fichero 2.0 creado por Carlos Gerado Cedillo Alcántar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfo))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        
        //inicio jFrame = new inicio();
        this.setVisible(false);
        //jFrame.setVisible(true);
        System.out.println("Regresando a inicio");
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        if( txtBuscar.getText().isEmpty() == true ){
            if( cbBuscar.getSelectedIndex() <= 0 ){
                JOptionPane.showMessageDialog(null, "Debe llenar el campo de busqueda");
            }else{
                if( rbuCategoria.isSelected() == true ){
                    try {
                        buscarCategoria();
                    } catch (SQLException ex) {
                        Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (BadLocationException ex) {
                        Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    if( rbuFuente.isSelected() == true ){
                        try {
                            buscarFuente();
                        } catch (SQLException ex) {
                            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (BadLocationException ex) {
                            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Debe seleccionar un filtro");
                    }
                }
            }
        }else{
            if( rbuTexto.isSelected() == true ){
                par = txtBuscar.getText();
                try {
                    buscarTexto(par);
                } catch (SQLException ex) {
                    Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
                } catch (BadLocationException ex) {
                    Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                if( rbuNoficha.isSelected() == true ){
                    par = txtBuscar.getText();
                    try {
                        buscarNoficha(par);
                                } catch (SQLException ex) {
                        Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (BadLocationException ex) {
                        Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un filtro");
                }
            }
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigActionPerformed
        try {
            
            Boolean accion = resultSet.next();
            
           if( accion == false ){
                JOptionPane.showMessageDialog(null, "Ya es el ultimo registro");
            }else{
                mostrar(resultSet);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (BadLocationException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSigActionPerformed

    private void btnAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntActionPerformed
         try {
            
            Boolean accion = resultSet.previous();
            
           if( accion == false ){
                JOptionPane.showMessageDialog(null, "Ya es el primeer registro");
            }else{
                mostrar(resultSet);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (BadLocationException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAntActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        if( !txtId.getText().isEmpty() ){
            
            try {
            // TODO add your handling code here:
            Modificar jFrame = new Modificar();
            this.setVisible(true);
            System.out.println("Va modificar la ficha");
            jFrame.setVisible(true);
            
            Modificar.txtId.setText(txtId.getText());
            Modificar.txtCategoria.setText(txtCategoria.getText());
            Modificar.txtSub1.setText(txtSub1.getText());
            Modificar.txtSub2.setText(txtSub2.getText());
            Modificar.txtSub3.setText(txtSub3.getText());
            Modificar.txtFuente.setText(txtFuente.getText());
            Modificar.txtFicha.setText(txtFicha.getText());
            
            } catch (ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
            
            this.dispose();
            
        }else{
            JOptionPane.showMessageDialog(null, "No hay ficha que modificar");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
         try {
            
            Boolean accion = resultSet.last();
            
           if( accion == false ){
                JOptionPane.showMessageDialog(null, "Ya es el ultimo registro");
            }else{
                mostrar(resultSet);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (BadLocationException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        try {
            
            Boolean accion = resultSet.first();
            
           if( accion == false ){
                JOptionPane.showMessageDialog(null, "Ya es el primeer registro");
            }else{
                mostrar(resultSet);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (BadLocationException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void rbuCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbuCategoriaItemStateChanged
        // TODO add your handling code here:
        txtBuscar.setVisible(false);
        txtBuscar.setText("");
        
        System.out.println("Buscando por categorias");
        cbBuscar.setVisible(true);
        
        cbBuscar.removeAllItems();
        lisatrCategorias();
        
        txtId.setText(""); txtCategoria.setText(""); txtSub1.setText("");
        txtSub2.setText(""); txtSub3.setText(""); txtFuente.setText(""); txtFicha.setText("");
        
        
    }//GEN-LAST:event_rbuCategoriaItemStateChanged

    private void rbuFuenteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbuFuenteItemStateChanged
        // TODO add your handling code here:
        txtBuscar.setVisible(false);
        txtBuscar.setText("");
        
        System.out.println("Buscando por fuentes");
        cbBuscar.setVisible(true);
        
        cbBuscar.removeAllItems();
        listarFuentes();
        
        txtId.setText(""); txtCategoria.setText(""); txtSub1.setText("");
        txtSub2.setText(""); txtSub3.setText(""); txtFuente.setText(""); txtFicha.setText("");
        
        
    }//GEN-LAST:event_rbuFuenteItemStateChanged

    private void rbuTextoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbuTextoItemStateChanged
        // TODO add your handling code here:
        txtBuscar.setVisible(true);
        System.out.println("Buscando por texto");
        cbBuscar.setVisible(false);
        txtBuscar.setText("");
        
        txtId.setText(""); txtCategoria.setText(""); txtSub1.setText("");
        txtSub2.setText(""); txtSub3.setText(""); txtFuente.setText(""); txtFicha.setText("");
        
    }//GEN-LAST:event_rbuTextoItemStateChanged

    private void rbuNofichaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbuNofichaItemStateChanged
        // TODO add your handling code here:
        txtBuscar.setVisible(true);
        System.out.println("Buscando por Fuentes");
        cbBuscar.setVisible(false);
        txtBuscar.setText("");
        
        txtId.setText(""); txtCategoria.setText(""); txtSub1.setText("");
        txtSub2.setText(""); txtSub3.setText(""); txtFuente.setText(""); txtFicha.setText("");
    }//GEN-LAST:event_rbuNofichaItemStateChanged

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        // TODO add your handling code here:
        
        JFileChooser exportar = new JFileChooser();
        int eleccion = exportar.showSaveDialog(this);
        String fichaId, fichaCategoria, fichaSub1, fichaSub2, fichaSub3, fichaTexto, fichaFuente;
        
        fichaId = txtId.getText();
        fichaCategoria = txtCategoria.getText();
        fichaSub1 = txtSub1.getText();
        fichaSub2 = txtSub2.getText();
        fichaSub3 = txtSub3.getText();
        fichaTexto = txtFicha.getText();
        fichaFuente = txtFuente.getText();
        
        if( eleccion == JFileChooser.APPROVE_OPTION ){
            
            File ruta = exportar.getSelectedFile();
            
            try {
                
                FileOutputStream archivo = new FileOutputStream(ruta+".pdf");
                Document ficha = new Document();
                PdfWriter.getInstance(ficha, archivo);
                
                //INICIO parametros de los parrafos
                Paragraph espacio = new Paragraph("\n");
                
                Paragraph fuente = new Paragraph(fichaFuente);
                fuente.setAlignment(Element.ALIGN_RIGHT);
                
                PdfPTable table = new PdfPTable(2);
                PdfPCell cellOne = new PdfPCell(new Phrase("Categoría: "+fichaCategoria));
                PdfPCell cellTwo = new PdfPCell(new Phrase("Sub categoría 1: " + fichaSub1));
                PdfPCell cellThree = new PdfPCell(new Phrase("Sub categoría 2: " + fichaSub2));
                PdfPCell cellFour = new PdfPCell(new Phrase("Sub categoría 3: " + fichaSub3));

                cellOne.setBorder(Rectangle.NO_BORDER);
                cellTwo.setBorder(Rectangle.NO_BORDER);
                cellThree.setBorder(Rectangle.NO_BORDER);
                cellFour.setBorder(Rectangle.NO_BORDER);

                table.addCell(cellOne);
                table.addCell(cellTwo);
                table.addCell(cellThree);
                table.addCell(cellFour);

                
                //FIN parametros de los parrafos
                
                ficha.open();
                
                //INICIO agragando parrafos
                ficha.add(new Paragraph("No. de ficha: " + fichaId));
                ficha.add(espacio);
                
                ficha.add(table);
//                ficha.add(new Paragraph("Categoria: " + fichaCategoria));
//                ficha.add(new Paragraph("Sub categoria 1: " + fichaSub1));
//                ficha.add(new Paragraph("Sub categoria 2: " + fichaSub2));
//                ficha.add(new Paragraph("Sub categoria 3: " + fichaSub3));
        

                ficha.add(espacio);
                ficha.add(new Paragraph(fichaTexto));
                ficha.add(espacio);
                ficha.add(fuente);
                //FIN agragando parrafos
                
                ficha.close();
                
                JOptionPane.showMessageDialog(null, "Ficha guardada con éxito");
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        
        }
        
    }//GEN-LAST:event_btnExportarActionPerformed

    private void rbuAvanzadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbuAvanzadoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_rbuAvanzadoItemStateChanged
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnt;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSig;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox cbBuscar;
    private javax.swing.ButtonGroup filtros;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblFuente;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblSub1;
    private javax.swing.JLabel lblSub2;
    private javax.swing.JLabel lblSub3;
    private javax.swing.JRadioButton rbuAvanzado;
    private javax.swing.JRadioButton rbuCategoria;
    private javax.swing.JRadioButton rbuFuente;
    private javax.swing.JRadioButton rbuNoficha;
    private javax.swing.JRadioButton rbuTexto;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextArea txtFicha;
    private javax.swing.JTextField txtFuente;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtSub1;
    private javax.swing.JTextField txtSub2;
    private javax.swing.JTextField txtSub3;
    // End of variables declaration//GEN-END:variables

    //Buscar
    
    private void buscarTexto(String par) throws SQLException, BadLocationException {
        
        conexion = ConexionBD.obtenerConexion();
        Statement statement = conexion.createStatement(
                resultSet.TYPE_SCROLL_INSENSITIVE,
                resultSet.CONCUR_READ_ONLY);
        PreparedStatement preparedStatement;
        
        System.out.println("Ejecutando: SELECT * FROM fichas WHERE texto = '"+par+"'");
        
        try {
            
            ConexionBD.obtenerConexion();
            String sql = "SELECT * FROM fichas WHERE texto LIKE '%"+par+"%'";
            preparedStatement = conexion.prepareCall(sql);
            resultSet = statement.executeQuery(sql);
            
            resultSet.next();
            mostrar(resultSet);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro una ficha");
            System.out.println(ex.getMessage());
        }
    }
    
    private void buscarCategoria() throws SQLException, BadLocationException {
        
        // 1ro hay que obtener el id de la categoria seleccionada en el combo box
        Categorias categoria = (Categorias) cbBuscar.getSelectedItem();
        Integer categoriaId = categoria.getId();
        String categoriaNombre = categoria.getNombre();
        System.out.println("Buscando fichas con la categoria "+categoriaNombre+" con al id "+categoriaId);
        
        //Ahora hay que buscar las ficha que tenga la caregoria guardada en categoriaId
        conexion = ConexionBD.obtenerConexion();
        Statement statement = conexion.createStatement(
                resultSet.TYPE_SCROLL_INSENSITIVE,
                resultSet.CONCUR_READ_ONLY);
        PreparedStatement preparedStatement;
        
        System.out.println("Ejecutando: SELECT * FROM fichas WHERE categoria = '"+categoriaId+"'");
        
        try {
            
            ConexionBD.obtenerConexion();
            String sql = "SELECT * FROM fichas WHERE categoria = '"+categoriaId+"'";
            preparedStatement = conexion.prepareCall(sql);
            resultSet = statement.executeQuery(sql);
            
            resultSet.next();
            mostrar(resultSet);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro una ficha");
            System.out.println(ex.getMessage());
        }
    }

    private void buscarFuente() throws SQLException, BadLocationException {
    
        // 1ro hay que obtener el id de la fuente seleccionada en el combo box
        Fuentes fuentes = (Fuentes) cbBuscar.getSelectedItem();
        Integer fuenteId = fuentes.getId();
        String fuenteNombre = fuentes.getNombre();
        System.out.println("Buscando fichas con la fuente "+fuenteNombre+" con al id "+fuenteId);
        
        //Ahora hay que buscar las ficha que tenga la caregoria guardada en categoriaId
        conexion = ConexionBD.obtenerConexion();
        Statement statement = conexion.createStatement(
                resultSet.TYPE_SCROLL_INSENSITIVE,
                resultSet.CONCUR_READ_ONLY);
        PreparedStatement preparedStatement;
        
        System.out.println("Ejecutando: SELECT * FROM fichas WHERE fuente = '"+fuenteId+"'");
        
        try {
            
            ConexionBD.obtenerConexion();
            String sql = "SELECT * FROM fichas WHERE fuente = '"+fuenteId+"'";
            preparedStatement = conexion.prepareCall(sql);
            resultSet = statement.executeQuery(sql);
            
            resultSet.next();
            mostrar(resultSet);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro una ficha");
            System.out.println(ex.getMessage());
        }
    }
    
    private void buscarNoficha(String par) throws SQLException, BadLocationException{
        //Al buscar una ficha por id, no se debe de aceptar letras, es decir que solo números
        Pattern texto = Pattern.compile(".+[a-zA-ZñÑáéíóúÁÉÍÓÚ]+.?");
        Matcher sip = texto.matcher(par);
        
        if( sip.matches() ){
            JOptionPane.showMessageDialog(null, "Este tipo de busqueda no acepta letras");
        }else{
            Integer fichaId = Integer.parseInt(par);
            
            conexion = ConexionBD.obtenerConexion();
            Statement statement = conexion.createStatement(
                    resultSet.TYPE_SCROLL_INSENSITIVE,
                 resultSet.CONCUR_READ_ONLY);
            PreparedStatement preparedStatement;
        
            System.out.println("Ejecutando: SELECT * FROM fichas WHERE id = '"+fichaId+"'");

            try {

                ConexionBD.obtenerConexion();
                String sql = "SELECT * FROM fichas WHERE id = '"+fichaId+"'";
                preparedStatement = conexion.prepareCall(sql);
                resultSet = statement.executeQuery(sql);

                resultSet.next();
                mostrar(resultSet);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se encontro una ficha");
                System.out.println(ex.getMessage());
            }
        }
    }
    
    //Mostrar

    public void mostrar(ResultSet resultSet) throws SQLException, BadLocationException {
        txtId.setText(resultSet.getString(1));
        txtFicha.setText(resultSet.getString(2));
        
        Integer categoriaId = Integer.valueOf(resultSet.getString(3));
        mostrarCategoria(categoriaId);
        
        if( !resultSet.getString(4).isEmpty() ){
            Integer sub1Id = Integer.valueOf(resultSet.getString(4));
            mostrarSubcategoria1(sub1Id);
        }
        
        if( !resultSet.getString(5).isEmpty() ){
            Integer sub2Id = Integer.valueOf(resultSet.getString(5));
            mostrarSubcategoria2(sub2Id);
        }
        
        if( !resultSet.getString(6).isEmpty() ){
            Integer sub3Id = Integer.valueOf(resultSet.getString(6));
            mostrarSubcategoria3(sub3Id);
        }
        
        Integer fuenteId = Integer.valueOf(resultSet.getString(7));
        mostrarFuentes(fuenteId);
        
        marcarBusqueda(txtBuscar.getText(), txtFicha.getText());
        
    }

    private void mostrarCategoria(Integer categoriaId) {
        
        conexion = ConexionBD.obtenerConexion();
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        
        try {
            
            ConexionBD.obtenerConexion();
            String sql = "SELECT nombre FROM categorias WHERE id = "+categoriaId+"";
            preparedStatement = conexion.prepareCall(sql);
            resultSet = preparedStatement.executeQuery();
            
            resultSet.next();
            categorias.setNombre(resultSet.getString("nombre"));
            txtCategoria.setText(categorias.getNombre());
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void mostrarSubcategoria1(Integer sub1Id) {
        
        conexion = ConexionBD.obtenerConexion();
        ResultSet resultSet;
        
        if(sub1Id == 0){
            txtSub1.setText("");
        }else{
        
            try {
                String sql = "SELECT nombre FROM subCategorias1 WHERE id = "+ sub1Id +";";
                PreparedStatement preparedStatement = conexion.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery();

                resultSet.next();
                subCategorias1.setNombre(resultSet.getString("nombre"));
                txtSub1.setText(subCategorias1.getNombre());

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private void mostrarSubcategoria2(Integer sub2Id) {
        
        conexion = ConexionBD.obtenerConexion();
        ResultSet resultSet;
        
        if(sub2Id == 0){
            txtSub2.setText("");
        }else{
        
            try {
                String sql = "SELECT nombre FROM subCategorias2 WHERE id = "+ sub2Id +";";
                PreparedStatement preparedStatement = conexion.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery();

                resultSet.next();
                subCategorias2.setNombre(resultSet.getString("nombre"));
                txtSub2.setText(subCategorias2.getNombre());

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private void mostrarSubcategoria3(Integer sub3Id) {
        
        conexion = ConexionBD.obtenerConexion();
        ResultSet resultSet;
        
        if(sub3Id == 0){
            txtSub3.setText("");
        }else{
        
            try {
                String sql = "SELECT nombre FROM subCategorias3 WHERE id = "+ sub3Id +";";
                PreparedStatement preparedStatement = conexion.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery();

                resultSet.next();
                subCategorias3.setNombre(resultSet.getString("nombre"));
                txtSub3.setText(subCategorias3.getNombre());

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private void mostrarFuentes(Integer fuenteId) {
        
        conexion = ConexionBD.obtenerConexion();
        ResultSet resultSet;
        
        try {
            String sql = "SELECT nombre FROM fuentes WHERE id = "+ fuenteId +";";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
                
            resultSet.next();
            fuentes.setNombre(resultSet.getString("nombre"));
            txtFuente.setText(fuentes.getNombre());
                
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    //Listar

    private void lisatrCategorias() {
        
        cbBuscar.addItem("--Seleccione--");
        cbBuscar.setSelectedIndex(0);
        
        try {
            conexion = ConexionBD.obtenerConexion();
            ResultSet resultSet;
            String sql = "SELECT * FROM categorias ORDER BY nombre ASC;";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                Categorias categorias = new Categorias();
                categorias.setId(resultSet.getInt("id"));
                categorias.setNombre(resultSet.getString("nombre"));
                categorias.setActivo(resultSet.getBoolean("activo"));
                cbBuscar.addItem(categorias);
            }
            
        } catch (SQLException ex) {
            System.err.println(ex.getErrorCode());
        }
    }

    private void listarFuentes() {
        
        cbBuscar.addItem("--Seleccione--");
        cbBuscar.setSelectedIndex(0);
        
        try {
            conexion = ConexionBD.obtenerConexion();
            ResultSet resultSet;
            String sql = "SELECT * FROM fuentes ORDER BY nombre ASC;";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                Fuentes fuentes = new Fuentes();
                fuentes.setId(resultSet.getInt("id"));
                fuentes.setNombre(resultSet.getString("nombre"));
                cbBuscar.addItem(fuentes);
            }
            
        } catch (SQLException ex) {
            System.err.println(ex.getErrorCode());
        }
    }
    
    //Marcar palabra en el texto de la ficha

    private void marcarBusqueda(String palabra, String texto) throws BadLocationException {
        
        Highlighter highlighter = txtFicha.getHighlighter();
        HighlightPainter paiter = new DefaultHighlighter.DefaultHighlightPainter(Color.YELLOW);
        int p0 = texto.indexOf(palabra);
        int p1 = p0 + palabra.length();
        highlighter.addHighlight(p0, p1, paiter);
        
    }
}