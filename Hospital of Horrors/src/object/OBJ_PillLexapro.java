package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_PillLexapro extends SuperObject{

    GamePanel gp;
    
    public OBJ_PillLexapro(GamePanel gp) {

        name = "Lexapro";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/objects/lexapro.png"));

            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}