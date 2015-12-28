package howToDraw;

import javax.swing.*;
import java.awt.*;


public class HowToDraw extends JPanel {


    public HowToDraw(){

        JFrame frame = new JFrame("DAY");
        frame.setLocation(750,150);
        frame.setMinimumSize(new Dimension(600, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = frame.getContentPane();


        JLabel jL = new JLabel("Label1");
        jL.setFont(new Font("Serif",Font.BOLD,14));
        container.add(jL,BorderLayout.PAGE_START);
        container.add(this, BorderLayout.CENTER);


        frame.pack();;
        frame.setVisible(true);
        repaint();

    }

    public static void main(String[] args) throws Exception {
        new HowToDraw();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(0, 0, 150, 150);

    }



}
