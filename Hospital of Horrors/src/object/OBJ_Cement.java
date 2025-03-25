package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Cement extends SuperObject{

    GamePanel gp;
    
    public OBJ_Cement(GamePanel gp) {

        name = "Cement";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/cement.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
