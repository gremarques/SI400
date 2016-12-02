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
import java.util.Map;
import java.util.Properties;
import javax.swing.table.TableModel;
import java.util.ResourceBundle;
import java.util.Locale;

public class TelaPrincipal extends javax.swing.JFrame {
    
    private AnosPaises anosPaises;
    Pais paises;

    public String lang = "en";
    public String country = "US";
        
    public Locale l = new Locale(lang, country);
    public ResourceBundle r = ResourceBundle.getBundle("lang", l);


    public TelaPrincipal(AnosPaises anosPaises) throws IOException {
        initComponents();
        PrencherPaises();     
        this.anosPaises = anosPaises;
        ComponentesTela();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boxPaises = new javax.swing.JComboBox();
        btnAnalise = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jBtnGrafico = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boxPaises.setBackground(new java.awt.Color(240, 240, 240));
        boxPaises.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxPaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPaisesActionPerformed(evt);
            }
        });

        btnAnalise.setText("Gerar tabela");
        btnAnalise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnaliseActionPerformed(evt);
            }
        });

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnAnalise))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnGrafico)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(boxPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
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

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void ComponentesTela(){

        String botaoTabela = r.getString("botaoTabela");
        btnAnalise.setText(botaoTabela);

        String titulo = r.getString("titulo");
        jLabel4.setText(titulo);

        String botaoGrafico = r.getString("botaoGrafico");
        jBtnGrafico.setText(botaoGrafico);

        String periodo = r.getString("periodo");
        jLabel3.setText(periodo);

        String opcoes = r.getString("opcoes");
        jMenu1.setText(opcoes);
        
        String sair = r.getString("sair");
        jMenuItem1.setText(sair);
        

    }
    
    private void btnAnaliseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnaliseActionPerformed
        String nomeBusca = this.boxPaises.getSelectedItem().toString();
        Pais pais = this.anosPaises.buscarUmPais(nomeBusca);
        
        Map<String,Pais>paisResultado = anosPaises.buscarPaises(nomeBusca);
        this.jTable1.setModel(new TabelaModel(this.anosPaises,pais));
    }//GEN-LAST:event_btnAnaliseActionPerformed

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    private void initFX(JFXPanel panel,Pais pais){
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        String eixoX = r.getString("eixoX");
        xAxis.setLabel(eixoX);
        String eixoY = r.getString("eixoY");
        yAxis.setLabel(eixoY);
        
        final BarChart<String,Number> bc = new BarChart<>(xAxis,yAxis);
        
        String tituloGraf = r.getString("tituloGraf");
        bc.setTitle(tituloGraf + pais.getPais());
        
        XYChart.Series series1 = new XYChart.Series();
        String legenda = r.getString("legenda");
        series1.setName(legenda);
        
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
   
    
    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>

        /* Create and display the form */
         AnosPaises anosPaises = new AnosPaises();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaPrincipal(anosPaises).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxPaises;
    private javax.swing.JButton btnAnalise;
    private javax.swing.JButton jBtnGrafico;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}