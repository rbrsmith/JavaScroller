import javax.swing.*;

public class Game {

    public static void main(String[] args) {
        JFrame window = new JFrame("Game");
        GamePanel gp = new GamePanel();
        window.setContentPane(gp);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

}
