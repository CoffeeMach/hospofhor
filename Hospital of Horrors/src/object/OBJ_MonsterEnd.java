package object;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_MonsterEnd extends SuperObject{

    GamePanel gp;
    
    public OBJ_MonsterEnd(GamePanel gp) {

        this.gp = gp;

        name = "Monster End";
        try {
            images = new BufferedImage[]{
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/one.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/onequarter.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/onehalf.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/two.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/three.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/four.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/five.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/six.png"))
            };

            image = images[5];

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}