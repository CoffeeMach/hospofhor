package object;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Food extends SuperObject{

    GamePanel gp;
    
    public OBJ_Food(GamePanel gp) {

        name = "Food";
        try {
            images = new BufferedImage[]{
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/food1.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/food2.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/food3.png"))
            };
            
            image = images[0];  // Start with the first image

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
