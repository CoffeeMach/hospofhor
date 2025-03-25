package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_WaterSymbol7 extends SuperObject{

    GamePanel gp;
    
    public OBJ_WaterSymbol7(GamePanel gp) {

        name = "Water Symbol7";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/waterkidneysymbol7.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}