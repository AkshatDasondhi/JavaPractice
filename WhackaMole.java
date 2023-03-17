import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WhackaMole extends JFrame implements ActionListener {

    private Timer timer;
    private JLabel scoreLabel, timeLabel;
    private int score, timeLeft, moleCount;
    private JButton[] moleButtons;

    public WhackaMole() {
        setTitle("Whack-a-Mole");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel scorePanel = new JPanel(new GridLayout(1, 2));
        scoreLabel = new JLabel("Score: 0");
        timeLabel = new JLabel("Time left: 60");
        scorePanel.add(scoreLabel);
        scorePanel.add(timeLabel);
        add(scorePanel, BorderLayout.NORTH);

        JPanel molePanel = new JPanel(new GridLayout(3, 3));
        moleButtons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            moleButtons[i] = new JButton();
            moleButtons[i].addActionListener(this);
            molePanel.add(moleButtons[i]);
        }
        add(molePanel, BorderLayout.CENTER);

        JButton startButton = new JButton("Start");
        startButton.addActionListener(this);
        add(startButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Start")) {
            startGame();
        } else {
            for (int i = 0; i < 9; i++) {
                if (e.getSource() == moleButtons[i]) {
                    if (moleButtons[i].getText().equals("Mole")) {
                        score++;
                        scoreLabel.setText("Score: " + score);
                        moleButtons[i].setText("");
                        moleCount--;
                    }else{
                        endGame();
                    }
                }
            }
        }
    }

    public void startGame() {
        score = 0;
        timeLeft = 60;
        moleCount = 0;
        scoreLabel.setText("Score: " + score);
        timeLabel.setText("Time left: " + timeLeft);

        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timeLeft--;
                timeLabel.setText("Time left: " + timeLeft);
                if (timeLeft == 0) {
                    endGame();
                }
            }
        });
        timer.start();

        spawnMole();
    }

    public void endGame() {
        timer.stop();
        JOptionPane.showMessageDialog(this, "Game over! Your score is " + score);
    }

    public void spawnMole() {
        if (moleCount < 3) {
            int index = (int) (Math.random() * 9);
            if (moleButtons[index].getText().equals("")) {
                moleButtons[index].setText("Mole");
                moleCount++;
            }
        }
        timer = new Timer(2000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 9; i++) {
                    if (moleButtons[i].getText().equals("Mole")) {
                        moleButtons[i].setText("");
                        moleCount--;
                    }
                }
                spawnMole();
            }
        });
        timer.setRepeats(false);
        timer.setInitialDelay(1000);
        timer.start();
    }

    public static void main(String[] args) {
        new WhackaMole();
    }
}
