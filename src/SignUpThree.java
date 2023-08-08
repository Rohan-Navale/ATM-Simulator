import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.Border;

public class SignUpThree extends JFrame implements ActionListener {
String formNo;
JCheckBox card,ib,mb,ea,ch,es,declare;
JRadioButton sa,ca,fda,rda;
JButton back, submit;

Random random=new Random();
Long cardnumber = Math.abs (random.nextLong() % 90000000L) + 5040936000000000L;
Long PIN =  Math.abs (random.nextLong() % 9000L) + 1000L;

    SignUpThree(String formno){
        formNo=formno;
        setTitle("New User Registration - Page 3");
        setSize(850,820);
        setLocation(350,10);
        setVisible(true);
        getContentPane().setBackground(Color.darkGray);
        setLayout(null);

        JLabel accountDetails = new JLabel("Account Details:");
        accountDetails.setBounds(44,48,300,35);
        accountDetails.setForeground(Color.white);
        accountDetails.setFont(new Font("Roboto",Font.BOLD,28));
        add(accountDetails);

        JLabel x = new JLabel("Your Application No. "+ formNo);
        x.setForeground(Color.white);
        x.setFont(new Font("Roboto",Font.PLAIN,20));
        x.setBounds(404,50,320,33);
        add(x);

        JLabel accType = new JLabel("Select Your Account Type");
        accType.setBounds(44,133,370,33);
        accType.setForeground(Color.WHITE);
        accType.setFont(new Font("Roboto",Font.PLAIN,24));
        add(accType);

        sa = new JRadioButton("Savings Account");
        sa.setFont(new Font("Roboto",Font.PLAIN,20));
        sa.setForeground(Color.WHITE);
        sa.setBackground(Color.DARK_GRAY);
        sa.setBounds(44,180,200,50);
        add(sa);

        ca = new JRadioButton("Current Account");
        ca.setFont(new Font("Roboto",Font.PLAIN,20));
        ca.setForeground(Color.WHITE);
        ca.setBackground(Color.DARK_GRAY);
        ca.setBounds(244,180,200,50);
        add(ca);

        fda = new JRadioButton("FD Account");
        fda.setFont(new Font("Roboto",Font.PLAIN,20));
        fda.setForeground(Color.WHITE);
        fda.setBackground(Color.DARK_GRAY);
        fda.setBounds(444,180,150,50);
        add(fda);

        rda = new JRadioButton("RD Account");
        rda.setFont(new Font("Roboto",Font.PLAIN,20));
        rda.setForeground(Color.WHITE);
        rda.setBackground(Color.DARK_GRAY);
        rda.setBounds(600,180,200,50);
        add(rda);

        ButtonGroup grouptype = new ButtonGroup();
        grouptype.add(sa);
        grouptype.add(ca);
        grouptype.add(fda);
        grouptype.add(rda);


        JLabel cardNo = new JLabel("Card Number:");
        cardNo.setFont(new Font("Roboto",Font.PLAIN,24));
        cardNo.setBounds(44,266,200,33);
        cardNo.setForeground(Color.WHITE);
        add(cardNo);

        JLabel yourDigits = new JLabel("Your 16 Digit ATM Card No.");
        yourDigits.setFont(new Font("Roboto",Font.PLAIN,14));
        yourDigits.setBounds(44,290,220,33);
        yourDigits.setForeground(Color.WHITE);
        add(yourDigits);

        JLabel actualcardNo = new JLabel(""+cardnumber);
        actualcardNo.setFont(new Font("Roboto",Font.PLAIN,22));
        actualcardNo.setBounds(304,266,500,33);
        actualcardNo.setForeground(Color.WHITE);
        add(actualcardNo);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Roboto",Font.PLAIN,24));
        pin.setBounds(44,340,500,33);
        pin.setForeground(Color.WHITE);
        add(pin);

        JLabel pinNo = new JLabel(""+PIN);
        pinNo.setFont(new Font("Roboto",Font.PLAIN,22));
        pinNo.setBounds(304,340,100,33);
        pinNo.setForeground(Color.WHITE);
        add(pinNo);

        JLabel note = new JLabel("Note down the Card Number and PIN for future use");
        note.setFont(new Font("Roboto",Font.PLAIN,14));
        note.setBounds(44,390,400,33);
        note.setForeground(Color.yellow);
        add(note);

        JLabel req = new JLabel("Services Requested:");
        req.setFont(new Font("Roboto",Font.PLAIN,24));
        req.setBounds(44,442,300,33);
        req.setForeground(Color.WHITE);
        add(req);

        card = new JCheckBox("ATM Card");
        card.setFont(new Font("Roboto",Font.PLAIN,20));
        card.setForeground(Color.WHITE);
        card.setBackground(Color.DARK_GRAY);
        card.setBounds(86,490,150,50);
        add(card);

        ib = new JCheckBox("Internet Banking");
        ib.setFont(new Font("Roboto",Font.PLAIN,20));
        ib.setForeground(Color.WHITE);
        ib.setBackground(Color.DARK_GRAY);
        ib.setBounds(269,490,180,50);
        add(ib);

        mb = new JCheckBox("Mobile Banking");
        mb.setFont(new Font("Roboto",Font.PLAIN,20));
        mb.setForeground(Color.WHITE);
        mb.setBackground(Color.DARK_GRAY);
        mb.setBounds(530,490,180,50);
        add(mb);

        ea = new JCheckBox("Email Alerts");
        ea.setFont(new Font("Roboto",Font.PLAIN,20));
        ea.setForeground(Color.WHITE);
        ea.setBackground(Color.DARK_GRAY);
        ea.setBounds(86,548,150,50);
        add(ea);

        ch = new JCheckBox("Cheque Book");
        ch.setFont(new Font("Roboto",Font.PLAIN,20));
        ch.setForeground(Color.WHITE);
        ch.setBackground(Color.DARK_GRAY);
        ch.setBounds(269,548,150,50);
        add(ch);

        es = new JCheckBox("E-statement");
        es.setFont(new Font("Roboto",Font.PLAIN,20));
        es.setForeground(Color.WHITE);
        es.setBackground(Color.DARK_GRAY);
        es.setBounds(530,548,180,50);
        add(es);

        declare = new JCheckBox("I here by confirm that above entered details are correct as per my knowledge");
        declare.setFont(new Font("Roboto",Font.PLAIN,14));
        declare.setForeground(Color.WHITE);
        declare.setBackground(Color.DARK_GRAY);
        declare.setBounds(44,620,550,50);
        add(declare);

        submit = new JButton("Submit");
        submit.setFont(new Font("Roboto",Font.PLAIN,18));
        submit.setForeground(Color.WHITE);
        submit.setBackground(Color.DARK_GRAY);;
        submit.addActionListener(this);
        submit.setBounds(600,720,170,40);
        submit.setBorder((Border) new SignUpThree.RoundBorder(40));
        add(submit);

        back = new JButton("Clear");
        back.setFont(new Font("Roboto",Font.PLAIN,18));
        back.setForeground(Color.WHITE);
        back.setBackground(Color.DARK_GRAY);;
        back.addActionListener(this);
        back.setBounds(400,720,170,40);
        back.setBorder((Border) new SignUpThree.RoundBorder(40));
        add(back);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==submit){
            String accountType = null;
            if(sa.isSelected())
                accountType="Savings Account";
            else if(ca.isSelected())
                accountType="Current Account";
            else if(fda.isSelected())
                accountType="Fixed Deposit Account";
            else if(rda.isSelected())
                accountType="Reccuring Deposit Account";

            String cardNo = ""+ cardnumber;
            String pinNo  = ""+ PIN;

            String facility = "";
            if(card.isSelected())
                facility=facility+"ATM Card";
            if(ib.isSelected())
                facility=facility+"Internet Banking";
            if(mb.isSelected())
                facility=facility+"Mobile Banking";
            if(ea.isSelected())
                facility=facility+"Email Alerts";
            if(ch.isSelected())
                facility=facility+"Cheque Book";
            if(es.isSelected())
                facility=facility+"E-statement";

            try {
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null,"Please select account type");
                } else {
                    String query1 = "insert into signupthree values ('"+formNo+"','"+accountType+"','"+cardNo+"','"+pinNo+"','"+facility+"')";

                }
            } catch (Exception e){
                System.out.println(e);
            }

        } else if(ae.getSource()==back){

        }
    }

    class RoundBorder implements Border {
        private int radius;

        public RoundBorder(int radius) {
            this.radius = radius;
        }

        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
        }

        public boolean isBorderOpaque() {
            return true;
        }

        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }
    }
    public static void main(String[] args){
       new SignUpThree("");
    }
}
