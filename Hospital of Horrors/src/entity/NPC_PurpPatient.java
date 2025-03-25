package entity;

import java.awt.Rectangle;

import main.GamePanel;

public class NPC_PurpPatient extends Entity{
    
    public static boolean hasEye = false;
    public static boolean hasObj = false;
    public static boolean hasSpokenFirst = false;

    public NPC_PurpPatient(GamePanel gp) {

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

        front1 = setUp("res/npc/Purp_Front_1");
        front2 = setUp("res/npc/Purp_Front_2");

    }

    public void setDialogue() {

        /* dialogue[0] = "Bir zamanlar bir ismim vardı, belki artık senindir...\n" +  
                      "Kaçsan iyi olur, ya da belki olmaz... Gözlerini bana\n" +  
                      "ödünç vermeye ne dersin küçük hanım?";  

        dialogue[1] = "Bunu enjektörü sana verirsem benim için buraya geri\n" +  
                      "döneceğine söz verir misin? Kimse geri dönmüyor...";  

        dialogue[2] = "Sen de kaçmalısın, hala vakit varken..."; */

        dialogue[0] = "I used to have a name, now I don't even remember my\n" +
                      "face. You better run before you lose yours. What\n" +
                      "do you say you lend your eyes to me, little child?..";

        dialogue[1] = "I will give you this syringe, but promise me you'll\n" +
                      "be back. No one ever keeps promises here, or lives\n" +
                      "up to it";

        dialogue[2] = "You need to go, while you still can...";

    }

    public void setAction() {

        super.setAction();
    }

    public void speak() {  //DO CHARACTER SPECIFIC STUFF

        super.hasMissionObj = hasEye;

        if(hasEye == true) {
            
            gp.player.hasEye = 0;
            hasObj = true;
        }

        if(!hasMissionObj) {

            hasSpokenFirst = true;
            gp.playSE(20);
        }

        super.speak();
    }
}