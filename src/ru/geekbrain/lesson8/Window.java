package ru.geekbrain.lesson8;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;

public class Window extends JFrame {

    public static final int ROW = 3;
    public static final int COL = 3;

    public Window () {
        setTitle("TicTacToe");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,400,400);
        setLayout(new GridLayout(ROW, COL));
        ImageIcon X1 = new ImageIcon("x.png");
        Image scaleImage = X1.getImage().getScaledInstance(getWidth()/ROW,getHeight()/COL,Image.SCALE_DEFAULT);
        System.out.println(getWidth());
        ImageIcon X = new ImageIcon(scaleImage);


        JButton[][] map = new JButton[ROW][COL];
        for (int i = 0; i <ROW ; i++) {
            for (int j = 0; j < COL; j++) {
                map[i][j] = new JButton(""+i+" "+j);
                map[i][j].setBackground(Color.WHITE);
                map[i][j].setBorderPainted(false);
                int finalI = i;
                int finalJ = j;
                map[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(map[finalI][finalJ].getText());
                        TicTacToe.humanStep(map[finalI][finalJ].getText());
                        map[finalI][finalJ].setIcon(X);

                    }
                    public void paint(Graphics graphics) {
                        graphics.setColor(Color.RED);
                        graphics.drawOval(map[finalI][finalJ].getHeight() /4, map[finalI][finalJ].getHeight() /4, getWidth() /2, getWidth()/2);
                        graphics.setColor(Color.RED);
                        graphics.fillOval(map[finalI][finalJ].getHeight() /4, map[finalI][finalJ].getHeight() /4, getWidth() /2, getWidth()/2);
                    }


                });
                add(map[i][j]);
            }
        }

        setVisible(true);



    }


}
