package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_PillCelexa extends SuperObject{

    GamePanel gp;
    
    public OBJ_PillCelexa(GamePanel gp) {

        name = "Celexa";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/celexa.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}