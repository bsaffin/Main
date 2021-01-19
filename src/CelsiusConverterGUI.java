import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverterGUI extends JFrame {

    private JPanel mainPanel;
    private JTextField celsiusTextField;
    private JLabel celsiusLabel;
    private JButton convertButton;
    private JLabel fahrenheitLabel;

    public CelsiusConverterGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();


        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //grab the text from the celsiusTestField
                //convert to a Double
                //update the fahrenheitLabel
                int tempFahr = (int)((Double.parseDouble(celsiusTextField.getText())) * 1.8 + 32);
                fahrenheitLabel.setText(tempFahr + " Fahrenheit");
            }
        });
    }

    public static void main(String[] args) {
        //Can I edit? - Charlieee1
        JFrame frame = new CelsiusConverterGUI("My Celsius Converter");
        frame.setVisible(true);


    }

}
