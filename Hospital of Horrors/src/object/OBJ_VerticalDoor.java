package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_VerticalDoor extends SuperObject{

    GamePanel gp;
    
    public OBJ_VerticalDoor(GamePanel gp) {

        name = "Vertical Door";
        try {
            shifted = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/open_vertical_door.png"));
            original = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/closed_vertical_door.png"));

            image = original;

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }

        collision = true;
    }
}
