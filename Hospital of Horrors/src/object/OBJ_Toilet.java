package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Toilet extends SuperObject{

    GamePanel gp;
    
    public OBJ_Toilet(GamePanel gp) {

        name = "Toilet";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/toilet.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }

        collision = true;
    }
}