package UASgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Objects;

import static UASgui.keyitem.*;
import static UASgui.jeniskeyboard.*;
import static UASgui.layoutkeyboard.*;
import static UASgui.materialkeyboard.*;
import static UASgui.switchkeyboard.*;

public class UASgui extends JFrame {

    public static void main(final String[] args) {
        JFrame frame = new JFrame("UASgui");
        frame.setContentPane(new UASgui().tampilan_awal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        JPanel picturePanel = new JPanel();
        //panel size
        picturePanel.setPreferredSize(new Dimension(920, 600));





    }


    private JPanel tampilan_awal;
    private JCheckBox highProfileKeyboardButton;
    private JTabbedPane tabbedPane1;
    private JLabel itemYangDiPilihLabel;
    private JComboBox comboBox1;

    private JComboBox comboBox2;
    private JComboBox comboBox3;

    private JButton resetButton;
    private JButton nextButton;
    private JButton previousButton;
    private JButton nextButton1;
    private JTextField textField1;
    private JComboBox comboBox4;
    private JButton nextButton2;
    private JButton previousButton1;
    private JButton previousButton2;
    private JButton nextButton3;
    private JTextArea itemshow;
    private JButton okButton;
    private JButton okButton1;
    private JTextPane item;


    public UASgui() {




        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //to the next panel
                tabbedPane1.setSelectedIndex(1);
                //button size


            }
        });

        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //previous panel
                tabbedPane1.setSelectedIndex(0);
            }
        });

        comboBox3.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                //if high profile is selected add price to total

                if (Objects.equals(comboBox3.getSelectedItem(), "High Profile")) {
                    //select jeniskeyboard.hihgprofile
                    int hargahigh = gethigh();
                    itemkey[0] = "High Profile Keyboard :" + hargahigh + "\n";
                    jenis[0] = hargahigh;


                } else if (Objects.equals(comboBox3.getSelectedItem(), "Low Profile")) {
                    //select jeniskeyboard.lowprofile
                    int hargalow = getlow();
                    itemkey[0] = "Low Profile Keyboard :" + hargalow + "\n";
                    //add price to total
                    jenis[0] = hargalow;

                }
        }
        });
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = total1.gettotal();
                String allitem = keyitem.getitem();
                textField1.setText("Rp " + total);
                itemshow.setText(allitem);


            }
        });
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("Rp " + total1.total[0]);
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //reset total price
                total1.total[0] = 0;
                textField1.setText("Rp " + total1.total[0]);
                //reset itemkey
                itemkey[0] = "";
                itemshow.setText(itemkey[0]);

            }
        });
        nextButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //to the next panel
                tabbedPane1.setSelectedIndex(2);
            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (Objects.equals(comboBox1.getSelectedItem(), "layout 100%")) {
                    seratus[0] = 150000;
                    enampuluhlima[0] = 0; // Set 65% layout price to 0
                    tujuhpuluhlima[0] = 0; // Set 75% layout price to 0
                    layout[0] = jenis[0] + seratus[0];
                    textField1.setText("Rp " + layout[0]);
                    itemkey1 [0] = "100% Layout :" + seratus[0] + "\n";
                    itemshow.setText(itemkey[0] + itemkey1[0]);


                } else if (Objects.equals(comboBox1.getSelectedItem(), "layout 65%")) {
                    enampuluhlima[0] = 100000;
                    seratus[0] = 0; // Set 100% layout price to 0
                    tujuhpuluhlima[0] = 0; // Set 75% layout price to 0
                    layout[0] = jenis[0] + enampuluhlima[0];
                    textField1.setText("Rp " + layout[0]);
                    itemkey1 [0] = "65% Layout :" + enampuluhlima[0] + "\n";
                    itemshow.setText(itemkey[0] + itemkey1[0]);

                } else if (Objects.equals(comboBox1.getSelectedItem(), "layout 75%")) {
                    tujuhpuluhlima[0] = 125000;
                    seratus[0] = 0; // Set 100% layout price to 0
                    enampuluhlima[0] = 0; // Set 65% layout price to 0
                    layout[0] = jenis[0] + tujuhpuluhlima[0];
                    textField1.setText("Rp " + layout[0]);
                    itemkey1 [0] = "75% Layout :" + tujuhpuluhlima[0] + "\n";
                    itemshow.setText( itemkey[0] + itemkey1[0]);

                }
            }


        });
        okButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        previousButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //previous panel
                tabbedPane1.setSelectedIndex(1);
            }
        });
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //to the next panel
                tabbedPane1.setSelectedIndex(3);
            }
        });
        comboBox4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //if layout is selected add price to total\
                if (Objects.equals(comboBox4.getSelectedItem(), "gateron")) {
                    gateron[0] = 204000;
                    oetemu[0] = 0; // Set cherry brown price to 0
                    cherrymx[0] = 0; // Set cherry red price to 0
                    switchk[0] = layout[0] + gateron[0];
                    textField1.setText("Rp " + switchk[0]);
                    itemkey2 [0] = "Gateron Switch :" + gateron[0] + "\n";
                    itemshow.setText( itemkey[0] + itemkey1[0] + itemkey2[0]);

                }else if (Objects.equals(comboBox4.getSelectedItem(), "oetemu")) {
                    oetemu[0] = 190000;
                    gateron[0] = 0; // Set gateron price to 0
                    cherrymx[0] = 0; // Set cherry red price to 0
                    switchk[0] = layout[0] + oetemu[0];
                    textField1.setText("Rp " + switchk[0]);
                    itemkey2 [0] = "Oetemu Switch :" + oetemu[0] + "\n";
                    itemshow.setText( itemkey[0] + itemkey1[0] + itemkey2[0]);

            }   else if (Objects.equals(comboBox4.getSelectedItem(), "cherry mx")) {
                    cherrymx[0] = 272000;
                    gateron[0] = 0; // Set gateron price to 0
                    oetemu[0] = 0; // Set oetemu price to 0
                    switchk[0] = layout[0] + cherrymx[0];
                    textField1.setText("Rp " + switchk[0]);
                    itemkey2 [0] = "Cherry MX Switch :" + cherrymx[0] + "\n";
                    itemshow.setText( itemkey[0] + itemkey1[0] + itemkey2[0]);

                }
            }
        });

        comboBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //if layout is selected add price to total
                if (Objects.equals(comboBox2.getSelectedItem(), "plastic")) {
                    plastic[0] = 200000;
                    metal[0] = 0;
                    kayu[0] = 0;
                    material[0] = switchk[0] + plastic[0];
                    textField1.setText("Rp " + material[0]);
                    itemkey3 [0] = "Plastic Case :" + plastic[0] + "\n";
                    itemshow.setText( itemkey[0] + itemkey1[0] + itemkey2[0] + itemkey3[0]);
                } else if (Objects.equals(comboBox2.getSelectedItem(), "metal")) {
                    metal[0] = 300000;
                    plastic[0] = 0;
                    kayu[0] = 0;
                    material[0] = switchk[0] + metal[0];
                    textField1.setText("Rp " + material[0]);
                    itemkey3 [0] = "Metal Case :" + metal[0] + "\n";
                    itemshow.setText( itemkey[0] + itemkey1[0] + itemkey2[0] + itemkey3[0]);
                } else if (Objects.equals(comboBox2.getSelectedItem(), "kayu")) {
                    kayu[0] = 450000;
                    plastic[0] = 0;
                    metal[0] = 0;
                    material[0] = switchk[0] + kayu[0];
                    textField1.setText("Rp " + material[0]);
                    itemkey3 [0] = "Wood Case :" + kayu[0] + "\n";
                    itemshow.setText( itemkey[0] + itemkey1[0] + itemkey2[0] + itemkey3[0]);
                }
            }
        });
        previousButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //previous panel
                tabbedPane1.setSelectedIndex(2);
            }
        });


        itemshow.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                itemshow.setText( itemkey[0]) ;
                itemshow.setText( itemkey[0]+ itemkey[1] );

            }
        });


    }



}
