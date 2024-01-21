
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alex_
 */
public class TrabaloP1 extends javax.swing.JFrame {

    /**
     * Creates new form TrabaloP1
     */
    public TrabaloP1() {
        initComponents();
        Validação1.setVisible(false);
        Validação2.setVisible(false);
        Validação3.setVisible(false);
        Validação4.setVisible(false);
        Validação5.setVisible(false);
        Validação6.setVisible(false);
        Validação7.setVisible(false);
        Validação8.setVisible(false);
        Validação9.setVisible(false);
        Validação10.setVisible(false);
    }
int cont=0;
    public void validar(){
        
        if (Campo1.getText().equals("")){Validação1.setVisible(true);cont++;} else {Validação1.setVisible(false);}
         if (Campo2.getText().equals("")){Validação2.setVisible(true);cont++;} else {Validação2.setVisible(false);}
          if (Campo3.getText().equals("")){Validação3.setVisible(true);cont++;} else {Validação3.setVisible(false);}
           if (Campo4.getText().equals("")){Validação4.setVisible(true);cont++;} else {Validação4.setVisible(false);}
            if (Campo5.getText().equals("")){Validação5.setVisible(true);cont++;} else {Validação5.setVisible(false);}
             if (Campo6.getText().equals("")){Validação6.setVisible(true);cont++;} else {Validação6.setVisible(false);}
              if (Campo7.getText().equals("")){Validação7.setVisible(true);cont++;} else {Validação7.setVisible(false);}
               if (Campo8.getText().equals("")){Validação8.setVisible(true);cont++;} else {Validação8.setVisible(false);}
                if (Campo9.getText().equals("")){Validação9.setVisible(true);cont++;} else {Validação9.setVisible(false);}
                 if (Campo10.getText().equals("")){Validação10.setVisible(true);cont++;} else {Validação10.setVisible(false);}
            
    }     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Sexo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Campo1 = new javax.swing.JTextField();
        Campo2 = new javax.swing.JTextField();
        Campo3 = new javax.swing.JTextField();
        Campo4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Campo6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Campo7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Campo5 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        opção_Masculino = new javax.swing.JRadioButton();
        opção_Feminino = new javax.swing.JRadioButton();
        opção_Outro = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        Campo8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Validação1 = new javax.swing.JLabel();
        Validação2 = new javax.swing.JLabel();
        Validação3 = new javax.swing.JLabel();
        Validação4 = new javax.swing.JLabel();
        Validação6 = new javax.swing.JLabel();
        Validação7 = new javax.swing.JLabel();
        Validação8 = new javax.swing.JLabel();
        Validação5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Campo9 = new javax.swing.JTextField();
        Validação9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Campo10 = new javax.swing.JTextField();
        Validação10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        opção_sexo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        idioma_ingles = new javax.swing.JCheckBox();
        idioma_espanhol = new javax.swing.JCheckBox();
        idioma_mandarim = new javax.swing.JCheckBox();
        idioma_valiriano = new javax.swing.JCheckBox();
        idioma_binario = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("Sobrenome:");

        jLabel3.setText("Data de Nascimento:");

        Sexo.setText("Sexo:");

        jLabel5.setText("Cidade:");

        Campo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Telefone:");

        jLabel7.setText("CEP:");

        jLabel8.setText("Bairro:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO." }));

        jLabel9.setText("Estado:");

        buttonGroup1.add(opção_Masculino);
        opção_Masculino.setText("Masculino");
        opção_Masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opção_MasculinoActionPerformed(evt);
            }
        });

        buttonGroup1.add(opção_Feminino);
        opção_Feminino.setText("Feminino");
        opção_Feminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opção_FemininoActionPerformed(evt);
            }
        });

        buttonGroup1.add(opção_Outro);
        opção_Outro.setText("Outro");
        opção_Outro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opção_OutroActionPerformed(evt);
            }
        });

        jLabel10.setText("CPF:");

        Campo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo8ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Jokerman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/3186886_arrow_green_movie_icon.png"))); // NOI18N
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Validação1.setForeground(new java.awt.Color(255, 0, 0));
        Validação1.setText("*");

        Validação2.setForeground(new java.awt.Color(255, 0, 0));
        Validação2.setText("*");

        Validação3.setForeground(new java.awt.Color(255, 0, 0));
        Validação3.setText("*");

        Validação4.setForeground(new java.awt.Color(255, 0, 0));
        Validação4.setText("*");

        Validação6.setForeground(new java.awt.Color(255, 0, 0));
        Validação6.setText("*");

        Validação7.setForeground(new java.awt.Color(255, 0, 0));
        Validação7.setText("*");

        Validação8.setForeground(new java.awt.Color(255, 0, 0));
        Validação8.setText("*");

        Validação5.setForeground(new java.awt.Color(255, 0, 0));
        Validação5.setText("*");

        jLabel11.setText("E-mail:");

        Campo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo9ActionPerformed(evt);
            }
        });

        Validação9.setForeground(new java.awt.Color(255, 0, 0));
        Validação9.setText("*");

        jLabel12.setText("Rua:");

        Validação10.setForeground(new java.awt.Color(255, 0, 0));
        Validação10.setText("*");

        jLabel13.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel13.setText("Formulario de Inscrição Ark's Universal");

        opção_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bissexual", "Assexual", "Pansexual", "Pansexual", "Pansexual" }));
        opção_sexo.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Fala alguma outra lingua?");

        idioma_ingles.setText("Ingles");
        idioma_ingles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idioma_inglesActionPerformed(evt);
            }
        });

        idioma_espanhol.setText("Espanhol");

        idioma_mandarim.setText("Mandarim");

        idioma_valiriano.setText("Valiriano");

        idioma_binario.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        idioma_binario.setText("010010100101");

        jMenuBar1.setBackground(new java.awt.Color(102, 255, 102));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/3151577_instruments_logo_mortal_movie_rune_icon (1).png"))); // NOI18N
        jMenu1.setText("Home");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/1907086_logo_media_social_viber_icon.png"))); // NOI18N
        jMenu2.setText("Contatos");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem5.setText("Atendimento");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Redes Sociais");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/3151589_bubble_chat_geek_message_icon.png"))); // NOI18N
        jMenu3.setText("Serviços");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem7.setText("Auxiliar");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Serviço misterioso");
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/3151558_geek_movie_spok_star_treck_icon.png"))); // NOI18N
        jMenu4.setText("volume liso");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem9.setText("Porta");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("Ken");
        jMenu4.add(jMenuItem10);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/3151588_golden_magic_movie_snitch_harry potter_icon.png"))); // NOI18N
        jMenu5.setText("opçoes");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem11.setText("Resetar CPF");
        jMenu5.add(jMenuItem11);

        jMenuItem12.setText("Cancelar CPF");
        jMenu5.add(jMenuItem12);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel13)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Campo3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Validação3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Sexo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Campo1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Validação1)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Campo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Validação2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(opção_Masculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(opção_Feminino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(opção_Outro))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(Campo5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Validação5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(opção_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(66, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Campo6, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(Campo4)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(Campo7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Validação7)
                                .addGap(1, 1, 1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Validação4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Validação6, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Campo10)
                            .addComponent(Campo9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Validação9, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Validação10))
                        .addGap(268, 268, 268))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idioma_ingles)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idioma_espanhol)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idioma_mandarim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idioma_valiriano)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idioma_binario))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(Campo8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Validação8))
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(Campo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Validação1)
                    .addComponent(Validação2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(Sexo)
                        .addComponent(Campo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(opção_Masculino)
                        .addComponent(opção_Feminino)
                        .addComponent(opção_Outro)
                        .addComponent(opção_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Validação3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(Campo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Validação4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Campo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(Validação5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Campo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Validação6)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Campo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Validação7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Campo8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Validação8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Campo9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Validação9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Campo10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Validação10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(idioma_ingles)
                    .addComponent(idioma_espanhol)
                    .addComponent(idioma_mandarim)
                    .addComponent(idioma_valiriano)
                    .addComponent(idioma_binario))
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Campo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void Campo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    cont=0;
        validar();
        if (cont==0){
            JOptionPane.showMessageDialog(null, "Informações enviadas para analise!!!");
        }
        if (Campo1.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"O campo Nome é obrigatorio!!!","validação",JOptionPane.ERROR_MESSAGE);
            Campo1.requestFocus();
        }
        if (Campo2.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"O campo Sobrenome é obrigatorio!!!","validação",JOptionPane.ERROR_MESSAGE);
            Campo2.requestFocus();
        }
        if (Campo3.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"O campo Data de Nascimento é obrigatorio!!!","validação",JOptionPane.ERROR_MESSAGE);
            Campo4.requestFocus();
        }
        if (Campo4.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"O campo Cidade é obrigatorio!!!","validação",JOptionPane.ERROR_MESSAGE);
            Campo4.requestFocus();
        }
        if (Campo5.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"O campo Bairro é obrigatorio!!!","validação",JOptionPane.ERROR_MESSAGE);
            Campo5.requestFocus();
        }
        if (Campo6.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"O campo Telefone é obrigatorio!!!","validação",JOptionPane.ERROR_MESSAGE);
            Campo6.requestFocus();
        }
        if (Campo7.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"O campo CEP é obrigatorio!!!","validação",JOptionPane.ERROR_MESSAGE);
            Campo7.requestFocus();
        }
        if (Campo8.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"O campo CPF é obrigatorio!!!","validação",JOptionPane.ERROR_MESSAGE);
            Campo8.requestFocus();
        }
        if (Campo9.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"O campo E-Mail é obrigatorio!!!","validação",JOptionPane.ERROR_MESSAGE);
            Campo9.requestFocus();
        }
        if (Campo10.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"O campo Rua é obrigatorio!!!","validação",JOptionPane.ERROR_MESSAGE);
            Campo10.requestFocus();
        }
        if (Campo1.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"O campo Nome é obrigatorio!!!","validação",JOptionPane.ERROR_MESSAGE);
            Campo1.requestFocus();
        }
        if (idioma_mandarim.isSelected() || idioma_ingles.isSelected() || idioma_espanhol.isSelected()|| idioma_valiriano.isSelected() ) {
        } else{
             JOptionPane.showMessageDialog(null,"O campo Idioma é obrigatorio!!!","validação",JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Campo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo9ActionPerformed

    private void opção_MasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opção_MasculinoActionPerformed
        // TODO add your handling code here:
        if (opção_Masculino.isSelected()){
            opção_sexo.setEnabled(false);
        } else {
            opção_sexo.setEnabled(true);
        }
    }//GEN-LAST:event_opção_MasculinoActionPerformed

    private void opção_FemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opção_FemininoActionPerformed
        // TODO add your handling code here:
        if (opção_Feminino.isSelected()){
            opção_sexo.setEnabled(false);
        } else {
            opção_sexo.setEnabled(true);
        }
    }//GEN-LAST:event_opção_FemininoActionPerformed

    private void opção_OutroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opção_OutroActionPerformed
        // TODO add your handling code here:
        if (opção_Outro.isSelected()){
            opção_sexo.setEnabled(true);
        } else {
            opção_sexo.setEnabled(false);
        } 
    }//GEN-LAST:event_opção_OutroActionPerformed

    private void idioma_inglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idioma_inglesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idioma_inglesActionPerformed

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
            java.util.logging.Logger.getLogger(TrabaloP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrabaloP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrabaloP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrabaloP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrabaloP1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Campo1;
    private javax.swing.JTextField Campo10;
    private javax.swing.JTextField Campo2;
    private javax.swing.JTextField Campo3;
    private javax.swing.JTextField Campo4;
    private javax.swing.JTextField Campo5;
    private javax.swing.JTextField Campo6;
    private javax.swing.JTextField Campo7;
    private javax.swing.JTextField Campo8;
    private javax.swing.JTextField Campo9;
    private javax.swing.JLabel Sexo;
    private javax.swing.JLabel Validação1;
    private javax.swing.JLabel Validação10;
    private javax.swing.JLabel Validação2;
    private javax.swing.JLabel Validação3;
    private javax.swing.JLabel Validação4;
    private javax.swing.JLabel Validação5;
    private javax.swing.JLabel Validação6;
    private javax.swing.JLabel Validação7;
    private javax.swing.JLabel Validação8;
    private javax.swing.JLabel Validação9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox idioma_binario;
    private javax.swing.JCheckBox idioma_espanhol;
    private javax.swing.JCheckBox idioma_ingles;
    private javax.swing.JCheckBox idioma_mandarim;
    private javax.swing.JCheckBox idioma_valiriano;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JRadioButton opção_Feminino;
    private javax.swing.JRadioButton opção_Masculino;
    private javax.swing.JRadioButton opção_Outro;
    private javax.swing.JComboBox<String> opção_sexo;
    // End of variables declaration//GEN-END:variables
}
