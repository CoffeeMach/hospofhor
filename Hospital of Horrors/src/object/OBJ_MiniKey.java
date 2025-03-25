package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_MiniKey extends SuperObject{

    GamePanel gp;
    
    public OBJ_MiniKey(GamePanel gp) {

        this.gp = gp;

        name = "Mini Key";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/mini_key.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}