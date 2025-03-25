package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_WaterSymbol3 extends SuperObject{

    GamePanel gp;
    
    public OBJ_WaterSymbol3(GamePanel gp) {

        name = "Water Symbol3";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/waterkidneysymbol3.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}