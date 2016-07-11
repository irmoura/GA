/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import static CODIGOS.Arquivo.PSL1;
import static CODIGOS.Arquivo.PSL2;
import static CODIGOS.Arquivo.PSL3;
import static CODIGOS.Arquivo.PSL4;
import static CODIGOS.Arquivo.PSL5;
import static CODIGOS.Arquivo.PSL6;
import java.awt.Color;
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
    
    public int HCT1;
    public int MCT1;
    public int HST1;
    public int MST1;
    public String ET1;
    public String ST1;
    
    public int HCT2;
    public int MCT2;
    public int HST2;
    public int MST2;
    public String ET2;
    public String ST2;
    
    public int HCT3;
    public int MCT3;
    public int HST3;
    public int MST3;
    public String ET3;
    public String ST3;
    
    public int HCT4;
    public int MCT4;
    public int HST4;
    public int MST4;
    public String ET4;
    public String ST4;
    
    public int HCT5;
    public int MCT5;
    public int HST5;
    public int MST5;
    public String ET5;
    public String ST5;
    
    public int hora, minuto, segundo;
    public String horas;
    public Calendar now;
    public Timer timer;
    
    public Password password;
   
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
        TEXTO_NOME_DA_VEZ = new javax.swing.JLabel();
        BOTAO_ZERAR = new javax.swing.JButton();
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
        TEC_1_BTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TEC_1_BTNMouseClicked(evt);
            }
        });
        jDesktopPane1.add(TEC_1_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 370, -1, -1));

        TEC_2_BTN.setText("Técnico 2");
        TEC_2_BTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TEC_2_BTNMouseClicked(evt);
            }
        });
        jDesktopPane1.add(TEC_2_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 370, -1, -1));

        TEC_3_BTN.setText("Técnico 3");
        TEC_3_BTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TEC_3_BTNMouseClicked(evt);
            }
        });
        jDesktopPane1.add(TEC_3_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 370, -1, -1));

        TEC_4_BTN.setText("Técnico 4");
        TEC_4_BTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TEC_4_BTNMouseClicked(evt);
            }
        });
        jDesktopPane1.add(TEC_4_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 370, -1, -1));

        TEC_5_BTN.setText("Técnico 5");
        TEC_5_BTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TEC_5_BTNMouseClicked(evt);
            }
        });
        jDesktopPane1.add(TEC_5_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 370, -1, -1));

        TEXTO_NOME_DA_VEZ.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        TEXTO_NOME_DA_VEZ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(TEXTO_NOME_DA_VEZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 680, 90));

        BOTAO_ZERAR.setText("ZERAR");
        BOTAO_ZERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_ZERARActionPerformed(evt);
            }
        });
        jDesktopPane1.add(BOTAO_ZERAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

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
        
        Arquivo.ler("CONFIG5");
        
        QDT = Integer.parseInt(PSL1[0]);
        
        if(QDT == 3){
            HCT1 = Integer.parseInt(PSL2[2]);//Hora Chegada Técnico 1
        MCT1 = Integer.parseInt(PSL2[3]);//Minuto chegada Técnico 1
        HST1 = Integer.parseInt(PSL2[4]);//Hora Saida Técnico 1
        MST1 = Integer.parseInt(PSL2[5]);//Minuto Saida Técnico 1
        ET1 = PSL2[6];//Entrada Técnico 1
        ST1 = PSL2[7];//Saida Técnico 1
        
        HCT2 = Integer.parseInt(PSL3[2]);//Hora Chegada Técnico 2
        MCT2 = Integer.parseInt(PSL3[3]);//Minuto Chegada Técnico 2
        HST2 = Integer.parseInt(PSL3[4]);//Hora Saida Técnico 2
        MST2 = Integer.parseInt(PSL3[5]);//Minuto Saida Técnico 2
        ET2 = PSL3[6];//Entrada Técnico 2
        ST2 = PSL3[7];//Saida Técnico 2
        
        HCT3 = Integer.parseInt(PSL4[2]);//Hora Chegada Técnico 3
        MCT3 = Integer.parseInt(PSL4[3]);//Minuto Chegada Técnico 3
        HST3 = Integer.parseInt(PSL4[4]);//Hora Saida Técnico 3
        MST3 = Integer.parseInt(PSL4[5]);//Minuto Saida Técnico 3
        ET3 = PSL4[6];//Entrada Técnico 3
        ST3 = PSL4[7];//Saida Técnico 3
        }
        if(QDT == 5){
                HCT1 = Integer.parseInt(PSL2[2]);//Hora Chegada Técnico 1
        MCT1 = Integer.parseInt(PSL2[3]);//Minuto chegada Técnico 1
        HST1 = Integer.parseInt(PSL2[4]);//Hora Saida Técnico 1
        MST1 = Integer.parseInt(PSL2[5]);//Minuto Saida Técnico 1
        ET1 = PSL2[6];//Entrada Técnico 1
        ST1 = PSL2[7];//Saida Técnico 1
        
        HCT2 = Integer.parseInt(PSL3[2]);//Hora Chegada Técnico 2
        MCT2 = Integer.parseInt(PSL3[3]);//Minuto Chegada Técnico 2
        HST2 = Integer.parseInt(PSL3[4]);//Hora Saida Técnico 2
        MST2 = Integer.parseInt(PSL3[5]);//Minuto Saida Técnico 2
        ET2 = PSL3[6];//Entrada Técnico 2
        ST2 = PSL3[7];//Saida Técnico 2
        
        HCT3 = Integer.parseInt(PSL4[2]);//Hora Chegada Técnico 3
        MCT3 = Integer.parseInt(PSL4[3]);//Minuto Chegada Técnico 3
        HST3 = Integer.parseInt(PSL4[4]);//Hora Saida Técnico 3
        MST3 = Integer.parseInt(PSL4[5]);//Minuto Saida Técnico 3
        ET3 = PSL4[6];//Entrada Técnico 3
        ST3 = PSL4[7];//Saida Técnico 3
        
        HCT4 = Integer.parseInt(PSL5[2]);//Hora Chegada Técnico 4
        MCT4 = Integer.parseInt(PSL5[3]);//Minuto Chegada Técnico 4
        HST4 = Integer.parseInt(PSL5[4]);//Hora Saida Técnico 4
        MST4 = Integer.parseInt(PSL5[5]);//Minuto Saida Técnico 4
        ET4 = PSL5[6];//Entrada Técnico 4
        ST4 = PSL5[7];//Saida Técnico 4
        
        HCT5 = Integer.parseInt(PSL6[2]);//Hora Chegada Técnico 5
        MCT5 = Integer.parseInt(PSL6[3]);//Minuto Chegada Técnico 5
        HST5 = Integer.parseInt(PSL6[4]);//Hora Saida Técnico 5
        MST5 = Integer.parseInt(PSL6[5]);//Minuto Saida Técnico 5
        ET5 = PSL6[6];//Entrada Técnico 5
        ST5 = PSL6[7];//Saida Técnico 5
        }
        
        obterHoras();//OBTEM A HORA EM QUE O PROGRAMA É ABERTO
        BOTAO_ZERAR.setEnabled(false);
        TEXTO_HORA.setForeground(Color.yellow);
        TEXTO_TOTAL.setForeground(Color.yellow);
        
        timer = new Timer(1000, (ActionEvent e) -> {
            
            contador++;
            
            obterHoras();

            TEXTO_HORA.setText(horas);
            
            ////////////////////////////////////////////////////////////////////
            /*TÉCNICOS HABILITADOS NA HORA E MINUTO DEFINIDOS*/
            if(horas.equals(ET1)){
                TEC_1_BTN.setEnabled(true);
                TEC_1_BTN.setSelected(false);
                TEC_1_BTN.setBackground(Color.green);
            }
            if(horas.equals(ET2)){
                TEC_2_BTN.setEnabled(true);
                TEC_2_BTN.setSelected(false);
                TEC_2_BTN.setBackground(Color.green);
            }
            if(horas.equals(ET3)){
                TEC_3_BTN.setEnabled(true);
                TEC_3_BTN.setSelected(false);
                TEC_3_BTN.setBackground(Color.green);
            }
            if(horas.equals(ET4)){
                TEC_4_BTN.setEnabled(true);
                TEC_4_BTN.setSelected(false);
                TEC_4_BTN.setBackground(Color.green);
            }
            if(horas.equals(ET5)){
                TEC_5_BTN.setEnabled(true);
                TEC_5_BTN.setSelected(false);
                TEC_5_BTN.setBackground(Color.green);
            }
            
            ////////////////////////////////////////////////////////////////////
        });
        
        timer.start();
       
        if(QDT == 3){
        
        /*DEFINE SE O BOTAO INICIARÁ VISIVEL*/
        inicioVisibilidadeBotoes(false, true, true, true, false);
        
        /*DEFINE O NOME DOS TÉCNICOS*/
        inicioNomeBotoes("", PSL2[0], PSL3[0], PSL4[0], "");
        
        /*DEFINE SE O BOTAO INICIARÁ HABILITADO*/
        TEC_1_BTN.setEnabled(false);
        TEC_2_BTN.setEnabled(true);
        TEC_3_BTN.setEnabled(true);
        TEC_4_BTN.setEnabled(true);
        TEC_5_BTN.setEnabled(false);
        
         ////////////////////////////////////////////////////////////////////////
        /*DEPOIS DO HORARIO DE CHEGADA O BOTAO INICIA HABILITADO*/
        if((hora >= HCT1 && minuto >= MCT1) ||
           (hora > HCT1)){
            TEC_2_BTN.setSelected(false);
            TEC_2_BTN.setBackground(Color.green);
        }
        if((hora >= HCT2 && minuto >= MCT2) ||
           (hora > HCT2)){
            TEC_3_BTN.setSelected(false);
            TEC_3_BTN.setBackground(Color.green);
        }
        if((hora >= HCT3 && minuto >= MCT3) ||
           (hora > HCT3)){
            TEC_4_BTN.setSelected(false);
            TEC_4_BTN.setBackground(Color.green);
        }
        
        }else
        if(QDT == 5){
        
        /*DEFINE SE O BOTAO INICIARÁ VISIVEL*/
        inicioVisibilidadeBotoes(true, true, true, true, true);
        
        /*DEFINE O NOME DOS TÉCNICOS*/
        inicioNomeBotoes(PSL2[0], PSL3[0], PSL4[0], PSL5[0], PSL6[0]);
        
        /*DEFINE SE O BOTAO INICIARÁ HABILITADO*/
        TEC_1_BTN.setEnabled(true);
        TEC_2_BTN.setEnabled(true);
        TEC_3_BTN.setEnabled(true);
        TEC_4_BTN.setEnabled(true);
        TEC_5_BTN.setEnabled(true);
        
         ////////////////////////////////////////////////////////////////////////
        /*DEPOIS DO HORARIO DE CHEGADA O BOTAO INICIA HABILITADO*/
        if((hora >= HCT1 && minuto >= MCT1) ||
           (hora > HCT1)){
            TEC_1_BTN.setSelected(false);
            TEC_1_BTN.setBackground(Color.green);
        }
        if((hora >= HCT2 && minuto >= MCT2) ||
           (hora > HCT2)){
            TEC_2_BTN.setSelected(false);
            TEC_2_BTN.setBackground(Color.green);
        }
        if((hora >= HCT3 && minuto >= MCT3) ||
           (hora > HCT3)){
            TEC_3_BTN.setSelected(false);
            TEC_3_BTN.setBackground(Color.green);
        }
        if((hora >= HCT4 && minuto >= MCT4) ||
           (hora > HCT4)){
            TEC_4_BTN.setSelected(false);
            TEC_4_BTN.setBackground(Color.green);
        }
        if((hora >= HCT5 && minuto >= MCT5) ||
           (hora > HCT5)){
            TEC_5_BTN.setSelected(false);
            TEC_5_BTN.setBackground(Color.green);
        }
        /*ANTES DO HORARIO O BOTAO INICIA DESABILITADO*/
        if((hora <= HCT1 && minuto < MCT1)){
            TEC_1_BTN.setEnabled(false);
            TEC_1_BTN.setSelected(true);
            TEC_1_BTN.setBackground(Color.red);
            TEC_1_BTN.setText(""+PSL2[0]);
        }
        if((hora <= HCT2 && minuto < MCT2)){
            TEC_2_BTN.setEnabled(false);
            TEC_2_BTN.setSelected(true);
            TEC_2_BTN.setBackground(Color.red);
            TEC_2_BTN.setText(""+PSL3[0]);
        }
        if((hora <= HCT3 && minuto < MCT3)){
            TEC_3_BTN.setEnabled(false);
            TEC_3_BTN.setSelected(true);
            TEC_3_BTN.setBackground(Color.red);
            TEC_3_BTN.setText(""+PSL4[0]);
        }
        if((hora <= HCT4 && minuto < MCT4)){
            TEC_4_BTN.setEnabled(false);
            TEC_4_BTN.setSelected(true);
            TEC_4_BTN.setBackground(Color.red);
            TEC_4_BTN.setText(""+PSL5[0]);
        }
        if((hora <= HCT5 && minuto < MCT5)){
            TEC_5_BTN.setEnabled(false);
            TEC_5_BTN.setSelected(true);
            TEC_5_BTN.setBackground(Color.red);
            TEC_5_BTN.setText(""+PSL6[0]);
        }
        
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:   
        
    }//GEN-LAST:event_formMouseClicked

    private void BOTAO_ZERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_ZERARActionPerformed
        // TODO add your handling code here:
        
        Object[] options = { "Sim", "Não" };   
        int opcao = JOptionPane.showOptionDialog(null,"Deseja zerar a contagem ?","Aviso",
        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);   
  
        if (opcao != 0){
        //JOptionPane.showMessageDialog(null,"");
        }else{
              
            String senha = "";
            int tentativas = 3;//Define o número de tentativas que o usuário terá para acertar a senha.
            
            for(int i=0;i<tentativas;i++)
            {
                if(!senha.equals(password.senha))      
                {
                    
                    senha = JOptionPane.showInputDialog(null,"Password: ","Warning "+(i+1)+"ª tentativa.",JOptionPane.OK_CANCEL_OPTION);
                    
                }    
            }
            if (!senha.equals(password.senha) || senha.equals(null))    
            {
                JOptionPane.showMessageDialog(null,"Senha incorreta ou operação cancelada","Aviso",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                if(QDT == 5){
                v = 0;
                TDA = 0;
                AT1 = 0;
                AT2 = 0;
                AT3 = 0;
                AT4 = 0;
                AT5 = 0;
                TEXTO_TOTAL.setText("ATENDIMENTOS : ");
                TEXTO_NOME_DA_VEZ.setText("");
                TEC_1_BTN.setText(""+PSL2[0]);
                TEC_2_BTN.setText(""+PSL3[0]);
                TEC_3_BTN.setText(""+PSL4[0]);
                TEC_4_BTN.setText(""+PSL5[0]);
                TEC_5_BTN.setText(""+PSL6[0]);
                BOTAO_ZERAR.setEnabled(false);
                }
            }
        }
        
    }//GEN-LAST:event_BOTAO_ZERARActionPerformed

    private void PAPEL_DE_PAREDEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PAPEL_DE_PAREDEMouseClicked
        // TODO add your handling code here:
        
        if(QDT == 5){
            
        BOTAO_ZERAR.setEnabled(true);//Ao primeiro clique habilita o botão zerar
        
        v++;//A cada clique incrementa +1

        ////////////////////////////////////////////////////////////////////////
        /*SE NENHUM BOTAO ESTIVER HABILITADO*/
        if((TEC_1_BTN.isSelected() && TEC_2_BTN.isSelected() && TEC_3_BTN.isSelected() && TEC_4_BTN.isSelected() && TEC_5_BTN.isSelected()) || 
          (!TEC_1_BTN.isEnabled() && !TEC_2_BTN.isEnabled() && !TEC_3_BTN.isEnabled() && !TEC_4_BTN.isEnabled() && !TEC_5_BTN.isEnabled())){
            JOptionPane.showMessageDialog(null,"Habilite pelo menos um Técnico.","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        ////////////////////////////////////////////////////////////////////////
        /*SE APENAS O 5° TÉCNICO ESTIVER HABILITADO*/
        if((TEC_1_BTN.isSelected() && TEC_2_BTN.isSelected() && TEC_3_BTN.isSelected() && TEC_4_BTN.isSelected() && !TEC_5_BTN.isSelected()) || 
          (!TEC_1_BTN.isEnabled() && !TEC_2_BTN.isEnabled() && !TEC_3_BTN.isEnabled() && !TEC_4_BTN.isEnabled() && TEC_5_BTN.isEnabled())){
            v = 5;
        }
        if(v == 1 && (TEC_1_BTN.isSelected() && TEC_2_BTN.isSelected() && TEC_3_BTN.isSelected() && TEC_4_BTN.isSelected() && !TEC_5_BTN.isSelected()) || 
          (!TEC_1_BTN.isEnabled() && !TEC_2_BTN.isEnabled() && !TEC_3_BTN.isEnabled() && !TEC_4_BTN.isEnabled() && TEC_5_BTN.isEnabled())){
            
            TEXTO_NOME_DA_VEZ.setText(PSL2[0]+" - "+PSL2[1]);
            AT5++;
            TEC_5_BTN.setText(PSL2[0]+" - "+AT5);
            TDA++;
            
        }
        ////////////////////////////////////////////////////////////////////////
        /*SE APENAS O 2º O 3º E O 4º TÉCNICO ESTIVEREM HABILITADOS*/
        if(v == 5 && !TEC_2_BTN.isSelected() && !TEC_3_BTN.isSelected() && TEC_1_BTN.isSelected() && !TEC_4_BTN.isSelected() && TEC_5_BTN.isSelected()){
            v = v - 4;
        }
        ////////////////////////////////////////////////////////////////////////
        /*SE APENAS O 3º E O 4º TÉCNICO ESTIVEREM HABILITADOS*/
        if(v == 5 && TEC_2_BTN.isSelected() && !TEC_3_BTN.isSelected() && TEC_1_BTN.isSelected() && !TEC_4_BTN.isSelected() && TEC_5_BTN.isSelected()){
            v = v - 3;
        }
        ////////////////////////////////////////////////////////////////////////
        /*SE APENAS O 2º E O 3º TÉCNICO ESTIVEREM HABILITADOS*/
        if(v == 4 && !TEC_2_BTN.isSelected() && !TEC_3_BTN.isSelected() && TEC_1_BTN.isSelected() && TEC_4_BTN.isSelected() && TEC_5_BTN.isSelected()){
            v = v - 2;
        }
        ////////////////////////////////////////////////////////////////////////
        /*NA VEZ DO TÉCNICO E O MESMO ESTIVER DESABILITADO*/
        if(v == 1 && TEC_1_BTN.isSelected() || v == 1 && !TEC_1_BTN.isEnabled()){
            v++;
        }
        if(v == 2 && TEC_2_BTN.isSelected() || v == 2 && !TEC_2_BTN.isEnabled()){
            v++;
        }
        if(v == 3 && TEC_3_BTN.isSelected() || v == 3 && !TEC_3_BTN.isEnabled()){
            v++;
        }
        if(v == 4 && TEC_4_BTN.isSelected() || v == 4 && !TEC_4_BTN.isEnabled()){
            v++;
        }
        if(v == 5 && TEC_5_BTN.isSelected() || v == 5 && !TEC_3_BTN.isEnabled()){
            v=1;
        }
        ////////////////////////////////////////////////////////////////////////
        /*SE APENAS O 2º TÉCNICO ESTIVER HABILITADO*/
        if(TEC_1_BTN.isSelected() && TEC_3_BTN.isSelected() && TEC_4_BTN.isSelected() && TEC_5_BTN.isSelected()){
            v=2;
        }
        ////////////////////////////////////////////////////////////////////////
        /*SE APENAS O 3º TÉCNICO ESTIVER HABILITADO*/
        if(TEC_1_BTN.isSelected() && TEC_2_BTN.isSelected() && TEC_4_BTN.isSelected() && TEC_5_BTN.isSelected()){
            v=3;
        }
        ////////////////////////////////////////////////////////////////////////
        /*SE APENAS O 4º TÉCNICO ESTIVER HABILITADO*/
        if(TEC_1_BTN.isSelected() && TEC_2_BTN.isSelected() && TEC_3_BTN.isSelected() && TEC_5_BTN.isSelected()){
            v=4;
        }
        ////////////////////////////////////////////////////////////////////////
        /*NA VEZ DO TÉCNICO E O MESMO ESTIVER HABILITADO*/
        if(v == 1 && !TEC_1_BTN.isSelected()){
            
            TEXTO_NOME_DA_VEZ.setText(PSL2[0]+" - "+PSL2[1]);
            AT1++;
            TEC_1_BTN.setText(PSL2[0]+" - "+AT1);
            TDA++;
            
        }
        if(v == 2 && !TEC_2_BTN.isSelected()){
            
            TEXTO_NOME_DA_VEZ.setText(PSL3[0]+" - "+PSL3[1]);
            AT2++;
            TEC_2_BTN.setText(PSL3[0]+" - "+AT2);
            TDA++;
            
        }
        if(v == 3 && !TEC_3_BTN.isSelected()){ 
            
            TEXTO_NOME_DA_VEZ.setText(PSL4[0]+" - "+PSL4[1]);
            AT3++;
            TEC_3_BTN.setText(PSL4[0]+" - "+AT3);
            TDA++;
            
        }
        if(v == 4 && !TEC_4_BTN.isSelected()){ 
            
            TEXTO_NOME_DA_VEZ.setText(PSL5[0]+" - "+PSL5[1]);
            AT4++;
            TEC_4_BTN.setText(PSL5[0]+" - "+AT4);
            TDA++;
            
        }
        if(v == 5 && !TEC_5_BTN.isSelected()){ 
            
            TEXTO_NOME_DA_VEZ.setText(PSL6[0]+" - "+PSL6[1]);
            AT5++;
            TEC_5_BTN.setText(PSL6[0]+" - "+AT5);
            TDA++;
            
            v = 0;
        }
        ////////////////////////////////////////////////////////////////////////
        /*NA VEZ DO ÚLTIMO TÉCNICO E O MESMO ESTIVER DESABILITADO*/
        if(v == 5 && TEC_5_BTN.isSelected() || v == 5 && !TEC_5_BTN.isEnabled()){
            v = 0;
        }
        ////////////////////////////////////////////////////////////////////////
        TEXTO_TOTAL.setText("Atendimentos : "+TDA);
        
        /*Codigos.Arquivo.gravar("Total de atendimentos: "+TDA,
                               PSL2[0]+" = "+AT1,
                               PSL3[0]+" = "+AT2,
                               PSL4[0]+" = "+AT3,
                               PSL5[0]+" = "+AT4,
                               PSL6[0]+" = "+AT5);*/
        }
        
    }//GEN-LAST:event_PAPEL_DE_PAREDEMouseClicked

    private void TEC_1_BTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TEC_1_BTNMouseClicked
        // TODO add your handling code here:
        if(TEC_1_BTN.isSelected()){
            TEC_1_BTN.setSelected(true);
            TEC_1_BTN.setBackground(Color.red);
        }else{
            TEC_1_BTN.setSelected(false);
            TEC_1_BTN.setBackground(Color.green);
        }
    }//GEN-LAST:event_TEC_1_BTNMouseClicked

    private void TEC_2_BTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TEC_2_BTNMouseClicked
        // TODO add your handling code here:
        if(TEC_2_BTN.isSelected()){
            TEC_2_BTN.setSelected(true);
            TEC_2_BTN.setBackground(Color.red);
        }else{
            TEC_2_BTN.setSelected(false);
            TEC_2_BTN.setBackground(Color.green);
        }
    }//GEN-LAST:event_TEC_2_BTNMouseClicked

    private void TEC_3_BTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TEC_3_BTNMouseClicked
        // TODO add your handling code here:
         if(TEC_3_BTN.isSelected()){
            TEC_3_BTN.setSelected(true);
            TEC_3_BTN.setBackground(Color.red);
        }else{
            TEC_3_BTN.setSelected(false);
            TEC_3_BTN.setBackground(Color.green);
        }
    }//GEN-LAST:event_TEC_3_BTNMouseClicked

    private void TEC_4_BTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TEC_4_BTNMouseClicked
        // TODO add your handling code here:
        if(TEC_4_BTN.isSelected()){
            TEC_4_BTN.setSelected(true);
            TEC_4_BTN.setBackground(Color.red);
        }else{
            TEC_4_BTN.setSelected(false);
            TEC_4_BTN.setBackground(Color.green);
        }
    }//GEN-LAST:event_TEC_4_BTNMouseClicked

    private void TEC_5_BTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TEC_5_BTNMouseClicked
        // TODO add your handling code here:
         if(TEC_5_BTN.isSelected()){
            TEC_5_BTN.setSelected(true);
            TEC_5_BTN.setBackground(Color.red);
        }else{
            TEC_5_BTN.setSelected(false);
            TEC_5_BTN.setBackground(Color.green);
        }
    }//GEN-LAST:event_TEC_5_BTNMouseClicked

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
    private javax.swing.JButton BOTAO_ZERAR;
    private javax.swing.JLabel PAPEL_DE_PAREDE;
    private javax.swing.JToggleButton TEC_1_BTN;
    private javax.swing.JToggleButton TEC_2_BTN;
    private javax.swing.JToggleButton TEC_3_BTN;
    private javax.swing.JToggleButton TEC_4_BTN;
    private javax.swing.JToggleButton TEC_5_BTN;
    private javax.swing.JLabel TEXTO_DESENVOLVEDOR;
    private javax.swing.JLabel TEXTO_HORA;
    private javax.swing.JLabel TEXTO_NOME_DA_VEZ;
    private javax.swing.JLabel TEXTO_TOTAL;
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables
}
