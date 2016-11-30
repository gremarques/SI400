package br.unicamp.ft.ui;

import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import br.unicamp.ft.entities.Pais;
import br.unicamp.ft.entities.AnosPaises;
import br.unicamp.ft.entities.TabelaModel;
import java.util.Map;
import javax.swing.table.TableModel;

public class Tela_Principal extends javax.swing.JFrame {
    
    private AnosPaises anosPaises;
    Pais paises;

    public Tela_Principal(AnosPaises anosPaises) throws IOException {
        initComponents();
        PrencherPaises();     
        this.anosPaises = anosPaises;
        InicializarComboBox();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boxPaises = new javax.swing.JComboBox();
        btnAnalise = new javax.swing.JButton();
        boxAnoInicial = new javax.swing.JComboBox();
        boxAnoFinal = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBtnGrafico = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boxPaises.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxPaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPaisesActionPerformed(evt);
            }
        });

        btnAnalise.setText("Analisar");
        btnAnalise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnaliseActionPerformed(evt);
            }
        });

        jLabel1.setText("De");

        jLabel2.setText("até");

        jLabel4.setFont(new java.awt.Font("Century", 1, 28)); // NOI18N
        jLabel4.setText("Consumo de Fertilizante em diversos países ");
        jLabel4.setToolTipText("");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jBtnGrafico.setText("Gerar gráfico");
        jBtnGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGraficoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century", 1, 28)); // NOI18N
        jLabel3.setText("2002-2013");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(boxAnoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2))
                                    .addComponent(btnAnalise))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnGrafico)
                                    .addComponent(boxAnoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boxPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(boxAnoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(boxAnoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnalise)
                    .addComponent(jBtnGrafico))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jMenu1.setText("Opções");
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Limpar Tela");
        jMenu1.add(jMenuItem3);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenu1.add(menuSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnaliseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnaliseActionPerformed
        String nomeBusca = this.boxPaises.getSelectedItem().toString();
        Pais pais = this.anosPaises.buscarUmPais(nomeBusca);
        
        Map<String,Pais>paisResultado = anosPaises.buscarPaises(nomeBusca);
        this.jTable1.setModel(new TabelaModel(this.anosPaises,pais));
    }//GEN-LAST:event_btnAnaliseActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

    private void boxPaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPaisesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxPaisesActionPerformed

    //Gerando o grafico
    private void jBtnGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGraficoActionPerformed
        Pais pais = this.anosPaises.buscarUmPais(this.boxPaises.getSelectedItem().toString());
        JDialog janP1 = new JDialog();
        JFXPanel fxPanel = new JFXPanel();
        janP1.add(fxPanel);
        janP1.setSize(800,600);
        janP1.setVisible(true);
        Platform.runLater(new Runnable() {
            @Override
            public void run(){
                initFX(fxPanel,pais);
            }
        });
    }//GEN-LAST:event_jBtnGraficoActionPerformed
private void initFX(JFXPanel panel,Pais pais){
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Anos");
        yAxis.setLabel("Valores");
        
        final BarChart<String,Number> bc = new BarChart<>(xAxis,yAxis);
        
        bc.setTitle("Consumo de fertilizante do Pais : " + pais.getPais());
        
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Consumo em quilograma por hectare");
        
        for(String nomePaises: this.anosPaises.nomesAnos){ //Erro! fazendo o grafico de todos os anos
            series1.getData().add(new XYChart.Data(nomePaises, pais.retornarValor(nomePaises))); 
       }

        bc.getData().addAll(series1);
        Scene scene = new Scene(bc,800,600);
        panel.setScene(scene);
    }

    //Receber os paises do CSV
    public void PrencherPaises() throws FileNotFoundException, IOException{
        CSVReader reader = new CSVReader(new FileReader("API_AG.CON.FERT.ZS_DS2_en_csv_v2.csv"));
        String [] nextLine;
        Pais paises = new Pais();
       
        while ((nextLine = reader.readNext()) != null) 
        {
            paises = new Pais(); // referenciando o array para Pais
            paises.setPais(nextLine[0]); // set nome de acordo com a linha em questão
            boxPaises.addItem(paises.getPais());//Adiciona os paises no combo-box,para o usuario escolher
            
        }
    }
    //Inserir os anos do CSV
    private void InicializarComboBoxAno(){
        List<String> anos = anosPaises.nomesAnos;
        DefaultComboBoxModel model = new DefaultComboBoxModel(anos.toArray(new String[anos.size()])); 
        this.boxAnoInicial.setModel(model);
        this.boxAnoFinal.setModel(model);
    }
    //Insere os caracteres "- - - -" junto com os anos
    private void InicializarComboBox(){
        List<String> nomeAnos = anosPaises.nomesAnos;
        
        this.boxAnoInicial.addItem("- - - -");
        this.boxAnoFinal.addItem("- - - -");
        for(String pais: nomeAnos){
                this.boxAnoInicial.addItem(pais);
                this.boxAnoFinal.addItem(pais);
        }
        
    }
    
public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         AnosPaises anosPaises = new AnosPaises();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Tela_Principal(anosPaises).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Tela_Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxAnoFinal;
    private javax.swing.JComboBox boxAnoInicial;
    private javax.swing.JComboBox boxPaises;
    private javax.swing.JButton btnAnalise;
    private javax.swing.JButton jBtnGrafico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem menuSair;
    // End of variables declaration//GEN-END:variables
}