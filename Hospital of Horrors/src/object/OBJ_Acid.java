package object;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Acid extends SuperObject{

    GamePanel gp;
    
    public OBJ_Acid(GamePanel gp) {

        this.gp = gp;

        name = "Acid";
        try {
            images = new BufferedImage[]{
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/acid.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/acid2.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/acid3.png"))
            };
            
            shifted = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/acid_spilled.png"));

            image = images[0];

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}