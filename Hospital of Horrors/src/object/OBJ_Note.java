package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Note extends SuperObject{

    GamePanel gp;
    
    public OBJ_Note(GamePanel gp) {

        name = "Note";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/largeMemo.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}