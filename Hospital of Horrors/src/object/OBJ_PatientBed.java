package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_PatientBed extends SuperObject{

    GamePanel gp;
    
    public OBJ_PatientBed(GamePanel gp) {

        this.gp = gp;

        name = "Patient Bed";
        try {
            shifted = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/right_bed.png"));
            original = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/patient_bed.png"));

            image = original;

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }

        collision = true;
    }
}