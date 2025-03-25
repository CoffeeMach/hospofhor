package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_KidneySymbol8 extends SuperObject{

    GamePanel gp;
    
    public OBJ_KidneySymbol8(GamePanel gp) {

        name = "Kidney Symbol8";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/kidneysymbol8.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}