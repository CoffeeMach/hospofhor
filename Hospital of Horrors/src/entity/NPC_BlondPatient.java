package entity;

import java.awt.Rectangle;

import main.GamePanel;

public class NPC_BlondPatient extends Entity{

    public static boolean hasFood = false;
    public static boolean hasObj = false;
    public static boolean hasSpokenFirst = false;

    public NPC_BlondPatient(GamePanel gp) {

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

        front1 = setUp("res/npc/Blond_Front1");
        front2 = setUp("res/npc/Blond_Front2");

    }

    public void setDialogue() {

        /* dialogue[0] = "Kaybolmuş gibisin. Ya da belki... yolunu mu şaşırdın?\n" +  
                      "Sana yardım edebilirim, ama bana güveniyor musun?\n" +  
                      "En son ne zaman yemek yediğimi hatırlamıyorum...";

        dialogue[1] = "Mmmm... fena değildi. Bu hapı sana veriyorum, ama\n" +
                      "seni değiştirmesine asla izin verme.";

        dialogue[2] = "Neden durdun? Git. Burada durmak, nefes almak bile\n" +  
                      "yanlış. Ya ilerlersin... ya da O seni yakalar."; */

        dialogue[0] = "You look lost. Have you lost your way, or your\n" +  
                      "mind? I could help you, but do I have your trust?\n" +  
                      "I can't remember the last time I ate... so hungry...";

        dialogue[1] = "Alright, not bad for a hospital meal. This pill is\n" +
                      "yours. Remember, never let it change you...";

        dialogue[2] = "Why are you back? Leave. Either you leave now,\n" +  
                      "or It catches you.";
    }

    public void setAction() {

        super.setAction();
    }

    public void speak() {  //DO CHARACTER SPECIFIC STUFF

        super.hasMissionObj = hasFood;

        //super.hasSpoken = hasSpokenFirst;

        if(hasFood == true) {
            
            gp.player.hasFood = 0;
            hasObj = true;
            gp.player.hasPill = true;
        }

        if(!hasMissionObj) {

            hasSpokenFirst = true;
            gp.playSE(14);
        }

        super.speak();
    }
}