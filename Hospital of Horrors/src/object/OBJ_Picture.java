package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Picture extends SuperObject{

    GamePanel gp;
    
    public OBJ_Picture(GamePanel gp) {

        name = "Picture";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/picture.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
