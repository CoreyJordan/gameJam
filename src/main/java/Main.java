import levels.GamePanel;
import levels.TestLevel;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("You Can't Make Me");
        window.setLocationRelativeTo(null);

        TestLevel testScreen = new TestLevel();
        window.add(testScreen);
        window.setTitle(window.getTitle() + ": " + testScreen.getTitle());

        window.pack();
        window.setVisible(true);

    }
}
