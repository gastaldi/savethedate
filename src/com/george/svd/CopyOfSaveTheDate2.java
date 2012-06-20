package com.george.svd;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CopyOfSaveTheDate2 {

    public static void main(String[] args) throws Exception {
        
        
        final JFrame jf = new JFrame("RESERVE A DATA");
        jf.setBackground(Color.WHITE);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        final JLabel lbl1 = new JLabel("RESERVE",SwingConstants.CENTER);
        lbl1.setFont(lbl1.getFont().deriveFont(72F));
        lbl1.setForeground(Color.RED);
        //        lbl1.setForeground(Color.blue);
         
        final JLabel lbl2 = new JLabel("A",SwingConstants.CENTER);
        lbl2.setFont(lbl2.getFont().deriveFont(72F));
        lbl2.setForeground(Color.BLUE);
        
        final JLabel lbl3 = new JLabel("DATA",SwingConstants.CENTER);
        lbl3.setFont(lbl3.getFont().deriveFont(72F));
        lbl3.setForeground(Color.RED);
        
        final JPanel pnl2 = new JPanel();
        pnl2.setLayout(new GridLayout(3,1));
        pnl2.add(lbl1);
        pnl2.add(lbl2);
        pnl2.add(lbl3);
        
        jf.setAlwaysOnTop(true);
        jf.setSize(600, 300);
        
        jf.getContentPane().add(pnl2);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        jf.setSize(screenWidth / 2, screenHeight / 2);
        jf.setLocation(screenWidth / 4, screenHeight / 4);

        jf.setVisible(true);
    }
}
