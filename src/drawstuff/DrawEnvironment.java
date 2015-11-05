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
class DrawEnvironment extends Environment {

    public DrawEnvironment() {
        logo = ResourceTools.loadImageFromResource("drawstuff/windows_logo.png");
        this.setBackground(Color.blue);

    }
    Image logo = null;

    @Override
    public void initializeEnvironment() {

    }

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
        graphics.setColor(new Color(205, 133, 63));
        graphics.fillOval(110, 230, 300, 300);
        graphics.setColor(new Color(255, 255, 255));
        graphics.fillOval(300, 230, 300, 300);

//        graphics.fillOval(30, 500, 600, 600);
//        
//        graphics.drawRect(30, 60, 200, 100);
//        graphics.setColor(new Color(205, 133, 63));
        graphics.setColor(Color.black);
        graphics.setFont(new Font("Calibri", Font.ITALIC, 55));
        graphics.drawString("Don't mess with me, I can't spell", 30, 40);

        if (logo != null) {
            graphics.drawImage(logo, 100, 100, 300, 300, this);
        }
    }

}
