package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Jar extends SuperObject{

    GamePanel gp;
    
    public OBJ_Jar(GamePanel gp) {

        name = "Jar";
        try {
            shifted = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/emptied_jar.png"));
            original = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/empty_jar.png"));

            image = original;

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
