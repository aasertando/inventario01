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
        txtCrearCantidad1 = new javax.swing.JLabel();
        inputCrearCantidad1 = new javax.swing.JTextField();
        txtCrearPrecio1 = new javax.swing.JLabel();
        inputCrearPrecio1 = new javax.swing.JTextField();
        btnCrearCaja = new javax.swing.JButton();
        bgInserar = new javax.swing.JPanel();
        bgEliminar = new javax.swing.JPanel();
        bgTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla1 = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCrearNombre.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        txtCrearNombre.setText("Nombre");

        inputCrearNombre1.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N

        txtCrearCantidad1.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        txtCrearCantidad1.setText("Cantidad");

        inputCrearCantidad1.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N

        txtCrearPrecio1.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        txtCrearPrecio1.setText("Precio");

        inputCrearPrecio1.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N

        btnCrearCaja.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        btnCrearCaja.setText("CrearCaja");
        btnCrearCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCaja(evt);
            }
        });

        javax.swing.GroupLayout bgCrearLayout = new javax.swing.GroupLayout(bgCrear);
        bgCrear.setLayout(bgCrearLayout);
        bgCrearLayout.setHorizontalGroup(
            bgCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgCrearLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(bgCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(bgCrearLayout.createSequentialGroup()
                            .addComponent(txtCrearNombre)
                            .addGap(18, 18, 18)
                            .addComponent(inputCrearNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(bgCrearLayout.createSequentialGroup()
                            .addComponent(txtCrearCantidad1)
                            .addGap(18, 18, 18)
                            .addComponent(inputCrearCantidad1))
                        .addGroup(bgCrearLayout.createSequentialGroup()
                            .addComponent(txtCrearPrecio1)
                            .addGap(18, 18, 18)
                            .addComponent(inputCrearPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bgCrearLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btnCrearCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        bgCrearLayout.setVerticalGroup(
            bgCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgCrearLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(bgCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCrearNombre)
                    .addComponent(inputCrearNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCrearCantidad1)
                    .addComponent(inputCrearCantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCrearPrecio1)
                    .addComponent(inputCrearPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnCrearCaja)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        tabbed1.addTab("CrearCaja", bgCrear);

        javax.swing.GroupLayout bgInserarLayout = new javax.swing.GroupLayout(bgInserar);
        bgInserar.setLayout(bgInserarLayout);
        bgInserarLayout.setHorizontalGroup(
            bgInserarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );
        bgInserarLayout.setVerticalGroup(
            bgInserarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        tabbed1.addTab("Insertar Caja", bgInserar);

        javax.swing.GroupLayout bgEliminarLayout = new javax.swing.GroupLayout(bgEliminar);
        bgEliminar.setLayout(bgEliminarLayout);
        bgEliminarLayout.setHorizontalGroup(
            bgEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );
        bgEliminarLayout.setVerticalGroup(
            bgEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        tabbed1.addTab("Eliminar Caja", bgEliminar);

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        tabbed1.addTab("Inventario", bgTabla);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(tabbed1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(tabbed1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void btnCrearCaja(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCaja

    }//GEN-LAST:event_btnCrearCaja

    private void btnActualizar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar

    }//GEN-LAST:event_btnActualizar

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
    private javax.swing.JButton btnCrearCaja;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JTextField inputCrearCantidad1;
    private javax.swing.JTextField inputCrearNombre1;
    private javax.swing.JTextField inputCrearPrecio1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla1;
    private javax.swing.JTabbedPane tabbed1;
    private javax.swing.JLabel txtCrearCantidad1;
    private javax.swing.JLabel txtCrearNombre;
    private javax.swing.JLabel txtCrearPrecio1;
    // End of variables declaration//GEN-END:variables
}
