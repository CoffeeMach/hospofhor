package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Bin extends SuperObject{

    GamePanel gp;
    
    public OBJ_Bin(GamePanel gp) {

        name = "Bin";
        try {
            shifted = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/bin_empty.png"));
            original = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/bin.png"));

            image = original;

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
