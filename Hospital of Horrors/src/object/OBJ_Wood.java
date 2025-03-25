package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Wood extends SuperObject{

    GamePanel gp;
    
    public OBJ_Wood(GamePanel gp) {

        name = "Wood";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/wood.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}