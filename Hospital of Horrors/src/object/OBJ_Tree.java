package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Tree extends SuperObject{

    GamePanel gp;
    
    public OBJ_Tree(GamePanel gp) {

        name = "Tree";
        try {
            shifted = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/tree_no_leaf.png"));
            original = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/tree.png"));

            image = original;

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
