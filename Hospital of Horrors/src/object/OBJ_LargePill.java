package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_LargePill extends SuperObject{

    GamePanel gp;
    
    public OBJ_LargePill(GamePanel gp) {

        name = "Large Pill";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/largepill.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}