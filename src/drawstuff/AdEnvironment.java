/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Colin
 */
public class AdEnvironment extends Environment {

    public AdEnvironment() {
        logo = ResourceTools.loadImageFromResource("drawstuff/windows_logo.png");
        this.setBackground(new Color(0, 102, 204));
    }

    @Override
    public void initializeEnvironment() {

    }
    Image logo = null;

    @Override
    public void timerTaskHandler() {

    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        //        graphics.fillOval(30, 30, 300, 300);
//        graphics.setColor(Color.red);
//        graphics.fillOval(200, 30, 300, 300);
//        graphics.setColor(Color.blue);
//        graphics.fillOval(300, 30, 300, 300);
        graphics.setColor(new Color(255, 0, 0, 175));
        graphics.fillOval(110, 230, 200, 200);
        graphics.setColor(new Color(75, 222, 255, 200));
        graphics.fillOval(250, 200, 100, 100);
        graphics.setColor(new Color(255, 255, 0, 255));
        graphics.fillOval(500, 300, 150, 150);
        graphics.setColor(new Color(176, 196, 222, 230));
        graphics.fillOval(525, 390, 75, 75);
        graphics.setColor(new Color(0, 0, 0, 170));
        graphics.fillOval(550, 420, 90, 90);
        graphics.setColor(new Color(124, 252, 0, 100));
        graphics.fillRect(300, 500, 120, 120);
        graphics.setColor(new Color(0, 255, 255, 200));
        graphics.fillRect(360, 490, 120, 100);

//        graphics.fillOval(30, 500, 600, 600);
//        
//        graphics.drawRect(30, 60, 200, 100);
//        graphics.setColor(new Color(205, 133, 63));
        graphics.setColor(new Color(124, 252, 0, 200));
        graphics.setFont(new Font("TimesRoman", Font.BOLD, 32));
        graphics.drawString("Windows won't lighten your wallet", 185, 150);

        if (logo != null) {
            graphics.drawImage(logo, 280, 150, 300, 300, this);
        }
    }
}
//        graphics.setColor(new Color(,));
//        graphics.fillOval(WIDTH, WIDTH, WIDTH, WIDTH);
