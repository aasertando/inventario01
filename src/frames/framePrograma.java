package frames;

import clases.creacionProducto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class framePrograma extends javax.swing.JFrame {
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    public framePrograma() {
        initComponents();
        
        String columnas[ ] = {"Código", "Nombre", "Cantidad disponible"};
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
        inputCrearNombre = new javax.swing.JTextField();
        btnCrearProducto = new javax.swing.JButton();
        txt1 = new javax.swing.JLabel();
        bgInserar = new javax.swing.JPanel();
        txt2 = new javax.swing.JLabel();
        jCombo = new javax.swing.JComboBox<>();
        txtCrearNombre1 = new javax.swing.JLabel();
        txtCrearNombre2 = new javax.swing.JLabel();
        inputInsertarCantidad = new javax.swing.JTextField();
        btnInsertarProducto = new javax.swing.JButton();
        bgTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla1 = new javax.swing.JTable();
        btnEliminarProducto = new javax.swing.JButton();
        bgActualizar = new javax.swing.JPanel();
        txt4 = new javax.swing.JLabel();
        txtCrearNombre3 = new javax.swing.JLabel();
        inputActualizarCodigo = new javax.swing.JTextField();
        txtCrearNombre4 = new javax.swing.JLabel();
        inputActualizarNombre = new javax.swing.JTextField();
        inputActualizarCantidad = new javax.swing.JTextField();
        txtCrearNombre5 = new javax.swing.JLabel();
        btnTomarValores = new javax.swing.JButton();
        btnActualizarValores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCrearNombre.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        txtCrearNombre.setText("Nombre");

        inputCrearNombre.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        inputCrearNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCrearNombreActionPerformed(evt);
            }
        });

        btnCrearProducto.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        btnCrearProducto.setText("Crear producto");
        btnCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProducto(evt);
            }
        });

        txt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt1.setText("Añada productos a la lista de productos disponibles");

        javax.swing.GroupLayout bgCrearLayout = new javax.swing.GroupLayout(bgCrear);
        bgCrear.setLayout(bgCrearLayout);
        bgCrearLayout.setHorizontalGroup(
            bgCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgCrearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgCrearLayout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(txtCrearNombre)
                .addGap(18, 18, 18)
                .addGroup(bgCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearProducto)
                    .addComponent(inputCrearNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
        );
        bgCrearLayout.setVerticalGroup(
            bgCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgCrearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1)
                .addGap(18, 18, 18)
                .addGroup(bgCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCrearNombre)
                    .addComponent(inputCrearNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCrearProducto)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        tabbed1.addTab("Crear Producto", bgCrear);

        txt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt2.setText("Añada productos ya creados al inventario");

        jCombo.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        txtCrearNombre1.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        txtCrearNombre1.setText("Producto");

        txtCrearNombre2.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        txtCrearNombre2.setText("Cantidad");

        inputInsertarCantidad.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N

        btnInsertarProducto.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
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
                .addContainerGap(144, Short.MAX_VALUE)
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
                .addGap(138, 138, 138))
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
                .addContainerGap(98, Short.MAX_VALUE))
        );

        tabbed1.addTab("Insertar Producto al Inventario", bgInserar);

        jTabla1.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
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

        btnEliminarProducto.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        btnEliminarProducto.setText("Eliminar Producto");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProducto(evt);
            }
        });

        javax.swing.GroupLayout bgTablaLayout = new javax.swing.GroupLayout(bgTabla);
        bgTabla.setLayout(bgTablaLayout);
        bgTablaLayout.setHorizontalGroup(
            bgTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                    .addGroup(bgTablaLayout.createSequentialGroup()
                        .addComponent(btnEliminarProducto)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bgTablaLayout.setVerticalGroup(
            bgTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        tabbed1.addTab("Inventario", bgTabla);

        txt4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt4.setText("Actualice productos existentes en el inventario");

        txtCrearNombre3.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        txtCrearNombre3.setText("Código");

        inputActualizarCodigo.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N

        txtCrearNombre4.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        txtCrearNombre4.setText("Nombre");

        inputActualizarNombre.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N

        inputActualizarCantidad.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N

        txtCrearNombre5.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        txtCrearNombre5.setText("Cantidad");

        btnTomarValores.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        btnTomarValores.setText("Tomar Valores");
        btnTomarValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomarValores(evt);
            }
        });

        btnActualizarValores.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        btnActualizarValores.setText("Actualizar Valores");
        btnActualizarValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarValores(evt);
            }
        });

        javax.swing.GroupLayout bgActualizarLayout = new javax.swing.GroupLayout(bgActualizar);
        bgActualizar.setLayout(bgActualizarLayout);
        bgActualizarLayout.setHorizontalGroup(
            bgActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt4, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(bgActualizarLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(bgActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgActualizarLayout.createSequentialGroup()
                        .addComponent(btnTomarValores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizarValores))
                    .addGroup(bgActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(bgActualizarLayout.createSequentialGroup()
                            .addComponent(txtCrearNombre5)
                            .addGap(18, 18, 18)
                            .addComponent(inputActualizarCantidad))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgActualizarLayout.createSequentialGroup()
                            .addComponent(txtCrearNombre4)
                            .addGap(18, 18, 18)
                            .addComponent(inputActualizarNombre))
                        .addGroup(bgActualizarLayout.createSequentialGroup()
                            .addComponent(txtCrearNombre3)
                            .addGap(18, 18, 18)
                            .addComponent(inputActualizarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgActualizarLayout.setVerticalGroup(
            bgActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt4)
                .addGap(18, 18, 18)
                .addGroup(bgActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCrearNombre3)
                    .addComponent(inputActualizarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCrearNombre4)
                    .addComponent(inputActualizarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCrearNombre5)
                    .addComponent(inputActualizarCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTomarValores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizarValores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(94, 94, 94))
        );

        tabbed1.addTab("Actualizar Producto del Inventario", bgActualizar);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //variable para que se inicialice en 0 para luego sumarle de 1 en 1 conforme a cuantos productos se creen
    int codigo = 0;
    
    private void btnCrearProducto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProducto
        
        
        /*Aqui se hace la confirmación de que haya algo en el input para poder crear el objeto (if)*/
        
        //el orden importa, ya que cada uno devuelve un valor diferente, de boolean a String no tiene sentido
        //locura,  .trim quita espacios(devuelve String),   .isEmpty verifica si esta vacío el textfield(devuelve booleano)
        if(inputCrearNombre.getText().trim().isEmpty()){
            
            JOptionPane.showMessageDialog(rootPane, "No se ha ingresado nada como nombre");        
            
        }else{
            
            /*Aqui se coloca el nombre del producto (anteriormente mandado a la clase) en el comboBox*/
            //se toma nombre del input
            String nombre = inputCrearNombre.getText();
            //se envía a la clase
            creacionProducto claseCrear = new creacionProducto(nombre);
           //se toma de la clase el nombre del producto Y  se añade a el comboBox
            jCombo.addItem(claseCrear.getNombre());
            //se deja en blanco en input
            inputCrearNombre.setText("");
            //se envía mensaje de confirmacion, al crear el producto
            JOptionPane.showMessageDialog(rootPane, "Objeto creado satisfactoriamente");


        }
        
    }//GEN-LAST:event_btnCrearProducto

    private void btnInsertarProducto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarProducto
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertarProducto

    private void btnEliminarProducto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProducto
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProducto

    private void btnTomarValores(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomarValores
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTomarValores

    private void btnActualizarValores(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarValores
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarValores

    private void inputCrearNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCrearNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCrearNombreActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framePrograma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgActualizar;
    private javax.swing.JPanel bgCrear;
    private javax.swing.JPanel bgInserar;
    private javax.swing.JPanel bgTabla;
    private javax.swing.JButton btnActualizarValores;
    private javax.swing.JButton btnCrearProducto;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnInsertarProducto;
    private javax.swing.JButton btnTomarValores;
    private javax.swing.JTextField inputActualizarCantidad;
    private javax.swing.JTextField inputActualizarCodigo;
    private javax.swing.JTextField inputActualizarNombre;
    private javax.swing.JTextField inputCrearNombre;
    private javax.swing.JTextField inputInsertarCantidad;
    private javax.swing.JComboBox<String> jCombo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla1;
    private javax.swing.JTabbedPane tabbed1;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txtCrearNombre;
    private javax.swing.JLabel txtCrearNombre1;
    private javax.swing.JLabel txtCrearNombre2;
    private javax.swing.JLabel txtCrearNombre3;
    private javax.swing.JLabel txtCrearNombre4;
    private javax.swing.JLabel txtCrearNombre5;
    // End of variables declaration//GEN-END:variables
}
