package object;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Blood3 extends SuperObject{

    GamePanel gp;
    
    public OBJ_Blood3(GamePanel gp) {

        name = "Blood3";
        try {
            images = new BufferedImage[]{
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/bloody_tile34.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/bloody_tile3.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/bloody_tile32.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/bloody_tile33.png"))
            };
            
            shifted = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/bloody_tile3_smeared.png"));

            image = images[0];

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}