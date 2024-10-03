import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm extends JFrame implements ActionListener {
    // Declare the form elements
    private JLabel nameLabel, ageLabel, courseLabel;
    private JTextField nameField, ageField;
    private JComboBox<String> courseBox;
    private JButton submitButton;
    private JTextArea resultArea;

    // Constructor to set up the form
    public StudentForm() {
        // Set up the frame
        setTitle("Student Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2)); // 5 rows, 2 columns

        // Name label and text field
        nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);
        add(nameLabel);
        add(nameField);

        // Age label and text field
        ageLabel = new JLabel("Age:");
        ageField = new JTextField(20);
        add(ageLabel);
        add(ageField);

        // Course label and drop-down box
        courseLabel = new JLabel("Course:");
        String[] courses = {"Computer Science", "Math", "Physics", "Chemistry", "Biology"};
        courseBox = new JComboBox<>(courses);
        add(courseLabel);
        add(courseBox);

        // Submit button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this); // Add action listener for button click
        add(submitButton);

        // Result area to display the submitted data
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        add(new JLabel()); // Empty label to fill space
        add(resultArea);

        // Make the form visible
        setVisible(true);
    }

    // Action performed method to handle button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the entered data
        String name = nameField.getText();
        String age = ageField.getText();
        String course = (String) courseBox.getSelectedItem();

        // Display the submitted data
        resultArea.setText("Student Info:\n");
        resultArea.append("Name: " + name + "\n");
        resultArea.append("Age: " + age + "\n");
        resultArea.append("Course: " + course + "\n");
    }

    // Main method to run the application
    public static void main(String[] args) {
        new StudentForm();
    }
}
