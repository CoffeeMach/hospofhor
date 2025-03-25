package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Dooray extends SuperObject{

    GamePanel gp;
    
    public OBJ_Dooray(GamePanel gp) {

        name = "Dooray";
        try {
            shifted = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/open_dooray.png"));
            original = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/dooray.png"));

            image = original;

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }

        collision = true;
    }
}