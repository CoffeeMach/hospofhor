package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Doll extends SuperObject{

    GamePanel gp;
    
    public OBJ_Doll(GamePanel gp) {

        name = "Doll";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/doll.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
