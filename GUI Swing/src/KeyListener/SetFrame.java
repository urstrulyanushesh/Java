package KeyListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SetFrame extends JFrame implements KeyListener {

    JLabel label,bgLabel;
    ImageIcon img,bgImg;
    SetFrame(){
        setLayout(null);
        setBounds(500,50,700,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);

        //For rocket
        label=new JLabel();
        label.setBounds(200,100,300,320);
//        getContentPane().setBackground(Color.black);
        img=new ImageIcon("src/KeyListener/rocket.png");
        label.setIcon(img);
        add(label);

//      For Background Space
        bgLabel=new JLabel();
        bgLabel.setSize(1700,850);
        bgImg=new ImageIcon("src/KeyListener/sp.png");
        bgLabel.setIcon(bgImg);
        add(bgLabel);




        setVisible(true);
    }


    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()){
            case 'w':label.setLocation(label.getX(),label.getY()-20);
            break;
            case 'a':label.setLocation(label.getX()-20,label.getY());
            break;
            case 's':label.setLocation(label.getX(),label.getY()+20);
            break;
            case 'd':label.setLocation(label.getX()+20,label.getY());
            break;
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case 38:label.setLocation(label.getX(),label.getY()-10);
            break;
            case 37:label.setLocation(label.getX()-10,label.getY());
            break;
            case 40:label.setLocation(label.getX(),label.getY()+10);
            break;
            case 39:label.setLocation(label.getX()+10,label.getY());
            break;
        }

    }

    public void keyReleased(KeyEvent e){
        System.out.println(" Released Key Char: " + e.getKeyChar());  //Prints Character
        System.out.println(" Released Key Code: " + e.getKeyCode()); //if same key is released Same Code No matter Capital or small
    }

    public static void main(String[] args) {
        new SetFrame();
    }

}
