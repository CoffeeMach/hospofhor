package object;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Eye extends SuperObject{

    GamePanel gp;
    
    public OBJ_Eye(GamePanel gp) {

        name = "Eye";
        try {
            images = new BufferedImage[]{
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/eye.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/eye2.png"))
            };
            
            shifted = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/eye_empty.png"));
            
            image = images[0];

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
