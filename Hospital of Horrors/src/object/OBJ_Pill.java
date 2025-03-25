package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Pill extends SuperObject{

    GamePanel gp;
    
    public OBJ_Pill(GamePanel gp) {

        name = "Pill";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/pill.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}