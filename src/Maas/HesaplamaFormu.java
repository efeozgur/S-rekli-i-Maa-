package Maas;

public class HesaplamaFormu extends javax.swing.JFrame {

    public HesaplamaFormu() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        tfAdSoyad = new javax.swing.JTextField();
        lblAdSoyad = new javax.swing.JLabel();
        lblTcNo = new javax.swing.JLabel();
        tfTcNo = new javax.swing.JTextField();
        lblAGI = new javax.swing.JLabel();
        cmbAGI = new javax.swing.JComboBox<>();
        lblKisiBilgileri = new javax.swing.JLabel();
        sep1 = new javax.swing.JSeparator();
        lblCalisilanGunSayisi = new javax.swing.JLabel();
        tfCalisilanGunSayisi = new javax.swing.JTextField();
        lblToplamTatil = new javax.swing.JLabel();
        tfToplamTatilGunu = new javax.swing.JTextField();
        lblCalisilanPazar = new javax.swing.JLabel();
        tfCalisilanPazar = new javax.swing.JTextField();
        lblYevmiye = new javax.swing.JLabel();
        tfYevmiye = new javax.swing.JTextField();
        sep2 = new javax.swing.JSeparator();
        cmbEsYardimi = new javax.swing.JComboBox<>();
        lblEsYardimi = new javax.swing.JLabel();
        lblCocukSayisi = new javax.swing.JLabel();
        tfCocukSayisi = new javax.swing.JTextField();
        cmbDonem = new javax.swing.JComboBox<>();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sürekli İşçi Maaş Hesaplama Formu");
        setResizable(false);

        lblAdSoyad.setText("Adı Soyadı ");

        lblTcNo.setText("T.C. Kimlik No ");

        lblAGI.setText("Asgari Geçim İndirimi (AGI)");

        cmbAGI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bekar", "Evli eşi çalışmayan", "Evli eşi çalışmayan 1 çocuklu", "Evli eşi çalışmayan 2 çocuklu", "Evli eşi çalışmayan 3 çocuklu", "Evli eşi çalışmayan 4 çocuklu", "Evli eşi çalışmayan 5 çocuklu", "Evli eşi çalışan", "Evli eşi çalışan 1 çocuklu", "Evli eşi çalışan 2 çocuklu", "Evli eşi çalışan 3 çocuklu", "Evli eşi çalışan 4 çocuklu", "Evli eşi çalışan 5 çocuklu" }));

        lblKisiBilgileri.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblKisiBilgileri.setText("Kişi Bilgileri");

        lblCalisilanGunSayisi.setText("Çalışılan Gün Sayısı");

        lblToplamTatil.setText("Toplam Tatil Günü Sayısı");

        lblCalisilanPazar.setText("Çalışılan Pazar Günü");

        lblYevmiye.setText("Yevmiye");

        cmbEsYardimi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alıyor", "Almıyor" }));

        lblEsYardimi.setText("Eş Yardımı");

        lblCocukSayisi.setText("Çocuk Sayısı");

        cmbDonem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15 Aralık - 14 Ocak", "15 Ocak - 14 Şubat", "15 Şubat - 14 Mart", "15 Mart - 14 Nisan", "15 Nisan - 14 Mayıs", "15 Mayıs - 14 Haziran", "15 Haziran - 14 Temmuz", "15 Temmuz - 14 Ağustos", "15 Ağustos - 14 Eylül", "15 Eylül - 14 Ekim", "15 Ekim - 14 Kasım", "15 Kasım - 14 Aralık" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sep1)
                    .addComponent(sep2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblToplamTatil)
                            .addComponent(lblCalisilanPazar)
                            .addComponent(lblYevmiye)
                            .addComponent(lblAGI)
                            .addComponent(lblCalisilanGunSayisi)
                            .addComponent(lblTcNo)
                            .addComponent(lblAdSoyad)
                            .addComponent(lblEsYardimi)
                            .addComponent(lblCocukSayisi))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbDonem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfTcNo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfAdSoyad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbEsYardimi, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbAGI, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 10, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCocukSayisi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCalisilanGunSayisi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfToplamTatilGunu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCalisilanPazar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfYevmiye, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblKisiBilgileri)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(cmbDonem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKisiBilgileri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTcNo)
                    .addComponent(tfTcNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdSoyad)
                    .addComponent(tfAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEsYardimi)
                    .addComponent(cmbEsYardimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCocukSayisi)
                    .addComponent(tfCocukSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAGI)
                    .addComponent(cmbAGI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCalisilanGunSayisi)
                    .addComponent(tfCalisilanGunSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblToplamTatil)
                    .addComponent(tfToplamTatilGunu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCalisilanPazar)
                    .addComponent(tfCalisilanPazar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfYevmiye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYevmiye))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HesaplamaFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HesaplamaFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HesaplamaFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HesaplamaFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HesaplamaFormu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbAGI;
    private javax.swing.JComboBox<String> cmbDonem;
    private javax.swing.JComboBox<String> cmbEsYardimi;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel lblAGI;
    private javax.swing.JLabel lblAdSoyad;
    private javax.swing.JLabel lblCalisilanGunSayisi;
    private javax.swing.JLabel lblCalisilanPazar;
    private javax.swing.JLabel lblCocukSayisi;
    private javax.swing.JLabel lblEsYardimi;
    private javax.swing.JLabel lblKisiBilgileri;
    private javax.swing.JLabel lblTcNo;
    private javax.swing.JLabel lblToplamTatil;
    private javax.swing.JLabel lblYevmiye;
    private javax.swing.JSeparator sep1;
    private javax.swing.JSeparator sep2;
    private javax.swing.JTextField tfAdSoyad;
    private javax.swing.JTextField tfCalisilanGunSayisi;
    private javax.swing.JTextField tfCalisilanPazar;
    private javax.swing.JTextField tfCocukSayisi;
    private javax.swing.JTextField tfTcNo;
    private javax.swing.JTextField tfToplamTatilGunu;
    private javax.swing.JTextField tfYevmiye;
    // End of variables declaration//GEN-END:variables
}
