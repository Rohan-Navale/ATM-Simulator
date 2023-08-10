import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpTwo extends JFrame implements ActionListener {
    long random;
    JComboBox rfield, cfield, ifield, efield, ofield;
    JTextField pfield, aafield;
    JButton sub, back;
    JRadioButton male,female,maried,single;
    String formNo;
    SignUpTwo(String formno){

        formNo=formno; // assigning  global string to  passes parameter
        System.out.println(formNo);
        setTitle("New User Registration - Page 2");
        setLayout(null);/// VVImp otherwise the text will be at the center

        JLabel a = new JLabel("Additional Details:");
        a.setForeground(Color.white);
        a.setFont(new Font("Roboto",Font.BOLD,28));
        a.setBounds(44,28,239,35);
        add(a);

        JLabel x = new JLabel("Your Application No. "+ formNo);
        x.setForeground(Color.white);
        x.setFont(new Font("Roboto",Font.PLAIN,20));
        x.setBounds(404,48,320,33);
        add(x);

        JLabel r = new JLabel("Religion");
        r.setForeground(Color.white);
        r.setFont(new Font("Roboto",Font.PLAIN,24));
        r.setBounds(44,100,320,33);
        add(r);

        String valReligion[]= {"Hindu","Muslim","Sikh","Chrisian","Other"};
        rfield = new JComboBox(valReligion);
        rfield.setBounds(404,100,370,33);
        rfield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(rfield);

        JLabel c = new JLabel("Category");
        c.setForeground(Color.white);
        c.setFont(new Font("Roboto",Font.PLAIN,24));
        c.setBounds(44,163,320,33);
        add(c);

        String valCategory[]= {"General","OBC","SC","ST","Other"};
        cfield = new JComboBox(valCategory);
        cfield.setBounds(404,163,370,33);
        cfield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(cfield);

        JLabel i = new JLabel("Income");
        i.setForeground(Color.white);
        i.setFont(new Font("Roboto",Font.PLAIN,24));
        i.setBounds(44,226,320,33);
        add(i);

        String valIncome[]= {"Null","<150000","<250000","<500000","Upto 1000000"};
        ifield = new JComboBox(valIncome);
        ifield.setBounds(404,226,370,33);
        ifield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(ifield);

        JLabel e = new JLabel("Educational Qualification");
        e.setForeground(Color.white);
        e.setFont(new Font("Roboto",Font.PLAIN,24));
        e.setBounds(44,289,320,33);
        add(e);

        String valEducation[]= {"Non Graduation","Graduate","Post Graduate","Doctorate","Other"};
        efield = new JComboBox(valEducation);
        efield.setBounds(404,289,370,33);
        efield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(efield);

        JLabel o = new JLabel("Occupation");
        o.setForeground(Color.white);
        o.setFont(new Font("Roboto",Font.PLAIN,24));
        o.setBounds(44,352,320,33);
        add(o);

        String valOccupation[]= {"Salaried","Self Employed","Business","Student","Other"};
        ofield = new JComboBox(valOccupation);
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

        maried = new JRadioButton("Yes");
        maried.setFont(new Font("Roboto",Font.PLAIN,18));
        maried.setForeground(Color.white);
        maried.setBounds(404,541,100,20);
        maried.setBackground(Color.darkGray);
        add(maried);

        single = new JRadioButton("No");
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

        male = new JRadioButton("Yes");
        male.setFont(new Font("Roboto",Font.PLAIN,18));
        male.setForeground(Color.white);
        male.setBounds(404,604,80,20);
        male.setBackground(Color.darkGray);
        add(male);

        female = new JRadioButton("No");
        female.setBounds(574,604,100,20);
        female.setFont(new Font("Roboto",Font.PLAIN,18));
        female.setForeground(Color.white);
        female.setBackground(Color.darkGray);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup(); // This will remove the option of selecting both the options
        gendergroup.add(male);
        gendergroup.add(female);

        sub = new JButton("Next");
        sub.setBounds(604,680,170,40);
        sub.setBackground(new Color(92,70,156));
        sub.setForeground(Color.white);
        sub.addActionListener(this);
        sub.setFont(new Font("Raleway", Font.BOLD,20));
        add(sub);

        back = new JButton("Back");
        back.setBounds(44,680,170,40);
        back.setBackground(new Color(29,38,125));
        back.setForeground(Color.white);
        back.addActionListener(this);
        back.setFont(new Font("Raleway", Font.BOLD,20));
        back.setBorderPainted(false);
        add(back);


        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        getContentPane().setBackground(new Color(46,51,90));

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==back){
            setVisible(false);
            new SignUpOne().setVisible(true);
        }

        if(ae.getSource()==sub) {
            String religion = (String) rfield.getSelectedItem();
            String cat = (String) cfield.getSelectedItem();
            String inc = (String) ifield.getSelectedItem();
            String ed = (String) efield.getSelectedItem();
            String occ = (String) ofield.getSelectedItem();
            String pn = pfield.getText();
            String ad = aafield.getText();

            String senior = null;
            if (male.isSelected()) {
                senior = "Yes";
            } else if (female.isSelected()) {
                senior = "No";
            }
            String exacc = null;
            if (male.isSelected()) {
                exacc = "Yes";
            } else if (single.isSelected()) {
                exacc = "No";
            }

            try {
                Conn c = new Conn();
                String query = "insert into signuptwo values('" + formNo + "', '" + religion + "', '" + cat + "', '" + inc + "', '" + ed + "','" + occ + "', '" + pn + "', '" + ad + "', '" + senior + "', '" + exacc + "')";
                c.s.executeUpdate(query);
                setVisible(false);
                new SignUpThree(formNo).setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args){
        new SignUpTwo("");
    }
}
