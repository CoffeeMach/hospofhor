package entity;

import java.awt.Rectangle;

import main.GamePanel;

public class NPC_GingerPatient extends Entity{

    public static boolean hasDynamite = false;
    public static boolean hasHeart = false;
    public static boolean hasObj = false;
    public static boolean hasSpokenFirst = false;

    public NPC_GingerPatient(GamePanel gp) {

        super(gp);

        direction = "front";

        solidArea = new Rectangle();
        solidArea.x = 0; //15
        solidArea.y = 0; //21
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        solidArea.width = 64; //2
        solidArea.height = 64; //10

        getImage();
        setDialogue();
    }

    public void getImage() {

        front1 = setUp("res/npc/Ginger_Front_1");
        front2 = setUp("res/npc/Ginger_Front_2");

    }

    public void setDialogue() {

        /* dialogue[0] = "şşşş... sessiz ol, dinliyorlar! Demek uyanıksın... ben\n" +  
                      "de öyle düşünüyordum... bana kalpsiz diyorlar. Bunu\n" +
                      "sana daha veremem. Sahi, kalbim nerede benim?";

        dialogue[1] = "Bu dinamiti kullanınca bağırma, bağırmandan zevk\n" +
                      "alacaklar.";

        dialogue[2] = "Onlar seni izliyorlar... gözlerini kırpmadan."; */

        dialogue[0] = "Hush child... be quiet, It listens! So you think you\n" +  
                      "are awake... They call me heartless! But that's not\n" +
                      "my fault! WHERE'S MY HEART?!";

        dialogue[1] = "Do not show pain when you use this... It will only\n" +
                      "feel joy.";

        dialogue[2] = "It watches you... without a blink.";

    }

    public void setAction() {

        super.setAction();
    }

    public void speak() {  //DO CHARACTER SPECIFIC STUFF

        super.hasMissionObj = hasHeart;

        if(hasHeart == true) {

            gp.player.hasHeart = 0;
            hasObj = true;
            gp.player.hasLexapro = true;
        }

        if(!hasMissionObj) {

            hasSpokenFirst = true;
            gp.playSE(14);
        }
            
        super.speak();
    }
}