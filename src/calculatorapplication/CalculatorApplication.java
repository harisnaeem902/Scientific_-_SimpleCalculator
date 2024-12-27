
package calculatorapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CalculatorApplication extends JFrame implements ActionListener
{
    double num1=0, num2=0,result=0;
    int calculator;
    
    JFrame frame = new JFrame("Calculator");
    JLabel Label = new JLabel();
    JTextField textfield = new JTextField ();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonSimple = new JButton("Simple Calculator");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDlete = new JButton("Del");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("X");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMin = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("\u221A");
    
    
    
    CalculatorApplication()
    {
        prepareGui();
        addComponents();
        addActionEvents();
    }
    int calculation;
    public void prepareGui()
    {
        frame.setSize(305,570);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public void addComponents()
    {
        
        Label.setBounds(250,0,50,50);
        Label.setForeground(Color.white);
        frame.add(Label);
      
        textfield.setBounds(10,40,270,40);
        textfield.setFont(new Font("Arial",Font.BOLD,20));
        textfield.setEditable(false);
        textfield.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textfield);
        
        onRadioButton.setBounds(10,95,60,40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        onRadioButton.setFocusable(false);
        frame.add(onRadioButton);
        
        offRadioButton.setBounds(10,120,60,40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        offRadioButton.setFocusable(false);
        frame.add(offRadioButton);
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);
        
        buttonSeven.setBounds(10,230,60,40);
        buttonSeven.setFont(new Font("Arial",Font.BOLD,20));
        buttonSeven.setFocusable(false);
        buttonSeven.addActionListener(this);
        frame.add(buttonSeven);
        
        buttonEight.setBounds(80,230,60,40);
        buttonEight.setFont(new Font("Arial",Font.BOLD,20));
        buttonEight.setFocusable(false);
        buttonEight.addActionListener(this);
        frame.add(buttonEight);
        
        buttonNine.setBounds(150,230,60,40);
        buttonNine.setFont(new Font("Arial",Font.BOLD,20));
        buttonNine.setFocusable(false);
        buttonNine.addActionListener(this);
        frame.add(buttonNine);
        
        buttonFour.setBounds(10,290,60,40);
        buttonFour.setFont(new Font("Arial",Font.BOLD,20));
        buttonFour.setFocusable(false);
        buttonFour.addActionListener(this);
        frame.add(buttonFour);
        
        buttonFive.setBounds(80,290,60,40);
        buttonFive.setFont(new Font("Arial",Font.BOLD,20));
        buttonFive.setFocusable(false);
        buttonFive.addActionListener(this);
        frame.add(buttonFive);
        
        buttonSix.setBounds(150,290,60,40);
        buttonSix.setFont(new Font("Arial",Font.BOLD,20));
        buttonSix.setFocusable(false);
        buttonSix.addActionListener(this);
        frame.add(buttonSix);
        
        buttonOne.setBounds(10,350,60,40);
        buttonOne.setFont(new Font("Arial",Font.BOLD,20));
        buttonOne.setFocusable(false);
        buttonOne.addActionListener(this);
        frame.add(buttonOne);
        
        buttonTwo.setBounds(80,350,60,40);
        buttonTwo.setFont(new Font("Arial",Font.BOLD,20));
        buttonTwo.setFocusable(false);
        buttonTwo.addActionListener(this);
        frame.add(buttonTwo);
        
        buttonThree.setBounds(150,350,60,40);
        buttonThree.setFont(new Font("Arial",Font.BOLD,20));
        buttonThree.setFocusable(false);
        buttonThree.addActionListener(this);
        frame.add(buttonThree);
        
        
        buttonDot.setBounds(150,410,60,40);
        buttonDot.setFont(new Font("Arial",Font.BOLD,20));
        buttonDot.setFocusable(false);
        buttonDot.addActionListener(this);
        frame.add(buttonDot);
        
        
        buttonZero.setBounds(10,410,130,40);
       
        buttonZero.setFont(new Font("Arial",Font.BOLD,20));
        buttonZero.setFocusable(false);
        buttonZero.addActionListener(this);
        frame.add(buttonZero);
        
        buttonSimple.setBounds(10,480,270,40);
        
        buttonSimple.setFont(new Font("Arial",Font.BOLD,20));
        buttonSimple.setFocusable(false);
        buttonSimple.addActionListener(this);
        frame.add(buttonSimple);
        buttonEqual.setBounds(220,350,60,100);
        buttonEqual.setFont(new Font("Arial",Font.BOLD,20));
        buttonEqual.setBackground(new Color(239,188,2));
        buttonEqual.addActionListener(this);
        frame.add(buttonEqual);
        
        buttonDiv.setBounds(220,110,60,40);
        buttonDiv.setFont(new Font("Arial",Font.BOLD,20));
        buttonDiv.setBackground(new Color(239,188,2));
        buttonDiv.setFocusable(false);
        buttonDiv.addActionListener(this);
        frame.add(buttonDiv);
        
        buttonSqrt.setBounds(10,170,60,40);
        buttonSqrt.setFont(new Font("Arial",Font.BOLD,18));
        buttonSqrt.setFocusable(false);
        buttonSqrt.addActionListener(this);
        frame.add(buttonSqrt);
        
        buttonMul.setBounds(220,230,60,40);
        buttonMul.setFont(new Font("Arial",Font.BOLD,20));
        buttonMul.setBackground(new Color(239,188,2));
        buttonMul.setFocusable(false);
        buttonMul.addActionListener(this);
        frame.add(buttonMul);
        
        buttonMin.setBounds(220,170,60,40);
        buttonMin.setFont(new Font("Arial",Font.BOLD,20));
        buttonMin.setBackground(new Color(239,188,2));
        buttonMin.setFocusable(false);
        buttonMin.addActionListener(this);
        frame.add(buttonMin);
        
        buttonPlus.setBounds(220,290,60,40);
        buttonPlus.setFont(new Font("Arial",Font.BOLD,20));
        buttonPlus.setBackground(new Color(239,188,2));
        buttonPlus.setFocusable(false);
        buttonPlus.addActionListener(this);
        frame.add(buttonPlus);
        
        buttonSquare.setBounds(80,170,60,40);
        buttonSquare.setFont(new Font("Arial",Font.BOLD,20));
        buttonSquare.setFocusable(false);
        buttonSquare.addActionListener(this);
        frame.add(buttonSquare);
        
        buttonReciprocal.setBounds(150,170,60,40);
        buttonReciprocal.setFont(new Font("Arial",Font.BOLD,15));
        buttonReciprocal.setFocusable(false);
        buttonReciprocal.addActionListener(this);
        frame.add(buttonReciprocal);
        
        buttonDlete.setBounds(150,110,60,40);
        buttonDlete.setFont(new Font("Arial",Font.BOLD,15));
        buttonDlete.setBackground(Color.red);
        buttonDlete.setForeground(Color.white);
        buttonDlete.setFocusable(false);
        buttonDlete.addActionListener(this);
        frame.add(buttonDlete);
        
        buttonClear.setBounds(80,110,60,40);
        buttonClear.setFont(new Font("Arial",Font.BOLD,15));
        buttonClear.setBackground(Color.red);
        buttonClear.setForeground(Color.white);
        buttonClear.setFocusable(false);
        buttonClear.addActionListener(this);
        frame.add(buttonClear);
    
    }
    public void addActionEvent()
    {
        onRadioButton.addActionListener((ActionListener) this);
        offRadioButton.addActionListener((ActionListener) this);
        buttonClear.addActionListener((ActionListener) this);
        buttonDlete.addActionListener((ActionListener) this);
        buttonSqrt.addActionListener((ActionListener) this);
        buttonSquare.addActionListener((ActionListener) this);
        buttonReciprocal.addActionListener((ActionListener) this);
        buttonMin.addActionListener((ActionListener) this);
        buttonSeven.addActionListener((ActionListener) this);
        buttonEight.addActionListener((ActionListener) this);
        buttonNine.addActionListener((ActionListener) this);
        buttonMul.addActionListener((ActionListener) this);
        buttonFour.addActionListener((ActionListener) this);
        buttonFive.addActionListener((ActionListener) this);
        buttonSix.addActionListener((ActionListener) this);
        buttonPlus.addActionListener((ActionListener) this);
        buttonOne.addActionListener((ActionListener) this);
        buttonTwo.addActionListener((ActionListener) this);
        buttonThree.addActionListener((ActionListener) this);
        buttonEqual.addActionListener((ActionListener) this);
        buttonZero.addActionListener((ActionListener) this);
        buttonDot.addActionListener((ActionListener) this);
        
        
    }

   
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        
        String a1=e.getActionCommand();
        if(source==onRadioButton){
            
          enable();
        }
        else if(source==offRadioButton)
        {
        disable();
    } 
        else if(source==buttonClear)
        {
        Label.setText("");
        textfield.setText("");
    }
        else if(source==buttonDlete)
        {
           int length = textfield.getText().length();
           int number = length-1;
           if(length>0)
           {
               StringBuilder back = new StringBuilder(textfield.getText());
               back.deleteCharAt(number);
               textfield.setText(back.toString());
           }
           if(textfield.getText().endsWith(""));
           Label.setText("");
           
        }
        else if (source==buttonZero)
        {
            if(textfield.getText().equals("0"))
            {
                return;
            }
            else
            {
                textfield.setText(textfield.getText() +"0");       
            }
    }
        else if(source==buttonOne)
        {
            textfield.setText(textfield.getText() +"1");
            
        }
        else if(source==buttonTwo)
        {
            textfield.setText(textfield.getText() +"2");
        }
        else if(source==buttonThree)
        {
            textfield.setText(textfield.getText() +"3");
        }
        else if(source==buttonFour)
        {
            textfield.setText(textfield.getText() +"4");
        }
        else if(source==buttonFive)
        {
           textfield.setText(textfield.getText() +"5"); 
        }
        else if(source==buttonSix)
        {
           textfield.setText(textfield.getText() +"6"); 
        }
        else if(source==buttonSimple){
            frame.setVisible(false);
            Simple s = new Simple();
            
            s.setTitle("Simple Calculator");
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s.setLayout(null);
        s.setSize(590,530);
        s.getContentPane().setBackground(Color.BLACK);
        s.intitialize();
        s.setLocationRelativeTo(null);
        s.setVisible(true);
        }
        else if(source==buttonSeven)
        {
           textfield.setText(textfield.getText() +"7"); 
        }
        else if(source==buttonEight)
        {
            textfield.setText(textfield.getText() +"8");
        }
        else if(source==buttonNine)
        {
            textfield.setText(textfield.getText() +"9");
        }
        else if(source==buttonDot)
        {
            if(textfield.getText().contains("."))
            {
                return;
            }
            else
            {
                textfield.setText(textfield.getText() + ".");
                
            }
            
        }
        else if(source==buttonPlus)
        {
            String str = textfield.getText();
            num1 = Double.parseDouble(textfield.getText());
            calculation = 1;
            textfield.setText("");
            Label.setText(str +"+");
            
        }
        else if(source==buttonMin)
        {
            String str = textfield.getText();
            num1 = Double.parseDouble(textfield.getText());
             calculation = 2;
            textfield.setText("");
            Label.setText(str +"-");
        }
        else if(source==buttonMul)
        {
            String str = textfield.getText();
            num1 = Double.parseDouble(textfield.getText());
             calculation = 3;
            textfield.setText("");
            Label.setText(str +"X");
        }
        else if(source==buttonDiv)
        {
            String str = textfield.getText();
            num1 = Double.parseDouble(textfield.getText());
             calculation = 4;
            textfield.setText("");
            Label.setText(str +"/");
        }
        else if(source==buttonSquare)
        {
            num1 = Double.parseDouble(textfield.getText());
            double square = Math.pow(num1, 2);
            String string = Double.toString(square);
            if(string.endsWith(".0"))
            {
                textfield.setText(string.replace(".0", ""));
            }
            else
            {
                textfield.setText(string);
            }
        }
        else if(source==buttonSqrt)
        {
            num1 = Double.parseDouble(textfield.getText());
            double sqrt = Math.sqrt(num1);
            textfield.setText(Double.toString(sqrt));
            
        }
        else if(source==buttonSqrt)
        {
            num1 = Double.parseDouble(textfield.getText());
            double reciprocal = 1/num1;
            String string = Double.toString(reciprocal);
            if(string.endsWith(".0"))
            {
                textfield.setText(string.replace(".0", ""));
            }
            else
            {
                textfield.setText(string);
            }
                 
        }
        else if(source==buttonEqual)
        {
            
            num2= Double.parseDouble(textfield.getText());
           
            switch(calculation)
            {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1*num2;
                    break;
                case 4:
                    result = num1/num2;
                    
                    break;
                
                    
                
            }
            
            if(Double.toString(result).endsWith(".0"))
            {
                textfield.setText(Double.toString(result).replace(",0", ""));
            }
            else
            {
                textfield.setText(Double.toString(result));
            }
            Label.setText("");
            num1 = result; 
        }
    
    }
    
    public void enable()
    {
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textfield.setEnabled(true);
        Label.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDlete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonMin.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);
          
    }
    
    public void disable()
    {
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        textfield.setEnabled(false);
        Label.setEnabled(false);
        Label.setText("");
        textfield.setText("");
        buttonClear.setEnabled(false);
        buttonDlete.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonReciprocal.setEnabled(false);
        buttonMin.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonDot.setEnabled(false);
        
    }

    private void addActionEvents() 
    {
        
    }

    
    
}
