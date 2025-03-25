package entity;

import java.awt.Rectangle;

import main.GamePanel;

public class NPC_BlackPatient extends Entity{

    public static boolean hasMemo = false;
    public static boolean hasObj = false;
    public static boolean updatedKidney = false;
    public static boolean hasSpokenFirst = false;

    public NPC_BlackPatient(GamePanel gp) {

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

        front1 = setUp("res/npc/Black_Front_1");
        front2 = setUp("res/npc/Black_Front_2");

    }

    public void setDialogue() {

        /* dialogue[0] = "Sonunda geldin, bekliyordum... farklı görünüyorsun.\n" +  
                      "Bana verdiğin sözü hatırlamıyorsun, değil mi? Hepsi\n" +  
                      "onların suçu... hatırlamalısın! Etrafına bak...";

        dialogue[1] = "çok hızlısın! Bu antibakteriyel böbreği al ve hızlan,\n" +
                      "delirmeni tekrardan izlemek istemiyorum.";

        dialogue[2] = "O seni izliyor... gözlerini bile kırpmadan."; */

        dialogue[0] = "You are finally here, I have been waiting for you...\n" +  
                      "You look different. You can't remember the promise,\n" +  
                      "huh..? It's all their fault... Remember! You must...";

        dialogue[1] = "It took you a while! Take this disinfectant and move,\n" +
                      "I don't want to watch you go crazy again...";

        dialogue[2] = "It's watching you... without blinking.";

    }

    public void setAction() {

        super.setAction();
    }

    public void speak() {  //DO CHARACTER SPECIFIC STUFF

        super.hasMissionObj = hasMemo;

        if(hasMemo && !updatedKidney) {
            
            gp.player.hasPapyrus = 0;
            gp.player.hasKidney += 1;
            gp.player.hasWater += 1;
            updatedKidney = true;
        }

        if(!hasMissionObj) {

            hasSpokenFirst = true;
            gp.playSE(23);
        }

        super.speak();
    }
}