import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SignUpTwo extends JFrame {

    SignUpTwo(){

        setLayout(null);/// VVImp otherwise the text will be at the center

        Random ran = new Random();
        long random = Math.abs((ran.nextLong()%9000L)+1000L);

        JLabel a = new JLabel("Additional Details");
        a.setForeground(Color.white);
        a.setFont(new Font("Roboto",Font.BOLD,28));
        a.setBounds(44,48,239,35);
        add(a);

        JLabel f = new JLabel("Application Form Number ");
        f.setForeground(Color.white);
        f.setFont(new Font("Roboto",Font.PLAIN,24));
        f.setBounds(44,120,320,33);
        add(f);

        JLabel f1 = new JLabel(String.valueOf(random));
        f1.setForeground(Color.white);
        f1.setFont(new Font("Roboto",Font.PLAIN,24));
        f1.setBounds(404,120,370,33);
        add(f1);

        JLabel r = new JLabel("Religion");
        r.setForeground(Color.white);
        r.setFont(new Font("Roboto",Font.PLAIN,24));
        r.setBounds(44,183,320,33);
        add(r);

        JLabel c = new JLabel("Category");
        c.setForeground(Color.white);
        c.setFont(new Font("Roboto",Font.PLAIN,24));
        c.setBounds(44,246,320,33);
        add(c);

        JLabel i = new JLabel("Income");
        i.setForeground(Color.white);
        i.setFont(new Font("Roboto",Font.PLAIN,24));
        i.setBounds(44,309,320,33);
        add(i);

        JLabel e = new JLabel("Educational Qualification");
        e.setForeground(Color.white);
        e.setFont(new Font("Roboto",Font.PLAIN,24));
        e.setBounds(44,372,320,33);
        add(e);

        JLabel o = new JLabel("Occupation");
        o.setForeground(Color.white);
        o.setFont(new Font("Roboto",Font.PLAIN,24));
        o.setBounds(44,435,320,33);
        add(o);

        JLabel p = new JLabel("PAN Number");
        p.setForeground(Color.white);
        p.setFont(new Font("Roboto",Font.PLAIN,24));
        p.setBounds(44,498,320,33);
        add(p);

        JLabel aa = new JLabel("Adhaar Number");
        aa.setForeground(Color.white);
        aa.setFont(new Font("Roboto",Font.PLAIN,24));
        aa.setBounds(44,561,320,33);
        add(aa);

        JLabel s = new JLabel("Senior Citizen");
        s.setForeground(Color.white);
        s.setFont(new Font("Roboto",Font.PLAIN,24));
        s.setBounds(44,624,320,33);
        add(s);

        JLabel ee = new JLabel("Existing Account");
        ee.setForeground(Color.white);
        ee.setFont(new Font("Roboto",Font.PLAIN,24));
        ee.setBounds(44,687,320,33);
        add(ee);


        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        getContentPane().setBackground(Color.darkGray);

    }

    public static void main(String[] args){
        new SignUpTwo();
    }
}
