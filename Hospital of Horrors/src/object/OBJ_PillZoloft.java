package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_PillZoloft extends SuperObject{

    GamePanel gp;
    
    public OBJ_PillZoloft(GamePanel gp) {

        name = "Zoloft";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/zoloft.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}