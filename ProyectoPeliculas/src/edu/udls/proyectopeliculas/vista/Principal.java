/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.udls.proyectopeliculas.vista;
import edu.udls.proyectopeliculas.control.GestorArchivos;
import edu.udls.proyectopeliculas.modelo.ListaPeliculas;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class Principal extends javax.swing.JFrame {
    ListaPeliculas listaDisponibles = new ListaPeliculas();
    ListaPeliculas listaRentadas = new ListaPeliculas();
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        txaDisponibles.setText(GestorArchivos.leerArchivo(listaDisponibles, "C:\\Users\\Ivan\\Documents\\OneDrive - Universidad La Salle Bajío\\Semestre Dos\\Programacion Estructurada y Orientada a Objetos\\OrientadaObjetos\\ProyectoPeliculas\\PeliculasDisponibles.csv"));
        txaRentadas.setText(GestorArchivos.leerArchivo(listaRentadas, "C:\\Users\\Ivan\\Documents\\OneDrive - Universidad La Salle Bajío\\Semestre Dos\\Programacion Estructurada y Orientada a Objetos\\OrientadaObjetos\\ProyectoPeliculas\\PeliculasRentadas.csv"));
        lblCantidadDisponibles.setText(Integer.toString(listaDisponibles.size()));
        lblCantidadRentadas.setText(Integer.toString(listaRentadas.size()));
        listaDisponibles.actual = listaDisponibles.first;
        listaRentadas.actual = listaRentadas.first;
        txtActualDisponibles.setText(listaDisponibles.actual());
        txtActualRentadas.setText(listaRentadas.actual());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDisponibles = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaRentadas = new javax.swing.JTextArea();
        btnInicioDisponibles = new javax.swing.JButton();
        btnFinDisponibles = new javax.swing.JButton();
        btnAnteriorDisponibles = new javax.swing.JButton();
        btnInicioRentadas = new javax.swing.JButton();
        btnFinRentadas = new javax.swing.JButton();
        btnAnteriorRentadas = new javax.swing.JButton();
        btnSiguienteRentadas = new javax.swing.JButton();
        txtActualDisponibles = new javax.swing.JTextField();
        txtActualRentadas = new javax.swing.JTextField();
        btnBuscarDisponibles = new javax.swing.JButton();
        txtBuscadorDisponibles = new javax.swing.JTextField();
        btnRentar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDevolver = new javax.swing.JButton();
        btnRentarTodo = new javax.swing.JButton();
        btnDevolverTodo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblCantidadDisponibles = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblCantidadRentadas = new javax.swing.JLabel();
        btnSiguienteDisponibles = new javax.swing.JButton();
        btnBuscarRentadas = new javax.swing.JButton();
        txtBuscadorRentadas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true), "BLOCKBUSTER", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24), new java.awt.Color(255, 255, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PELICULAS DISPONIBLES");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PELICULAS RENTADAS");

        txaDisponibles.setBackground(new java.awt.Color(255, 255, 255));
        txaDisponibles.setColumns(20);
        txaDisponibles.setForeground(new java.awt.Color(0, 0, 0));
        txaDisponibles.setRows(5);
        jScrollPane2.setViewportView(txaDisponibles);

        txaRentadas.setBackground(new java.awt.Color(255, 255, 255));
        txaRentadas.setColumns(20);
        txaRentadas.setForeground(new java.awt.Color(0, 0, 0));
        txaRentadas.setRows(5);
        jScrollPane1.setViewportView(txaRentadas);

        btnInicioDisponibles.setBackground(new java.awt.Color(255, 255, 0));
        btnInicioDisponibles.setForeground(new java.awt.Color(0, 0, 153));
        btnInicioDisponibles.setText("<<");
        btnInicioDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioDisponiblesActionPerformed(evt);
            }
        });

        btnFinDisponibles.setBackground(new java.awt.Color(255, 255, 0));
        btnFinDisponibles.setForeground(new java.awt.Color(0, 0, 153));
        btnFinDisponibles.setText(">>");
        btnFinDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinDisponiblesActionPerformed(evt);
            }
        });

        btnAnteriorDisponibles.setBackground(new java.awt.Color(255, 255, 0));
        btnAnteriorDisponibles.setForeground(new java.awt.Color(0, 0, 153));
        btnAnteriorDisponibles.setText("<");
        btnAnteriorDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorDisponiblesActionPerformed(evt);
            }
        });

        btnInicioRentadas.setBackground(new java.awt.Color(255, 255, 0));
        btnInicioRentadas.setForeground(new java.awt.Color(0, 0, 153));
        btnInicioRentadas.setText("<<");
        btnInicioRentadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioRentadasActionPerformed(evt);
            }
        });

        btnFinRentadas.setBackground(new java.awt.Color(255, 255, 0));
        btnFinRentadas.setForeground(new java.awt.Color(0, 0, 153));
        btnFinRentadas.setText(">>");
        btnFinRentadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinRentadasActionPerformed(evt);
            }
        });

        btnAnteriorRentadas.setBackground(new java.awt.Color(255, 255, 0));
        btnAnteriorRentadas.setForeground(new java.awt.Color(0, 0, 153));
        btnAnteriorRentadas.setText("<");
        btnAnteriorRentadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorRentadasActionPerformed(evt);
            }
        });

        btnSiguienteRentadas.setBackground(new java.awt.Color(255, 255, 0));
        btnSiguienteRentadas.setForeground(new java.awt.Color(0, 0, 153));
        btnSiguienteRentadas.setText(">");
        btnSiguienteRentadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteRentadasActionPerformed(evt);
            }
        });

        txtActualDisponibles.setBackground(new java.awt.Color(255, 255, 255));
        txtActualDisponibles.setForeground(new java.awt.Color(0, 0, 0));

        txtActualRentadas.setBackground(new java.awt.Color(255, 255, 255));
        txtActualRentadas.setForeground(new java.awt.Color(0, 0, 0));

        btnBuscarDisponibles.setBackground(new java.awt.Color(255, 255, 0));
        btnBuscarDisponibles.setForeground(new java.awt.Color(0, 0, 153));
        btnBuscarDisponibles.setText("Buscar");
        btnBuscarDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDisponiblesActionPerformed(evt);
            }
        });

        txtBuscadorDisponibles.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscadorDisponibles.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscadorDisponibles.setText("Pelicula...");

        btnRentar.setBackground(new java.awt.Color(255, 255, 0));
        btnRentar.setForeground(new java.awt.Color(0, 0, 153));
        btnRentar.setText("Rentar");
        btnRentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Actual");

        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Actual");

        btnDevolver.setBackground(new java.awt.Color(255, 255, 0));
        btnDevolver.setForeground(new java.awt.Color(0, 0, 153));
        btnDevolver.setText("Devolver");
        btnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverActionPerformed(evt);
            }
        });

        btnRentarTodo.setBackground(new java.awt.Color(255, 255, 102));
        btnRentarTodo.setForeground(new java.awt.Color(0, 0, 153));
        btnRentarTodo.setText("Rentar Todo");
        btnRentarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentarTodoActionPerformed(evt);
            }
        });

        btnDevolverTodo.setBackground(new java.awt.Color(255, 255, 102));
        btnDevolverTodo.setForeground(new java.awt.Color(0, 0, 153));
        btnDevolverTodo.setText("Devolver Todo");
        btnDevolverTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverTodoActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Cantidad");

        lblCantidadDisponibles.setForeground(new java.awt.Color(255, 255, 0));
        lblCantidadDisponibles.setText("jLabel6");

        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Cantidad");

        lblCantidadRentadas.setForeground(new java.awt.Color(255, 255, 0));
        lblCantidadRentadas.setText("jLabel8");

        btnSiguienteDisponibles.setBackground(new java.awt.Color(255, 255, 0));
        btnSiguienteDisponibles.setForeground(new java.awt.Color(0, 0, 153));
        btnSiguienteDisponibles.setText(">");
        btnSiguienteDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteDisponiblesActionPerformed(evt);
            }
        });

        btnBuscarRentadas.setBackground(new java.awt.Color(255, 255, 0));
        btnBuscarRentadas.setForeground(new java.awt.Color(0, 0, 204));
        btnBuscarRentadas.setText("Buscar");

        txtBuscadorRentadas.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscadorRentadas.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscadorRentadas.setText("Pelicula...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtActualDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRentar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtActualRentadas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnDevolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInicioDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAnteriorDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btnSiguienteDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFinDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCantidadDisponibles)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCantidadRentadas))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnInicioRentadas, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnAnteriorRentadas, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                    .addComponent(btnSiguienteRentadas, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnFinRentadas, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBuscarDisponibles)
                                .addGap(15, 15, 15)
                                .addComponent(txtBuscadorDisponibles))
                            .addComponent(btnRentarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDevolverTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBuscarRentadas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscadorRentadas)))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(364, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblCantidadDisponibles)
                    .addComponent(jLabel7)
                    .addComponent(lblCantidadRentadas))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnInicioDisponibles)
                        .addComponent(btnFinDisponibles)
                        .addComponent(btnAnteriorDisponibles)
                        .addComponent(btnInicioRentadas)
                        .addComponent(btnFinRentadas)
                        .addComponent(btnAnteriorRentadas)
                        .addComponent(btnSiguienteRentadas))
                    .addComponent(btnSiguienteDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtActualDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtActualRentadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRentar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDevolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRentarTodo)
                    .addComponent(btnDevolverTodo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarDisponibles)
                    .addComponent(txtBuscadorDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarRentadas)
                    .addComponent(txtBuscadorRentadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(218, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioDisponiblesActionPerformed
        // TODO add your handling code here:
        listaDisponibles.actual = listaDisponibles.first;
        txtActualDisponibles.setText(listaDisponibles.actual());
    }//GEN-LAST:event_btnInicioDisponiblesActionPerformed

    private void btnFinDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinDisponiblesActionPerformed
        // TODO add your handling code here:
        listaDisponibles.actual = listaDisponibles.last;
        txtActualDisponibles.setText(listaDisponibles.actual());
    }//GEN-LAST:event_btnFinDisponiblesActionPerformed

    private void btnInicioRentadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioRentadasActionPerformed
        // TODO add your handling code here:
        listaRentadas.actual = listaRentadas.first;
        txtActualRentadas.setText(listaRentadas.actual());
    }//GEN-LAST:event_btnInicioRentadasActionPerformed

    private void btnFinRentadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinRentadasActionPerformed
        // TODO add your handling code here:
        listaRentadas.actual = listaRentadas.last;
        txtActualRentadas.setText(listaRentadas.actual());
    }//GEN-LAST:event_btnFinRentadasActionPerformed

    private void btnAnteriorDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorDisponiblesActionPerformed
        // TODO add your handling code here:
        if(listaDisponibles.first() != listaDisponibles.actual()){
            listaDisponibles.actual = listaDisponibles.actual.getAnterior();
            txtActualDisponibles.setText(listaDisponibles.actual());
        }
    }//GEN-LAST:event_btnAnteriorDisponiblesActionPerformed

    private void btnSiguienteDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteDisponiblesActionPerformed
        // TODO add your handling code here:
        if(listaDisponibles.last() != listaDisponibles.actual()){
            listaDisponibles.actual = listaDisponibles.actual.getSiguiente();
            txtActualDisponibles.setText(listaDisponibles.actual());
        }
    }//GEN-LAST:event_btnSiguienteDisponiblesActionPerformed

    private void btnAnteriorRentadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorRentadasActionPerformed
        // TODO add your handling code here:
        if(listaRentadas.first() != listaRentadas.actual()){
            listaRentadas.actual = listaRentadas.actual.getAnterior();
            txtActualRentadas.setText(listaRentadas.actual());
        }
    }//GEN-LAST:event_btnAnteriorRentadasActionPerformed

    private void btnRentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentarActionPerformed
        // TODO add your handling code here:
        ListaPeliculas.move(listaDisponibles, listaRentadas);
        txaDisponibles.setText(listaDisponibles.enlist(listaDisponibles));
        txaRentadas.setText(listaRentadas.enlist(listaRentadas));
        lblCantidadDisponibles.setText(Integer.toString(listaDisponibles.size()));
        lblCantidadRentadas.setText(Integer.toString(listaRentadas.size()));
        if(listaDisponibles.size() > 0){
            txtActualDisponibles.setText(listaDisponibles.actual());
        }else{
            txtActualDisponibles.setText(null);
        }
    }//GEN-LAST:event_btnRentarActionPerformed

    private void btnRentarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentarTodoActionPerformed
        // TODO add your handling code here:
        ListaPeliculas.moveAll(listaDisponibles, listaRentadas);
        txaDisponibles.setText(null);
        txaRentadas.setText(listaRentadas.enlist(listaRentadas));
        lblCantidadDisponibles.setText(Integer.toString(listaDisponibles.size()));
        lblCantidadRentadas.setText(Integer.toString(listaRentadas.size()));
        txtActualDisponibles.setText(null);
    }//GEN-LAST:event_btnRentarTodoActionPerformed

    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed
        // TODO add your handling code here:
        ListaPeliculas.move(listaRentadas, listaDisponibles);
        txaDisponibles.setText(listaDisponibles.enlist(listaDisponibles));
        txaRentadas.setText(listaRentadas.enlist(listaRentadas));
        lblCantidadDisponibles.setText(Integer.toString(listaDisponibles.size()));
        lblCantidadRentadas.setText(Integer.toString(listaRentadas.size()));
        txtActualRentadas.setText(listaRentadas.actual());
    }//GEN-LAST:event_btnDevolverActionPerformed

    private void btnSiguienteRentadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteRentadasActionPerformed
        // TODO add your handling code here:
        if(listaRentadas.last() != listaRentadas.actual()){
            listaRentadas.actual = listaRentadas.actual.getSiguiente();
            txtActualRentadas.setText(listaRentadas.actual());
        }
    }//GEN-LAST:event_btnSiguienteRentadasActionPerformed

    private void btnDevolverTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverTodoActionPerformed
        // TODO add your handling code here:
        ListaPeliculas.moveAll(listaRentadas, listaDisponibles);
        txaRentadas.setText(null);
        txaDisponibles.setText(listaDisponibles.enlist(listaDisponibles));
        lblCantidadDisponibles.setText(Integer.toString(listaDisponibles.size()));
        lblCantidadRentadas.setText(Integer.toString(listaRentadas.size()));
        txtActualRentadas.setText(null);
    }//GEN-LAST:event_btnDevolverTodoActionPerformed

    private void btnBuscarDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDisponiblesActionPerformed
        // TODO add your handling code here:
<<<<<<< HEAD
        txtActualDisponibles.setText(listaDisponibles.search(txtBuscadorDisponibles.getText()).getMovie());
=======
        txtActualDisponibles.setText(listaDisponibles.search(txtBuscadorDisponibles.getText()));
>>>>>>> c0be8a86e66b845ad95b9b6e23912f42e260ff19
    }//GEN-LAST:event_btnBuscarDisponiblesActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnteriorDisponibles;
    private javax.swing.JButton btnAnteriorRentadas;
    private javax.swing.JButton btnBuscarDisponibles;
    private javax.swing.JButton btnBuscarRentadas;
    private javax.swing.JButton btnDevolver;
    private javax.swing.JButton btnDevolverTodo;
    private javax.swing.JButton btnFinDisponibles;
    private javax.swing.JButton btnFinRentadas;
    private javax.swing.JButton btnInicioDisponibles;
    private javax.swing.JButton btnInicioRentadas;
    private javax.swing.JButton btnRentar;
    private javax.swing.JButton btnRentarTodo;
    private javax.swing.JButton btnSiguienteDisponibles;
    private javax.swing.JButton btnSiguienteRentadas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCantidadDisponibles;
    private javax.swing.JLabel lblCantidadRentadas;
    private javax.swing.JTextArea txaDisponibles;
    private javax.swing.JTextArea txaRentadas;
    private javax.swing.JTextField txtActualDisponibles;
    private javax.swing.JTextField txtActualRentadas;
    private javax.swing.JTextField txtBuscadorDisponibles;
    private javax.swing.JTextField txtBuscadorRentadas;
    // End of variables declaration//GEN-END:variables
}
