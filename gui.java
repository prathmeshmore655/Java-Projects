import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class gui{
    public gui(){

        Frame newFrame=new Frame("LENGTH CONVERSION");
        newFrame.setSize(300,700);
        newFrame.setVisible(true);
        newFrame.setBackground(Color.BLACK);
        newFrame.setLayout(null);

        newFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                newFrame.dispose();
            }
        });

        Label label1 = new Label("Length Conversions");
        label1.setBounds(90, 20, 150, 80);
        label1.setForeground(Color.cyan);

        newFrame.add(label1);

        Label a1 = new Label("Conversion unit:");
        a1.setBounds(20, 100, 100, 30);
        a1.setForeground(Color.cyan);
        newFrame.add(a1);

        JComboBox<String> unit=new JComboBox<>();
        unit.addItem("Cm");
        unit.addItem("M");
        unit.addItem("Km");
        unit.addItem("Foot");
        unit.addItem("Mile");
        unit.addItem("Inch");
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
                String choice=(String) unit.getSelectedItem();
                if (choice.equals("Cm")){

                    Label x=new Label("Enter Value:");
                    x.setBounds(20,200,100,30);
                    x.setBackground(Color.BLACK);
                    x.setForeground(Color.CYAN);
                    newFrame.add(x);

                    TextField t=new TextField();
                    t.setBounds(20,240,100,30);

                    newFrame.add(t);

                    Button getValue=new Button("Get Value");
                    getValue.setBounds(200,240,80,30);
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


                            length l = new length();
                            double[] nm = l.dog(value, choice);


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

                            Label ans2 = new Label("");
                            ans2.setBackground(Color.black);
                            ans2.setForeground(Color.cyan);
                            ans2.setBounds(20, 380, 200, 30);

                            Label ans3 = new Label("");
                            ans3.setBackground(Color.black);
                            ans3.setForeground(Color.cyan);
                            ans3.setBounds(20, 420, 200, 30);

                            Label ans4 = new Label("");
                            ans4.setBackground(Color.black);
                            ans4.setForeground(Color.cyan);
                            ans4.setBounds(20, 460, 200, 30);

                            Label ans5 = new Label("");
                            ans5.setBackground(Color.black);
                            ans5.setForeground(Color.cyan);
                            ans5.setBounds(20, 500, 200, 30);

                            newFrame.add(ans);
                            newFrame.add(ans1);
                            newFrame.add(ans2);
                            newFrame.add(ans3);
                            newFrame.add(ans4);
                            newFrame.add(ans5);


                            calculate.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    ans1.setText("Meter:" + nm[0]);
                                    ans2.setText("Kilometer:" + nm[1]);
                                    ans3.setText("Foot:" + nm[2]);
                                    ans4.setText("Mile:" + nm[3]);
                                    ans5.setText("Inch:" + nm[4]);
                                }
                            });


                        }
                    });






                } else if (choice.equals("M")) {
                    Label x=new Label("Enter Value:");
                    x.setBounds(20,200,100,30);
                    x.setBackground(Color.BLACK);
                    x.setForeground(Color.CYAN);
                    newFrame.add(x);

                    TextField t=new TextField();
                    t.setBounds(20,240,100,30);

                    newFrame.add(t);

                    Button getValue=new Button("Get Value");
                    getValue.setBounds(200,240,80,30);
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


                            length l = new length();
                            double[] nm = l.dog(value, choice);


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

                            Label ans2 = new Label("");
                            ans2.setBackground(Color.black);
                            ans2.setForeground(Color.cyan);
                            ans2.setBounds(20, 380, 200, 30);

                            Label ans3 = new Label("");
                            ans3.setBackground(Color.black);
                            ans3.setForeground(Color.cyan);
                            ans3.setBounds(20, 420, 200, 30);

                            Label ans4 = new Label("");
                            ans4.setBackground(Color.black);
                            ans4.setForeground(Color.cyan);
                            ans4.setBounds(20, 460, 200, 30);

                            Label ans5 = new Label("");
                            ans5.setBackground(Color.black);
                            ans5.setForeground(Color.cyan);
                            ans5.setBounds(20, 500, 200, 30);

                            newFrame.add(ans);
                            newFrame.add(ans1);
                            newFrame.add(ans2);
                            newFrame.add(ans3);
                            newFrame.add(ans4);
                            newFrame.add(ans5);


                            calculate.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    ans1.setText("Centimeters:"+ nm[0]);
                                    ans2.setText("Kilometer:"+ nm[1]);
                                    ans3.setText("Foot:" + nm[2]);
                                    ans4.setText("Mile:" + nm[3]);
                                    ans5.setText("Inch:" + nm[4]);
                                }
                            });


                        }
                    });



                } else if (choice.equals("Km")) {
                    Label x=new Label("Enter Value:");
                    x.setBounds(20,200,100,30);
                    x.setBackground(Color.BLACK);
                    x.setForeground(Color.CYAN);
                    newFrame.add(x);

                    TextField t=new TextField();
                    t.setBounds(20,240,100,30);

                    newFrame.add(t);

                    Button getValue=new Button("Get Value");
                    getValue.setBounds(200,240,80,30);
                    getValue.setBackground(Color.BLACK);
                    getValue.setForeground(Color.CYAN);
                    newFrame.add(getValue);

                    getValue.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            double value = 0;
                            try {
                                
                                String inputText = t.getText();
                                double number = Double.parseDouble(inputText);
                                value = number;
                                System.out.println("User entered number: " + number);
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid input. Please enter a valid number.");
                            }


                            length l = new length();
                            double[] nm = l.dog(value, choice);


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

                            Label ans2 = new Label("");
                            ans2.setBackground(Color.black);
                            ans2.setForeground(Color.cyan);
                            ans2.setBounds(20, 380, 200, 30);

                            Label ans3 = new Label("");
                            ans3.setBackground(Color.black);
                            ans3.setForeground(Color.cyan);
                            ans3.setBounds(20, 420, 200, 30);

                            Label ans4 = new Label("");
                            ans4.setBackground(Color.black);
                            ans4.setForeground(Color.cyan);
                            ans4.setBounds(20, 460, 200, 30);

                            Label ans5 = new Label("");
                            ans5.setBackground(Color.black);
                            ans5.setForeground(Color.cyan);
                            ans5.setBounds(20, 500, 200, 30);

                            newFrame.add(ans);
                            newFrame.add(ans1);
                            newFrame.add(ans2);
                            newFrame.add(ans3);
                            newFrame.add(ans4);
                            newFrame.add(ans5);


                            calculate.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    ans1.setText("Centimeter:" + nm[0]);
                                    ans2.setText("Meter:" + nm[1]);
                                    ans3.setText("Foot:" + nm[2]);
                                    ans4.setText("Mile:" + nm[3]);
                                    ans5.setText("Inch:" + nm[4]);
                                }
                            });


                        }
                    });




                } else if (choice.equals("Foot")) {
                    Label x=new Label("Enter Value:");
                    x.setBounds(20,200,100,30);
                    x.setBackground(Color.BLACK);
                    x.setForeground(Color.CYAN);
                    newFrame.add(x);

                    TextField t=new TextField();
                    t.setBounds(20,240,100,30);

                    newFrame.add(t);

                    Button getValue=new Button("Get Value");
                    getValue.setBounds(200,240,80,30);
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


                            length l = new length();
                            double[] nm = l.dog(value, choice);


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

                            Label ans2 = new Label("");
                            ans2.setBackground(Color.black);
                            ans2.setForeground(Color.cyan);
                            ans2.setBounds(20, 380, 200, 30);

                            Label ans3 = new Label("");
                            ans3.setBackground(Color.black);
                            ans3.setForeground(Color.cyan);
                            ans3.setBounds(20, 420, 200, 30);

                            Label ans4 = new Label("");
                            ans4.setBackground(Color.black);
                            ans4.setForeground(Color.cyan);
                            ans4.setBounds(20, 460, 200, 30);

                            Label ans5 = new Label("");
                            ans5.setBackground(Color.black);
                            ans5.setForeground(Color.cyan);
                            ans5.setBounds(20, 500, 200, 30);

                            newFrame.add(ans);
                            newFrame.add(ans1);
                            newFrame.add(ans2);
                            newFrame.add(ans3);
                            newFrame.add(ans4);
                            newFrame.add(ans5);


                            calculate.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    ans1.setText("CentiMeter:" + nm[0]);
                                    ans2.setText("Meter:" + nm[1]);
                                    ans3.setText("Kilometer:" + nm[2]);
                                    ans4.setText("Mile:" + nm[3]);
                                    ans5.setText("Inch:" + nm[4]);
                                }
                            });


                        }
                    });




                } else if (choice.equals("Mile")) {
                    Label x=new Label("Enter Value:");
                    x.setBounds(20,200,100,30);
                    x.setBackground(Color.BLACK);
                    x.setForeground(Color.CYAN);
                    newFrame.add(x);

                    TextField t=new TextField();
                    t.setBounds(20,240,100,30);

                    newFrame.add(t);

                    Button getValue=new Button("Get Value");
                    getValue.setBounds(200,240,80,30);
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


                            length l = new length();
                            double[] nm = l.dog(value, choice);


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

                            Label ans2 = new Label("");
                            ans2.setBackground(Color.black);
                            ans2.setForeground(Color.cyan);
                            ans2.setBounds(20, 380, 200, 30);

                            Label ans3 = new Label("");
                            ans3.setBackground(Color.black);
                            ans3.setForeground(Color.cyan);
                            ans3.setBounds(20, 420, 200, 30);

                            Label ans4 = new Label("");
                            ans4.setBackground(Color.black);
                            ans4.setForeground(Color.cyan);
                            ans4.setBounds(20, 460, 200, 30);

                            Label ans5 = new Label("");
                            ans5.setBackground(Color.black);
                            ans5.setForeground(Color.cyan);
                            ans5.setBounds(20, 500, 200, 30);

                            newFrame.add(ans);
                            newFrame.add(ans1);
                            newFrame.add(ans2);
                            newFrame.add(ans3);
                            newFrame.add(ans4);
                            newFrame.add(ans5);


                            calculate.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    ans1.setText("Centieter:" + nm[0]);
                                    ans2.setText("Meter:" + nm[1]);
                                    ans3.setText("Kilometer:" + nm[2]);
                                    ans4.setText("Foot:" + nm[3]);
                                    ans5.setText("Inch:" + nm[4]);
                                }
                            });


                        }
                    });




                }
                else {
                    Label x=new Label("Enter Value:");
                    x.setBounds(20,200,100,30);
                    x.setBackground(Color.BLACK);
                    x.setForeground(Color.CYAN);
                    newFrame.add(x);

                    TextField t=new TextField();
                    t.setBounds(20,240,100,30);

                    newFrame.add(t);

                    Button getValue=new Button("Get Value");
                    getValue.setBounds(200,240,80,30);
                    getValue.setBackground(Color.BLACK);
                    getValue.setForeground(Color.CYAN);
                    newFrame.add(getValue);

                    getValue.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            double value = 0;
                            try {
                                String inputText = t.getText();
                                double number = Double.parseDouble(inputText);
                                value = number;
                                System.out.println("User entered number: " + number);
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid input. Please enter a valid number.");
                            }


                            length l = new length();
                            double[] nm = l.dog(value, choice);


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

                            Label ans2 = new Label("");
                            ans2.setBackground(Color.black);
                            ans2.setForeground(Color.cyan);
                            ans2.setBounds(20, 380, 200, 30);

                            Label ans3 = new Label("");
                            ans3.setBackground(Color.black);
                            ans3.setForeground(Color.cyan);
                            ans3.setBounds(20, 420, 200, 30);

                            Label ans4 = new Label("");
                            ans4.setBackground(Color.black);
                            ans4.setForeground(Color.cyan);
                            ans4.setBounds(20, 460, 200, 30);

                            Label ans5 = new Label("");
                            ans5.setBackground(Color.black);
                            ans5.setForeground(Color.cyan);
                            ans5.setBounds(20, 500, 200, 30);

                            newFrame.add(ans);
                            newFrame.add(ans1);
                            newFrame.add(ans2);
                            newFrame.add(ans3);
                            newFrame.add(ans4);
                            newFrame.add(ans5);


                            calculate.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    ans1.setText("Centieter:" + nm[0]);
                                    ans2.setText("Meter:" + nm[1]);
                                    ans3.setText("Kilometer:" + nm[2]);
                                    ans4.setText("Foot:" + nm[3]);
                                    ans5.setText("Mile:" + nm[4]);
                                }
                            });


                        }
                    });




                }
            }
        });

    }
}
