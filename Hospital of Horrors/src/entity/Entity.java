package entity;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;
import main.UtilityTool;

public class Entity {

    GamePanel gp;

    public int worldX;
    public int worldY;
    public static int speed;
    public int NPCspeed;

    public BufferedImage front1, front2, back1, back2, left1, left2, right1, right2;
    public String direction;

    public int spriteCounter = 0;
    public int spriteNum = 1;

    public Rectangle solidArea = new Rectangle(30, 42, 4, 20);  //can be overridden inside classes
    public int solidAreaDefaultX, solidAreaDefaultY;
    public boolean collisionOn = false;

    public int actionLockCounter = 0;

    public int dialogueIndex = 0;
    public boolean hasMissionObj = false;
    public boolean hasSpoken = false;

    String dialogue[] = new String[4];

    public Entity(GamePanel gp) {

        this.gp = gp;
    }

    public void setAction() {

        spriteCounter++;
        if(spriteCounter > 20) {
            if(spriteNum == 1) {
                spriteNum = 2;
            }
            else if(spriteNum == 2) {
                spriteNum = 1;
            }
            spriteCounter = 0;
        }
    }

    public void speak() {

        if(!hasMissionObj) {
            dialogueIndex = 0;
            gp.ui.currentDialogue = dialogue[dialogueIndex];
            hasSpoken = true;

        } else if (hasMissionObj && hasSpoken) {

            if(dialogueIndex == 0) {
                dialogueIndex = 1;
                gp.playSE(5);
            }

            if(dialogue[dialogueIndex] == null) {
                dialogueIndex = 2;
            }
            
            gp.ui.currentDialogue = dialogue[dialogueIndex];
            dialogueIndex++;
        }
    }

    public void update() {

        collisionOn = false;
        gp.cChecker.checkTile(this);
        gp.cChecker.checkObject(this, false);
        gp.cChecker.checkPlayer(this);

        setAction();
    }

    public void draw(Graphics2D g2) {

        BufferedImage image = null;

        int screenX = worldX - gp.player.worldX + gp.player.screenX;
        int screenY = worldY - gp.player.worldY + gp.player.screenY;

        if(worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
           worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
           worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
           worldY - gp.tileSize < gp.player.worldY + gp.player.screenY) {

            switch(direction) {
                case "front":
                    if(spriteNum == 1) {
                        image = front1;
                    }
                    if(spriteNum == 2) {
                        image = front2;
                    }
                    break;
                }
                    
            g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);
        }
    }

    public BufferedImage setUp(String imagePath) {

        UtilityTool uTool =  new UtilityTool();
        BufferedImage image = null;

        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream(imagePath + ".png"));
            image = uTool.scaleImage(image, gp.tileSize, gp.tileSize);

        }catch(IOException e) {

            e.printStackTrace();
        }

        return image;
    }
}