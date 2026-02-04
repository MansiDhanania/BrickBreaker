package breakoutBall;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Gameplay gamePlay = new Gameplay();

        frame.setBounds(200, 100, 700, 650);
        frame.setTitle("Breakout Ball");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gamePlay);
        frame.setVisible(true);
    }
}