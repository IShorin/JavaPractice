package ru.IShorin.JavaPractice.laba27;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

 class GameController implements KeyListener, ActionListener {
    private GameView gameView;
    private Timer mainTimer;
    private Snake snake;

    public GameController() {
        snake = new Snake();
        gameView = new GameView(this);
        this.gameView.addKeyListener(this);
        this.mainTimer = new Timer(50, this);
        mainTimer.start();
    }

    public void stopGame() {
        mainTimer.stop();
    }

    public void startGame() {
        mainTimer.start();
    }

    public void keyPressed(KeyEvent e) {
        snake.onMove(e.getKeyCode());
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        gameView.moveForward();
    }

    public Snake getSnake() {
        return snake;
    }
}