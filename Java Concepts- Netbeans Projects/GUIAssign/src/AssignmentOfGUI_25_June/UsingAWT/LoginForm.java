package AssignmentOfGUI_25_June.UsingAWT;

import java.awt.*;
import java.awt.event.*;

class LoginWindow extends Frame{

    //Frame f;
    Panel p;
    Label l1, l2, l3;
    TextField t1, t2;
    Button b;
    
     class WE extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent we){
            dispose();
        }        
    }

    LoginWindow() {
        addWindowListener(new WE());
        //f = new Frame();
        
//        f.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent we) {
//                //System.exit(0);                             //Exception...WHY????
//                                              //Showing CTError: cannot found method dispose()
//            }
//        });
        setLayout(null);
        setBackground(Color.YELLOW);
        setTitle("Login Form");
        setSize(400, 300);
        setVisible(true);

        l1 = new Label("User ID: ");
        l1.setBounds(50, 60, 60, 20);
        add(l1);
        t1 = new TextField();
        t1.setBounds(160, 60, 190, 20);
        add(t1);

        l2 = new Label("Password: ");
        l2.setBounds(50, 110, 60, 20);
        add(l2);
        t2 = new TextField();
        t2.setBounds(160, 110, 190, 20);
        add(t2);

        p = new Panel();
        p.setLayout(null);
        p.setBackground(Color.GREEN);
        p.setBounds(50, 150, 300, 110);
        add(p);

        b = new Button("Login");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = t1.getText();
                String s2 = t2.getText();
                if (s1.equalsIgnoreCase("LoginID") && s2.equals("LoginPassword")) {
                    l3.setText("Login Successful!");
                } else {
                    l3.setText("Sorry! Invalid Credentials...");
                }
            }
        });
        b.setBounds(25, 20, 250, 30);
        p.add(b);

        l3 = new Label("______________________________________________________________________");
        l3.setAlignment(l3.CENTER);
        l3.setBounds(25, 60, 250, 30);
        p.add(l3);
    }
}

public class LoginForm {

    public static void main(String[] args) {
        LoginWindow lw = new LoginWindow();
    }
}
