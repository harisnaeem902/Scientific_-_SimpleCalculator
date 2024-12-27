
package calculatorapplication;

/**
 *
 * @author A.S.PRIDE
 */import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Simple extends JFrame implements ActionListener{
  private JTextField txtbox;
  private JButton [] butt= new JButton[10];
  private JButton equal = new JButton("=");
  private JButton Multiply = new JButton("x");
  private JButton divide = new JButton("/");
  private JButton plus = new JButton("+");
  private JButton Minus = new JButton("-");
  JButton Sceintific = new JButton("Sceintific Calculator");
  private int secval;
  private int firstval;
  private String Sign;
  private JButton Clear=new JButton("C");
    public void intitialize(){
        Font f = new Font("Arial",Font.BOLD,23);
        txtbox= new JTextField();
        txtbox.setBounds(10,20,550,60);
        txtbox.setHorizontalAlignment(SwingConstants.RIGHT);
        txtbox.setFont(f);
        txtbox.setEditable(false);
        this.add(txtbox);
        int j = 0;
        int k=0;
        for(int i = 0;i<butt.length;i++){
            butt[i]=new JButton();
            butt[i].setText(String.valueOf(i));
            if(i<=3)
            butt[i].setBounds(10+i*150,100,100,60);
            else if(i<=7){
            butt[i].setBounds(10+j*150,180,100,60);
            j++;}
            else if(i<=9){
               butt[i].setBounds(10+k*150,260,100,60);
            k++;  
            }
            butt[i].setFont(f);
            butt[i].addActionListener(this);
            this.add(butt[i]);
        }
        plus.setBounds(310,260,100,60);
        plus.setFont(f);
        plus.setBackground(Color.YELLOW);
        plus.setForeground(Color.BLACK);
        this.add(plus);
        Minus.setBounds(460,260,100,60);
        Minus.setFont(f);
        Minus.setBackground(Color.YELLOW);
        Minus.setForeground(Color.BLACK);
        this.add(Minus);
        Multiply.setBounds(10,340,100,60);
        Multiply.setFont(f);
        Multiply.setBackground(Color.YELLOW);
        Multiply.setForeground(Color.BLACK);
        this.add(Multiply);
        
        divide.setBounds(160,340,100,60);
        divide.setFont(f);
        divide.setBackground(Color.yellow);
        divide.setForeground(Color.BLACK);
        this.add(divide);
        equal.setBounds(310,340,100,60);
        equal.setFont(f);
        equal.setBackground(Color.red);
        equal.setForeground(Color.BLACK);
        this.add(equal);
        Sceintific.setBounds(140,420,300,60);
        Sceintific.setFont(f);
        Sceintific.addActionListener(this);
        this.add(Sceintific);
        Clear.setBounds(460,340,100,60);
        Clear.setFont(f);
        Clear.setBackground(Color.red);
        Clear.setForeground(Color.BLACK);
        this.add(Clear);
        Clear.addActionListener(this);
        plus.addActionListener( this);
        equal.addActionListener( this);
        Minus.addActionListener( this);
        Multiply.addActionListener( this);
        divide.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae){
   String a1 = ae.getActionCommand();
   if(a1.compareTo("+")==0){
   firstval=Integer.parseInt(txtbox.getText());
   Sign=ae.getActionCommand();
   txtbox.setText("");
   }
   else if(a1.compareTo("Sceintific Calculator")==0){
       this.setVisible(false);
       CalculatorApplication c = new CalculatorApplication();
    
    
   }
else if(a1.compareTo("x")==0){
   firstval=Integer.parseInt(txtbox.getText());
   Sign=ae.getActionCommand();
   txtbox.setText("");
}
else if(a1.compareTo("-")==0){
   firstval=Integer.parseInt(txtbox.getText());
   Sign=ae.getActionCommand();
   txtbox.setText("");  
   }
else if(a1.compareTo("/")==0){
   firstval=Integer.parseInt(txtbox.getText());
   Sign=ae.getActionCommand();
   txtbox.setText("");  
    }

else if(a1.compareTo("C")==0){
    firstval=0;
    secval=0;
    Sign=null;
    txtbox.setText("");
}
else if(a1.compareTo("=")==0){
    if(Sign.compareTo("x")==0){
    secval=firstval*Integer.parseInt(txtbox.getText());
    txtbox.setText(String.valueOf(secval));
    }
    else if(Sign.compareTo("+")==0){
    secval=firstval+Integer.parseInt(txtbox.getText());
    txtbox.setText(String.valueOf(secval));
    }
    else if(Sign.compareTo("/")==0){
    secval=firstval/Integer.parseInt(txtbox.getText());
    txtbox.setText(String.valueOf(secval));
    }
    else if(Sign.compareTo("-")==0){
    secval=firstval-Integer.parseInt(txtbox.getText());
    txtbox.setText(String.valueOf(secval));
    }
    
}
else{
    txtbox.setText(txtbox.getText()+a1);
}
}
}

