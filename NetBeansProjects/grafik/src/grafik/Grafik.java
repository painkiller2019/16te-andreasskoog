/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafik;

/**
 *
 * @author andreas.skoog
 */
import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Grafik extends JPanel {

    private int width = 100;
    private int height = 100;
    private int d = 50;
    private int x = 0;
    private int y = 0;

    private void moveBall() {
        x += 1;
        y += 1;
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, d, d);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Grafik grafik = new Grafik();

        frame.setSize(700, 800);//x, y
        frame.setLocation(300, 300);
        frame.setTitle("Mitt första grafiska prodjekt");
        frame.setDefaultCloseOperation(3);
        frame.add(grafik);
        frame.setResizable(true);
        frame.setVisible(true);

        while (true) {
            grafik.moveBall();
            grafik.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Grafik.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
