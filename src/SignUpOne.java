import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;


public class SignUpOne extends JFrame implements ActionListener{
JTextField ffield, rfield,cfield, ifield, ofield, pfield,aafield,stateTextfield;
JButton sub;
JDateChooser date;
JRadioButton male,female,maried,single;

    Random ran   = new Random();
    long random = Math.abs((ran.nextLong()%9000L)+1000L);
    SignUpOne(){

        setLayout(null);/// VVImp otherwise the text will be at the center

        JLabel a = new JLabel("Personal Details:");
        a.setForeground(Color.white);
        a.setFont(new Font("Roboto",Font.BOLD,28));
        a.setBounds(44,48,239,35);
        add(a);



        JLabel x = new JLabel("Your Application No. "+ random);
        x.setForeground(Color.white);
        x.setFont(new Font("Roboto",Font.PLAIN,20));
        x.setBounds(404,48,320,33);
        add(x);

        JLabel f = new JLabel("Name");
        f.setForeground(Color.white);
        f.setFont(new Font("Roboto",Font.PLAIN,24));
        f.setBounds(44,120,320,33);
        add(f);

        ffield = new JTextField();
        ffield.setBounds(404,120,370,33);
        ffield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(ffield);


        JLabel r = new JLabel("Father's Name");
        r.setForeground(Color.white);
        r.setFont(new Font("Roboto",Font.PLAIN,24));
        r.setBounds(44,183,320,33);
        add(r);

        rfield = new JTextField();
        rfield.setBounds(404,183,370,33);
        rfield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(rfield);

        JLabel c = new JLabel("Date of Birth");
        c.setForeground(Color.white);
        c.setFont(new Font("Roboto",Font.PLAIN,24));
        c.setBounds(44,246,320,33);
        add(c);

        date = new JDateChooser(); //Jcalender.jar file was not available. Downloaded and added. File-> Project Structure -> Library -> Add -> Apply
        date.setBounds(404,246,370,33);
        date.setForeground(Color.BLACK);
        date.setFont(new Font("Roboto",Font.PLAIN,22));
        add(date);

        JLabel g = new JLabel("Gender");
        g.setForeground(Color.white);
        g.setFont(new Font("Roboto",Font.PLAIN,24));
        g.setBounds(44,300,320,33);
        add(g);

        male = new JRadioButton("Male");
        male.setFont(new Font("Roboto",Font.PLAIN,18));
        male.setForeground(Color.white);
        male.setBounds(404,306,80,20);
        male.setBackground(Color.darkGray);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(574,306,100,20);
        female.setFont(new Font("Roboto",Font.PLAIN,18));
        female.setForeground(Color.white);
        female.setBackground(Color.darkGray);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup(); // This will remove the option of selecting both the options
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel i = new JLabel("Email Address");
        i.setForeground(Color.white);
        i.setFont(new Font("Roboto",Font.PLAIN,24));
        i.setBounds(44,352,320,33);
        add(i);

        ifield = new JTextField();
        ifield.setBounds(404,352,370,33);
        ifield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(ifield);

        JLabel e = new JLabel("Marital Occupation");
        e.setForeground(Color.white);
        e.setFont(new Font("Roboto",Font.PLAIN,24));
        e.setBounds(44,405,320,33);
        add(e);

        maried = new JRadioButton("Married");
        maried.setFont(new Font("Roboto",Font.PLAIN,18));
        maried.setForeground(Color.white);
        maried.setBounds(404,412,100,20);
        maried.setBackground(Color.darkGray);
        add(maried);

        single = new JRadioButton("Unmarried");
        single.setBounds(574,412,150,20);
        single.setFont(new Font("Roboto",Font.PLAIN,18));
        single.setForeground(Color.white);
        single.setBackground(Color.darkGray);
        add(single);

        ButtonGroup maritalgroup = new ButtonGroup(); // This will remove the option of selecting both the options
        maritalgroup.add(maried);
        maritalgroup.add(single);

        JLabel o = new JLabel("Address");
        o.setForeground(Color.white);
        o.setFont(new Font("Roboto",Font.PLAIN,24));
        o.setBounds(44,458,320,33);
        add(o);

        ofield = new JTextField();
        ofield.setBounds(404,458,370,33);
        ofield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(ofield);

        JLabel p = new JLabel("City");
        p.setForeground(Color.white);
        p.setFont(new Font("Roboto",Font.PLAIN,24));
        p.setBounds(44,521,320,33);
        add(p);

        pfield = new JTextField();
        pfield.setBounds(404,521,370,33);
        pfield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(pfield);

        JLabel aa = new JLabel("PIN Code");
        aa.setForeground(Color.white);
        aa.setFont(new Font("Roboto",Font.PLAIN,24));
        aa.setBounds(44,584,320,33);
        add(aa);

        aafield = new JTextField();
        aafield.setBounds(404,584,370,33);
        aafield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(aafield);

        JLabel statefield = new JLabel("State");
        statefield.setForeground(Color.white);
        statefield.setFont(new Font("Roboto",Font.PLAIN,24));
        statefield.setBounds(44,647,320,33);
        add(statefield);

        stateTextfield = new JTextField();
        stateTextfield.setBounds(404,647,370,33);
        stateTextfield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(stateTextfield);

        sub = new JButton("Next");
        sub.setBounds(604,710,170,40);
        sub.setBackground(Color.DARK_GRAY);
        sub.setForeground(Color.white);
        sub.addActionListener(this);
        sub.setBorder((Border) new SignUpOne.RoundBorder(40));
        sub.setFont(new Font("Roboto", Font.PLAIN,18));
        add(sub);

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        getContentPane().setBackground(Color.darkGray);

    }

    @Override
    public void actionPerformed(ActionEvent ac) {
        String formno = ""+random;
        String name = ffield.getText();
        String fname = rfield.getText();
        String dob = ((JTextField) date.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        } else if(female.isSelected()) {
            gender = "Female";
        }
        String email=ifield.getText();
        String marital = null;
        if(maried.isSelected()){
            marital="Married";
        } else if(single.isSelected()){
            marital="Unmarried";
        }
        String address = ofield.getText();
        String city = pfield.getText();
        String pin = aafield.getText();
        String state = stateTextfield.getText();

        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name cannot be empty");
            } else {
                Conn c = new Conn();
               String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"','"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pin+"', '"+state+"')";
                c.s.executeUpdate(query);
            }
        } catch (Exception e){
            System.out.println(e);
        }
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
        new SignUpOne();
    }
}
