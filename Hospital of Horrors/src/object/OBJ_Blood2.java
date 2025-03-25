package object;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Blood2 extends SuperObject{

    GamePanel gp;
    
    public OBJ_Blood2(GamePanel gp) {

        name = "Blood2";
        try {
            images = new BufferedImage[]{
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/bloody_tile23.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/bloody_tile24.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/bloody_tile2.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/bloody_tile22.png"))
            };

            shifted = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/bloody_tile2_smeared.png"));
            
            image = images[0];

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
