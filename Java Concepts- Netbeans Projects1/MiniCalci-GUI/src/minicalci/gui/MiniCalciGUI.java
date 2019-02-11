package minicalci.gui;

import java.awt.*;
import java.awt.event.*;

class GUI1 extends Frame{

    //Frame f;    //instead writing this and calling its object by ref. again and again, we can extend Frame class in this class.
    Label l1, l2, l3, l4;
    Panel p;
    TextField t1, t2;
    Button b1, b2, b3, b4;

    class Add implements ActionListener {

        @Override   //this notation tells, that method of interface ActionListener is overidden.
        public void actionPerformed(ActionEvent e) {
            String s1 = t1.getText();   //getText() returns a string, thus we have to keep its literal in String identifier.
            String s2 = t2.getText();
            try {
                double i1 = Double.parseDouble(s1);
                double i2 = Double.parseDouble(s2);
                double i = i1 + i2;
                String sum = String.valueOf(i);
                l4.setText(sum);
            } catch (Exception ex) {
                l4.setText(ex.getMessage());
            }
        }
    }

    class Sub implements ActionListener {

        @Override   //this notation tells, that method of interface ActionListener is overidden.
        public void actionPerformed(ActionEvent e) {
            String s1 = t1.getText();   //getText() returns a string, thus we have to keep its literal in String identifier.
            String s2 = t2.getText();
            try {
                double i1 = Double.parseDouble(s1);
                double i2 = Double.parseDouble(s2);
                double i = i1 - i2;
                String sub = String.valueOf(i);
                l4.setText(sub);
            } catch (Exception ex) {
                l4.setText(ex.getMessage());
            }
        }
    }

    class Mul implements ActionListener {

        @Override   //this notation tells, that method of interface ActionListener is overidden.
        public void actionPerformed(ActionEvent e) {
            String s1 = t1.getText();   //getText() returns a string, thus we have to keep its literal in String identifier.
            String s2 = t2.getText();
            try {
                double i1 = Double.parseDouble(s1);
                double i2 = Double.parseDouble(s2);
                double i = i1 * i2;
                String mul = String.valueOf(i);
                l4.setText(mul);
            } catch (Exception ex) {
                l4.setText(ex.getMessage());
            }
        }
    }

    class Div implements ActionListener {

        @Override   //this notation tells, that method of interface ActionListener is overidden.
        public void actionPerformed(ActionEvent e) {
            String s1 = t1.getText();   //getText() returns a string, thus we have to keep its literal in String identifier.
            String s2 = t2.getText();
            try {
                double i1 = Double.parseDouble(s1);
                double i2 = Double.parseDouble(s2);
                double i = i1 / i2;
                String div = String.valueOf(i);
                l4.setText(div);
            } catch (Exception ex) {
                l4.setText(ex.getMessage());
            }
        }
    }

//    class WE implements WindowListener {
//
//        @Override
//        public void windowOpened(WindowEvent we) {
//            System.out.println("WindowOpened!");
//        }
//
//        @Override
//        public void windowClosing(WindowEvent we) {
//            System.out.println("windowClosing!");
//            dispose();  //this method closes the particular frame only, whereas 'System.exit(0);' will shut down the whole application (generally used in multi window applications.)
//        }
//
//        @Override
//        public void windowClosed(WindowEvent we) {
//            System.out.println("windowClosed!");
//        }
//
//        @Override
//        public void windowIconified(WindowEvent we) {
//            System.out.println("windowIconified!");
//        }
//
//        @Override
//        public void windowDeiconified(WindowEvent we) {
//            System.out.println("windowDeiconified!");
//        }
//
//        @Override
//        public void windowActivated(WindowEvent we) {
//            System.out.println("windowActivated!");
//        }
//
//        @Override
//        public void windowDeactivated(WindowEvent we) {
//            System.out.println("windowDeactivated!");
//        }
//
//    }
    
    //if we don't want to override all the methods of WindowListener Interface, we can extends interface's child class i.e. WindowAbstractor, which allows us to override the methods we need and leave those which we are not gonna use.

    class WE extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent we){
            dispose();
        }        
    }
    GUI1() {
        addWindowListener(new WE());
        new Frame();
        setTitle("Mini  Calci");
        setLayout(null);
        setVisible(true);
        setSize(350, 270);
        setBackground(Color.YELLOW);

        p = new Panel();
        p.setLayout(null);
        p.setVisible(true);
        p.setBounds(25, 45, 300, 160);
        p.setBackground(Color.BLUE);
        add(p);

        l1 = new Label("1st No.: ");
        l1.setForeground(Color.WHITE);
        l1.setBounds(20, 20, 50, 20);
        p.add(l1);
        t1 = new TextField();
        t1.setBounds(100, 20, 175, 20);
        p.add(t1);

        l2 = new Label("1st No.: ");
        l2.setForeground(Color.WHITE);
        l2.setBounds(20, 60, 50, 20);
        p.add(l2);
        t2 = new TextField();
        t2.setBounds(100, 60, 175, 20);
        p.add(t2);

        b1 = new Button("+");
        b1.addActionListener(new Add());
        b1.setBounds(20, 100, 50, 40);
        p.add(b1);
        b2 = new Button("-");
        b2.addActionListener(new Sub());
        b2.setBounds(90, 100, 50, 40);
        p.add(b2);
        b3 = new Button("*");
        b3.addActionListener(new Mul());
        b3.setBounds(160, 100, 50, 40);
        p.add(b3);
        b4 = new Button("/");
        b4.addActionListener(new Div());
        b4.setBounds(230, 100, 50, 40);
        p.add(b4);

        l3 = new Label("Answer: ");
        l3.setVisible(true);
        l3.setBounds(25, 225, 50, 20);
        add(l3);

        l4 = new Label("__________________________________________________");
        l4.setVisible(true);
        l4.setBounds(105, 225, 220, 20);
        add(l4);
    }
}

public class MiniCalciGUI {

    public static void main(String[] args) {
        GUI1 gui = new GUI1();
    }

}
