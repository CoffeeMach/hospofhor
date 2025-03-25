package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_HeartSymbol extends SuperObject{

    GamePanel gp;
    
    public OBJ_HeartSymbol(GamePanel gp) {

        this.gp = gp;

        name = "Heart Symbol";
        try {

            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/heart_symbol.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
