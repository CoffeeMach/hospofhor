package object;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Brain extends SuperObject{

    GamePanel gp;
    
    public OBJ_Brain(GamePanel gp) {

        name = "Brain";
        try {
            images = new BufferedImage[]{
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/brain.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/brain2.png"))
            };
            
            shifted = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/brain_empty.png"));

            image = images[0];

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
