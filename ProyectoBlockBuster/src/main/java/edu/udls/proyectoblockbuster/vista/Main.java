package edu.udls.proyectoblockbuster.vista;
import edu.udls.proyectoblockbuster.control.ArchiveManager;
import edu.udls.proyectoblockbuster.modelo.MovieList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */

public class Main extends javax.swing.JFrame {
    //CREAMOS DOS LISTAS, UNA PARA LAS PELICULAS RENTADAS Y OTRA PARA LAS PELICULAS DISPONIBLES
    MovieList availableMovies = new MovieList();
    MovieList rentedMovies = new MovieList();
    
    public Main() {
        initComponents();
        //LEEMOS LOS ARCHIVOS Y LE PONEMOS EL CONTENIDO DE LAS LISTAS A LAS AREAS DE TEXTO EN LA INTERFAZ
        txaDisponibles.setText(ArchiveManager.leerArchivo(ArchiveLocations.routeAvailableMovies, availableMovies));
        txaRentadas.setText(ArchiveManager.leerArchivo(ArchiveLocations.routeRentedMovies, rentedMovies));
        //AGREGAMOS LA CANTIDAD DE NODOS(PELICULAS) A LOS LABELS DE DISPONIBLESE Y RENTADAS
        lblCantidadDisponibles.setText(Integer.toString(availableMovies.size()));
        lblCantidadRentadas.setText(Integer.toString(rentedMovies.size()));
        //DECLARAMOS EL NODO ACTUAL COMO EL PRIMER NODO
        availableMovies.current = availableMovies.first;
        rentedMovies.current = rentedMovies.first;
        //ESTABLECEMOS EL CONTENIDO DEL TEXTO CON LA PELICULA ACTUAL
        txtActualDisponibles.setText(availableMovies.current());
        txtActualRentadas.setText(rentedMovies.current());
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
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

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

        txaDisponibles.setEditable(false);
        txaDisponibles.setBackground(new java.awt.Color(255, 255, 255));
        txaDisponibles.setColumns(20);
        txaDisponibles.setForeground(new java.awt.Color(0, 0, 0));
        txaDisponibles.setRows(5);
        jScrollPane2.setViewportView(txaDisponibles);

        txaRentadas.setEditable(false);
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

        txtActualDisponibles.setEditable(false);
        txtActualDisponibles.setBackground(new java.awt.Color(255, 255, 255));
        txtActualDisponibles.setForeground(new java.awt.Color(0, 0, 0));

        txtActualRentadas.setEditable(false);
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
        btnBuscarRentadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRentadasActionPerformed(evt);
            }
        });

        txtBuscadorRentadas.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscadorRentadas.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscadorRentadas.setText("Pelicula...");

        btnSalir.setBackground(new java.awt.Color(255, 255, 0));
        btnSalir.setForeground(new java.awt.Color(0, 0, 153));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir)
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
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnInicioRentadas, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAnteriorRentadas, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                        .addComponent(btnSiguienteRentadas, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFinRentadas, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(65, 65, 65)))))
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
                                    .addComponent(txtBuscadorRentadas))))))
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
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(226, Short.MAX_VALUE)))
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
        //AL DAR CLICK AL BOTON SE DECLARA EL NODO ACTUAL COMO EL PRIMERO Y SE MUESTRA EN EL CAMPO DE TEXTO
        availableMovies.current = availableMovies.first;
        txtActualDisponibles.setText(availableMovies.current());
    }//GEN-LAST:event_btnInicioDisponiblesActionPerformed

    private void btnAnteriorDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorDisponiblesActionPerformed
        //AL DAR CLICK EN EL BOTON SE REVISA PRIMERO QUE EL NODO ACTUAL NO SEA EL PRIMERO, ES DECIR QUE HAYA OTRO NODO ANTERIOR
        //PARA MOVERSE A ESE, TAMBIEN SE REVISA QUE EL TAMAÑO DE LA LISTA SEA MAYOT A 1, DE MANERA QUE SI EL USUARIO UTILIZA EL
        //BOTON ANTERIOR PARA LLEGAR AL PRIMERO, NO SE PUEDA MOVER A UN NODO NULO
        if(availableMovies.first() != availableMovies.current() && availableMovies.size() > 1){
            availableMovies.current = availableMovies.current.getPrevious();
            txtActualDisponibles.setText(availableMovies.current());
        }
    }//GEN-LAST:event_btnAnteriorDisponiblesActionPerformed

    private void btnSiguienteDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteDisponiblesActionPerformed
        //FUNCIONA DE LA MISMA MANERA QUE EL BOTON DE ANTERIOR, SOLO QUE REVISANDO QUE EL NODO ACTUAL NO SEA EL FINAL Y QUE EL
        //NODO SIGUIENTE NO SEA NULO
        if(availableMovies.last() != availableMovies.current() && availableMovies.size() > 1){
            availableMovies.current = availableMovies.current.getNext();
            txtActualDisponibles.setText(availableMovies.current());
        }
    }//GEN-LAST:event_btnSiguienteDisponiblesActionPerformed

    private void btnFinDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinDisponiblesActionPerformed
        //AL DAR CLICK AL BOTON SE DECLARA EL ULTIMO NODO COMO EL ACTUAL Y SE MUESTRA SU INFORMACION EN EL CAMPO DE TEXTO
        availableMovies.current = availableMovies.last;
        txtActualDisponibles.setText(availableMovies.current());
    }//GEN-LAST:event_btnFinDisponiblesActionPerformed

    private void btnInicioRentadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioRentadasActionPerformed
        rentedMovies.current = rentedMovies.first;
        txtActualRentadas.setText(rentedMovies.current());
    }//GEN-LAST:event_btnInicioRentadasActionPerformed

    private void btnAnteriorRentadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorRentadasActionPerformed
        if(rentedMovies.first() != rentedMovies.current() && rentedMovies.size() > 1){
            rentedMovies.current = rentedMovies.current.getPrevious();
            txtActualRentadas.setText(rentedMovies.current());
        }
    }//GEN-LAST:event_btnAnteriorRentadasActionPerformed

    private void btnSiguienteRentadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteRentadasActionPerformed
        if(rentedMovies.last() != rentedMovies.current() && rentedMovies.size() > 1){
            rentedMovies.current = rentedMovies.current.getNext();
            txtActualRentadas.setText(rentedMovies.current());
        }
    }//GEN-LAST:event_btnSiguienteRentadasActionPerformed

    private void btnFinRentadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinRentadasActionPerformed
        rentedMovies.current = rentedMovies.last;
        txtActualRentadas.setText(rentedMovies.current());
    }//GEN-LAST:event_btnFinRentadasActionPerformed

    private void btnRentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentarActionPerformed
        //LLAMO EL METODO MOVER DESDE LA LISTA DE PELICULAS DISPONIBLES
        availableMovies.move(rentedMovies);
        //VUELVO A ENLISTAR LA LISTA DISPONIBLES Y RENTADAS Y EL STRING QUE DEVUELVEN LO DEFINO EN AMBAS AREAS
        txaDisponibles.setText(availableMovies.enlist(availableMovies));
        txaRentadas.setText(rentedMovies.enlist(rentedMovies));
        //VUELVO A MOSTRAR LA CANTIDAD DE NODOS CON EL TAMAÑO DE LA LISTA ACTUALIZADO
        lblCantidadDisponibles.setText(Integer.toString(availableMovies.size()));
        lblCantidadRentadas.setText(Integer.toString(rentedMovies.size()));
        //CHECA QUE AL MENOS HAYA ALGUN NODO PARA MOSTRAR EN EL CAMPO DE TEXTO, DE OTRA MANERA MUESTRA UN VALOR NULO
        if(availableMovies.size() > 0){
            txtActualDisponibles.setText(availableMovies.current());
            txtActualRentadas.setText(rentedMovies.current());
        }else{
            txtActualDisponibles.setText(null);
        }
    }//GEN-LAST:event_btnRentarActionPerformed

    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed
        //HACE EXACTAMENTE LO MISMO PERO CAMBIANDO DE LISTA
        rentedMovies.move(availableMovies);
        txaRentadas.setText(rentedMovies.enlist(rentedMovies));
        txaDisponibles.setText(availableMovies.enlist(availableMovies));
        lblCantidadRentadas.setText(Integer.toString(rentedMovies.size()));
        lblCantidadDisponibles.setText(Integer.toString(availableMovies.size()));
        if(rentedMovies.size() > 0){
            txtActualRentadas.setText(rentedMovies.current());
            txtActualDisponibles.setText(availableMovies.current());
        }else{
            txtActualRentadas.setText(null);
        }   
    }//GEN-LAST:event_btnDevolverActionPerformed

    private void btnRentarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentarTodoActionPerformed
        //CHECA QUE HAYA AL MENOS UN NODO PARA MOVER
        if(availableMovies.size() > 0){
            //LLAMA EL METODO MOVEALL DESDE LA LISTA DE PELICULAS DISPONIBLES
            availableMovies.moveAll(rentedMovies);
            //DECLARA EL AREA DE TEXTO COMO NULO YA QUE LA LISTA NO TIENE NINGUN NODO PARA MOSTRAR
            txaDisponibles.setText(null);
            //VUELVE A ENLISTAR Y MOSTRAR EL STRING QUE DEVUELVE EL METODO ENLIST DESDE LA LISTA DE RENTADAS
            txaRentadas.setText(rentedMovies.enlist(rentedMovies));
            //ACTUALIZA EL LABEL CON LA CANTIDAD DE NODOS ACTUALIZADO DE CADA LISTA
            lblCantidadDisponibles.setText(Integer.toString(availableMovies.size()));
            lblCantidadRentadas.setText(Integer.toString(rentedMovies.size()));
            //DECLARA EL CAMPO DE TEXTO DE LOS DISPONIBLES COMO NULO YA QUE NO TIENE NODOS
            txtActualDisponibles.setText(null);
            //DECLARA EL CAMPO DE TEXTO DE LAS RENTADAS CON EL NODO ACTUAL
            txtActualRentadas.setText(rentedMovies.current());
        }
    }//GEN-LAST:event_btnRentarTodoActionPerformed

    private void btnDevolverTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverTodoActionPerformed
        if(rentedMovies.size() > 0){
            rentedMovies.moveAll(availableMovies);
            txaRentadas.setText(null);
            txaDisponibles.setText(availableMovies.enlist(availableMovies));
            lblCantidadRentadas.setText(Integer.toString(rentedMovies.size()));
            lblCantidadDisponibles.setText(Integer.toString(availableMovies.size()));
            txtActualRentadas.setText(null);
            txtActualDisponibles.setText(availableMovies.current());
        }
    }//GEN-LAST:event_btnDevolverTodoActionPerformed

    private void btnBuscarDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDisponiblesActionPerformed
        //LLAMA AL METODO DESDE LA LISTA DE DISPONIBLES, ENVIANDOLE  EL CONTENIDO DEL CAMPO DE TEXTO DEL BUSCADOR
        availableMovies.search(txtBuscadorDisponibles.getText());
        //EL METODO SE ENCARGA DE ACTUALIZAR EL NODO ACTUAL CON LO QUE ENCAJE CON LO QUE EL USUARIO INGRESO EN EL 
        //CAMPO DE TEXTO DEL BUSCADOR, LUEGO SE ACTUALIZA EL CONTENIDO DEL CAMPO DE TEXTO DEL NODO ACTUAL
        //LA CONDICIONAL SE ASEGURA DE QUE HAYA CONTENIDO DE UN NODO PARA MOSTRAR EN EL CAMPO DE TEXTO
        if(availableMovies.current != null){
            txtActualDisponibles.setText(availableMovies.current());
        }
        else{
            txtActualDisponibles.setText(null);
        }
    }//GEN-LAST:event_btnBuscarDisponiblesActionPerformed

    private void btnBuscarRentadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRentadasActionPerformed
        rentedMovies.search(txtBuscadorRentadas.getText());
        if(rentedMovies.current != null){
            txtActualRentadas.setText(rentedMovies.current());
        }
        else{
            txtActualRentadas.setText(null);
        }
    }//GEN-LAST:event_btnBuscarRentadasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //SE LLAMA AL METODO DEL ARCHIVE MANAGER QUE SE ENCARGA DE REESCRIBIR LOS ARCHIVOS, TANTO DE RENTADAS COMO
        //DE LAS PELICULAS DISPONIBLES
        ArchiveManager.reescribirArchivo(ArchiveLocations.routeAvailableMovies, availableMovies);
        ArchiveManager.reescribirArchivo(ArchiveLocations.routeRentedMovies, rentedMovies);
        //CIERRA LA INTERFAZ ACTUAL Y SE ACABA EL PROGRAMA
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
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
    private javax.swing.JButton btnSalir;
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
