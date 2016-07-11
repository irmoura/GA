/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import static CODIGOS.Arquivo.inf;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Ismael Ribeiro
 */
public class Tela extends javax.swing.JFrame {
    
    public int v;//Vez
    public int TDA;//Total de Atendimentos
    public int AT1;//Atendimentos Técnico 1
    public int AT2;//Atendimentos Técnico 2
    public int AT3;//Atendimentos Técnico 3
    public int AT4;//Atendimentos Técnico 4
    public int AT5;//Atendimentos Técnico 5
    public int contador;
    public int QDT;
    
    public int hora, minuto, segundo;
    public String horas;
    public Calendar now;
    public Timer timer;
   
    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();  
    }
    
    public void inicioVisibilidadeBotoes(Boolean t1, Boolean t2, Boolean t3, Boolean t4, Boolean t5){
        TEC_1_BTN.setVisible(t1);
        TEC_2_BTN.setVisible(t2);
        TEC_3_BTN.setVisible(t3);
        TEC_4_BTN.setVisible(t4);
        TEC_5_BTN.setVisible(t5);
    }
    
    public void inicioNomeBotoes(String N1, String N2, String N3, String N4, String N5){
        TEC_1_BTN.setText(N1);
        TEC_2_BTN.setText(N2);
        TEC_3_BTN.setText(N3);
        TEC_4_BTN.setText(N4);
        TEC_5_BTN.setText(N5);
    }
    
    public void inicioBotoesHabilitados(Boolean t1, Boolean t2, Boolean t3, Boolean t4, Boolean t5){
        TEC_1_BTN.setEnabled(t1);
        TEC_2_BTN.setEnabled(t1);
        TEC_3_BTN.setEnabled(t1);
        TEC_4_BTN.setEnabled(t1);
        TEC_5_BTN.setEnabled(t1);
    }
    
    public void obterHoras(){
        now = Calendar.getInstance();
        horas = String.format("%1$tH:%1$tM:%1$tS", now);//HORAS NO FORMATO 13:00:00
        hora = Integer.parseInt(String.format("%1$tH", now));//HORAS 13
        minuto = Integer.parseInt(String.format("%1$tM", now));//MINUTO 00
        segundo = Integer.parseInt(String.format("%1$tS", now));//SEGUNDO
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        TEC_1_BTN = new javax.swing.JToggleButton();
        TEC_2_BTN = new javax.swing.JToggleButton();
        TEC_3_BTN = new javax.swing.JToggleButton();
        TEC_4_BTN = new javax.swing.JToggleButton();
        TEC_5_BTN = new javax.swing.JToggleButton();
        TEXTO_DA_VEZ = new javax.swing.JLabel();
        BTN_ZERAR = new javax.swing.JButton();
        TEXTO_TOTAL = new javax.swing.JLabel();
        TEXTO_HORA = new javax.swing.JLabel();
        TEXTO_DESENVOLVEDOR = new javax.swing.JLabel();
        PAPEL_DE_PAREDE = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TEC_1_BTN.setText("Técnico 1");
        jDesktopPane1.add(TEC_1_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 370, -1, -1));

        TEC_2_BTN.setText("Técnico 2");
        jDesktopPane1.add(TEC_2_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 370, -1, -1));

        TEC_3_BTN.setText("Técnico 3");
        jDesktopPane1.add(TEC_3_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 370, -1, -1));

        TEC_4_BTN.setText("Técnico 4");
        jDesktopPane1.add(TEC_4_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 370, -1, -1));

        TEC_5_BTN.setText("Técnico 5");
        jDesktopPane1.add(TEC_5_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 370, -1, -1));

        TEXTO_DA_VEZ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(TEXTO_DA_VEZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 680, 90));

        BTN_ZERAR.setText("ZERAR");
        BTN_ZERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ZERARActionPerformed(evt);
            }
        });
        jDesktopPane1.add(BTN_ZERAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        TEXTO_TOTAL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TEXTO_TOTAL.setText("Atendimentos : ");
        jDesktopPane1.add(TEXTO_TOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        TEXTO_HORA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TEXTO_HORA.setText("00:00:00");
        jDesktopPane1.add(TEXTO_HORA, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        TEXTO_DESENVOLVEDOR.setText("Desenvolvedor : Ismael Ribeiro");
        jDesktopPane1.add(TEXTO_DESENVOLVEDOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        PAPEL_DE_PAREDE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/vistamizer-windows-vista-wallpaper-pack-14.jpg"))); // NOI18N
        PAPEL_DE_PAREDE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PAPEL_DE_PAREDEMouseClicked(evt);
            }
        });
        jDesktopPane1.add(PAPEL_DE_PAREDE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        obterHoras();//OBTEM A HORA EM QUE O PROGRAMA É ABERTO
        BTN_ZERAR.setEnabled(false);
        
        timer = new Timer(1000, (ActionEvent e) -> {
            
            contador++;
            
            obterHoras();

            TEXTO_HORA.setText(horas);
            
            ////////////////////////////////////////////////////////////////////
        });
        
        timer.start();
        
        try {
            Arquivo.ler();
        } catch (IOException ex) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        QDT = Integer.parseInt(inf[0]);
       
        if(QDT == 3){
        
        /*DEFINE SE O BOTAO INICIARÁ VISIVEL*/
        inicioVisibilidadeBotoes(false, true, true, true, false);
        
        /*DEFINE O NOME DOS TÉCNICOS*/
        inicioNomeBotoes("", inf[1], inf[2], inf[3], "");
        
        /*DEFINE SE O BOTAO INICIARÁ HABILITADO*/
        inicioBotoesHabilitados(false, false, false, false, false);//false, true, true, true, false
        
        }else
        if(QDT == 5){
        
        /*DEFINE SE O BOTAO INICIARÁ VISIVEL*/
        inicioVisibilidadeBotoes(true, true, true, true, true);
        
        /*DEFINE O NOME DOS TÉCNICOS*/
        inicioNomeBotoes(inf[1], inf[2], inf[3], inf[4], inf[5]);
        
        /*DEFINE SE O BOTAO INICIARÁ HABILITADO*/
        inicioBotoesHabilitados(true, true, true, true, true);
        
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:   
        
    }//GEN-LAST:event_formMouseClicked

    private void BTN_ZERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ZERARActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_BTN_ZERARActionPerformed

    private void PAPEL_DE_PAREDEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PAPEL_DE_PAREDEMouseClicked
        // TODO add your handling code here:
        
        BTN_ZERAR.setEnabled(true);
        
        v++;//A cada clique incrementa +1
        
        ////////////////////////////////////////////////////////////////////////
        /*SE NENHUM BOTAO ESTIVER HABILITADO*/
        /*if((QDT == 3 && !TEC_1_BTN.isEnabled() && !TEC_2_BTN.isEnabled() && !TEC_3_BTN.isEnabled() && !TEC_4_BTN.isEnabled() && !TEC_5_BTN.isEnabled())){
            JOptionPane.showMessageDialog(null,"Todos os técnicos estão fora do horário de atendimento.","Aviso",JOptionPane.WARNING_MESSAGE);
        }*/
        
        TEXTO_TOTAL.setText("Atendimentos : "+v);
        
    }//GEN-LAST:event_PAPEL_DE_PAREDEMouseClicked

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_ZERAR;
    private javax.swing.JLabel PAPEL_DE_PAREDE;
    private javax.swing.JToggleButton TEC_1_BTN;
    private javax.swing.JToggleButton TEC_2_BTN;
    private javax.swing.JToggleButton TEC_3_BTN;
    private javax.swing.JToggleButton TEC_4_BTN;
    private javax.swing.JToggleButton TEC_5_BTN;
    private javax.swing.JLabel TEXTO_DA_VEZ;
    private javax.swing.JLabel TEXTO_DESENVOLVEDOR;
    private javax.swing.JLabel TEXTO_HORA;
    private javax.swing.JLabel TEXTO_TOTAL;
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables
}
