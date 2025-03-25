package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_EyeSymbol extends SuperObject{

    GamePanel gp;
    
    public OBJ_EyeSymbol(GamePanel gp) {

        this.gp = gp;

        name = "Eye Symbol";
        try {

            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/eye_symbol.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
