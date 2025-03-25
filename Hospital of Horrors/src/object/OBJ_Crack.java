package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Crack extends SuperObject{

    GamePanel gp;
    
    public OBJ_Crack(GamePanel gp) {

        name = "Crack";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/crack.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
