import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form extends JFrame {
    private JPanel panel1;
    private JTextArea textArea1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JButton SHOWButton;

    public form() {
        add(panel1);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        SHOWButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioButton1.isSelected()) {
                    textArea1.setText(divisible());
                } else if (radioButton2.isSelected()) {
                    textArea1.setText(findPrimes());
                }

                else {
                    textArea1.setText("You did not select anything.");
                }
            }
        });
    }

    public String divisible() {
        String result = "";
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result += i + "\n";
            }
        }

        return result;
    }


    private String findPrimes() {
        String result = "";

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                result += i + "\n";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        form form = new form();
        form.setVisible(true);
    }
}
