
package moving_image;






  

import javax.swing.JComponent;

import javax.swing.JPanel;

import javax.swing.ImageIcon;

import java.awt.Graphics;

import java.awt.Color;

public class Container extends JComponent 
{
     static JPanel panel;
    
     static int column = 3;
     
     static int row = 195;
     
     static int number = 1;
    
  Container(JPanel panel)
  {
      this.panel = panel;
      
      setBounds(0, 0,panel.getWidth() , panel.getHeight());
         
  }
    
  public void paint(Graphics g)
  {
    ImageIcon image =new ImageIcon(new ImageIcon(getClass().getResource("images/"+number+".png")).getImage());
       
     g.drawImage(image.getImage(), column, row, 206, 356, null); 
     
       g.setColor(Color.WHITE);
       
       g.fillOval(35,40 ,100, 30);
       g.fillOval(70,45 ,150, 50);
       g.fillOval(160,55 ,100, 30);
       g.fillOval(320,45 ,100, 25);
       g.fillOval(340,40 ,100, 25);
       g.fillOval(700,40 ,100, 30);
       g.fillOval(780,40 ,100, 30);
       g.fillOval(610,50 ,150, 30);
       
       g.setColor(Color.YELLOW);
       
       g.fillOval(480,30 ,80,80);
       
       }
  
  static Thread thread  = new Thread()
    {
       @Override
        public void run()
        {
            try
            {
                while(true)
                {
                  number++;
                  
                  if(number==8)
                  {
                    number=1;
                  }
                  
                 panel.repaint();  
                 
                 column+=10;
                 
                  thread .sleep(100);
                }
                
            } catch (java.lang.InterruptedException ex) {
                                                           System.out.println(ex.getMessage()); 
                                                         }
        }
    };
   
   public static void move()
  {
     if(!thread .isAlive())
    {
      thread .start();
    }
      column = 3;
    }
}












    
    