package spotfinder;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;

public class SpotFinderPanel extends JPanel implements MouseListener {

    public static final int winDistance = 10;
    public static final int xSize = 4;

    public SpotFinderPanel() {
        spot = new Point(0, 0);
        guesses = new ArrayList<>();
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (!isWon) {
            Point p = e.getPoint();
            guesses.add(p);
            lastGuessDistance = (int) spot.distance(p);
            if (lastGuessDistance <= winDistance) {
                isWon = true;
            }
            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (isWon) {
            g.setColor(Color.green);
        } else {
            g.setColor(Color.gray);
        }
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.black);
        for (Point p : guesses) {
            g.drawLine(p.x - xSize, p.y + xSize, p.x + xSize, p.y - xSize);
            g.drawLine(p.x - xSize, p.y - xSize, p.x + xSize, p.y + xSize);
        }
        if (isWon) {
            g.drawOval(spot.x - winDistance, spot.y - winDistance, winDistance * 2, winDistance * 2);
            g.setFont(this.getFont());
            FontMetrics fM = g.getFontMetrics();
            int textWidth = fM.stringWidth("You won!");
            int x = (this.getWidth() - textWidth) / 2;
            g.drawString("You Won!", x, this.getHeight() / 2);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public void resetGame() {
        spot.x = (int) (Math.random() * this.getWidth());
        spot.y = (int) (Math.random() * this.getHeight());

        guesses.clear();
        lastGuessDistance = 0;
        isWon = false;
    }

    public int getGuessCount() {
        return guesses.size();
    }

    public int getLastGuessDistance() {
        return lastGuessDistance;
    }

    private ArrayList<Point> guesses;
    private Point spot;
    private int lastGuessDistance;
    private boolean isWon;

}
