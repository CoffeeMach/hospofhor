package object;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Sink extends SuperObject{

    GamePanel gp;
    
    public OBJ_Sink(GamePanel gp) {

        name = "Sink";
        try {
            images = new BufferedImage[]{
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/sink.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/sink2.png"))
            };
            
            image = images[0];

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}