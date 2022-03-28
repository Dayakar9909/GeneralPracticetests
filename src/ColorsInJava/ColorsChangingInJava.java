package ColorsInJava;

import java.awt.*;
import java.awt.event.*;

public class ColorsChangingInJava extends Frame implements ActionListener {

    Button red, green,blue;

    public ColorsChangingInJava(){
        red = new Button("Red");
        green = new Button("Green");
        blue = new Button("Blue");

        setLayout(new FlowLayout());
        add(red);
        add(green);
        add(blue);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
    }

    public static void main(String[] args){

    ColorsChangingInJava  col = new ColorsChangingInJava();
    col.setTitle("Changing background color of frame");
    col.setSize(500, 500);
    col.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String clickedButton = e.getActionCommand();
        System.out.println(clickedButton + " Clicked");

        if (e.getSource() == red){
            setBackground(Color.red);
        }
        else if (e.getSource() == green){
            setBackground(Color.green);
        }
        else
            setBackground(Color.blue);
        }

    }

