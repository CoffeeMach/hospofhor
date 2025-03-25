package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_CementSpilled extends SuperObject{

    GamePanel gp;
    
    public OBJ_CementSpilled(GamePanel gp) {

        name = "Cement Spilled";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/cement_spilled.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
