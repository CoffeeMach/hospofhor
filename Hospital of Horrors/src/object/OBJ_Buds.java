package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Buds extends SuperObject{

    GamePanel gp;
    
    public OBJ_Buds(GamePanel gp) {

        name = "Buds";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/buds.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
