import javafx.scene.layout.Background;
import javax.swing.*;
import java.awt.*;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
   // private JTextField pole;
    public static void main(String[] args) {
     //   pole = new JTextField("something");
       // add(pole);\


        JFrame f=new JFrame("Battleship");//creating instance of JFrame
        JLabel p1,p2, p3,p4;
        p1 = new JLabel("my field");
        p1.setBounds(80,15,100,30);
        f.add(p1);

        p2 = new JLabel("enemy field");
        p2.setBounds(340,15,100,30);
        f.add(p2);

        p3 = new JLabel("my field");
        p3.setBounds(80,215,100,30);
        f.add(p3);

        p4 = new JLabel("enemy field");
        p4.setBounds(340,215,100,30);
        f.add(p4);

        for(int i=0; i<10;i++){
            for(int j=0; j<10;j++){

//enemy starts


                JButton enemy  = new JButton("");//creating instance of JButton
                enemy.setBounds(280+16*i,40+16*j,15, 15);
                f.add(enemy);

                enemy.addActionListener((e)-> {
                    if((enemy.getBackground()!=(Color.BLUE))&&(enemy.getBackground()!=(Color.RED))) {
                        enemy.setBackground(Color.GREEN);
                    }
                });

//my starts
                JButton my  = new JButton("");//creating instance of JButton
                my.setBounds(20+16*i,40+16*j,15, 15);
                f.add(my);

                my.addActionListener((e)-> {
                    if((enemy.getBackground()==(Color.GREEN))||(my.getBackground()==(Color.yellow))) {
                        enemy.setBackground(Color.RED);
                        my.setBackground(Color.yellow);
                    }
                    else {
                        if (my.getBackground()!=(Color.yellow))
                        {
                            enemy.setBackground(Color.BLUE);
                            my.setBackground(Color.BLUE);
                        }
                    }
                });

//secondmy
                JButton my2  = new JButton("");//creating instance of JButton
                my2.setBounds(20+16*i,240+16*j,15, 15);
                f.add(my2);

                my2.addActionListener((e)-> {
                    //if((enemy.getBackground()!=(Color.BLUE))&&(enemy.getBackground()!=(Color.RED))) {
                   //     enemy.setBackground(Color.GREEN);
                    //}
                });

//secondenemy
                JButton enemy2  = new JButton("");//creating instance of JButton
                enemy2.setBounds(280+16*i,240+16*j,15, 15);
                f.add(enemy2);

                enemy2.addActionListener((e)-> {
                    //if((enemy.getBackground()!=(Color.BLUE))&&(enemy.getBackground()!=(Color.RED))) {
                    //     enemy.setBackground(Color.GREEN);
                    //}
                });

            }
        }

        //  f.add(b);//adding button in JFrame
        f.setSize(480,500);
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }
}  