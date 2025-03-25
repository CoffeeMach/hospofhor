package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_End extends SuperObject{

    GamePanel gp;
    
    public OBJ_End(GamePanel gp) {

        name = "End";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/end.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}