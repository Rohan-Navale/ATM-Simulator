import javax.swing.*;
import java.awt.*;

public class Trans extends JFrame {
    Trans(){
        setLayout(null);
        setVisible(true);
        setSize(900,900);
        setLocation(300,0);
        setTitle("ATM Interface");
        getContentPane().setBackground(new Color(11,58,151));
    }
    public static void main(String[] args){
        new Trans();
    }
}






