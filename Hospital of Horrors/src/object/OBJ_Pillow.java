package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Pillow extends SuperObject{

    GamePanel gp;
    
    public OBJ_Pillow(GamePanel gp) {

        name = "Pillow";
        try {
            shifted = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/pillow_empty.png"));
            original = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/pillow.png"));

            image = original;

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}