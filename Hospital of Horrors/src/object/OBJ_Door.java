package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Door extends SuperObject{


    GamePanel gp;
    
    public OBJ_Door(GamePanel gp) {

        name = "Door";
        try {
            shifted = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/open_door.png"));
            original = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/door.png"));

            image = original;

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }

        collision = true;
    }
}