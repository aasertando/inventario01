package frames;

import javax.swing.table.DefaultTableModel;

public class framePrograma extends javax.swing.JFrame {
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    public framePrograma() {
        initComponents();
        
        String columnas[ ] = {"Código", "Nombre"};
        modelo.setColumnIdentifiers(columnas);
        jTabla1.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        tabbed1 = new javax.swing.JTabbedPane();
        bgCrear = new javax.swing.JPanel();
        txtCrearNombre = new javax.swing.JLabel();
        inputCrearNombre1 = new javax.swing.JTextField();
        btnCrearProducto = new javax.swing.JButton();
        txt1 = new javax.swing.JLabel();
        bgInserar = new javax.swing.JPanel();
        txt2 = new javax.swing.JLabel();
        jCombo = new javax.swing.JComboBox<>();
        txtCrearNombre1 = new javax.swing.JLabel();
        txtCrearNombre2 = new javax.swing.JLabel();
        inputInsertarCantidad = new javax.swing.JTextField();
        btnInsertarProducto = new javax.swing.JButton();
        bgEliminar = new javax.swing.JPanel();
        bgTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla1 = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCrearNombre.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        txtCrearNombre.setText("Nombre");

        inputCrearNombre1.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N

        btnCrearProducto.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        btnCrearProducto.setText("Crear producto");
        btnCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProducto(evt);
            }
        });

        txt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt1.setText("Añada 1 producto a la lista de productos disponibles");

        javax.swing.GroupLayout bgCrearLayout = new javax.swing.GroupLayout(bgCrear);
        bgCrear.setLayout(bgCrearLayout);
        bgCrearLayout.setHorizontalGroup(
            bgCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgCrearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(bgCrearLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(txtCrearNombre)
                .addGap(18, 18, 18)
                .addGroup(bgCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearProducto)
                    .addComponent(inputCrearNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        bgCrearLayout.setVerticalGroup(
            bgCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgCrearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1)
                .addGap(18, 18, 18)
                .addGroup(bgCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCrearNombre)
                    .addComponent(inputCrearNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCrearProducto)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        tabbed1.addTab("Crear Producto", bgCrear);

        txt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt2.setText("Añada productos ya existentes al inventario");

        jCombo.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N

        txtCrearNombre1.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        txtCrearNombre1.setText("Producto");

        txtCrearNombre2.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        txtCrearNombre2.setText("Cantidad");

        inputInsertarCantidad.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N

        btnInsertarProducto.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        btnInsertarProducto.setText("Inserar Producto");
        btnInsertarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarProducto(evt);
            }
        });

        javax.swing.GroupLayout bgInserarLayout = new javax.swing.GroupLayout(bgInserar);
        bgInserar.setLayout(bgInserarLayout);
        bgInserarLayout.setHorizontalGroup(
            bgInserarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgInserarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgInserarLayout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(bgInserarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgInserarLayout.createSequentialGroup()
                        .addComponent(txtCrearNombre1)
                        .addGap(18, 18, 18)
                        .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgInserarLayout.createSequentialGroup()
                        .addComponent(txtCrearNombre2)
                        .addGap(18, 18, 18)
                        .addGroup(bgInserarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInsertarProducto)
                            .addComponent(inputInsertarCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(149, 149, 149))
        );
        bgInserarLayout.setVerticalGroup(
            bgInserarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgInserarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt2)
                .addGap(18, 18, 18)
                .addGroup(bgInserarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCrearNombre1)
                    .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgInserarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCrearNombre2)
                    .addComponent(inputInsertarCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnInsertarProducto)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        tabbed1.addTab("Insertar Producto al Inventario", bgInserar);

        javax.swing.GroupLayout bgEliminarLayout = new javax.swing.GroupLayout(bgEliminar);
        bgEliminar.setLayout(bgEliminarLayout);
        bgEliminarLayout.setHorizontalGroup(
            bgEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
        );
        bgEliminarLayout.setVerticalGroup(
            bgEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );

        tabbed1.addTab("Eliminar Producto del Inventario", bgEliminar);

        jTabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTabla1);

        btnEliminar.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");

        btnActualizar.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar(evt);
            }
        });

        javax.swing.GroupLayout bgTablaLayout = new javax.swing.GroupLayout(bgTabla);
        bgTabla.setLayout(bgTablaLayout);
        bgTablaLayout.setHorizontalGroup(
            bgTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                    .addGroup(bgTablaLayout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bgTablaLayout.setVerticalGroup(
            bgTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbed1.addTab("Inventario", bgTabla);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbed1)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbed1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearProducto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProducto

    }//GEN-LAST:event_btnCrearProducto

    private void btnActualizar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar

    }//GEN-LAST:event_btnActualizar

    private void btnInsertarProducto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarProducto
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertarProducto

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framePrograma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgCrear;
    private javax.swing.JPanel bgEliminar;
    private javax.swing.JPanel bgInserar;
    private javax.swing.JPanel bgTabla;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCrearProducto;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertarProducto;
    private javax.swing.JTextField inputCrearNombre1;
    private javax.swing.JTextField inputInsertarCantidad;
    private javax.swing.JComboBox<String> jCombo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla1;
    private javax.swing.JTabbedPane tabbed1;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txtCrearNombre;
    private javax.swing.JLabel txtCrearNombre1;
    private javax.swing.JLabel txtCrearNombre2;
    // End of variables declaration//GEN-END:variables
}
