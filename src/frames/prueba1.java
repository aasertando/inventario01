package frames;

import javax.swing.table.DefaultTableModel;

public class prueba1 extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    
    public prueba1() {
        initComponents();
        String columnas [ ] = {"Código", "Nombre"};
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        bgCrearProducto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputNombreProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btnCrearProducto = new javax.swing.JButton();
        bgInsertarProducto = new javax.swing.JPanel();
        bgEliminarProducto = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel1.setText("Nombre del producto");

        inputNombreProducto.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel2.setText("Productos creados");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable);

        btnCrearProducto.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnCrearProducto.setText("Crear producto");

        javax.swing.GroupLayout bgCrearProductoLayout = new javax.swing.GroupLayout(bgCrearProducto);
        bgCrearProducto.setLayout(bgCrearProductoLayout);
        bgCrearProductoLayout.setHorizontalGroup(
            bgCrearProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgCrearProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgCrearProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(bgCrearProductoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNombreProducto))
                    .addGroup(bgCrearProductoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgCrearProductoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCrearProducto)))
                .addContainerGap())
        );
        bgCrearProductoLayout.setVerticalGroup(
            bgCrearProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgCrearProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgCrearProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Crear Producto", bgCrearProducto);

        javax.swing.GroupLayout bgInsertarProductoLayout = new javax.swing.GroupLayout(bgInsertarProducto);
        bgInsertarProducto.setLayout(bgInsertarProductoLayout);
        bgInsertarProductoLayout.setHorizontalGroup(
            bgInsertarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        bgInsertarProductoLayout.setVerticalGroup(
            bgInsertarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Insertar Producto", bgInsertarProducto);

        javax.swing.GroupLayout bgEliminarProductoLayout = new javax.swing.GroupLayout(bgEliminarProducto);
        bgEliminarProducto.setLayout(bgEliminarProductoLayout);
        bgEliminarProductoLayout.setHorizontalGroup(
            bgEliminarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        bgEliminarProductoLayout.setVerticalGroup(
            bgEliminarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Eliminar Producto", bgEliminarProducto);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
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


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prueba1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgCrearProducto;
    private javax.swing.JPanel bgEliminarProducto;
    private javax.swing.JPanel bgInsertarProducto;
    private javax.swing.JButton btnCrearProducto;
    private javax.swing.JTextField inputNombreProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
