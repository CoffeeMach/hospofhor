package object;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Heart extends SuperObject{

    GamePanel gp;
    
    public OBJ_Heart(GamePanel gp) {

        name = "Heart";
        try {
            images = new BufferedImage[]{
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/heart.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/heart2.png"))
            };

            shifted = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/empty_heart.png"));
            
            image = images[0];

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
