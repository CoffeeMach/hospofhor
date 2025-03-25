package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Box extends SuperObject{

    GamePanel gp;
    
    public OBJ_Box(GamePanel gp) {

        name = "Box";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/box.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}