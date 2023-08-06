import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Random;

public class SignUpTwo extends JFrame {
    JTextField rfield, cfield, ifield, efield, ofield, pfield, aafield;
    SignUpTwo(){
        setTitle("New User Registration - Page 2");
        setLayout(null);/// VVImp otherwise the text will be at the center

        JLabel a = new JLabel("Additional Details:");
        a.setForeground(Color.white);
        a.setFont(new Font("Roboto",Font.BOLD,28));
        a.setBounds(44,28,239,35);
        add(a);

        JLabel r = new JLabel("Religion");
        r.setForeground(Color.white);
        r.setFont(new Font("Roboto",Font.PLAIN,24));
        r.setBounds(44,100,320,33);
        add(r);

        rfield = new JTextField();
        rfield.setBounds(404,100,370,33);
        rfield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(rfield);

        JLabel c = new JLabel("Category");
        c.setForeground(Color.white);
        c.setFont(new Font("Roboto",Font.PLAIN,24));
        c.setBounds(44,163,320,33);
        add(c);

        cfield = new JTextField();
        cfield.setBounds(404,163,370,33);
        cfield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(cfield);

        JLabel i = new JLabel("Income");
        i.setForeground(Color.white);
        i.setFont(new Font("Roboto",Font.PLAIN,24));
        i.setBounds(44,226,320,33);
        add(i);

        ifield = new JTextField();
        ifield.setBounds(404,226,370,33);
        ifield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(ifield);

        JLabel e = new JLabel("Educational Qualification");
        e.setForeground(Color.white);
        e.setFont(new Font("Roboto",Font.PLAIN,24));
        e.setBounds(44,289,320,33);
        add(e);

        efield = new JTextField();
        efield.setBounds(404,289,370,33);
        efield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(efield);

        JLabel o = new JLabel("Occupation");
        o.setForeground(Color.white);
        o.setFont(new Font("Roboto",Font.PLAIN,24));
        o.setBounds(44,352,320,33);
        add(o);

        ofield = new JTextField();
        ofield.setBounds(404,352,370,33);
        ofield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(ofield);

        JLabel p = new JLabel("PAN Number");
        p.setForeground(Color.white);
        p.setFont(new Font("Roboto",Font.PLAIN,24));
        p.setBounds(44,415,320,33);
        add(p);

        pfield = new JTextField();
        pfield.setBounds(404,415,370,33);
        pfield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(pfield);

        JLabel aa = new JLabel("Adhaar Number");
        aa.setForeground(Color.white);
        aa.setFont(new Font("Roboto",Font.PLAIN,24));
        aa.setBounds(44,478,320,33);
        add(aa);

        aafield = new JTextField();
        aafield.setBounds(404,478,370,33);
        aafield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(aafield);

        JLabel s = new JLabel("Senior Citizen");
        s.setForeground(Color.white);
        s.setFont(new Font("Roboto",Font.PLAIN,24));
        s.setBounds(44,541,320,33);
        add(s);

        JRadioButton maried = new JRadioButton("Yes");
        maried.setFont(new Font("Roboto",Font.PLAIN,18));
        maried.setForeground(Color.white);
        maried.setBounds(404,541,100,20);
        maried.setBackground(Color.darkGray);
        add(maried);

        JRadioButton single = new JRadioButton("No");
        single.setBounds(574,541,150,20);
        single.setFont(new Font("Roboto",Font.PLAIN,18));
        single.setForeground(Color.white);
        single.setBackground(Color.darkGray);
        add(single);

        ButtonGroup maritalgroup = new ButtonGroup(); // This will remove the option of selecting both the options
        maritalgroup.add(maried);
        maritalgroup.add(single);

        JLabel ee = new JLabel("Existing Account");
        ee.setForeground(Color.white);
        ee.setFont(new Font("Roboto",Font.PLAIN,24));
        ee.setBounds(44,604,320,33);
        add(ee);

        JRadioButton male = new JRadioButton("Yes");
        male.setFont(new Font("Roboto",Font.PLAIN,18));
        male.setForeground(Color.white);
        male.setBounds(404,604,80,20);
        male.setBackground(Color.darkGray);
        add(male);

        JRadioButton female = new JRadioButton("No");
        female.setBounds(574,604,100,20);
        female.setFont(new Font("Roboto",Font.PLAIN,18));
        female.setForeground(Color.white);
        female.setBackground(Color.darkGray);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup(); // This will remove the option of selecting both the options
        gendergroup.add(male);
        gendergroup.add(female);

        JButton sub = new JButton("Submit");
        sub.setBounds(604,670,170,40);
        sub.setBackground(Color.DARK_GRAY);
        sub.setForeground(Color.white);
        sub.setFont(new Font("Roboto", Font.PLAIN,18));
        sub.setBorder((Border) new RoundBorder(40));
        add(sub);


        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        getContentPane().setBackground(Color.darkGray);

    }

    class RoundBorder implements Border {
        private int radius;
        public RoundBorder(int radius) {
            this.radius = radius;
        }
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }
        public boolean isBorderOpaque() {
            return true;
        }
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
    }

    public static void main(String[] args){
        new SignUpTwo();
    }
}
