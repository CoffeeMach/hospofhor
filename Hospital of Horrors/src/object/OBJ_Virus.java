package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Virus extends SuperObject{

    GamePanel gp;
    
    public OBJ_Virus(GamePanel gp) {

        this.gp = gp;

        name = "Virus";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/virus.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}