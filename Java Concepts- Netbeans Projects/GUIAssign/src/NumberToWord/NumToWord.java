package NumberToWord;

import java.awt.*;
import java.awt.event.*;

class Main {

    Frame f;
    Label l1, l2;
    TextField t;
    Button b;

    Main() {
        f = new Frame();
        f.setLayout(null);
        f.setSize(400, 250);
        f.setTitle("Number to Word Converter");
        f.setBackground(Color.ORANGE);
        f.setVisible(true);

        l1 = new Label("No. (<10000 & >0) : ");
        l1.setBounds(50, 60, 140, 20);
        f.add(l1);
        t = new TextField();
        t.setBounds(210, 60, 140, 20);
        f.add(t);

        b = new Button("Convert to Word");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                //int i = 0;
//                String num[][] = {
//                    {"one thousand", "two thousand", "three thousand", "four thousand", "five thousand", "six thousand", "seven thousand", "eight thousand", "nine thousand"},
//                    {"one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"},
//                    {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"},
//                    {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"},
//                    {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}
//                };
                 String word[] = new String[4]; //string type so that we can perform operations like concatenation, etc...
                 String num = t.getText();
                 for(int i = 0; i<num.length();i++){
                    // word[i].concat(word[i]);
                 }
            }
        });
        b.setBounds(100, 110, 200, 30);
        f.add(b);

        l2 = new Label("__________________________________________________________________________");
        l2.setBounds(50, 170, 300, 30);
        f.add(l2);
    }
}
//we have to use concept of wrapper class to convert int values to their respective string values

public class NumToWord {

    public static void main(String[] args) {

        Main m = new Main();
    }
}
