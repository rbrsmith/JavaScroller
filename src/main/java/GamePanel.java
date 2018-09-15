import jdk.nashorn.internal.runtime.ECMAException;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePanel extends JPanel implements Runnable {

    private static final long serialVersionUID = 1L;
    /** The screen WIDTH of the drawing panel */
    public static final int WIDTH = 640;
    /** The screen HEIGHT of the drawing panel */
    public static final int HEIGHT = 480;
    /** The game thread that represents our game loop */
    private Thread thread;
    /** A boolean value indicating that our game is running */
    private boolean running;
    /** The number of frames per second we want the game to run in */
    private int FPS = 120;
    /** The time slice that should elapse before we update the screen */
    private long targetTime = 1000/FPS;

    public GamePanel() {
        super();
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setFocusable(true);
        requestFocus();

        addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent e) {}

            public void keyReleased(KeyEvent e) {}

            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                if(e.getKeyCode() == 81) {
                    closeWindow();
                }
            }
        });

    }

    private void closeWindow() {
        System.exit(0);
    }

    public void addNotify() {
        super.addNotify();
        if(thread == null) {
            thread = new Thread(this);
            thread.start();

        }
        running = true;
    }

    public void init() {
    }

    public void update() {
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Toolkit.getDefaultToolkit().sync();
    }


    public void run() {

        init();
    }

}