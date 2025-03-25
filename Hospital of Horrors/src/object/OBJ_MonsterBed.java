package object;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_MonsterBed extends SuperObject{

    GamePanel gp;
    
    public OBJ_MonsterBed(GamePanel gp) {

        this.gp = gp;

        name = "Monster Bed";
        try {
            images = new BufferedImage[]{
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/monster_bed.png")),
                ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/monster_bed2.png"))
            };

            shifted = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/asylum_bed.png"));

            image = images[0];

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }

        collision = true;
    }
}