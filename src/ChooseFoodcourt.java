import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.Random;


public class ChooseFoodcourt extends JFrame {
    public ChooseFoodcourt() {
        this.setTitle("Destination Chooser");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 100);
        this.setLayout(new FlowLayout());

        JButton button = new JButton("Where are we going today?");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRandomDestination();
            }
        });

        this.getContentPane().add(button);

        this.setVisible(true);
    }

    private void showRandomDestination() {
        String[] destinations = {
                "foodcourt 1",
                "foodcourt 2",
                "foodcourt 3",
                "foodcourt 4",
                "foodcourt 5",
                "foodcourt 6",
                "macdonalds"
        };

        Random random = new Random();
        int index = random.nextInt(destinations.length);

        JOptionPane.showMessageDialog(this, "Let's go to " + destinations[index] + "!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ChooseFoodcourt();
            }
        });
    }
}
