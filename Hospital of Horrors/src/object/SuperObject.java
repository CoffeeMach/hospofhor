package object;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import main.GamePanel;
import main.UtilityTool;
import entity.Player;

public class SuperObject{
    
    public BufferedImage image;

    public BufferedImage original;

    public BufferedImage shifted;

    BufferedImage[] images;
    int imageIndex = 0;
    int imageCounter = 0;
    
    public String name;
    public boolean collision = false;

    public boolean shift = false;
    public boolean executed = false;
    public static int wakeMonster = 0;
    public static int damage = 0;

    public int worldX, worldY;

    public Rectangle solidArea = new Rectangle(0,0, 64,64);
    public int solidAreaDefaultX = 0;
    public int solidAreaDefaultY = 0;

    UtilityTool uTool = new UtilityTool();

    public void updateImage() {

        if (shift && shifted != null) {
            image = shifted;
            collision = false;
        } else if (!shift && original != null) {
            image = original;
        }
    }

    public void switchImage() {
        imageCounter++;
        if (imageCounter >= 30 && image != shifted) {  // Change image every 20 frames
            imageIndex = (imageIndex + 1) % images.length;
            image = images[imageIndex];
            imageCounter = 0;
        }
    }

    public void stopDamage() {

        if(executed == false) {
            Player.speed += 1;
            damage -= 1;
        }
    }
    
    public void takeDamage() {

        if(executed == false) {
            Player.speed -= 1;
            damage += 1;
        }
    }

    public void draw(Graphics2D g2, GamePanel gp) {
        
        int screenX = worldX - gp.player.worldX + gp.player.screenX;
        int screenY = worldY - gp.player.worldY + gp.player.screenY;

        if(worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
           worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
           worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
           worldY - gp.tileSize < gp.player.worldY + gp.player.screenY) {
                    
            g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);
        }
    }
}