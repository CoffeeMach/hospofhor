package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_LargePillZoloft extends SuperObject{

    GamePanel gp;
    
    public OBJ_LargePillZoloft(GamePanel gp) {

        name = "Large Zoloft";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/largezoloft.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}