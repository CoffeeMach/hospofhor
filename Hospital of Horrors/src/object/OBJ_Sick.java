package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Sick extends SuperObject{

    GamePanel gp;
    
    public OBJ_Sick(GamePanel gp) {

        name = "Sick";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/sick.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}