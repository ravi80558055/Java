package MyCalci;

import java.awt.*;
import java.awt.event.*;
import javafx.scene.input.TouchPoint;

class Main extends Frame {

    //Frame f;
    Button b[] = new Button[16];
    Panel p1, p2;
    TextField t;
    String s1,s2,s3;

    Main() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
        new Frame();
        setLayout(null);
        setSize(300, 395);
        setTitle("My Calci");
        setBackground(Color.ORANGE);
        setVisible(true);

        p1 = new Panel();
        p1.setLayout(null);
        p1.setBackground(Color.GRAY);
        p1.setBounds(25, 50, 250, 50);
        add(p1);

        t = new TextField();
        t.setBounds(10, 10, 160, 30);
        p1.add(t);

        b[0] = new Button("Clear");
        b[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                t.setText(null);
            }
        });
        b[0].setBounds(180, 10, 60, 30);
        p1.add(b[0]);

        p2 = new Panel();
        p2.setLayout(null);
        p2.setBackground(Color.GREEN);
        p2.setBounds(25, 120, 250, 250);
        add(p2);

        b[1] = new Button("7");
        b[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String s1 = new String();
                s1 = t.getText();
                String s2 = s1.concat("7");
                t.setText(s2);
                //t.setText("7");
            }
        });
        b[1].setBounds(10, 10, 50, 50);
        p2.add(b[1]);

        b[2] = new Button("8");
        b[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String s1 = new String();
                s1 = t.getText();
                String s2 = s1.concat("8");
                t.setText(s2);
                //t.setText("8");
            }
        });
        b[2].setBounds(70, 10, 50, 50);
        p2.add(b[2]);

        b[3] = new Button("9");
        b[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String s1 = new String();
                s1 = t.getText();
                String s2 = s1.concat("9");
                t.setText(s2);
                //t.setText("9");
            }
        });
        b[3].setBounds(130, 10, 50, 50);
        p2.add(b[3]);

        b[4] = new Button("/");
        b[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                s1 = t.getText();
                t.setText(null);
            }
        });
        b[4].setBounds(190, 10, 50, 50);
        p2.add(b[4]);

        b[5] = new Button("4");
        b[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String s1 = new String();
                s1 = t.getText();
                String s2 = s1.concat("4");
                t.setText(s2);
                //t.setText("4");
            }
        });
        b[5].setBounds(10, 70, 50, 50);
        p2.add(b[5]);

        b[6] = new Button("5");
        b[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String s1 = new String();
                s1 = t.getText();
                String s2 = s1.concat("5");
                t.setText(s2);
                //t.setText("5");
            }
        });
        b[6].setBounds(70, 70, 50, 50);
        p2.add(b[6]);

        b[7] = new Button("6");
        b[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String s1 = new String();
                s1 = t.getText();
                String s2 = s1.concat("6");
                t.setText(s2);
                //t.setText("6");
            }
        });
        b[7].setBounds(130, 70, 50, 50);
        p2.add(b[7]);

        b[8] = new Button("*");
        b[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                s1 = t.getText();
                t.setText(null);
            }
        });
        b[8].setBounds(190, 70, 50, 50);
        p2.add(b[8]);

        b[9] = new Button("1");
        b[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String s1 = new String();
                s1 = t.getText();
                String s2 = s1.concat("1");
                t.setText(s2);
                //t.setText("1");
            }
        });
        b[9].setBounds(10, 130, 50, 50);
        p2.add(b[9]);

        b[10] = new Button("2");
        b[10].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String s1 = new String();
                s1 = t.getText();
                String s2 = s1.concat("2");
                t.setText(s2);
                //t.setText("2");
            }
        });
        b[10].setBounds(70, 130, 50, 50);
        p2.add(b[10]);

        b[11] = new Button("3");
        b[11].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String s1 = new String();
                s1 = t.getText();
                String s2 = s1.concat("3");
                t.setText(s2);
                //t.setText("3");
            }
        });
        b[11].setBounds(130, 130, 50, 50);
        p2.add(b[11]);

        b[12] = new Button("-");
        b[12].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                s1 = t.getText();
                t.setText(null);
            }
        });
        b[12].setBounds(190, 130, 50, 50);
        p2.add(b[12]);

        b[13] = new Button("0");
        b[13].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String s1 = new String();
                s1 = t.getText();
                String s2 = s1.concat("0");
                t.setText(s2);
                //t.setText("0");
            }
        });
        b[13].setBounds(10, 190, 50, 50);
        p2.add(b[13]);

        b[14] = new Button("=");
        b[14].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                s2 = t.getText();
                int i1,i2,i3;
                i1 = Integer.parseInt(s1);
                i2 = Integer.parseInt(s2);
                i3 = i1 + i2;
//                int i3 = i1 - i2;
//                int i3 = i1 * i2;
//                int i3 = i1 / i2;
                s3 = String.valueOf(i3);
                t.setText(s3);
                
                //                int sign = s1.length();
                //                char op = s1.charAt(sign);
                //                switch (op) {
                //                    case '+':
                //                        String s2 = t.getText();
                //                        int i2 = Integer.parseInt(s2);
                //                        int sum = i1 + i2;
                //                        String result_sum = String.valueOf(sum);
                //                        t.setText(result_sum);
                //                        break;
                //                       
                //                    case '-':
                //                        String s3 = t.getText();
                //                        int i3 = Integer.parseInt(s3);
                //                        int sub = i1 - i3;
                //                        String result_sub = String.valueOf(sub);
                //                        t.setText(result_sub);
                //                        break;    
                //                }
                //                //t.setText("");
                //                String s2 = t.getText();
                //                int i2 = Integer.parseInt(s2);
                //                int sum = i1 + i2;
                //                String result = String.valueOf(sum);
                //                t.setText(result);
            }
        });
        b[14].setBounds(70, 190, 110, 50);
        p2.add(b[14]);

        b[15] = new Button("+");
        b[15].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                s1 = t.getText();
                t.setText(null);

//                String s1 = t.getText();
//                int i1 = Integer.parseInt(s1);
//                t.setText("");
//                String s2 = t.getText();
//                int i2 = Integer.parseInt(s2);
//                int sum = i1 + i2;
//                String result = String.valueOf(sum);
//                t.setText(result);
            }
        });
        b[15].setBounds(190, 190, 50, 50);
        p2.add(b[15]);
    }
}

public class MyCalci {

    public static void main(String[] args) {
        new Main();
    }
}
