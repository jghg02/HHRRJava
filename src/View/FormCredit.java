package View;

import Controller.CreditController;
import Model.Person;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jhgonzalez on 7/15/17.
 */
public class FormCredit {
    public JPanel panel1;
    private JTextField amountCredit;
    private JButton agregarButton;

    public FormCredit() {

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreditController.addCredit(Integer.parseInt(amountCredit.getText()),new Person());

            }
        });
    }
}
