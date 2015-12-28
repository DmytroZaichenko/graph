import javax.swing.*;
import java.awt.*;

/**
 * Created by admin on 26.12.2015.
 */
public class Windows {

    public static void main(String[] args) {
        JFrame f  = new JFrame();
        //f.setBounds(300,100,800,600);

        f.setMinimumSize(new Dimension(800, 600));
        f.setLocation(300, 100);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }

}
