package com.george.svd;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LookAndFeel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class SaveTheDate {

    public static void main(String[] args) throws Exception {
        
        
        final JFrame jf = new JFrame("");
        jf.setBackground(Color.WHITE);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JLabel lbl = new JLabel("<html><font size=100><font color=red>RESERVE</font> A <font color=red>DATA</font></font></html>",SwingConstants.CENTER);

        
        lbl.setFont(lbl.getFont().deriveFont(72F));
        lbl.setBackground(Color.WHITE);
        jf.setAlwaysOnTop(true);
        jf.setSize(600, 300);
        
        jf.getContentPane().add(lbl);
        lbl.setVisible(false);
        final JButton btn = new JButton("Clique em mim !");
        JPanel pnl = new JPanel();
        pnl.add(btn);
        jf.getContentPane().add(pnl,BorderLayout.NORTH);
        btn.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl.setVisible(true);
                btn.setVisible(false);
                jf.setTitle("Reserve a data !");
            }
        });
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        jf.setSize(screenWidth / 2, screenHeight / 2);
        jf.setLocation(screenWidth / 4, screenHeight / 4);

        jf.setVisible(true);
    }
}
