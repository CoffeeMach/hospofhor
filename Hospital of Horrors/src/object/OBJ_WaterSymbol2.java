package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_WaterSymbol2 extends SuperObject{

    GamePanel gp;
    
    public OBJ_WaterSymbol2(GamePanel gp) {

        name = "Water Symbol2";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/waterkidneysymbol2.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}