import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class FaceApplet extends Applet implements ActionListener
{
    Button funnyBtn, sadBtn;
    String faceType = "";

    public void init()
    {
        funnyBtn = new Button("Funny Face");
        sadBtn = new Button("Sad Face");

        add(funnyBtn);
        add(sadBtn);

        funnyBtn.addActionListener(this);
        sadBtn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == funnyBtn)
            faceType = "funny";
        else if(e.getSource() == sadBtn)
            faceType = "sad";

        repaint();
    }

    public void paint(Graphics g)
    {
        
        g.drawOval(50, 80, 200, 200); 

        if(faceType.equals("funny"))
        {
            g.fillOval(95, 140, 20, 20);
            g.fillOval(185, 140, 20, 20);
            g.drawArc(110, 160, 80, 60, 0, -180);
        }
        else if(faceType.equals("sad"))
        {
            g.fillOval(95, 140, 20, 20);
            g.fillOval(185, 140, 20, 20);
            g.drawArc(110, 180, 80, 60, 0, 180);
        }
    }
}

/*
<html>
<body>
<applet code="FaceApplet.class" codebase="." width="400" height="400">
</applet>
</body>
</html>
*/
