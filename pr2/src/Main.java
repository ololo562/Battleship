import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame f=new JFrame();//creating instance of JFrame

        for(int i=0; i<10;i++){
            for(int j=0; j<10;j++){

//enemy starts
                JButton enemy  = new JButton("");//creating instance of JButton
                enemy.setBounds(280+16*i,20+16*j,15, 15);
                f.add(enemy);

//my starts
                JButton my  = new JButton("");//creating instance of JButton
                my.setBounds(20+16*i,20+16*j,15, 15);
                f.add(my);

                my.addActionListener((e)-> {
                    my.setBackground(Color.BLUE);
                    enemy.setBackground(Color.BLUE);
                 //   enemy.setBackground(Color.BLUE);
                });

            }
        }

      //  f.add(b);//adding button in JFrame
        f.setSize(480,240);
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }
}  