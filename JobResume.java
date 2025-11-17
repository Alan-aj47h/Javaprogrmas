import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JobResume extends JFrame implements ActionListener {
    JTextField nameField, emailField, phoneField, addressField, qualificationField, skillsField;
    JTextArea outputArea;
    JButton submitBtn, clearBtn;
    JobResume() {
        setTitle("Job Resume");
        setSize(400, 500);
        setLayout(new GridLayout(8, 2));
        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);
        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);
        add(new JLabel("Phone:"));
        phoneField = new JTextField();
        add(phoneField);
        add(new JLabel("Address:"));
        addressField = new JTextField();
        add(addressField);
        add(new JLabel("Qualification:"));
        qualificationField = new JTextField();
        add(qualificationField);
        add(new JLabel("Skills:"));
        skillsField = new JTextField();
        add(skillsField);
        submitBtn = new JButton("Submit");
        clearBtn = new JButton("Clear");
        add(submitBtn);
        add(clearBtn);
        submitBtn.addActionListener(this);
        clearBtn.addActionListener(this);
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(outputArea);
        add(scroll);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitBtn) {
            String resume = "----- JOB RESUME -----\n\n"
                    + "Name: " + nameField.getText() + "\n"
                    + "Email: " + emailField.getText() + "\n"
                    + "Phone: " + phoneField.getText() + "\n"
                    + "Address: " + addressField.getText() + "\n"
                    + "Qualification: " + qualificationField.getText() + "\n"
                    + "Skills: " + skillsField.getText() + "\n";

            outputArea.setText(resume);
        }
        if (e.getSource() == clearBtn) {
            nameField.setText("");
            emailField.setText("");
            phoneField.setText("");
            addressField.setText("");
            qualificationField.setText("");
            skillsField.setText("");
            outputArea.setText("");
        }
    }
    public static void main(String[] args) {
        new JobResume();
    }
}
