import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("Click");
        b.setBounds(130, 200, 100, 50);

        JRadioButton r = new JRadioButton("Radio Button");
        r.setBounds(130, 100, 150, 30);

        JPasswordField n = new JPasswordField();
        n.setBounds(130, 150, 150, 30);

        f.add(b);
        f.add(r);
        f.add(n);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}