package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Memo extends SuperObject{

    GamePanel gp;
    
    public OBJ_Memo(GamePanel gp) {

        name = "Memo";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/memo.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}