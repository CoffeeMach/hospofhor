package tile;

import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

import main.GamePanel;
import main.UtilityTool;

public class TileManager {

    GamePanel gp;
    public Tile[] tile;
    public int mapTileNum[][];
    

    public TileManager(GamePanel gp) {

        this.gp = gp;

        tile = new Tile[34];  // 33 tiles in total
        mapTileNum = new int[gp.maxWorldCol][gp.maxWorldRow];

        getTileImage();
        loadMap("res/maps/worldmap.txt");
    }

    public void getTileImage() {

        /*
        NPC,BOSS
        DO NOT STEP ON BLOOD OR YOU GET INFECTED, LOSE LIVES, FIND INJECTION TO GET CURE, SPECIAL SOLUTION TO CLEAN FLOOR
        THE MANIAC GETS PUT WITH CEMENT OR SEDATIVE OR IMAGES OF THINGS THEY ARE SCARED OF
        SET THE BUILDING ON FIRE WITH THINGS COLLECTED FROM ALL OTHER LEVELS AT THE END BEFORE JUMPING OFF
        FARELER DOLAŞSIN LABDAN KAÇAN
        HEART = LIVES
        5 water
        3 cement
        2 cures
        1 picture
        1 pill
        */

        // Bloody tiles
        setUp(0, "nonbloody_tile", false);
        setUp(1, "bottom_left_stairs", false);
        setUp(2, "bottom_right_stairs", false);
        setUp(3, "middle_left_stairs", false);
        setUp(4, "middle_right_stairs", false);

        setUp(5, "left_wall", true);
        setUp(6, "top_wall", true);
        setUp(7, "right_wall", true);
        setUp(8, "bottom_wall", true);
        setUp(9, "vertical_curtain", true);
        setUp(10, "horizontal_curtain", true);

        setUp(11, "top_left_corner", true);
        setUp(12, "top_right_corner", true);
        setUp(13, "bottom_right_corner", true);
        setUp(14, "bottom_left_corner", true);

        setUp(15, "t_wall", true);

        setUp(16, "middle_vertical_wall", true);
        setUp(17, "black", true);

        setUp(18, "asylum_floor", false);
        setUp(19, "asylum_bottom_left_corner", true);
        setUp(20, "asylum_bottom_right_corner", true);
        setUp(21, "asylum_bottom_wall", true);
        setUp(22, "asylum_left_wall", true);
        setUp(23, "asylum_right_wall", true);
        setUp(24, "asylum_top_left_wall", true);
        setUp(25, "asylum_top_right_corner", true);
        setUp(26, "asylum_top_wall", true);

        setUp(27, "curtain_right_wall", true);
        setUp(28, "curtain_left_wall", true);
        setUp(29, "curtain_corner", true);
        setUp(30, "curtain_left_corner", true);
    }

    public void setUp(int index, String imageName, boolean collision) {

        UtilityTool uTool = new UtilityTool();

        try{
            tile[index] = new Tile();
            tile[index].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/tiles/" + imageName + ".png"));
            tile[index].image = uTool.scaleImage(tile[index].image, gp.tileSize, gp.tileSize);
            tile[index].collision = collision;

        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void loadMap(String filePath) {

        try {
            InputStream is = getClass().getClassLoader().getResourceAsStream(filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            int col = 0;
            int row = 0;
            
            while(col < gp.maxWorldCol && row < gp.maxWorldRow) {

                String line = br.readLine();

                while(col < gp.maxWorldCol) {

                    String numbers[] = line.split(" ");

                    int num = Integer.parseInt(numbers[col]);

                    mapTileNum[col][row] = num;
                    col++;
                }
                if(col == gp.maxWorldCol) {
                    col = 0;
                    row++;
                }
            }
            br.close();

        }catch(Exception e) {

        }
    }

    public void draw(Graphics2D g2) {

        int worldCol = 0;
        int worldRow = 0;

        while(worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow) {

            int tileNum = mapTileNum[worldCol][worldRow];

            int worldX = worldCol * gp.tileSize;
            int worldY = worldRow * gp.tileSize;
            int screenX = worldX - gp.player.worldX + gp.player.screenX;
            int screenY = worldY - gp.player.worldY + gp.player.screenY;

            if(worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
               worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
               worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
               worldY - gp.tileSize < gp.player.worldY + gp.player.screenY) {
                        
                        g2.drawImage(tile[tileNum].image, screenX, screenY, null);
                    }
            
            worldCol++;

            if(worldCol == gp.maxWorldCol) {
                worldCol = 0;
                worldRow++;
            }
        }
    }   
}