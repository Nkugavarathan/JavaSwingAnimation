import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {
    final int panelWidth=800;
    final int panelHeight=800;
    Image sun;
    Image cloud;
    Timer timer;
    int xVelocity=3;// how many pixel image move on x axis
    int yVelocity=1;
    int x=0;
    int y=0;

MyPanel(){
        this.setPreferredSize(new Dimension(panelWidth,panelHeight));
        this.setBackground(Color.WHITE);

        sun=new ImageIcon("E:\\java\\Java2024\\JavaSwing - Bro code\\Animation\\src\\sun.png").getImage();
        cloud=new ImageIcon("E:\\java\\Java2024\\JavaSwing - Bro code\\_2DGraphis\\src\\cloud.jpg").getImage();
        timer=new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            // move horizontal
                if(x>=panelWidth-sun.getWidth(null) || x<0){
                    xVelocity=xVelocity*-1;
                }
                x=x+xVelocity;
                repaint();

                // move vertically
                if(y>=panelHeight-sun.getHeight(null) || y<0){
                    yVelocity=yVelocity*-1;
                }
                y=y+yVelocity;
                repaint();
            }
        });
    timer.start();


    }
    public void paint(Graphics g){
    super.paint(g);
    Graphics2D g2d=(Graphics2D) g ;
    g2d.drawImage(cloud,0,0,null);
    g2d.drawImage(sun,x,y,null);
    }
}
