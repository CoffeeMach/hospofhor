package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Stairs extends SuperObject{

    GamePanel gp;
    
    public OBJ_Stairs(GamePanel gp) {

        name = "Stairs";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/stairs.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
