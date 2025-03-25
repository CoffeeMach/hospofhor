package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_KidneySymbol6 extends SuperObject{

    GamePanel gp;
    
    public OBJ_KidneySymbol6(GamePanel gp) {

        name = "Kidney Symbol6";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/kidneysymbol6.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}