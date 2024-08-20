import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class converter {

    public static void main(String[] args) {

        Frame frame = new Frame("UNIT CONVERTER");
        frame.setSize(300, 250);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setBackground(Color.black);


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                frame.dispose();
            }
        });

        Label label = new Label("UNIT CONVERTER");
        label.setBounds(90, 20, 150, 80);
        label.setForeground(Color.cyan);

        frame.add(label);

        Label a = new Label("Choose Conversion Type:");
        a.setBounds(20, 100, 150, 30);
        a.setForeground(Color.cyan);
        frame.add(a);


        JComboBox<String> type=new JComboBox<>();

        type.addItem("Length Conversion");
        type.addItem("Weight Conversion");
        type.addItem("Temperature Conversion");
        frame.add(type);
        type.setBounds(20,140,160,30);

        Button next = new Button("NEXT");
        next.setBounds(20, 180, 50, 20);
        next.setForeground(Color.cyan);
        next.setBackground(Color.BLACK);
        frame.add(next);


        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String conversion=(String) type.getSelectedItem();

                if (conversion.equals("Length Conversion")){
                    new gui();



                } else if (conversion.equals("Weight Conversion")) {
                    new gui1();



                }
                else {
                    new gui2();


                }
            }
        });


    }
}