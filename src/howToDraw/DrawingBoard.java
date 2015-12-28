package howToDraw;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    private final static String IMAGE_NAME = "red.png";
    private Image iTank;

    public DrawingBoard(){
        try {
            iTank = ImageIO.read(new File(IMAGE_NAME));

        } catch (IOException e) {
            System.err.println("Can't find image: " + IMAGE_NAME);
        }

    }

    @Override
    public void paint(Graphics g) {
        g.setColor(new Color(203, 30, 0));
        g.fillRect(0,0,800,600);


        g.setColor(new Color(86,142,204));
        g.fillRect(400, 100, 50, 50);

        g.setColor(new Color(34,174,93));
        g.fill3DRect(400, 200, 49, 49, true);

        g.setColor(new Color(255,255,255));
        g.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 32));
        g.drawString("I love ...", 20, 50);

        g.drawImage(iTank, 100, 500, new ImageObserver() {
            @Override
            public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
                return false;
            }
        });


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("I can drew text!!!");
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setLocation(300,100);
        frame.getContentPane().add(new DrawingBoard());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setVisible(true);
    }
}
