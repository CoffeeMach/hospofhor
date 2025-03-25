package object;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Blood extends SuperObject{

    GamePanel gp;
    
    public OBJ_Blood(GamePanel gp) {

        name = "Blood";
        try {
            images = new BufferedImage[]{
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/b.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/bb.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/bbb.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/bbbb.png"))
            };

            shifted = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/bloody_tile1_smeared.png"));

            image = images[0];

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
