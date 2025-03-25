package object;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Intercom extends SuperObject{

    GamePanel gp;
    
    public OBJ_Intercom(GamePanel gp) {

        name = "Intercom";
        try {
            images = new BufferedImage[]{
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/intercom.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/intercom2.png"))
            };

            shifted = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/intercom.png"));
            
            image = images[0];
            
            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
