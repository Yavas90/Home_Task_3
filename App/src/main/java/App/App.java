package App;

import javax.swing.*;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    protected boolean isAlive = true;

    public App(final int SIZE) {
        setTitle("Bombs and Deaths");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);

        boolean[][] bombs = new boolean[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                bombs[i][j] = Math.random() <= 0.25;
            }
        }

        JButton[][] buttons = new JButton[SIZE][SIZE];

        setLayout(new GridLayout(SIZE, SIZE));
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                JButton button = new JButton();
                buttons[i][j] = button;
                button.setText("\u003f");
                int ii = i;
                int jj = j;
                button.addActionListener(actionEvent -> {
                    if (!isAlive) return;
                    if (bombs[ii][jj]) {
                        button.setText("\u2620");
                        button.setFont(button.getFont().deriveFont(41.F));
                        button.setBackground(Color.ORANGE);
                        button.setForeground(Color.WHITE);

                        for (int k = 0; k < SIZE; k++) {
                            for (int l = 0; l < SIZE; l++) {
                                if (bombs[k][l]) {
                                    buttons[k][l].setText("\u2620");
                                    buttons[k][l].setFont(button.getFont().deriveFont(41.F));
                                    buttons[k][l].setBackground(Color.BLACK);
                                    buttons[k][l].setForeground(Color.RED);
                                }
                            }
                            isAlive = false;
                        }
                    } else if (isAlive) {
                        int counter = 0;
                        int height = buttons.length;
                        int width = buttons[0].length;
                        for (int k = ii - 1; k <= ii + 1; ++k) {
                            for (int l = jj - 1; l <= jj + 1; ++l) {
                                if (0 <= k && k < height && 0 <= l && l < width && (k != ii || l != jj)) {
                                    if (bombs[k][l])
                                        counter++;
                                }
                            }
                        }
                        button.setText(counter + "");
                        button.setFont(button.getFont().deriveFont(20.F));
                        button.setBackground(Color.GREEN);
                        button.setForeground(Color.white);
                    }
                });
                add(button);
            }
        }
        setVisible(true);
    }
}

