package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_PillPaxil extends SuperObject{

    GamePanel gp;
    
    public OBJ_PillPaxil(GamePanel gp) {

        name = "Paxil";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/paxil.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}