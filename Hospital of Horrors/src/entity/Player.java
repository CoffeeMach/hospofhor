package entity;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import main.GamePanel;
import main.KeyHandler;

public class Player extends Entity{

    KeyHandler keyH;

    public final int screenX;
    public final int screenY;
    int standCounter = 0;
    int walkCounter = 0;
    public boolean hasClothes = false;
    public int hasAcid = 0;
    public int hasKey = 0;
    public int hasKidney = 0;
    public int hasCement = 0;
    public int hasWater = 0;
    public int wakeMonster = 0;
    public int hasCal = 0;
    public int hasPapyrus = 0;
    public int hasFood = 0;
    public int hasEye = 0;
    public int hasBuds = 0;
    public int hasHeart = 0;
    public int playerState = 0;
    public int endNum = 0;
    public boolean hasPill = false;
    public boolean hasCelexa = false;
    public boolean hasZoloft = false;
    public boolean hasPaxil = false;
    public boolean hasLexapro = false;
    public boolean hasDoll = false;



    public Player(GamePanel gp, KeyHandler keyH) {

        super(gp);

        this.keyH = keyH;

        screenX = gp.screenWidth/2 - gp.tileSize/2;
        screenY = gp.screenHeight/2 - gp.tileSize/2;

        solidArea = new Rectangle();
        solidArea.x = 30; //15
        solidArea.y = 42; //21
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        solidArea.width = 4; //2
        solidArea.height = 20; //10

        setDefaultValues();
        getPlayerImage();
    }
    public void setDefaultValues() {

        worldX = gp.tileSize * 35; //53
        worldY = gp.tileSize * 19; //27
        speed = 10;
        direction = "front";
    }
    public void getPlayerImage() {

        if(playerState == 0) {
            if(hasClothes) {
                front1 = setUp("res/player/Patient2_Front_1");
                front2 = setUp("res/player/Patient2_Front_2");
                back1 = setUp("res/player/Patient2_Back_1");
                back2 = setUp("res/player/Patient2_Back_2");
                right1 = setUp("res/player/Patient2_Right_1");
                right2 = setUp("res/player/Patient2_Right_2");
                left1 = setUp("res/player/Patient2_Left_1");
                left2 = setUp("res/player/Patient2_Left_2");
            } else if(!hasClothes) {
                front1 = setUp("res/player/Patient2_Front_1_White");
                front2 = setUp("res/player/Patient2_Front_2_White");
                back1 = setUp("res/player/Patient2_Back_1_White");
                back2 = setUp("res/player/Patient2_Back_2_White");
                right1 = setUp("res/player/Patient2_Right_1_White");
                right2 = setUp("res/player/Patient2_Right_2_White");
                left1 = setUp("res/player/Patient2_Left_1_White");
                left2 = setUp("res/player/Patient2_Left_2_White");
            }
        } if(playerState == 1) {
            if(hasClothes) {
                front1 = setUp("res/player/Patient_Front_1");
                front2 = setUp("res/player/Patient_Front_2");
                back1 = setUp("res/player/Patient_Back_1");
                back2 = setUp("res/player/Patient_Back_2");
                right1 = setUp("res/player/Patient_Right_1");
                right2 = setUp("res/player/Patient_Right_2");
                left1 = setUp("res/player/Patient_Left_1");
                left2 = setUp("res/player/Patient_Left_2");
            } else if(!hasClothes) {
                front1 = setUp("res/player/Patient_Front_1_White");
                front2 = setUp("res/player/Patient_Front_2_White");
                back1 = setUp("res/player/Patient_Back_1_White");
                back2 = setUp("res/player/Patient_Back_2_White");
                right1 = setUp("res/player/Patient_Right_1_White");
                right2 = setUp("res/player/Patient_Right_2_White");
                left1 = setUp("res/player/Patient_Left_1_White");
                left2 = setUp("res/player/Patient_Left_2_White");
            }
        }

        
    }

    public void update() {

        if(keyH.upPressed == true || keyH.downPressed == true || keyH.leftPressed == true || keyH.rightPressed == true)
        {
            
            if(keyH.upPressed == true) {
                direction = "back";
            }
            else if(keyH.downPressed == true) {
                direction = "front";
            }
            else if(keyH.leftPressed == true) {
                direction = "left";
            }
            else if(keyH.rightPressed == true) {
                direction = "right";
            }

            // CHECK TILE COLLISION
            collisionOn = false;
            gp.cChecker.checkTile(this);

            // CHECK OBJECT COLLISION
            int objIndex = gp.cChecker.checkObject(this, true);
            pickUpObject(objIndex);

            // CHECK NPC COLLISION
            int npcIndex = gp.cChecker.checkEntity(this, gp.npc);
            interactNPC(npcIndex);

            // IF COLLISION IS FALSE, PLAYER CAN MOVE
            if(collisionOn == false) {
                switch(direction) {
                case "back":
                    worldY -= speed;
                    break;
                case "front":
                    worldY += speed;
                    break;
                case "left":
                    worldX -= speed;
                    break;
                case "right":
                    worldX += speed;
                    break;
                }
            }

            spriteCounter++;
            if(spriteCounter > 12) {
                if(spriteNum == 1) {
                    spriteNum = 2;
                }
                else if(spriteNum == 2) {
                    spriteNum = 1;
                }
                spriteCounter = 0;
            }

            walkCounter++;
            if(walkCounter > 40 && speed == 4) {
                gp.playSE(15);
                walkCounter = 0;
            } else if(walkCounter > 50 && speed == 3) {
                gp.playSE(15);
                walkCounter = 0;
            } else if(walkCounter > 60 && speed == 2) {
                gp.playSE(15);
                walkCounter = 0;
            } else if(walkCounter > 70 && speed == 1) {
                gp.playSE(15);
                walkCounter = 0;
            }
            
        } else {
            standCounter++;
            if(standCounter == 20) {
                spriteNum = 1;
                standCounter = 0;
            }
        }

        gp.obj[154].switchImage();
        gp.obj[32].switchImage();
        gp.obj[150].switchImage();
        gp.obj[151].switchImage();
        gp.obj[152].switchImage();
        gp.obj[40].switchImage();
        gp.obj[34].switchImage();
        gp.obj[33].switchImage();
        gp.obj[35].switchImage();
        gp.obj[36].switchImage();
        gp.obj[37].switchImage();
        gp.obj[38].switchImage();
        gp.obj[39].switchImage();
        
        for(int i = 45; i < 135; i++) {
            if(gp.obj[i] != null) {
                gp.obj[i].switchImage();
            }
        }

        for(int i = 137; i < 142; i++) {
            if(gp.obj[i] != null) {
                gp.obj[i].switchImage();
            }
        }

        for(int i = 155; i < 158; i++) {
            if(gp.obj[i] != null) {
                gp.obj[i].switchImage();
            }
        }

        if(hasPapyrus == 1 && keyH.viewPressed) {
            gp.ui.showItem = true;
        } else if(!keyH.viewPressed) {
            gp.ui.showItem = false;
        }

        if(hasPill && keyH.viewPressed) {
            gp.ui.showItem = true;
        } else if(!keyH.viewPressed) {
            gp.ui.showItem = false;
        }

        if(hasZoloft && keyH.viewPressed) {
            gp.ui.showItem = true;
        } else if(!keyH.viewPressed) {
            gp.ui.showItem = false;
        }

        if(hasPaxil && keyH.viewPressed) {
            gp.ui.showItem = true;
        } else if(!keyH.viewPressed) {
            gp.ui.showItem = false;
        }

        if(hasLexapro && keyH.viewPressed) {
            gp.ui.showItem = true;
        } else if(!keyH.viewPressed) {
            gp.ui.showItem = false;
        }

        if(hasCelexa && keyH.viewPressed) {
            gp.ui.showItem = true;
        } else if(!keyH.viewPressed) {
            gp.ui.showItem = false;
        }

        if(hasDoll && keyH.viewPressed) {
            gp.ui.showItem = true;
        } else if(!keyH.viewPressed) {
            gp.ui.showItem = false;
        }
    }

    public void pickUpObject(int i) {
        if(i != 999) {

            String objectName = gp.obj[i].name;

            switch(objectName) {
            case "Acid":
                if(keyH.spaceBar && hasAcid == 0) {
                    gp.playSE(5);
                    gp.obj[i] = null;
                    hasAcid++;
                }
                break;
            case "Door":
                if(keyH.spaceBar && hasAcid > 0 && !gp.obj[i].shift) {
                    gp.playSE(8);
                    gp.obj[i].shift = true;
                    gp.obj[i].updateImage();
                    hasAcid--;
                } else if (keyH.spaceBar && !gp.obj[i].shift) {
                    //gp.ui.showMessage("kapıyı açmak için... daha fazlasına ihtiyacım var");
                    gp.ui.showMessage("More... I need more to open the door");
                }
                break;
            case "Vertical Door":
                if(keyH.spaceBar && hasAcid > 0 && !gp.obj[i].shift && hasClothes) {
                    gp.playSE(8);
                    gp.obj[i].shift = true;
                    gp.obj[i].updateImage();
                    hasAcid--;
                } else if (keyH.spaceBar && !gp.obj[i].shift && !hasClothes) {
                    //gp.ui.showMessage("bu şekilde çıkamam, başka seçeneğim yok mu?");
                    gp.ui.showMessage("I can't leave looking like this");
                } else if (keyH.spaceBar && !gp.obj[i].shift) {
                    //gp.ui.showMessage("kapıyı açmak için... daha fazlasına ihtiyacım var");
                    gp.ui.showMessage("More... I need more to open the door");
                }
                break;
            case "Cement":
                if(keyH.spaceBar && hasCement < 2 && hasAcid == 0) {
                    gp.playSE(5);
                    gp.obj[i] = null;
                    hasCement++;
                    System.out.println("has cement");
                }
                break;
            case "Tree":
                if(speed < 4 && !gp.obj[i].shift) {
                    gp.playSE(10);
                    gp.obj[i].shift = true;
                    gp.obj[i].updateImage();
                    gp.obj[i].stopDamage();
                    gp.obj[i].executed = true;
                }
                break;
            case "Blood":  //TAKE AWAY SIGHT
                if(keyH.spaceBar && hasWater > 0  && !gp.obj[i].shift) {
                    gp.playSE(4);
                    gp.obj[i] = null;
                    hasKidney--;
                    hasWater--;
                } else if (!gp.obj[i].shift) {
                    gp.playSE(6);
                    gp.obj[i].shift = true;
                    gp.obj[i].updateImage();
                    if(speed > 1) {
                        gp.obj[i].takeDamage();
                        gp.obj[i].executed = true;
                    }
                }
                break;
            case "Blood2":  //TAKE AWAY SIGHT
                if(keyH.spaceBar && hasWater > 0  && !gp.obj[i].shift) {
                    gp.playSE(4);
                    gp.obj[i] = null;
                    hasKidney--;
                    hasWater--;
                } else if (!gp.obj[i].shift) {
                    gp.playSE(6);
                    gp.obj[i].shift = true;
                    gp.obj[i].updateImage();
                    if(speed > 1) {
                        gp.obj[i].takeDamage();
                        gp.obj[i].executed = true;
                    }
                }
                break;
            case "Blood3":  //TAKE AWAY SIGHT
                if(keyH.spaceBar && hasWater > 0 && !gp.obj[i].shift) {
                    gp.playSE(4);
                    gp.obj[i] = null;
                    hasKidney--;
                    hasWater--;
                } else if (!gp.obj[i].shift) {
                    gp.playSE(6);
                    gp.obj[i].shift = true;
                    gp.obj[i].updateImage();
                    if(speed > 1) {
                        gp.obj[i].takeDamage();
                        gp.obj[i].executed = true;
                    }
                }
                break;
            case "Kidney": //COLLECT AS MANY AS YOU CAN
                if(keyH.spaceBar && !gp.obj[i].shift) {
                    gp.playSE(7);
                    gp.obj[i].shift = true;
                    gp.obj[i].updateImage();
                    hasKidney++;
                }
                break;
            case "Jar":
                if(keyH.spaceBar && !gp.obj[i].shift && hasKidney > hasWater) {
                    gp.playSE(7);
                    gp.obj[i].shift = true;
                    gp.obj[i].updateImage();
                    hasWater++;
                } else if(keyH.spaceBar && hasKidney <= hasWater && !gp.obj[i].shift) {
                    //gp.ui.showMessage("antibakteriyel depolamam için daha fazla organ lazım...");
                    gp.ui.showMessage("I need more kidneys to store disinfectant...");
                }
                break;
            case "Crack":
                if(!gp.obj[i].shift) {
                    System.out.println("scared");
                }
                break;
            case "Stairs":
                if(keyH.spaceBar) {  //check all items have been collected before leaving
                    gp.gameState = gp.finishState;
                }
                break;
            case "Brain":
                if(keyH.spaceBar && !gp.obj[i].shift) {
                    gp.obj[i].shift = true;
                    gp.obj[i].updateImage();
                    gp.playSE(7);
                    //gp.ui.showMessage("nefesini hissediyorum, gözleri karanlıkta açılıp kapanıyor");
                    gp.ui.showMessage("I can feel him... watching me, following me, devouring me...");
                }
                break;
            case "Heart":
                if(keyH.spaceBar && !gp.obj[i].shift && hasFood == 0 && hasPapyrus == 0 && hasCal == 0 && hasEye == 0 && hasBuds == 0 && NPC_GingerPatient.hasSpokenFirst) {
                    gp.obj[i].shift = true;
                    gp.obj[i].updateImage();
                    gp.playSE(7);
                    hasHeart++;
                    NPC_GingerPatient.hasHeart = true;
                } else if(keyH.spaceBar && !gp.obj[i].shift) {
                    //gp.ui.showMessage("benim kalbim hala atıyor");
                    gp.ui.showMessage("I do not need a beating heart... yet");
                }
                break;
            case "Eye":
                if(keyH.spaceBar && !gp.obj[i].shift && hasFood == 0 && hasPapyrus == 0 && hasCal == 0  && hasHeart == 0 && hasBuds == 0 && NPC_PurpPatient.hasSpokenFirst) {
                    gp.obj[i].shift = true;
                    gp.obj[i].updateImage();
                    gp.playSE(7);
                    hasEye++;
                    NPC_PurpPatient.hasEye = true;
                } else if(keyH.spaceBar && !gp.obj[i].shift) {
                    //gp.ui.showMessage("önce bakmam gereken başka yerler var");
                    gp.ui.showMessage("I already have both eyes");
                }
                break;
            case "Patient Bed":
                if(keyH.spaceBar && !gp.obj[i].shift) {
                    gp.playSE(5);
                    gp.obj[i].shift = true;
                    gp.obj[i].updateImage();
                    hasClothes = true;
                    getPlayerImage();
                }
                break;
            case "Monster Bed":
                if(keyH.spaceBar && wakeMonster == 9 && !gp.obj[i].shift) {
                    gp.obj[i].shift = true;
                    gp.obj[i].updateImage();
                    //gp.ui.showMessage("çok geç, o zaten burada");
                    gp.ui.showMessage("Too late, it's already here");
                    gp.ui.gameOver = true;
                    endNum = 1;
                    gp.stopMusic();
                    gp.playSE(27);
                } else if(keyH.spaceBar && !gp.obj[i].shift && wakeMonster == 0) {
                    //gp.ui.showMessage("o şeyi uyandırmak istemem, sessiz olsam iyi olur...");
                    gp.ui.showMessage("I do not want to wake that thing...");
                    gp.playSE(25);
                    wakeMonster++;
                } else if(keyH.spaceBar) {
                    wakeMonster++;
                }
                break;
            case "Right Bed Occupied":
                if(keyH.spaceBar) {
                    //gp.ui.showMessage("nefesi çok yavaş, acaba..?");
                    gp.ui.showMessage("It's almost as if he's not... breathing");
                }
                break;
            case "Left Bed Occupied":
                if(keyH.spaceBar) {
                    //gp.ui.showMessage("gözleri kapalı... ama izliyor... hepsi");
                    gp.ui.showMessage("Eyes shut, but watching... everything");
                }
                break;
            case "Picture":
                if(keyH.spaceBar && hasFood == 0 && hasPapyrus == 0  && hasBuds == 0 && hasEye == 0 && hasHeart == 0 && NPC_BluePatient.hasSpokenFirst) {
                    gp.playSE(5);
                    gp.obj[i] = null;
                    hasCal++;
                    NPC_BluePatient.hasCalender = true;
                } else if(keyH.spaceBar) {
                    //gp.ui.showMessage("önce birine danışmam gerek");
                    gp.ui.showMessage("I do not know what I need a calendar for");
                }
                break;
            case "Food":
                if(keyH.spaceBar && hasEye == 0 && hasPapyrus == 0  && hasBuds == 0 && hasCal == 0  && hasHeart == 0 && NPC_BlondPatient.hasSpokenFirst) {
                    gp.playSE(5);
                    gp.obj[i] = null;
                    NPC_BlondPatient.hasFood = true;
                    hasFood++;
                } else if(keyH.spaceBar) {
                    //gp.ui.showMessage("bu yemek başkasına ait olabilir");
                    gp.ui.showMessage("I do not feel hunger... yet");
                }
                break;
            case "Pillow":
                if(keyH.spaceBar && !gp.obj[i].shift && hasFood == 0 && hasEye == 0 && hasCal == 0 && hasBuds == 0  && hasHeart == 0 && NPC_BlackPatient.hasSpokenFirst) {
                    gp.obj[i].shift = true;
                    gp.obj[i].updateImage();
                    gp.playSE(7);
                    NPC_BlackPatient.hasMemo = true;
                    hasPapyrus++;
                } else if(keyH.spaceBar && !gp.obj[i].shift) {
                    //gp.ui.showMessage("buraya neden bakmam gerektiğini hatırlayamıyorum... dilimin ucunda");
                    gp.ui.showMessage("I do not remember what this pillow is for");
                }
                break;
            case "Intercom":
                if(keyH.spaceBar && !gp.obj[i].shift && hasPapyrus == 0 && hasFood == 0 && hasEye == 0 && hasCal == 0  && hasHeart == 0 && NPC_VitiligoPatient.hasSpokenFirst) {
                    gp.playSE(24);
                    gp.obj[i].shift = true;
                    gp.obj[i].updateImage();
                    NPC_VitiligoPatient.hasBuds = true;
                    hasBuds++;
                } else if(keyH.spaceBar && !gp.obj[i].shift) {
                    //gp.ui.showMessage("önce dinlemem gereken başka şeyler var");
                    gp.ui.showMessage("I feel that I need to listen to someone else first");
                }
                break;
            case "Key":
                if(keyH.spaceBar && hasKey == 0) {
                    gp.playSE(5);
                    gp.obj[i] = null;
                    hasKey++;
                }
                break;
            case "Dooray":
                if(keyH.spaceBar && hasKey > 0 && !gp.obj[i].shift) {
                    gp.playSE(8);
                    gp.obj[i].shift = true;
                    gp.obj[i].updateImage();
                    hasKey--;
                } else if (keyH.spaceBar && !gp.obj[i].shift) {
                    //gp.ui.showMessage("kapıyı açmak için... daha fazlasına ihtiyacım var");
                    gp.ui.showMessage("This door... it's different than the others");
                }
                break;
            }
        }
    }

    public void interactNPC(int i) {

        if(i != 999 && keyH.spaceBar) {

            if(hasAcid == 1){
                gp.stopMusic();
                gp.playSE(13);
                endNum = 0;
                gp.ui.gameOver = true;
            } else {
                gp.gameState = gp.dialogueState;
                gp.npc[i].speak();
            }
        }
    }

    public void draw(Graphics2D g2) {

        BufferedImage image = null;

        switch(direction) {
        case "back":
            if(spriteNum == 1) {
                image = back1;
            }
            if(spriteNum == 2) {
                image = back2;
            }
            break;
        case "front":
            if(spriteNum == 1) {
                image = front1;
            }
            if(spriteNum == 2) {
                image = front2;
            }
            break;
        case "right":
            if(spriteNum == 1) {
                image = right1;
            }
            if(spriteNum == 2) {
                image = right2;
            }
            break;
        case "left":
            if(spriteNum == 1) {
                image = left1;
            }
            if(spriteNum == 2) {
                image = left2;
            }
            break;
        }
        g2.drawImage(image, screenX, screenY, null);

    }
}