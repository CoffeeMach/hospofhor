package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Injection extends SuperObject{

    GamePanel gp;
    
    public OBJ_Injection(GamePanel gp) {

        name = "Injection";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/injection.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}