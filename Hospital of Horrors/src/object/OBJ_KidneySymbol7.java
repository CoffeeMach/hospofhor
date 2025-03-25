package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_KidneySymbol7 extends SuperObject{

    GamePanel gp;
    
    public OBJ_KidneySymbol7(GamePanel gp) {

        name = "Kidney Symbol7";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/kidneysymbol7.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}