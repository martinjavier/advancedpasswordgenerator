package advancedpasswordgenerator;

import java.awt.Image;
import java.util.Random;
import java.awt.datatransfer.*;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class MainFrame extends javax.swing.JFrame {

    /**
     * @author Martín Javier Del Percio
     * (c) 2016 Martín Javier Del Percio <martinjavierd@gmail.com>
     * GNU General Public License, version 3 (GPL-3.0)
     * Buenos Aires, Argentina
     */
    
    public String clave = "";
    public String lang = "es";
    public String country = "SP";
    
    public MainFrame() {
        
        initComponents();  
        //getContentPane().setBackground(java.awt.Color.BLUE);
        setIcon();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtResultado = new javax.swing.JTextField();
        btnCopiar = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        panelLong = new javax.swing.JPanel();
        sldLongitud = new javax.swing.JSlider();
        panelGC = new javax.swing.JPanel();
        chkboxSimb = new javax.swing.JCheckBox();
        chkboxNume = new javax.swing.JCheckBox();
        chkboxMinu = new javax.swing.JCheckBox();
        chkboxMayu = new javax.swing.JCheckBox();
        chkboxTodo = new javax.swing.JCheckBox();
        btn_sp = new javax.swing.JButton();
        btn_en = new javax.swing.JButton();
        btn_ger = new javax.swing.JButton();
        btn_fran = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generador Avanzado De Contraseñas");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 216, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        txtResultado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultado.setText("(vacio)");
        txtResultado.setFocusable(false);

        btnCopiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCopiar.setText("copiar la contraseña");
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });

        btnGenerar.setBackground(new java.awt.Color(204, 255, 204));
        btnGenerar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGenerar.setText("GENERAR");
        btnGenerar.setToolTipText("Generar la contraseña");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        panelLong.setBorder(javax.swing.BorderFactory.createTitledBorder("Longitud"));

        sldLongitud.setMajorTickSpacing(8);
        sldLongitud.setMaximum(128);
        sldLongitud.setMinimum(8);
        sldLongitud.setMinorTickSpacing(8);
        sldLongitud.setPaintLabels(true);
        sldLongitud.setPaintTicks(true);
        sldLongitud.setSnapToTicks(true);
        sldLongitud.setToolTipText("");
        sldLongitud.setValue(8);

        javax.swing.GroupLayout panelLongLayout = new javax.swing.GroupLayout(panelLong);
        panelLong.setLayout(panelLongLayout);
        panelLongLayout.setHorizontalGroup(
            panelLongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sldLongitud, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLongLayout.setVerticalGroup(
            panelLongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLongLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(sldLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        panelGC.setBorder(javax.swing.BorderFactory.createTitledBorder("Grupos de Caracteres"));
        panelGC.setName(""); // NOI18N

        chkboxSimb.setText("Símbolos");

        chkboxNume.setText("Números");

        chkboxMinu.setText("Letras Minúsculas");

        chkboxMayu.setText("Letras Mayúsculas");

        chkboxTodo.setText("Seleccionar Todo");
        chkboxTodo.setToolTipText("Selecciona todas las opciones de una vez");
        chkboxTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkboxTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGCLayout = new javax.swing.GroupLayout(panelGC);
        panelGC.setLayout(panelGCLayout);
        panelGCLayout.setHorizontalGroup(
            panelGCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGCLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelGCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkboxMayu)
                    .addComponent(chkboxMinu)
                    .addComponent(chkboxTodo)
                    .addComponent(chkboxNume)
                    .addComponent(chkboxSimb))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        panelGCLayout.setVerticalGroup(
            panelGCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkboxTodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkboxMayu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkboxMinu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkboxSimb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkboxNume)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_sp.setForeground(new java.awt.Color(240, 240, 240));
        btn_sp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/advancedpasswordgenerator/Spain_icon.png"))); // NOI18N
        btn_sp.setToolTipText("Español");
        btn_sp.setBorderPainted(false);
        btn_sp.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_sp.setOpaque(false);
        btn_sp.setPreferredSize(new java.awt.Dimension(32, 32));
        btn_sp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_spActionPerformed(evt);
            }
        });

        btn_en.setIcon(new javax.swing.ImageIcon(getClass().getResource("/advancedpasswordgenerator/UK_icon.png"))); // NOI18N
        btn_en.setBorderPainted(false);
        btn_en.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enActionPerformed(evt);
            }
        });

        btn_ger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/advancedpasswordgenerator/Germany_icon.png"))); // NOI18N
        btn_ger.setLabel("");
        btn_ger.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_ger.setMaximumSize(new java.awt.Dimension(38, 38));
        btn_ger.setMinimumSize(new java.awt.Dimension(38, 38));
        btn_ger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerActionPerformed(evt);
            }
        });

        btn_fran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/advancedpasswordgenerator/France_icon.png"))); // NOI18N
        btn_fran.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_fran.setPreferredSize(new java.awt.Dimension(40, 35));
        btn_fran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_franActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCopiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtResultado)
                    .addComponent(btnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelGC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(panelLong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_fran, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ger, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_sp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_en, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_sp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_en, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_ger, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_fran, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelGC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelLong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnGenerar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCopiar)
                .addGap(20, 20, 20))
        );

        btn_ger.getAccessibleContext().setAccessibleName("");
        btn_fran.getAccessibleContext().setAccessibleName("");

        setSize(new java.awt.Dimension(973, 402));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chkboxTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkboxTodoActionPerformed
        
        if (!chkboxTodo.isSelected())
        {
            chkboxMayu.setSelected(false);
            chkboxMinu.setSelected(false);
            chkboxNume.setSelected(false);
            chkboxSimb.setSelected(false);
        }
        else
        {    
            chkboxMayu.setSelected(true);
            chkboxMinu.setSelected(true);
            chkboxNume.setSelected(true);
            chkboxSimb.setSelected(true);
        }
        
    }//GEN-LAST:event_chkboxTodoActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        
        boolean mayu = chkboxMayu.isSelected();
        boolean minu = chkboxMinu.isSelected();
        boolean nume = chkboxNume.isSelected();
        boolean simb = chkboxSimb.isSelected();
        
        if ((mayu) | (minu) | (nume) | (simb))
            {        
        
                clave = "";
                Random randomGenerator = new Random();

                char [] numer = {'0','1','2','3','4','5','6','7','8','9'};
                char [] minus = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
                char [] mayus = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
                char [] simbo = {'°','!','#','@','^','+','-','$','%','&','/','(',')','=','?','¡','[',']','*','¨'};

                int cadena;
                int cantidad;
                int posicion;

               int maximo = sldLongitud.getValue();
                
                while ( clave.length() < maximo)
                {    
                    cadena = randomGenerator.nextInt(4);                    

                    switch (cadena){
                        case 0:
                            if (chkboxNume.isSelected())
                            {
                            cantidad = numer.length;
                            posicion = randomGenerator.nextInt(cantidad);
                            clave = clave + numer[posicion];
                            }
                        case 1:
                            if (chkboxMinu.isSelected())
                            {
                            cantidad = minus.length;
                            posicion = randomGenerator.nextInt(cantidad);
                            clave = clave + minus[posicion];
                            }
                        case 2:
                            if (chkboxMayu.isSelected())
                            {
                            cantidad = mayus.length;
                            posicion = randomGenerator.nextInt(cantidad);
                            clave = clave + mayus[posicion];
                            }
                        case 3:
                            if (chkboxSimb.isSelected())
                            {
                            cantidad = simbo.length;
                            posicion = randomGenerator.nextInt(cantidad);
                            clave = clave + simbo[posicion];
                            }
                    }
                }
            }
            
            txtResultado.setText(clave);
    
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed

        StringSelection stringSelection = new StringSelection(clave);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);        
        
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void btn_spActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_spActionPerformed
        
        chkboxTodo.setText("Seleccionar Todo");        
        chkboxMayu.setText("Letras Mayúsculas");
        chkboxMinu.setText("Letras Minúsculas");
        chkboxSimb.setText("Símbolos");
        chkboxNume.setText("Números");
        btnGenerar.setText("GENERAR");
        txtResultado.setText("(vacio)");
        btnCopiar.setText("copiar la contraseña");
        this.setTitle("Generador Avanzado de Contraseñas");
        panelLong.setBorder(BorderFactory.createTitledBorder("Longitud"));
        panelGC.setBorder(BorderFactory.createTitledBorder("Grupo de Caracteres"));
        
    }//GEN-LAST:event_btn_spActionPerformed

    private void btn_enActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enActionPerformed

        chkboxTodo.setText("Select All");
        chkboxMayu.setText("Capital Letters");
        chkboxMinu.setText("Lowercase Letters");
        chkboxSimb.setText("Symbols");
        chkboxNume.setText("Numbers");
        btnGenerar.setText("GENERATE");
        txtResultado.setText("(empty)");
        btnCopiar.setText("copy the password");
        this.setTitle("Advanced Password Generator");
        panelLong.setBorder(BorderFactory.createTitledBorder("Length"));
        panelGC.setBorder(BorderFactory.createTitledBorder("Character Set"));
        
    }//GEN-LAST:event_btn_enActionPerformed

    private void btn_franActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_franActionPerformed

        chkboxTodo.setText("Tout Sélectionner");
        chkboxMayu.setText("Lettres Majuscules");
        chkboxMinu.setText("Lettres Minuscules");
        chkboxSimb.setText("Symboles");
        chkboxNume.setText("Nombres");
        btnGenerar.setText("Générer");
        txtResultado.setText("(vide)");
        btnCopiar.setText("Copier Le Mot De Passe");
        this.setTitle("Générateur De Mot De Passe Avancé");
        panelLong.setBorder(BorderFactory.createTitledBorder("Longueur"));
        panelGC.setBorder(BorderFactory.createTitledBorder("Jeu de Caractères"));
        
    }//GEN-LAST:event_btn_franActionPerformed

    private void btn_gerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerActionPerformed
        
        chkboxTodo.setText("Alles Auswählen");
        chkboxMayu.setText("Großbuchstaben");
        chkboxMinu.setText("Kleinbuchstaben");
        chkboxSimb.setText("Symbole");
        chkboxNume.setText("Nummern");
        btnGenerar.setText("GENERIEREN");
        txtResultado.setText("(leer)");
        btnCopiar.setText("Kopieren Sie Das Kennwort Ein");
        this.setTitle("Erweitert Kennwort Generator");
        panelLong.setBorder(BorderFactory.createTitledBorder("Länge"));
        panelGC.setBorder(BorderFactory.createTitledBorder("Zeichensatz"));
        
    }//GEN-LAST:event_btn_gerActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btn_en;
    private javax.swing.JButton btn_fran;
    private javax.swing.JButton btn_ger;
    private javax.swing.JButton btn_sp;
    private javax.swing.JCheckBox chkboxMayu;
    private javax.swing.JCheckBox chkboxMinu;
    private javax.swing.JCheckBox chkboxNume;
    private javax.swing.JCheckBox chkboxSimb;
    private javax.swing.JCheckBox chkboxTodo;
    private javax.swing.JPanel panelGC;
    private javax.swing.JPanel panelLong;
    private javax.swing.JSlider sldLongitud;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("password.png")));        
    }
}
