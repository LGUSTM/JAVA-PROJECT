/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.model.Cliente;
import fatec.poo.model.ItemPedido;
import fatec.poo.model.Pedido;
import fatec.poo.model.Pessoa;
import fatec.poo.model.Produto;
import fatec.poo.model.Vendedor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Informatica
 */
public class GuiEmitirPedido extends javax.swing.JFrame {

    /**
     * Creates new form GuiEmitirPedido
     */
    public GuiEmitirPedido(ArrayList<Pedido> e, ArrayList<Pessoa> p, ArrayList<Produto> pr) {
        initComponents();
        cadPedido = e;
        cadCliVend = p;
        cadProd = pr;
        modTblProd = (DefaultTableModel) tblProduto.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        bGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnCPFVendedor = new javax.swing.JButton();
        lblDadosVendedor = new javax.swing.JLabel();
        ftxtCPFVendedor = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        rbtnAVista = new javax.swing.JRadioButton();
        rbtnAPrazo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtNumPedido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ftxtDataPedido = new javax.swing.JFormattedTextField();
        btnNumPedido = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnCPFCliente = new javax.swing.JButton();
        lblDadosCliente = new javax.swing.JLabel();
        ftxtCPFCliente = new javax.swing.JFormattedTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnCodProduto = new javax.swing.JButton();
        txtCodProduto = new javax.swing.JTextField();
        lblProduto = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtQtdeVendida = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblIValTotalPedido = new javax.swing.JLabel();
        lblQtdeItensPedidos = new javax.swing.JLabel();
        btnAddItem = new javax.swing.JButton();
        btnRemoverItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        btnIncluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Emitir Pedido");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Vendedor"));
        jPanel1.setToolTipText("Pedido");

        jLabel7.setText("CPF Vendedor ");

        btnCPFVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnCPFVendedor.setEnabled(false);
        btnCPFVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCPFVendedorActionPerformed(evt);
            }
        });

        lblDadosVendedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        try {
            ftxtCPFVendedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtCPFVendedor.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ftxtCPFVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCPFVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDadosVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDadosVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCPFVendedor)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(ftxtCPFVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedido"));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Forma de Pagamento"));

        bGroup.add(rbtnAVista);
        rbtnAVista.setSelected(true);
        rbtnAVista.setText("A Vista");
        rbtnAVista.setEnabled(false);

        bGroup.add(rbtnAPrazo);
        rbtnAPrazo.setText("A Prazo");
        rbtnAPrazo.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnAVista)
                .addGap(18, 18, 18)
                .addComponent(rbtnAPrazo)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnAVista)
                    .addComponent(rbtnAPrazo))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jLabel1.setText("Número do Pedido");

        jLabel2.setText("Data do Pedido");

        try {
            ftxtDataPedido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtDataPedido.setEnabled(false);
        ftxtDataPedido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftxtDataPedidoFocusLost(evt);
            }
        });

        btnNumPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnNumPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtNumPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNumPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(ftxtDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNumPedido)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtNumPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(ftxtDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cliente"));

        jLabel3.setText("CPF Cliente");

        btnCPFCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnCPFCliente.setEnabled(false);
        btnCPFCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCPFClienteActionPerformed(evt);
            }
        });

        lblDadosCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        try {
            ftxtCPFCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtCPFCliente.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(ftxtCPFCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCPFCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCPFCliente)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(ftxtCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Itens do Pedido"));

        jLabel9.setText("Código do Produto");

        btnCodProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnCodProduto.setEnabled(false);
        btnCodProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodProdutoActionPerformed(evt);
            }
        });

        txtCodProduto.setEnabled(false);

        lblProduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel11.setText("Qtde. Vendida");

        txtQtdeVendida.setEnabled(false);

        jLabel12.setText("Valor Total do Pedido");

        jLabel13.setText("Quantidade de Itens Pedidos");

        lblIValTotalPedido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lblQtdeItensPedidos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnAddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnAddItem.setText("Adicionar Item");
        btnAddItem.setEnabled(false);
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnRemoverItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/rem.png"))); // NOI18N
        btnRemoverItem.setText("Remover Item");
        btnRemoverItem.setEnabled(false);
        btnRemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverItemActionPerformed(evt);
            }
        });

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Prec. Unit.", "Qtde. Vend.", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProduto);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCodProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtQtdeVendida, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRemoverItem, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIValTotalPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(lblQtdeItensPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCodProduto)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtQtdeVendida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddItem)
                    .addComponent(btnRemoverItem))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIValTotalPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblQtdeItensPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(161, 161, 161))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblIValTotalPedido, lblQtdeItensPedidos});

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddItem, btnRemoverItem});

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnIncluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnExcluir, btnIncluir, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAlterar)
                        .addComponent(btnExcluir)
                        .addComponent(btnIncluir))
                    .addComponent(btnSair))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnExcluir, btnIncluir, btnSair});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnNumPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumPedidoActionPerformed
        int x;
        boolean formaPagto;
        String data = ftxtDataPedido.getText().replaceAll("[^0-9]", "");

            for (x = 0; x < cadPedido.size(); x++) {
                if (cadPedido.get(x) instanceof Pedido) {
                    if ((cadPedido.get(x)).getNumero().equals(txtCodProduto.getText())) {
                        break;
                    }
                }
            }

            if (x < cadPedido.size()) {
                posPedido = x; //localizou o objeto Pedido no ArrayList
            } else {
                posPedido = -1;//não localizou o objeto Pedido no ArrayList
            }

            if (posPedido >= 0) {
                ftxtDataPedido.setText(cadPedido.get(posPedido).getDataEmissao());

                if (cadPedido.get(posPedido).getFormaPagto()) {
                    rbtnAVista.setSelected(true);
                    rbtnAVista.setSelected(false);
                } else {
                    rbtnAVista.setSelected(false);
                    rbtnAPrazo.setSelected(true);
                }

                btnNumPedido.setEnabled(false);
                txtCodProduto.setEnabled(true);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
                btnRemoverItem.setEnabled(true);
                txtCodProduto.requestFocus();
            } else {
            txtNumPedido.setEnabled(false);
            btnNumPedido.setEnabled(false);

            ftxtDataPedido.setEnabled(true);
            btnCPFCliente.setEnabled(true);

            ftxtDataPedido.requestFocus();
        }
    }//GEN-LAST:event_btnNumPedidoActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnCPFClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCPFClienteActionPerformed
        int x;
        for (x = 0; x < cadCliVend.size(); x++) {
            if (cadCliVend.get(x) instanceof Cliente) {
                if (((Cliente) cadCliVend.get(x)).getCpf().equals(ftxtCPFCliente.getText())) {
                    break;
                }
            }
        }

        if (x < cadCliVend.size()) {
            posCliente = x; //localizou o objeto Cliente no ArrayList

            lblDadosCliente.setText(((Cliente) cadCliVend.get(x)).getNome());
            ((Cliente) cadCliVend.get(x)).addPedido(objPedido);

            ftxtCPFCliente.setEnabled(false);
            btnCPFCliente.setEnabled(false);

            ftxtCPFVendedor.setEnabled(true);
            ftxtCPFVendedor.requestFocus();
            btnCPFVendedor.setEnabled(true);

        } else {
            posCliente = -1;//não localizou o objeto Cliente no ArrayList
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
            ftxtCPFCliente.requestFocus();
        }
    }//GEN-LAST:event_btnCPFClienteActionPerformed

    private void ftxtDataPedidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftxtDataPedidoFocusLost
        if (Pedido.validarData(ftxtDataPedido.getText()) == false) {
            JOptionPane.showMessageDialog(null, "Você deve inserir uma data válida!");
            ftxtDataPedido.requestFocus();
        } else {
            ftxtDataPedido.setEnabled(false);

            objPedido = new Pedido(txtNumPedido.getText(), ftxtDataPedido.getText());
            cadPedido.add(objPedido);
            
            ftxtCPFCliente.setEnabled(true);
            ftxtCPFCliente.requestFocus();
        }
    }//GEN-LAST:event_ftxtDataPedidoFocusLost

    private void btnCPFVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCPFVendedorActionPerformed
        int x;
        for (x = 0; x < cadCliVend.size(); x++) {
            if (cadCliVend.get(x) instanceof Vendedor) {
                if (((Vendedor) cadCliVend.get(x)).getCpf().equals(ftxtCPFVendedor.getText())) {
                    break;
                }
            }
        }

        if (x < cadCliVend.size()) {
            posVendedor = x; //localizou o objeto Vendedor no ArrayList

            lblDadosVendedor.setText(((Vendedor) cadCliVend.get(x)).getNome());
            ((Vendedor) cadCliVend.get(x)).addPedido(objPedido);

            ftxtCPFVendedor.setEnabled(false);
            btnCPFVendedor.setEnabled(false);

            txtCodProduto.setEnabled(true);
            txtCodProduto.requestFocus();
            btnCodProduto.setEnabled(true);
        } else {
            posVendedor = -1;//não localizou o objeto Vendedor no ArrayList
            JOptionPane.showMessageDialog(null, "Vendedor não encontrado!");
            ftxtCPFVendedor.requestFocus();
        }
    }//GEN-LAST:event_btnCPFVendedorActionPerformed

    private void btnCodProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodProdutoActionPerformed
        int x;
        for (x = 0; x < cadProd.size(); x++) {
            if (cadProd.get(x) instanceof Produto) {
                if ((cadProd.get(x)).getCodigo().equals(txtCodProduto.getText())) {
                    break;
                }
            }
        }

        if (x < cadProd.size()) {
            posProduto = x; //localizou o objeto Produto no ArrayList
            lblProduto.setText(cadProd.get(posProduto).getDescricao());

            btnAddItem.setEnabled(true);
            btnRemoverItem.setEnabled(true);
            txtQtdeVendida.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
            txtCodProduto.requestFocus();
        }
    }//GEN-LAST:event_btnCodProdutoActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        int x;
        double totalItem, qtdeVendida = 0;
        boolean verifica;

        for (x = 0; x < cadProd.size(); x++) {
            if (cadProd.get(x) instanceof Produto) {
                if ((cadProd.get(x)).getCodigo().equals(txtCodProduto.getText())) {
                    posProduto = x;
                    break;
                }
            }
        }

        try {
            qtdeVendida = Double.parseDouble(txtQtdeVendida.getText());
            verifica = true;
        } catch (Exception e) {
            verifica = false;
            JOptionPane.showMessageDialog(null, "Insira apenas números!");
            txtQtdeVendida.requestFocus();
        }
        if (verifica) {
            if (qtdeVendida == 0) {
                JOptionPane.showMessageDialog(null, "Digite uma quantidade válida");
                txtQtdeVendida.requestFocus();
            } else {
                if (cadProd.get(x).getQtdeEstoque() >= qtdeVendida) {
                    cont++;
                    objItemPedido = new ItemPedido(cont, Double.parseDouble(txtQtdeVendida.getText()), cadProd.get(x));
                    totalItem = objItemPedido.getTotalItem();

                    if (totalItem > ((Cliente) cadCliVend.get(posCliente)).getLimiteDisp()) {
                        JOptionPane.showMessageDialog(null, "O valor do item do pedido ultrapassa o limite disponível!");
                    } else {
                        objPedido.addItemPedido(objItemPedido);

                        String linha[] = {txtCodProduto.getText(),
                            cadProd.get(x).getDescricao(),
                            String.valueOf(cadProd.get(x).getPreco()),
                            txtQtdeVendida.getText(),
                            String.valueOf(totalItem)};

                        modTblProd.addRow(linha);

                        totalPedido += totalItem;
                        lblIValTotalPedido.setText(String.valueOf(totalPedido));
                        totalQtde += qtdeVendida;
                        lblQtdeItensPedidos.setText(String.valueOf(totalQtde));
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Quantidade em estoque indisponível!");
                }
            }
        }
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverItemActionPerformed
        if (tblProduto.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null,
                    "A linha não foi selecionada",
                    "Aviso",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            modTblProd.removeRow(tblProduto.getSelectedRow());
        }
    }//GEN-LAST:event_btnRemoverItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGroup;
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCPFCliente;
    private javax.swing.JButton btnCPFVendedor;
    private javax.swing.JButton btnCodProduto;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnNumPedido;
    private javax.swing.JButton btnRemoverItem;
    private javax.swing.JButton btnSair;
    private javax.swing.JFormattedTextField ftxtCPFCliente;
    private javax.swing.JFormattedTextField ftxtCPFVendedor;
    private javax.swing.JFormattedTextField ftxtDataPedido;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDadosCliente;
    private javax.swing.JLabel lblDadosVendedor;
    private javax.swing.JLabel lblIValTotalPedido;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQtdeItensPedidos;
    private javax.swing.JRadioButton rbtnAPrazo;
    private javax.swing.JRadioButton rbtnAVista;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtCodProduto;
    private javax.swing.JTextField txtNumPedido;
    private javax.swing.JTextField txtQtdeVendida;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Pedido> cadPedido = new ArrayList<Pedido>();
    private ArrayList<Pessoa> cadCliVend = new ArrayList<Pessoa>();
    private ArrayList<Produto> cadProd = new ArrayList<Produto>();
    private Pedido objPedido;
    private ItemPedido objItemPedido;
    private int posCliente;
    private int posVendedor;
    private int posPedido;
    private int posProduto;
    private int cont = 0;
    private double totalPedido = 0;
    private double totalQtde = 0;
    private DefaultTableModel modTblProd;
}
