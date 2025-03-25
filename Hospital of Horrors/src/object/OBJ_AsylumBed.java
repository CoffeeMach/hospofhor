package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_AsylumBed extends SuperObject{

    GamePanel gp;
    
    public OBJ_AsylumBed(GamePanel gp) {

        name = "Asylum Bed";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/asylum_bed.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    
        collision = true;
    }
}
