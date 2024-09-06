import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class visual {
    private JTextField textFNum1;
    private JTextField textFNum2;
    private JButton sumarButton;
    private JButton restaButton;
    private JButton multiplicacionButton;
    private JButton divisionButton;
    private JLabel jLabRes;
    private JPanel pnlInicio;
    private JButton borrarButton;


    public visual() {
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Scanner scan = new Scanner(System.in);
                Double num1 = Double.parseDouble(textFNum1.getText());
                Double num2 = Double.parseDouble(textFNum2.getText());
                double res = num1 + num2;
                JOptionPane.showMessageDialog(null,"EL RESULTADO ES = "+ res);
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textFNum1.setText("");
                textFNum2.setText("");
            }
        });
        restaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Scanner scan = new Scanner(System.in);
                Double num1 = Double.parseDouble(textFNum1.getText());
                Double num2 = Double.parseDouble(textFNum2.getText());
                double res = num1 - num2;
                JOptionPane.showMessageDialog(null,"EL RESULTADO ES = " +res);
            }
        });
        multiplicacionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Scanner scan = new Scanner(System.in);
                Double num1 = Double.parseDouble(textFNum1.getText());
                Double num2 = Double.parseDouble(textFNum2.getText());
                double res = num1 * num2;
                JOptionPane.showMessageDialog(null,"EL RESULTADO ES = "+ res);
            }
        });
        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Scanner scan = new Scanner(System.in);
                Double num1 = Double.parseDouble(textFNum1.getText());
                Double num2 = Double.parseDouble(textFNum2.getText());
                double res = num1 / num2;
                JOptionPane.showMessageDialog(null,"EL RESULTADO ES = "+ res);

            }
        });
    }

    public static void main(String[] args) {
JFrame frame = new JFrame("CALCULADORA");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
visual vis = new visual();
frame.setSize(500,300); //Tamaño de la ventana
        frame.setContentPane(new visual().pnlInicio);

frame.pack();
frame.setVisible(true);

    }
}
