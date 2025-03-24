package AppletJava;

import java.applet.Applet;
import java.awt.*;
/* Note==============================================This tuns in Java 7 only
<applet code="Welcome.class" width="200" height="300">
</applet>*/
public class Welcome extends Applet {

    @Override
    public void print(Graphics g) {
        g.drawString("I am Applet",20,100);
    }
}
