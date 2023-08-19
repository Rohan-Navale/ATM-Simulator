import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MiniStatement extends JFrame implements ActionListener {
    String PIN;
    MiniStatement(String pin){
        setTitle("Mini Statement");
        setLayout(null);

        JLabel text = new JLabel();
        text.setBounds(20,140,400,200);
        add(text);

        JLabel bankname = new JLabel("Ease Bank");
        bankname.setBounds(150,20,100,20);
        add(bankname);

        JLabel card =  new JLabel();
        card.setBounds(20,80,300,20);
        add(card);

        JLabel balancetext = new JLabel();
        balancetext.setBounds(20,400,300,20);
        add(balancetext);

        try{
            Conn conn= new Conn();
            ResultSet rs = conn.s.executeQuery("SELECT * FROM login WHERE pinNo='"+pin+"'");
            while (rs.next()){
                card.setText("Card Number: "+rs.getString("cardNo").substring(0,4)+"XXXXXXXX"+rs.getString("cardNo").substring(12,16));
            }
        } catch (Exception e){
            System.out.println(e);
        }
        try{
            int balance = 0;
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("SELECT * FROM bank WHERE pin='"+pin+"'");
            while (rs.next()){
                text.setText(text.getText()+"<html>" +rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br><html>");
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            balancetext.setText("Your Balance is Rs."+balance);
        } catch (Exception e){
            System.out.println(e);
        }

        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }

    public static void main(String[] args){
        new MiniStatement("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
