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
        JLabel o1,o2,o3,o4;
        p1 = new JLabel("my field for shoots");
        p1.setBounds(50,15,150,30);
        f.add(p1);

        p2 = new JLabel("enemy field");
        p2.setBounds(340,15,100,30);
        f.add(p2);

        p3 = new JLabel("enemy field for shoots");
        p3.setBounds(37,215,150,30);
        f.add(p3);

        p4 = new JLabel("my field");
        p4.setBounds(340,215,100,30);
        f.add(p4);

        for(int i=0; i<10;i++){
            for(int j=0; j<10;j++){

                JButton enemy  = new JButton("");//creating instance of JButton
                enemy.setBounds(280+16*i,40+16*j,15, 15);
                f.add(enemy);

                JButton my  = new JButton("");//creating instance of JButton
                my.setBounds(20+16*i,40+16*j,15, 15);
                f.add(my);

                JButton my2  = new JButton("");//creating instance of JButton
                my2.setBounds(20+16*i,240+16*j,15, 15);
                f.add(my2);

                JButton enemy2  = new JButton("");//creating instance of JButton
                enemy2.setBounds(280+16*i,240+16*j,15, 15);
                f.add(enemy2);

//enemy field where I put ships
                enemy.addActionListener((e)-> {
                    if((enemy.getBackground()!=(Color.blue))&&(enemy.getBackground()!=(Color.orange))) {
                        enemy.setBackground(Color.green);
                    }
                });

//my starts fro shoots

                my.addActionListener((e)-> {
                    if((enemy.getBackground()==(Color.green))&&(enemy.getBackground()!=(Color.blue))) {
                        enemy.setBackground(Color.orange);
                        my.setBackground(Color.red);
                    }
                    else{
                        if(my.getBackground()!=(Color.red)) {
                            enemy.setBackground(Color.blue);
                            my.setBackground(Color.blue);
                        }
                    }
                });

//secondmy for shoots


                my2.addActionListener((e)-> {
                    if((enemy2.getBackground()==(Color.green))&&(enemy2.getBackground()!=(Color.blue))) {
                        enemy2.setBackground(Color.orange);
                        my2.setBackground(Color.red);
                    }
                    else{
                        if(my2.getBackground()!=(Color.red)) {
                            enemy2.setBackground(Color.blue);
                            my2.setBackground(Color.blue);
                        }
                    }
                });

//secondenemy where I put ships

                enemy2.addActionListener((e)-> {
                    if((enemy2.getBackground()!=(Color.blue))&&(enemy2.getBackground()!=(Color.orange))) {
                        enemy2.setBackground(Color.green);
                    }
                });

            }
        }
        JButton other1  = new JButton("");
        JButton other2  = new JButton("");
        JButton other3  = new JButton("");
        JButton other4  = new JButton("");

        other1.setBackground(Color.green);
        other2.setBackground(Color.blue);
        other3.setBackground(Color.orange);
        other4.setBackground(Color.red);

        other1.setBounds(20,420,15, 15);
        f.add(other1);
        other2.setBounds(20,440,15, 15);
        f.add(other2);
        other3.setBounds(20,460,15, 15);
        f.add(other3);
        other4.setBounds(20,480,15, 15);
        f.add(other4);

        o1 = new JLabel("- you put a ship");
        o1.setBounds(40,410,150,30);
        f.add(o1);
        o2 = new JLabel("- you miss");
        o2.setBounds(40,430,150,30);
        f.add(o2);
        o3 = new JLabel("- your ship is shooted");
        o3.setBounds(40,450,150,30);
        f.add(o3);
        o4 = new JLabel("- you hit");
        o4.setBounds(40,470,150,30);
        f.add(o4);

        //  f.add(b);//adding button in JFrame
        f.setSize(480,540);
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }
}  