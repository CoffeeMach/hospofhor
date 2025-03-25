package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_MiniAcid extends SuperObject{

    GamePanel gp;
    
    public OBJ_MiniAcid(GamePanel gp) {

        this.gp = gp;

        name = "Mini Acid";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/mini_acid.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}