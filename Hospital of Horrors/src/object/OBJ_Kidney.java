package object;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Kidney extends SuperObject{

    GamePanel gp;
    
    public OBJ_Kidney(GamePanel gp) {

        this.gp = gp;

        name = "Kidney";
        try {
            images = new BufferedImage[]{
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/kidney.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/kidney2.png"))
            };
            
            shifted = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/emptied_jar.png"));
            
            image = images[0];

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
