package entity;

import java.awt.Rectangle;

import main.GamePanel;

public class NPC_VitiligoPatient extends Entity{
    
    public static boolean hasBuds = false;
    public static boolean hasObj = false;
    public static boolean updatedKidney = false;
    public static boolean hasSpokenFirst = false;

    public NPC_VitiligoPatient(GamePanel gp) {

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

        front1 = setUp("res/npc/Vitiligo_Front_1");
        front2 = setUp("res/npc/Vitiligo_Front_2");

    }

    public void setDialogue() {

        /* dialogue[0] = "Hala... buradasın. Güzel, seni hala kullanabilirim.\n" +  
                      "Daha delirmedin, değil mi? Ateş? Titreme? ... sesler?\n" +  
                      "Sesler beni delirtiyor... ne olur kurtar beni.";  

        dialogue[1] = "ahh... sonunda... sessizlik. Bu antibakteriyelli\n" +
                      "böbrek seni yolundaki hastalıklardan koruyacak.";

        dialogue[2] = "Yoluna devam et küçük çocuk."; */

        dialogue[0] = "You're still here. Good, you can be of use to me.\n" +  
                      "You haven't gone mad yet, right? Fever? Tremors?..\n" +  
                      "voices? The voices are killing me...";  

        dialogue[1] = "Finally... silence. This disinfectant will protect\n" +
                      "you from sickness on the road. Use it wisely...";

        dialogue[2] = "Keep walking child.";

    }

    public void setAction() {

        super.setAction();
    }

    public void speak() {  //DO CHARACTER SPECIFIC STUFF

        super.hasMissionObj = hasBuds;

        if(hasBuds && !updatedKidney) {
            
            gp.player.hasBuds = 0;
            gp.player.hasKidney += 1;
            gp.player.hasWater += 1;
            updatedKidney = true;
        }

        if(!hasMissionObj) {

            hasSpokenFirst = true;
            gp.playSE(21);
        }

        super.speak();
    }
}