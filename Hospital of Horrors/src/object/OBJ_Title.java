package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Title extends SuperObject{

    GamePanel gp;
    
    public OBJ_Title(GamePanel gp) {

        name = "Title";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/title.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}