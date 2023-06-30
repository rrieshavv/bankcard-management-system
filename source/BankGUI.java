/**
 * BankGUI implements ActionListner.
 * BankCard contains multiple attributes, a constructor and 2 methods.
 * Methods type of this class comprises of overridden methods and main method.
 *
 * @author Rishav Karna
 * @version April 25, 2023
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class BankGUI implements ActionListener
{
    //jframe variables declared
    private JFrame gui;
    //jpanel variables declared
    private JPanel portal,dPortal,dMainView,dAddView,cPortal,creditMainView,creditAddView,creditLimitView;
    //jlabel variables declared 
    private JLabel bjl1,bjl2,bjl3,bjl4,bjl5,djl1,djl2,djl3,djl4,djl5,djl6,djl7,djl8,djl9,dans1,dans2,dans3,dans4,dans5,dst1,dst_ans1,cst1,cst_ans1,cjl1,cjl2,cjl3,cjl4,cjl5,cjl6,cjl7,cjl8,cjl9,cjl10,cjl61,cjl81,cjl71,cjl91,cjl62,cjl82,cans1,cans2,cans3,cans4,cans5,cans6,cans7,cans8,cans9,cans61,cans71;
    //jtextfield variables declared
    private JTextField bjt1,bjt2,bjt3,bjt4,bjt5,djt1,djt2,djt3,cjt1,cjt2,cjt3,cjt4;
    //jbutton variables declared
    private JButton bjb1,bjb2,bjb3,djb1,djb2,djb3,djb4,djb5,djb6,cjb1,cjb2,cjb3,cjb4,cjb5,cjb12,cjb32;
    //jcombobox varibales declared
    private JComboBox<String> jyear2,jday2,jmonth2,jyear,jday,jmonth;
    
    //arrays for jcombobox declared
    private String year[]={"2023","2024","2025","2026","2027","2028","2029","2030"};
    private String day[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    private String month[]={"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sept","oct","Nov","Dec"};
    
    //a new color object to add dark green color to jlabel
    private Color darkGreen = new Color(26, 153, 60);
    
    //arraylist of BankCard type
    private ArrayList<BankCard> arrayGui = new ArrayList<BankCard>();
    public BankGUI()
    {
        //frame and jpanel objects initialised
        gui = new JFrame("Portal");
        portal = new JPanel();
        dPortal = new JPanel();
        dMainView = new JPanel();
        dAddView = new JPanel();
        cPortal = new JPanel();
        creditMainView = new JPanel();
        creditLimitView = new JPanel();
        creditAddView = new JPanel();
        
        //background color to the panels
        creditMainView.setBackground(new Color(255, 244, 214));
        creditAddView.setBackground(new Color(255, 244, 214));
        creditLimitView.setBackground(new Color(255, 244, 214));
        cPortal.setBackground(new Color(254,228,153,255));
        portal.setBackground(new Color(254,228,153,255));
        dPortal.setBackground(new Color(254,228,153,255));
        dMainView.setBackground(new Color(255, 244, 214));
        dAddView.setBackground(new Color(255, 244, 214));
        
        //BANK PORTAL 
        //jlabel font size set 
        JLabel bTitle = new JLabel("BANK PORTAL");
        bTitle.setFont(new Font("Serif",Font.PLAIN,36));

        //jlabel objects initialised
        bjl1 = new JLabel("Card ID");
        bjl2 = new JLabel("Client Name");
        bjl3 = new JLabel("Balance Amount");
        bjl4 = new JLabel("Bank Account");
        bjl5 = new JLabel("Issuer Bank");

        //setting font size and type for jlabels
        bjl1.setFont(new Font("Serif",Font.PLAIN,14));
        bjl2.setFont(new Font("Serif",Font.PLAIN,14));
        bjl3.setFont(new Font("Serif",Font.PLAIN,14));
        bjl4.setFont(new Font("Serif",Font.PLAIN,14));
        bjl5.setFont(new Font("Serif",Font.PLAIN,14));

        bjt1 = new JTextField();//card id 
        bjt2 = new JTextField();//clientName
        bjt3 = new JTextField();//balance amount
        bjt4 = new JTextField();//bank acc
        bjt5 = new JTextField();//issuerbank

        //jbutton objects initialised
        bjb1 = new JButton("Debit Card");
        bjb2 = new JButton("Credit Card");
        bjb3 = new JButton("Clear");

        //to perform event handling on button click
        bjb1.addActionListener(this);
        bjb2.addActionListener(this);
        bjb3.addActionListener(this);

        //setting bounds for declared jlabels, jtextfields and jbutton
        bTitle.setBounds(259,52,282,50);
        bjl1.setBounds(88,161,48,20);
        bjl2.setBounds(432,163,77,20);
        bjl3.setBounds(34,215,102,20);
        bjl4.setBounds(47,267,86,20);
        bjl5.setBounds(432,268,74,20);
        bjt1.setBounds(165,157,201,28);
        bjt2.setBounds(538,157,201,28);
        bjt3.setBounds(165,210,201,28);
        bjt4.setBounds(165,260,201,28);
        bjt5.setBounds(538,260,201,28);
        bjb1.setBounds(166,389,179,32);
        bjb2.setBounds(468,389,179,32);
        bjb3.setBounds(619,316,120,32);

        // adding to the panel
        portal.add(bTitle);
        portal.add(bjl1);
        portal.add(bjl2);
        portal.add(bjl3);
        portal.add(bjl4);
        portal.add(bjl5);
        portal.add(bjt1);
        portal.add(bjt2);
        portal.add(bjt3);
        portal.add(bjt4);
        portal.add(bjt5);
        portal.add(bjb1);
        portal.add(bjb2);
        portal.add(bjb3);

        //DEBIT PORTAL
        //jlabel font size set 
        JLabel dTitle = new JLabel("DEBIT CARD");
        dTitle.setFont(new Font("Serif",Font.PLAIN,36));

        //jlabel objects initialised
        djl1 = new JLabel("Card ID :");
        djl2 = new JLabel("Balance Amount :");
        djl3 = new JLabel("Client Name :");
        djl4 = new JLabel("Bank Account :");
        djl5 = new JLabel("Issuer Bank :");
        djl6 = new JLabel("Withdrawal Amount");
        djl7 = new JLabel("PIN Number");
        djl8 = new JLabel("PIN Number"); //for withdrawl view
        djl9 = new JLabel("Date Of Withdrawl");
        dst1 = new JLabel("Status :");
        cst1 = new JLabel("Status :");
        
        //empty jlabels to set text later
        dans1 = new JLabel();
        dans2 = new JLabel();
        dans3 = new JLabel();
        dans4 = new JLabel();
        dans5 = new JLabel();
        
        dst_ans1 = new JLabel("NOT ACTIVE");
        cst_ans1 = new JLabel("NOT ACTIVE");
        //color to font of jlabel
        dst_ans1.setForeground(Color.RED);
        cst_ans1.setForeground(Color.RED);

        //jtextfields initialised
        djt1 = new JTextField();//withdrawal amount
        djt2 = new JTextField();//pin number
        djt3 = new JTextField();//for withdrawl view pin no.

        //jbuttons initialised
        djb1 = new JButton("Back");
        djb2 = new JButton("Withdraw");
        djb3 = new JButton("Clear");
        djb4 = new JButton("Display");
        djb5 = new JButton("Add Debit Card");
        djb6 = new JButton("Clear");//withdraw clear
        
        //to perform event handling on button click
        djb1.addActionListener(this);
        djb2.addActionListener(this);
        djb3.addActionListener(this);
        djb4.addActionListener(this);
        djb5.addActionListener(this);
        djb6.addActionListener(this);

        
        //combobox initialised with arrau
        jyear2=new JComboBox<String>(year);
        jmonth2=new JComboBox<String>(month);
        jday2= new JComboBox<String>(day);
        
        //setting bounds for declared jlabels, jtextfields and jbutton
        dTitle.setBounds(291,52,217,50);
        djl1.setBounds(88,161,56,20);
        djl2.setBounds(34,215,110,20);
        djl3.setBounds(59,269,85,17);
        djl4.setBounds(50,323,93,20);
        djl5.setBounds(62,377,82,20);
        djl6.setBounds(31,14,128,20);
        djl7.setBounds(77,81,77,20);
        djl8.setBounds(72,59,77,20);
        djl9.setBounds(35,104,114,20);
        djt1.setBounds(179,8,165,26);
        djt2.setBounds(184,75,165,26);
        djt3.setBounds(179,53,165,26);
        djb1.setBounds(34,443,83,32);
        djb2.setBounds(55,148,167,32);
        djb5.setBounds(60,135,167,32);
        djb3.setBounds(250,135,99,32);
        djb4.setBounds(132,443,107,32);
        djb6.setBounds(245,148,99,32);
        dans1.setBounds(154,161,140,20);
        dans2.setBounds(154,215,140,20);
        dans3.setBounds(154,269,140,20);
        dans4.setBounds(154,323,140,20);
        dans5.setBounds(154,377,140,20);
        dst1.setBounds(100,107,54,20);
        dst_ans1.setBounds(154,107,93,20);
        cst1.setBounds(100,107,54,20);
        cst_ans1.setBounds(154,107,93,20);
        jday2.setBounds(179,98,43,32);
        jmonth2.setBounds(228,98,50,32);
        jyear2.setBounds(286,98,57,32);
        
        //setting bounnds for panels
        dMainView.setBounds(413,161,366,236);
        dAddView.setBounds(413,175,366,236);

        //adding to panel
        dMainView.add(djt2);
        dMainView.add(djb3);
        dMainView.add(djl7);
        dMainView.add(djb5);
        dAddView.add(djl6);
        dAddView.add(djt1);
        dAddView.add(djl8);
        dAddView.add(djt3);
        dAddView.add(djl9);
        dAddView.add(jday2);
        dAddView.add(jmonth2);
        dAddView.add(jyear2);
        dAddView.add(djb2);
        dAddView.add(djb6);
        dPortal.add(dst1);
        dPortal.add(dst_ans1);
        dPortal.add(dTitle);
        dPortal.add(djl1);
        dPortal.add(djl2);
        dPortal.add(djl3);
        dPortal.add(djl4);
        dPortal.add(djl5);
        dPortal.add(djb1);
        dPortal.add(djb4);
        dPortal.add(dans1);
        dPortal.add(dans2);
        dPortal.add(dans3);
        dPortal.add(dans4);
        dPortal.add(dans5);
        dPortal.add(dMainView);
        dPortal.add(dAddView);
        
        
        //properties for the panel
        dMainView.setVisible(true);
        dMainView.setLayout(null);
        dMainView.setSize(385,196);
        
        dAddView.setVisible(false);
        dAddView.setLayout(null);
        dAddView.setSize(385,196);
        
        //Credit portal
        JLabel cTitle = new JLabel("CREDIT CARD");
        cTitle.setFont(new Font("Serif",Font.PLAIN,36));
        
        //jlabels initialsed
        cjl1 = new JLabel("Card ID :");
        cjl2 = new JLabel("Balance Amount :");
        cjl3 = new JLabel("Client Name :");
        cjl4 = new JLabel("Bank Account :");
        cjl5 = new JLabel("Issuer Bank :");
        cjl6 = new JLabel("CVC :");
        cjl61 = new JLabel("CVC :");//for add view
        cjl62 = new JLabel("CVC :");//for limit view
        cjl7 = new JLabel("Credit limit :");
        cjl71 = new JLabel("Credit limit :");//for add view
        cjl8 = new JLabel("Interest % :");
        cjl81 = new JLabel("Interest % :");//for add view
        cjl82 = new JLabel("Interest % :");//for limit view
        cjl9 = new JLabel("Grace period :");
        cjl91 = new JLabel("Grace period :");//for add view
        cjl10=new JLabel("Expiry date");
        
        //jlabels to set text latter
        cans1 = new JLabel();
        cans2 = new JLabel();
        cans3 = new JLabel();
        cans4 = new JLabel();
        cans5 = new JLabel();
        cans6 = new JLabel();
        cans61= new JLabel();
        cans71 = new JLabel();
        cans7 = new JLabel();
        cans8 = new JLabel();
        cans9 = new JLabel();
        
        //textfields initialised
        cjt1 = new JTextField();//cvc
        cjt2 = new JTextField();//creditlimit
        cjt3 = new JTextField();//interest
        cjt4 = new JTextField();//graceperiod

        //combobox initialsed with arrays
        jyear=new JComboBox<String>(year);
        jmonth=new JComboBox<String>(month);
        jday= new JComboBox<String>(day);
        
        //jbutton initialised
        cjb1 = new JButton("Set Credit Limit");
        cjb12= new JButton("Add Credit Card");
        cjb2 = new JButton("Cancel Credit Card");
        cjb3 = new JButton("Clear");
        cjb32= new JButton("Clear");
        cjb4 = new JButton("Back");
        cjb5 = new JButton("Display");
        
        //action listeners to get source for event handling
        cjb1.addActionListener(this);
        cjb2.addActionListener(this);
        cjb3.addActionListener(this);
        cjb4.addActionListener(this);
        cjb5.addActionListener(this);
        cjb12.addActionListener(this);
        cjb32.addActionListener(this);

        //set bounds for objects
        cTitle.setBounds(291,52,245,50);
        cjl1.setBounds(88,161,56,20);
        cjl2.setBounds(34,215,110,20);
        cjl3.setBounds(59,269,85,17);
        cjl4.setBounds(50,323,93,20);
        cjl5.setBounds(62,377,82,20);
        cjl6.setBounds(65,43,37,20);
        cjl7.setBounds(21,97,82,20);
        cjl8.setBounds(224,43,74,20);
        cjl9.setBounds(206,97,89,20);
        cjl61.setBounds(65,43,37,20);//for add view
        cjl62.setBounds(65,43,37,20);
        cjl71.setBounds(21,97,82,20);//for add view
        cjl81.setBounds(224,43,74,20);//for add view
        cjl82.setBounds(224,43,74,20);
        cjl91.setBounds(206,97,89,20);//for add view
        cjl10.setBounds(30,96,74,20);
        cjt1.setBounds(113,37,81,26);
        cjt2.setBounds(102,92,81,26);
        cjt3.setBounds(298,37,81,26);
        cjt4.setBounds(300,91,89,26);
        cjb1.setBounds(33,158,221,32);
        cjb2.setBounds(33,158,221,32);
        cjb12.setBounds(33,158,221,32);
        cjb3.setBounds(262,158,123,32);
        cjb32.setBounds(262,158,123,32);
        cjb4.setBounds(34,443,83,32);
        cjb5.setBounds(132,443,107,32);
        cans1.setBounds(154,161,140,20);
        cans2.setBounds(154,215,140,20);
        cans3.setBounds(154,269,140,20);
        cans4.setBounds(154,323,140,20);
        cans5.setBounds(154,377,140,20);
        cans6.setBounds(110,43,45,20);
        cans7.setBounds(303,43,45,20);
        cans61.setBounds(110,43,45,20);
        cans71.setBounds(303,43,45,20);
        cans8.setBounds(110,97,81,20);
        cans9.setBounds(303,97,81,20);
        jyear.setBounds(312,90,70,26);
        jmonth.setBounds(218,90,70,26);
        jday.setBounds(124,90,70,26);
        creditLimitView.setBounds(379,181,399,233);
        creditAddView.setBounds(379,181,399,233);
        creditMainView.setBounds(379,181,399,233);
        
        //adding objects 
        cPortal.add(cTitle);
        cPortal.add(cjl1);
        cPortal.add(cjl2);
        cPortal.add(cjl3);
        cPortal.add(cjl4);
        cPortal.add(cjl5);
        cPortal.add(cjb4);
        cPortal.add(cjb5);
        cPortal.add(cans1);
        cPortal.add(cans2);
        cPortal.add(cans3);
        cPortal.add(cans4);
        cPortal.add(cans5);
        cPortal.add(cst1);
        cPortal.add(cst_ans1);
        cPortal.add(creditLimitView);
        cPortal.add(creditMainView);
        cPortal.add(creditAddView);
        creditLimitView.add(cjl62);
        creditLimitView.add(cjl7);
        creditLimitView.add(cjl82);
        creditLimitView.add(cjl9);
        creditLimitView.add(cans61);
        creditLimitView.add(cans71);
        creditLimitView.add(cans8);
        creditLimitView.add(cans9);
        creditLimitView.add(cjb2);
        creditAddView.add(cjl61);
        creditAddView.add(cjl71);
        creditAddView.add(cjl81);
        creditAddView.add(cjl91);
        creditAddView.add(cans6);
        creditAddView.add(cans7);
        creditAddView.add(cjt2);
        creditAddView.add(cjt4);
        creditAddView.add(cjb1);
        creditAddView.add(cjb32);
        creditMainView.add(jyear);
        creditMainView.add(jmonth);
        creditMainView.add(jday);
        creditMainView.add(cjl6);
        creditMainView.add(cjt1);
        creditMainView.add(cjl8);
        creditMainView.add(cjt3);
        creditMainView.add(cjl10);
        creditMainView.add(cjb12);
        creditMainView.add(cjb3);
        
        //properties set for jpanels
        creditLimitView.setLayout(null);
        creditLimitView.setSize(399,233);
        creditLimitView.setVisible(false);
        
        creditAddView.setLayout(null);
        creditAddView.setSize(399,233);
        creditAddView.setVisible(false);
        
        creditMainView.setLayout(null);
        creditMainView.setSize(399,233);
        creditMainView.setVisible(true);
        
        portal.setLayout(null);
        portal.setSize(800,500);
        portal.setVisible(true);

        dPortal.setLayout(null);
        dPortal.setSize(800,500);
        dPortal.setVisible(false);

        cPortal.setLayout(null);
        cPortal.setSize(800,500);
        cPortal.setVisible(false);

        //panels added to frames
        gui.add(portal);
        gui.add(dPortal);
        gui.add(cPortal);
        
        //frame properties
        gui.setLayout(null);
        gui.setSize(800,530);
        gui.setVisible(true);
        gui.setResizable(false);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bjb1)
        {
            if(bjt1.getText().isEmpty() || bjt2.getText().isEmpty() || bjt3.getText().isEmpty() || bjt4.getText().isEmpty() || bjt5.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Empty fields found!","alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    int card_id = Integer.parseInt(bjt1.getText());
                    String client_name = bjt2.getText();
                    double balance_amount = Double.parseDouble(bjt3.getText());
                    String bank_account = bjt4.getText();
                    String issuer_bank = bjt5.getText();
                    
                    dans1.setText((String.valueOf(card_id)).toUpperCase());
                    dans2.setText((String.valueOf(balance_amount)).toUpperCase());
                    dans3.setText((client_name).toUpperCase());
                    dans4.setText((bank_account).toUpperCase());
                    dans5.setText((issuer_bank).toUpperCase());
                    
                    //to change the panel on button change
                    portal.setVisible(false);
                    dPortal.setVisible(true);
                }
                catch(NumberFormatException a)
                {
                    JOptionPane.showMessageDialog(null,"Enter valid data!","alert",JOptionPane.ERROR_MESSAGE);
                }
            }
        }else if (e.getSource()==bjb2)
        {
            if(bjt1.getText().isEmpty() || bjt2.getText().isEmpty() || bjt3.getText().isEmpty() || bjt4.getText().isEmpty() || bjt5.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Empty fields found!","alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    int card_id = Integer.parseInt(bjt1.getText());
                    String client_name = bjt2.getText();
                    double balance_amount = Double.parseDouble(bjt3.getText());
                    String bank_account = bjt4.getText();
                    String issuer_bank = bjt5.getText();
                    
                    
                    cans1.setText(String.valueOf(card_id));
                    cans2.setText(String.valueOf(balance_amount));
                    cans3.setText(client_name);
                    cans4.setText(bank_account);
                    cans5.setText(issuer_bank);
                    
                    //to change the panel on button change
                    portal.setVisible(false);
                    cPortal.setVisible(true);
                }
                catch(NumberFormatException a)
                {
                    JOptionPane.showMessageDialog(null,"Enter valid data!","alert",JOptionPane.ERROR_MESSAGE);
                }
            }
        }else if (e.getSource()==bjb3)
        {
            /*
             * when clicked
               this button clear all the jtextfields
               */
            bjt1.setText("");
            bjt2.setText("");
            bjt3.setText("");
            bjt4.setText("");
            bjt5.setText("");
        }else if(e.getSource()==djb1)
        {
            cPortal.setVisible(false);
            dPortal.setVisible(false);
            portal.setVisible(true);
            dAddView.setVisible(false);
            dMainView.setVisible(true);
            dst_ans1.setText("NOT ACTIVE");
            dst_ans1.setForeground(Color.RED);
            arrayGui.clear();
        }else if (e.getSource()==djb5)
        {
            if(djt2.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Enter pin code! Empty field found!","alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    /*
                     * add a debit card
                     * by passing all the jtextfield values to the debit class constructor 
                     * and show a dialog box 
                     */
                    int card_id = Integer.parseInt(bjt1.getText());
                    String client_name = bjt2.getText();
                    double balance_amount = Double.parseDouble(bjt3.getText());
                    String bank_account = bjt4.getText();
                    String issuer_bank = bjt5.getText();
                        
                    int pin_number = Integer.parseInt(djt2.getText());
    
                    DebitCard debitObj = new DebitCard(balance_amount,card_id,bank_account,client_name,issuer_bank,pin_number);
                    arrayGui.add(debitObj);
                    
                    JOptionPane.showMessageDialog(null,"Debit card added succesfully!","alert", JOptionPane.INFORMATION_MESSAGE);
                    dst_ans1.setText("ACTIVE");
                    dst_ans1.setForeground(darkGreen);
                    
                    dAddView.setVisible(true);
                    dMainView.setVisible(false);
                }
                catch(NumberFormatException a)
                {
                    JOptionPane.showMessageDialog(null,"Enter a valid value!","alert",JOptionPane.ERROR_MESSAGE);
                }
            }
            
        }else if(e.getSource()==djb2)
        {
            if(djt1.getText().isEmpty() || djt3.getText().isEmpty() ){
                JOptionPane.showMessageDialog(null,"Empty fields found!","alert", JOptionPane.ERROR_MESSAGE);             
            }
            else{
                try
                {
                    /*
                     * by casting the object of debit card class
                     * access the withdraw method of debit class 
                     * and be able to withdraw an aamount
                     * show a dialog box after process is successful
                     */
                    int withdrawl_amount=Integer.parseInt(djt1.getText());
                    int pin_number=Integer.parseInt(djt3.getText());
                    int add_pin_number=Integer.parseInt(djt2.getText());
                    String day = jday2.getSelectedItem().toString();
                    String year = jyear2.getSelectedItem().toString();
                    String month =  jmonth2.getSelectedItem().toString();
                    String withdrawl_date=day+"/"+month+"/"+year;
                    
                    for (BankCard values: arrayGui)
                    {
                        if(values instanceof DebitCard)
                        {
                            if(add_pin_number == pin_number)
                            {
                                double bamount=Double.parseDouble(dans2.getText());
                                
                                if (withdrawl_amount<=0)
                                {
                                    JOptionPane.showMessageDialog(null,"Enter a valid value!","alert",JOptionPane.ERROR_MESSAGE);
                                }
                                else
                                {
                                    if(bamount>=withdrawl_amount)
                                    {
                                        DebitCard debitObj = (DebitCard) values;
                                        debitObj.withdraw(withdrawl_amount,withdrawl_date,pin_number);
                                        JOptionPane.showMessageDialog(null,"Amount withdrawn!","alert", JOptionPane.INFORMATION_MESSAGE);
                                        double b_left = bamount-withdrawl_amount;
                                        dans2.setText(String.valueOf(b_left));
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(null,"Insufficient balance!","alert", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                            }else
                            {
                                JOptionPane.showMessageDialog(null,"Incorrect pin code!","alert", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
                catch(NumberFormatException a)
                {
                    JOptionPane.showMessageDialog(null,"Enter a valid value!","alert",JOptionPane.ERROR_MESSAGE);
                }
            }
            
        }else if (e.getSource()==djb4)
        {
            for(BankCard values: arrayGui)
            {
                DebitCard displayDebitObj = (DebitCard) values;
                displayDebitObj.display();
            }
        }
        else if(e.getSource()==cjb4) //back btn
        {
            cPortal.setVisible(false);
            dPortal.setVisible(false);
            portal.setVisible(true);
            creditAddView.setVisible(false);
            creditMainView.setVisible(true);
            creditLimitView.setVisible(false);
            cst_ans1.setText("NOT ACTIVE");
            cst_ans1.setForeground(Color.RED);
            arrayGui.clear();
            
        }else if(e.getSource()==cjb12) //add credit card button
        {
            if(cjt1.getText().isEmpty() || cjt3.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Empty fields found!","alert", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                /*
                 * add a credit card
                 * by passing all the jtextfield values to the credit class constructor 
                 * and show a dialog box 
                 */
                try{
                    int card_id = Integer.parseInt(bjt1.getText());
                    String client_name = bjt2.getText();
                    double balance_amount = Double.parseDouble(bjt3.getText());
                    String bank_account = bjt4.getText();
                    String issuer_bank = bjt5.getText();
                    
                    int cvc = Integer.parseInt(cjt1.getText());
                    float interest = Float.parseFloat(cjt3.getText());  
                    int cvc_number = Integer.parseInt(cjt1.getText());
                    double interest_rate = Double.parseDouble(cjt3.getText());
                    String day = jday.getSelectedItem().toString();
                    String year = jyear.getSelectedItem().toString();
                    String month =  jmonth.getSelectedItem().toString();
                    String expiry_date=day+"/"+month+"/"+year;
                    
                    CreditCard creditObj = new CreditCard(card_id,client_name,issuer_bank,bank_account,balance_amount,cvc_number,interest_rate,expiry_date);
                    arrayGui.add(creditObj);
                    JOptionPane.showMessageDialog(null,"Credit card added succesfully!","alert", JOptionPane.INFORMATION_MESSAGE);
                    
                    creditAddView.setVisible(true);
                    creditMainView.setVisible(false);
                    creditLimitView.setVisible(false);
                    cans6.setText(String.valueOf(cvc));
                    cans7.setText(String.valueOf(interest)+"%");
                    cans61.setText(String.valueOf(cvc));
                    cans71.setText(String.valueOf(interest)+"%");
                    cst_ans1.setText("ACTIVE");
                    cst_ans1.setForeground(darkGreen);
                }
                catch(NumberFormatException a)
                {
                    JOptionPane.showMessageDialog(null,"Enter a valid value!","alert",JOptionPane.ERROR_MESSAGE);
                }
            }
        }else if (e.getSource()==cjb1)// set credit limit button
        {
            if(cjt2.getText().isEmpty() || cjt4.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Empty fields found!","alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    /*
                     * cast the object of creditcard as bankcard
                     * and access the setcreditlimit() function of credit card 
                     * and finally be able to set a credit limit
                     * show a dialog box in appropriate places
                     */
                    double credit = Double.parseDouble(cjt2.getText());
                    int grace = Integer.parseInt(cjt4.getText());
                    double balance = Double.parseDouble(bjt3.getText());
                    
                    for(BankCard values: arrayGui)
                    {
                        if(values instanceof CreditCard)
                        {
                            if(credit <= 2.5*balance){
                                CreditCard setLimitObj = (CreditCard) values;
                                setLimitObj.setCreditLimit(credit,grace);
                                JOptionPane.showMessageDialog(null,"Credit limit is set!","alert", JOptionPane.INFORMATION_MESSAGE);
                                cans8.setText(String.valueOf(credit));
                                cans9.setText(String.valueOf(grace));
                                creditAddView.setVisible(false);
                                creditMainView.setVisible(false);
                                creditLimitView.setVisible(true);
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"Sorry, you do not have sufficient balance for the required credit amount.","alert", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                }
                catch(NumberFormatException a)
                {
                    JOptionPane.showMessageDialog(null,"Enter a valid value!","alert",JOptionPane.ERROR_MESSAGE);
                }
            }
            
            
        }else if (e.getSource()==cjb2)//cancel credit card
        {
            creditAddView.setVisible(false);
            creditMainView.setVisible(true);
            creditLimitView.setVisible(false);
            
            for(BankCard values: arrayGui)
            {
                if(values instanceof CreditCard)
                {
                    CreditCard cancelCreditObj = (CreditCard) values;
                    cancelCreditObj.cancelCreditCard();
                    JOptionPane.showMessageDialog(null,"Credit card cancelled!","alert", JOptionPane.INFORMATION_MESSAGE);
                    cst_ans1.setText("NOT ACTIVE");
                    cst_ans1.setForeground(Color.RED);
                }
            }
        }else if (e.getSource()==cjb3)
        {
            /*
             * when clicked
               this button clear all the jtextfields
               */
            cjt1.setText("");
            cjt3.setText("");
        }else if (e.getSource()==djb3)
        {
            /*
             * when clicked
               this button clear all the jtextfields
                */
            djt2.setText("");
        }else if (e.getSource()==cjb32)
        {
            /*
             * when clicked
               this button clear all the jtextfields
               */
            cjt2.setText("");
            cjt4.setText("");
        }else if (e.getSource()==djb6)
        {
            /*
             * when clicked
               this button clear all the jtextfields
               */
            djt1.setText("");
            djt3.setText("");
            
        }else if (e.getSource()==cjb5)
        {
            for (BankCard values : arrayGui)
            {
                CreditCard displayObjCredit = (CreditCard) values;
                displayObjCredit.display();
            }
        }
    }
    public static void main(String [] args)
    {
        new BankGUI();
    }
}