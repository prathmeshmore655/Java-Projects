import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class gui2{
    public gui2(){
        Frame newFrame=new Frame("TEMPERATURE CONVERSION");
        newFrame.setSize(300,700);
        newFrame.setVisible(true);
        newFrame.setLayout(null);
        newFrame.setBackground(Color.BLACK);
        newFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                newFrame.dispose();
            }
        });

        Label label1 = new Label("Temperature Conversions");
        label1.setBounds(90, 20, 150, 80);
        label1.setForeground(Color.cyan);

        newFrame.add(label1);

        Label a1 = new Label("Conversion unit:");
        a1.setBounds(20, 100, 100, 30);
        a1.setForeground(Color.white);
        newFrame.add(a1);


        JComboBox<String> unit=new JComboBox<>();
        unit.addItem("Celsius");
        unit.addItem("Fahrenheit");
        unit.setBounds(20,160,100,30);
        unit.setVisible(true);
        newFrame.add(unit);

        Button b=new Button("OK");
        b.setBounds(150,160,50,30);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.CYAN);
        newFrame.add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String choice = (String) unit.getSelectedItem();
                if (choice.equals("Celsius")) {

                    Label x = new Label("Enter Value:");
                    x.setBounds(20, 200, 100, 30);
                    x.setBackground(Color.BLACK);
                    x.setForeground(Color.CYAN);
                    newFrame.add(x);

                    TextField t = new TextField();
                    t.setBounds(20, 240, 100, 30);

                    newFrame.add(t);

                    Button getValue = new Button("Get Value");
                    getValue.setBounds(200, 240, 80, 30);
                    getValue.setBackground(Color.BLACK);
                    getValue.setForeground(Color.CYAN);
                    newFrame.add(getValue);

                    getValue.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            double value = 0;
                            try {
                                // Get the user-entered number
                                String inputText = t.getText();
                                double number = Double.parseDouble(inputText);
                                value = number;
                                System.out.println("User entered number: " + number);
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid input. Please enter a valid number.");
                            }

                            temperature t = new temperature();
                            double nm = t.bird(value, choice);


                            Button calculate = new Button("Calculate");
                            calculate.setBounds(20, 280, 80, 30);
                            calculate.setBackground(Color.BLACK);
                            calculate.setForeground(Color.cyan);
                            newFrame.add(calculate);


                            Label ans = new Label("Result:");
                            ans.setBackground(Color.black);
                            ans.setForeground(Color.cyan);
                            ans.setBounds(20, 310, 200, 30);

                            Label ans1 = new Label("");
                            ans1.setBackground(Color.black);
                            ans1.setForeground(Color.cyan);
                            ans1.setBounds(20, 340, 200, 30);

                            newFrame.add(ans);
                            newFrame.add(ans1);


                            calculate.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    ans1.setText("Fahrenheit:" + nm);

                                }
                            });


                        }
                    });

                } else {
                    Label x = new Label("Enter Value:");
                    x.setBounds(20, 200, 100, 30);
                    x.setBackground(Color.BLACK);
                    x.setForeground(Color.CYAN);
                    newFrame.add(x);

                    TextField t = new TextField();
                    t.setBounds(20, 240, 100, 30);

                    newFrame.add(t);

                    Button getValue = new Button("Get Value");
                    getValue.setBounds(200, 240, 80, 30);
                    getValue.setBackground(Color.BLACK);
                    getValue.setForeground(Color.CYAN);
                    newFrame.add(getValue);

                    getValue.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            double value = 0;
                            try {
                                // Get the user-entered number
                                String inputText = t.getText();
                                double number = Double.parseDouble(inputText);
                                value = number;
                                System.out.println("User entered number: " + number);
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid input. Please enter a valid number.");
                            }


                            temperature t = new temperature();
                            double nm = t.bird(value, choice);


                            Button calculate = new Button("Calculate");
                            calculate.setBounds(20, 280, 80, 30);
                            calculate.setBackground(Color.BLACK);
                            calculate.setForeground(Color.cyan);
                            newFrame.add(calculate);


                            Label ans = new Label("Result:");
                            ans.setBackground(Color.black);
                            ans.setForeground(Color.cyan);
                            ans.setBounds(20, 310, 200, 30);

                            Label ans1 = new Label("");
                            ans1.setBackground(Color.black);
                            ans1.setForeground(Color.cyan);
                            ans1.setBounds(20, 340, 200, 30);



                            newFrame.add(ans);
                            newFrame.add(ans1);



                            calculate.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    ans1.setText("Celsius:" + nm);
                                }
                            });


                        }
                    });
                }
            }
        });
    }
}






