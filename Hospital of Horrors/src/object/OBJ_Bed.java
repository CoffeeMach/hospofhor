package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Bed extends SuperObject{

    GamePanel gp;
    
    public OBJ_Bed(GamePanel gp) {

        name = "Bed";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/left_bed.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
        
        collision = true;
    }
}
