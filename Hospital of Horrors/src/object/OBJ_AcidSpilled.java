package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_AcidSpilled extends SuperObject{

    GamePanel gp;
    
    public OBJ_AcidSpilled(GamePanel gp) {

        name = "Acid Spilled";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/acid_spilled.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}