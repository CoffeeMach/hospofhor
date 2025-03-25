package object;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Key extends SuperObject{

    GamePanel gp;
    
    public OBJ_Key(GamePanel gp) {

        this.gp = gp;

        name = "Key";
        try {
            images = new BufferedImage[]{
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/key2.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/key3.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/key2.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/key3.png"))
            };

            image = images[0];

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}