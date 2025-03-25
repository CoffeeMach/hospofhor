package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_LeftBedOccupied extends SuperObject{

    GamePanel gp;
    
    public OBJ_LeftBedOccupied(GamePanel gp) {

        this.gp = gp;

        name = "Left Bed Occupied";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/left_bed_occupied.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }

        collision = true;
    }
}