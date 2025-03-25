package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_WaterSymbol4 extends SuperObject{

    GamePanel gp;
    
    public OBJ_WaterSymbol4(GamePanel gp) {

        name = "Water Symbol4";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/waterkidneysymbol4.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}