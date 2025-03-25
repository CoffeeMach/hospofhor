package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_FoodE extends SuperObject{

    GamePanel gp;
    
    public OBJ_FoodE(GamePanel gp) {

        this.gp = gp;

        name = "FoodE";
        try {

            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/food3.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
