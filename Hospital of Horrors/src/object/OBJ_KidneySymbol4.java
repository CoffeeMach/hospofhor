package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_KidneySymbol4 extends SuperObject{

    GamePanel gp;
    
    public OBJ_KidneySymbol4(GamePanel gp) {

        name = "Kidney Symbol4";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/kidneysymbol4.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}