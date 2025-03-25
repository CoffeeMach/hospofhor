package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_RightBed extends SuperObject{

    GamePanel gp;
    
    public OBJ_RightBed(GamePanel gp) {

        name = "Right Bed";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/right_bed.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
        
        collision = true;
    }
}
