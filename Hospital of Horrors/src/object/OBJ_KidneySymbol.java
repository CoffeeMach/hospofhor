package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_KidneySymbol extends SuperObject{

    GamePanel gp;
    
    public OBJ_KidneySymbol(GamePanel gp) {

        name = "Kidney Symbol";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/kidneysymbol.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}