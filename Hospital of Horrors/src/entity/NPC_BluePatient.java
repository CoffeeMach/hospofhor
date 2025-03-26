package entity;

import java.awt.Rectangle;

import main.GamePanel;

public class NPC_BluePatient extends Entity{

    public static boolean hasCalender = false;
    public static boolean hasObj = false;
    public static boolean hasSpokenFirst = false;

    public NPC_BluePatient(GamePanel gp) {

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

        front1 = setUp("res/npc/Blue_Front_1");
        front2 = setUp("res/npc/Blue_Front_2");

    }

    public void setDialogue() {

        /* dialogue[0] = "Aynaya bu kadar uzun bakmamalısın. Bugün uyandığına\n" +  
                      "emin misin? Günlerden ne? Ne zamandır buradayım..?\n" +
                      "Lütfen... bana yardım etmek zorundasın.";

        dialogue[1] = "Nasıl teşekkür edeceğim..? Al, bu oyuncak senin...\n" +
                      "aslında hep senindi, hep senin olacak.";

        dialogue[2] = "Hadi, yoluna devam et..."; */

        dialogue[0] = "You ought not look at the mirror this long. Are\n" +  
                      "you certain this is not a dream? What day is it?\n" +
                      "How long have I been here? Please, you must help.";

        dialogue[1] = "There doesn't seem much hope left for me after\n" +
                      "this much time... Take this doll, it helped me\n" +
                      "before, now it will help you...";

        dialogue[2] = "Go on, don't worry about me...";

    }

    public void setAction() {

        super.setAction();
    }

    public void speak() {  //DO CHARACTER SPECIFIC STUFF

        super.hasMissionObj = hasCalender;

        if(hasCalender == true) {
            
            gp.player.hasCal = 0;
            hasObj = true;
            gp.player.hasDoll = true;
        }

        if(!hasMissionObj) {

            hasSpokenFirst = true;
            gp.playSE(19);
        }

        super.speak();
    }
}