
package calculadora;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;

public class Calculadora extends javax.swing.JFrame {

    
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
   
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/images/icono.png")).getImage());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelSuperior = new javax.swing.JPanel();
        txtResultat = new javax.swing.JLabel();
        txtOperacio = new javax.swing.JLabel();
        barraSeparadora = new javax.swing.JPanel();
        PaneLInferior = new javax.swing.JPanel();
        btn_c = new javax.swing.JButton();
        btn_ce = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_sumar = new javax.swing.JButton();
        btn_dividir = new javax.swing.JButton();
        btn_multiplicar = new javax.swing.JButton();
        btn_restar = new javax.swing.JButton();
        btn_porciento = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_decimal = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelSuperior.setBackground(new java.awt.Color(26, 27, 40));

        txtResultat.setBackground(new java.awt.Color(255, 255, 255));
        txtResultat.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        txtResultat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtOperacio.setFont(new java.awt.Font("Segoe Print", 0, 36)); // NOI18N
        txtOperacio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        barraSeparadora.setBackground(new java.awt.Color(30, 36, 53));

        javax.swing.GroupLayout barraSeparadoraLayout = new javax.swing.GroupLayout(barraSeparadora);
        barraSeparadora.setLayout(barraSeparadoraLayout);
        barraSeparadoraLayout.setHorizontalGroup(
            barraSeparadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );
        barraSeparadoraLayout.setVerticalGroup(
            barraSeparadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelSuperiorLayout = new javax.swing.GroupLayout(PanelSuperior);
        PanelSuperior.setLayout(PanelSuperiorLayout);
        PanelSuperiorLayout.setHorizontalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraSeparadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultat, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtOperacio, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelSuperiorLayout.setVerticalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorLayout.createSequentialGroup()
                .addComponent(txtResultat, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraSeparadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtOperacio, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(PanelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 220));

        PaneLInferior.setBackground(new java.awt.Color(26, 27, 40));
        PaneLInferior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_c.setBackground(new java.awt.Color(82, 201, 220));
        btn_c.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btn_c.setForeground(new java.awt.Color(255, 255, 255));
        btn_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_default.png"))); // NOI18N
        btn_c.setText("C");
        btn_c.setFocusPainted(false);
        btn_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        PaneLInferior.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, 50));

        btn_ce.setBackground(new java.awt.Color(82, 201, 220));
        btn_ce.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btn_ce.setForeground(new java.awt.Color(255, 255, 255));
        btn_ce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_default.png"))); // NOI18N
        btn_ce.setText("CE");
        btn_ce.setFocusPainted(false);
        btn_ce.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ce.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_ce.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_ce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ceActionPerformed(evt);
            }
        });
        PaneLInferior.add(btn_ce, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 50, 50));

        btn_0.setBackground(new java.awt.Color(30, 36, 53));
        btn_0.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btn_0.setForeground(new java.awt.Color(255, 255, 255));
        btn_0.setText("0");
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        PaneLInferior.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 50, 50));

        btn_sumar.setBackground(new java.awt.Color(82, 201, 220));
        btn_sumar.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btn_sumar.setForeground(new java.awt.Color(255, 255, 255));
        btn_sumar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_sumar.png"))); // NOI18N
        btn_sumar.setText("+");
        btn_sumar.setFocusPainted(false);
        btn_sumar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sumar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_sumar_secondary.png"))); // NOI18N
        btn_sumar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_sumar_secondary.png"))); // NOI18N
        btn_sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumarActionPerformed(evt);
            }
        });
        PaneLInferior.add(btn_sumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 50, 110));

        btn_dividir.setBackground(new java.awt.Color(82, 201, 220));
        btn_dividir.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btn_dividir.setForeground(new java.awt.Color(255, 255, 255));
        btn_dividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_default.png"))); // NOI18N
        btn_dividir.setText("/");
        btn_dividir.setFocusPainted(false);
        btn_dividir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dividir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_dividir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dividirActionPerformed(evt);
            }
        });
        PaneLInferior.add(btn_dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 50, 50));

        btn_multiplicar.setBackground(new java.awt.Color(82, 201, 220));
        btn_multiplicar.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btn_multiplicar.setForeground(new java.awt.Color(255, 255, 255));
        btn_multiplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_default.png"))); // NOI18N
        btn_multiplicar.setText("*");
        btn_multiplicar.setFocusPainted(false);
        btn_multiplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_multiplicar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_multiplicar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicarActionPerformed(evt);
            }
        });
        PaneLInferior.add(btn_multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 50, 50));

        btn_restar.setBackground(new java.awt.Color(82, 201, 220));
        btn_restar.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btn_restar.setForeground(new java.awt.Color(255, 255, 255));
        btn_restar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_default.png"))); // NOI18N
        btn_restar.setText("-");
        btn_restar.setFocusPainted(false);
        btn_restar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_restar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_restar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restarActionPerformed(evt);
            }
        });
        PaneLInferior.add(btn_restar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 50, 50));

        btn_porciento.setBackground(new java.awt.Color(82, 201, 220));
        btn_porciento.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btn_porciento.setForeground(new java.awt.Color(255, 255, 255));
        btn_porciento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_default.png"))); // NOI18N
        btn_porciento.setText("%");
        btn_porciento.setFocusPainted(false);
        btn_porciento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_porciento.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_porciento.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_porciento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcientoActionPerformed(evt);
            }
        });
        PaneLInferior.add(btn_porciento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 50, 50));

        btn_9.setBackground(new java.awt.Color(30, 36, 53));
        btn_9.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btn_9.setForeground(new java.awt.Color(255, 255, 255));
        btn_9.setText("9");
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        PaneLInferior.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 50, 50));

        btn_6.setBackground(new java.awt.Color(30, 36, 53));
        btn_6.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btn_6.setForeground(new java.awt.Color(255, 255, 255));
        btn_6.setText("6");
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        PaneLInferior.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 50, 50));

        btn_3.setBackground(new java.awt.Color(30, 36, 53));
        btn_3.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btn_3.setForeground(new java.awt.Color(255, 255, 255));
        btn_3.setText("3");
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        PaneLInferior.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 50, 50));

        btn_igual.setBackground(new java.awt.Color(82, 201, 220));
        btn_igual.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_default.png"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        PaneLInferior.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 50, 50));

        btn_8.setBackground(new java.awt.Color(30, 36, 53));
        btn_8.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btn_8.setForeground(new java.awt.Color(255, 255, 255));
        btn_8.setText("8");
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        PaneLInferior.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 50, 50));

        btn_5.setBackground(new java.awt.Color(30, 36, 53));
        btn_5.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btn_5.setForeground(new java.awt.Color(255, 255, 255));
        btn_5.setText("5");
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        PaneLInferior.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 50, 50));

        btn_2.setBackground(new java.awt.Color(30, 36, 53));
        btn_2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btn_2.setForeground(new java.awt.Color(255, 255, 255));
        btn_2.setText("2");
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        PaneLInferior.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 50, 50));

        btn_decimal.setBackground(new java.awt.Color(30, 36, 53));
        btn_decimal.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btn_decimal.setForeground(new java.awt.Color(255, 255, 255));
        btn_decimal.setText(".");
        btn_decimal.setFocusPainted(false);
        btn_decimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_decimal.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_decimal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_decimalActionPerformed(evt);
            }
        });
        PaneLInferior.add(btn_decimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 50, 50));

        btn_7.setBackground(new java.awt.Color(30, 36, 53));
        btn_7.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btn_7.setForeground(new java.awt.Color(255, 255, 255));
        btn_7.setText("7");
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        PaneLInferior.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 50, 50));

        btn_4.setBackground(new java.awt.Color(30, 36, 53));
        btn_4.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btn_4.setForeground(new java.awt.Color(255, 255, 255));
        btn_4.setText("4");
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        PaneLInferior.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 50, 50));

        btn_1.setBackground(new java.awt.Color(30, 36, 53));
        btn_1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btn_1.setForeground(new java.awt.Color(255, 255, 255));
        btn_1.setText("1");
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        PaneLInferior.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 50, 50));

        getContentPane().add(PaneLInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 390, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        // TODO add your handling code here:
        txtOperacio.setText("");
        txtResultat.setText("");
       
    }//GEN-LAST:event_btn_cActionPerformed
    
    public void addNumber(String digito){
        txtOperacio.setText(txtOperacio.getText() + digito);
    }
    
    private void btn_ceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ceActionPerformed
            String text = txtOperacio.getText().substring(0,txtOperacio.getText().length() -1);
            txtOperacio.setText(text);
            btn_igual.doClick();
    }//GEN-LAST:event_btn_ceActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        addNumber("0");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumarActionPerformed
        addNumber("+");
        
    }//GEN-LAST:event_btn_sumarActionPerformed

    private void btn_dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dividirActionPerformed
        addNumber("/");
        
    }//GEN-LAST:event_btn_dividirActionPerformed

    private void btn_multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicarActionPerformed
        addNumber("*");
        
    }//GEN-LAST:event_btn_multiplicarActionPerformed

    private void btn_restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restarActionPerformed
        addNumber("-");
        
    }//GEN-LAST:event_btn_restarActionPerformed

    private void btn_porcientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcientoActionPerformed
        addNumber("%");
        
    }//GEN-LAST:event_btn_porcientoActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        addNumber("9");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        addNumber("6");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
       addNumber("3");
       btn_igual.doClick();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
         try {
           String resultat = se.eval(txtOperacio.getText()).toString();
           txtResultat.setText(resultat);
        } catch (Exception e) {  
            txtResultat.setText("ERROR!");
        }
        
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        addNumber("8");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        addNumber("5");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        addNumber("2");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_decimalActionPerformed
        addNumber(".");
       
    }//GEN-LAST:event_btn_decimalActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        addNumber("7");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
        addNumber("4");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
       addNumber("1");
       btn_igual.doClick();
    }//GEN-LAST:event_btn_1ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PaneLInferior;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.JPanel barraSeparadora;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_ce;
    private javax.swing.JButton btn_decimal;
    private javax.swing.JButton btn_dividir;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multiplicar;
    private javax.swing.JButton btn_porciento;
    private javax.swing.JButton btn_restar;
    private javax.swing.JButton btn_sumar;
    private javax.swing.JLabel txtOperacio;
    private javax.swing.JLabel txtResultat;
    // End of variables declaration//GEN-END:variables
}
