package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_WaterSymbol8 extends SuperObject{

    GamePanel gp;
    
    public OBJ_WaterSymbol8(GamePanel gp) {

        name = "Water Symbol8";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/waterkidneysymbol8.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}