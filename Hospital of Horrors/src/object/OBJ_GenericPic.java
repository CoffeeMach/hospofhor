package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_GenericPic extends SuperObject{

    GamePanel gp;
    
    public OBJ_GenericPic(GamePanel gp) {

        name = "Generic Pic";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/genericpic.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}