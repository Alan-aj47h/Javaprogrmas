import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {

    JTextField num1Field, num2Field, resultField;
    JButton addBtn, subBtn, mulBtn, divBtn, clearBtn;

    SimpleCalculator() {

        setTitle("Simple Calculator");
        setSize(300, 250);
        setLayout(new GridLayout(6, 2));   
        add(new JLabel("First Number:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("Second Number:"));
        num2Field = new JTextField();
        add(num2Field);

        add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false); 
        add(resultField);
        addBtn = new JButton("Add");
        subBtn = new JButton("Subtract");
        mulBtn = new JButton("Multiply");
        divBtn = new JButton("Divide");
        clearBtn = new JButton("Clear");

        add(addBtn); 
        add(subBtn);
        add(mulBtn);
        add(divBtn);
        add(clearBtn);

        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        try {
            double n1 = Double.parseDouble(num1Field.getText());
            double n2 = Double.parseDouble(num2Field.getText());
            double ans = 0;

            if (e.getSource() == addBtn) {
                ans = n1 + n2;
            } else if (e.getSource() == subBtn) {
                ans = n1 - n2;
            } else if (e.getSource() == mulBtn) {
                ans = n1 * n2;
            } else if (e.getSource() == divBtn) {
                ans = n1 / n2;
            }

            resultField.setText(String.valueOf(ans));

            if (e.getSource() == clearBtn) {
                num1Field.setText("");
                num2Field.setText("");
                resultField.setText("");
            }

        } catch (Exception ex) {
            resultField.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
