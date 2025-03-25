package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import entity.NPC_BlondPatient;
import entity.NPC_BluePatient;
import entity.NPC_GingerPatient;
import entity.NPC_PurpPatient;
import object.OBJ_AcidSpilled;
import object.OBJ_Box;
import object.OBJ_Buds;
import object.OBJ_Doll;
import object.OBJ_End;
import object.OBJ_EyeSymbol;
import object.OBJ_FoodE;
import object.OBJ_GenericPic;
import object.OBJ_HeartSymbol;
import object.OBJ_Injection;
import object.OBJ_KidneySymbol;
import object.OBJ_KidneySymbol2;
import object.OBJ_KidneySymbol3;
import object.OBJ_KidneySymbol4;
import object.OBJ_KidneySymbol5;
import object.OBJ_KidneySymbol6;
import object.OBJ_KidneySymbol7;
import object.OBJ_KidneySymbol8;
import object.OBJ_Memo;
import object.OBJ_MiniAcid;
import object.OBJ_MiniKey;
import object.OBJ_MonsterEnd;
import object.OBJ_Note;
import object.OBJ_Pill;
import object.OBJ_Sick;
import object.OBJ_Title;
import object.OBJ_WaterSymbol;
import object.OBJ_WaterSymbol2;
import object.OBJ_WaterSymbol3;
import object.OBJ_WaterSymbol4;
import object.OBJ_WaterSymbol5;
import object.OBJ_WaterSymbol6;
import object.OBJ_WaterSymbol7;
import object.OBJ_WaterSymbol8;
import object.OBJ_Wood;
import object.SuperObject;

public class UI {
    
    GamePanel gp;
    Graphics2D g2;
    Font chiller_50;
    Font unquiet_50;
    Font hometown_35;
    BufferedImage kidneyImage;
    BufferedImage kidneyImage2;
    BufferedImage kidneyImage3;
    BufferedImage kidneyImage4;
    BufferedImage kidneyImage5;
    BufferedImage kidneyImage6;
    BufferedImage kidneyImage7;
    BufferedImage kidneyImage8;
    BufferedImage waterImage;
    BufferedImage waterImage2;
    BufferedImage waterImage3;
    BufferedImage waterImage4;
    BufferedImage waterImage5;
    BufferedImage waterImage6;
    BufferedImage waterImage7;
    BufferedImage waterImage8;
    BufferedImage damageImage;
    BufferedImage acidImage;
    BufferedImage feverImage;
    BufferedImage picImage;
    BufferedImage memoImage;
    BufferedImage foodImage;
    BufferedImage eyeImage;
    BufferedImage dynamiteImage;
    BufferedImage pillImage;
    BufferedImage budsImage;
    BufferedImage injectionImage;
    BufferedImage dollImage;
    BufferedImage keyImage;
    BufferedImage acidSpilledImage;
    BufferedImage endImage;
    BufferedImage noteImage;
    BufferedImage heartImage;
    BufferedImage boxImage;
    BufferedImage titleImage;
    BufferedImage monsterImage;

    public boolean messageOn = false;
    public String message = "";
    int messageCounter = 0;
    public boolean gameOver = false;
    public boolean monster = false;
    public boolean showItem = false;
    String text;
    int textLength;
    int messageLength;
    int x;
    public int y;
    int width;
    int height;
    public int commandNum = 0;
    public int titleScreenState = 0; //0: the first screen, 1: second screen title

    public String currentDialogue = "";

    public UI(GamePanel gp) {

        this.gp = gp;

        unquiet_50 = new Font("Unquiet Spirits", Font.BOLD, 50); //for game endings

        chiller_50 = new Font("Chiller", Font.BOLD, 50);

        hometown_35 = new Font("Hometown", Font.PLAIN, 35);

        OBJ_KidneySymbol kidney = new OBJ_KidneySymbol(gp);
        kidneyImage = kidney.image;
        OBJ_KidneySymbol2 kidney2 = new OBJ_KidneySymbol2(gp);
        kidneyImage2 = kidney2.image;
        OBJ_KidneySymbol3 kidney3 = new OBJ_KidneySymbol3(gp);
        kidneyImage3 = kidney3.image;
        OBJ_KidneySymbol4 kidney4 = new OBJ_KidneySymbol4(gp);
        kidneyImage4 = kidney4.image;
        OBJ_KidneySymbol5 kidney5 = new OBJ_KidneySymbol5(gp);
        kidneyImage5 = kidney5.image;
        OBJ_KidneySymbol6 kidney6 = new OBJ_KidneySymbol6(gp);
        kidneyImage6 = kidney6.image;
        OBJ_KidneySymbol7 kidney7 = new OBJ_KidneySymbol7(gp);
        kidneyImage7 = kidney7.image;
        OBJ_KidneySymbol8 kidney8 = new OBJ_KidneySymbol8(gp);
        kidneyImage8 = kidney8.image;

        OBJ_WaterSymbol water = new OBJ_WaterSymbol(gp);
        waterImage = water.image;
        OBJ_WaterSymbol2 water2 = new OBJ_WaterSymbol2(gp);
        waterImage2 = water2.image;
        OBJ_WaterSymbol3 water3 = new OBJ_WaterSymbol3(gp);
        waterImage3 = water3.image;
        OBJ_WaterSymbol4 water4 = new OBJ_WaterSymbol4(gp);
        waterImage4 = water4.image;
        OBJ_WaterSymbol5 water5 = new OBJ_WaterSymbol5(gp);
        waterImage5 = water5.image;
        OBJ_WaterSymbol6 water6 = new OBJ_WaterSymbol6(gp);
        waterImage6 = water6.image;
        OBJ_WaterSymbol7 water7 = new OBJ_WaterSymbol7(gp);
        waterImage7 = water7.image;
        OBJ_WaterSymbol8 water8 = new OBJ_WaterSymbol8(gp);
        waterImage8 = water8.image;

        OBJ_GenericPic pic = new OBJ_GenericPic(gp);
        picImage = pic.image;

        OBJ_Sick fever = new OBJ_Sick(gp);
        feverImage = fever.image;

        OBJ_MiniAcid acid = new OBJ_MiniAcid(gp);
        acidImage = acid.image;

        OBJ_Memo memo = new OBJ_Memo(gp);
        memoImage = memo.image;

        OBJ_FoodE food = new OBJ_FoodE(gp);
        foodImage = food.image;

        OBJ_EyeSymbol eye = new OBJ_EyeSymbol(gp);
        eyeImage = eye.image;

        OBJ_Wood dynamite = new OBJ_Wood(gp);
        dynamiteImage = dynamite.image;

        OBJ_Pill pill = new OBJ_Pill(gp);
        pillImage = pill.image;

        OBJ_Buds buds = new OBJ_Buds(gp);
        budsImage = buds.image;

        OBJ_Injection injection = new OBJ_Injection(gp);
        injectionImage = injection.image;

        OBJ_Doll doll = new OBJ_Doll(gp);
        dollImage = doll.image;

        OBJ_MiniKey key = new OBJ_MiniKey(gp);
        keyImage = key.image;

        OBJ_AcidSpilled acidSpilled = new OBJ_AcidSpilled(gp);
        acidSpilledImage = acidSpilled.image;

        OBJ_End end = new OBJ_End(gp);
        endImage = end.image;

        OBJ_Note note = new OBJ_Note(gp);
        noteImage = note.image;

        OBJ_HeartSymbol heart = new OBJ_HeartSymbol(gp);
        heartImage = heart.image;

        OBJ_Box box = new OBJ_Box(gp);
        boxImage = box.image;

        OBJ_Title title = new OBJ_Title(gp);
        titleImage = title.image;

        OBJ_MonsterEnd monster = new OBJ_MonsterEnd(gp);
        monsterImage = monster.image;
    }

    public void showMessage(String text) {

        message = text;
        messageOn = true;
    }

    public void draw(Graphics2D g2) {

        this.g2 = g2;

        g2.setFont(hometown_35);
        g2.setColor(Color.white);

        if(gp.gameState == gp.titleState) {
            drawTitleScreen();

        }
        if(gp.gameState == gp.playState) {
            // Boxes
            g2.drawImage(boxImage, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);

            for(int i = 4; i <= 10; i += 2) {
                g2.drawImage(boxImage, i*gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);
            }
        }
        if(gp.gameState == gp.endState) {
            drawPauseScreen();
        }
        if(gp.gameState == gp.dialogueState) {
            drawDialogueScreen();

            // Boxes
            g2.drawImage(boxImage, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);

            for(int i = 4; i <= 10; i += 2) {
                g2.drawImage(boxImage, i*gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);
            }
        }

        if (gp.gameState == gp.finishState) {
            drawFinishedScreen();

        } else if (gameOver == true) {

            drawGameOverScreen();

        } else {

            if(gp.player.hasKidney >= 1) {

                g2.drawImage(kidneyImage, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);

                if(gp.player.hasWater >= 1) {
                    g2.drawImage(waterImage, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);
                }
            }
            
            if(gp.player.hasKidney >= 2) {

                g2.drawImage(kidneyImage2, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);

                if(gp.player.hasWater >= 2) {
                    g2.drawImage(waterImage2, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);
                }
            }
            
            if(gp.player.hasKidney >= 3) {

                g2.drawImage(kidneyImage3, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);

                if(gp.player.hasWater >= 3) {
                    g2.drawImage(waterImage3, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);
                }
            } if(gp.player.hasKidney >= 4) {

                g2.drawImage(kidneyImage4, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);

                if(gp.player.hasWater >= 4) {
                    g2.drawImage(waterImage4, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);
                }
            } if(gp.player.hasKidney >= 5) {

                g2.drawImage(kidneyImage5, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);

                if(gp.player.hasWater >= 5) {
                    g2.drawImage(waterImage5, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);
                }

            } if(gp.player.hasKidney >= 6) {

                g2.drawImage(kidneyImage6, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);

                if(gp.player.hasWater >= 6) {
                    g2.drawImage(waterImage6, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);
                }

            } if(gp.player.hasKidney >= 7) {

                g2.drawImage(kidneyImage7, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);

                if(gp.player.hasWater >= 7) {
                    g2.drawImage(waterImage7, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);
                }
            } if(gp.player.hasKidney >= 8) {

                g2.drawImage(kidneyImage8, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);

                if(gp.player.hasWater >= 8) {
                    g2.drawImage(waterImage8, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);
                }
            }

            if (SuperObject.damage > 0) {
                g2.drawImage(feverImage, gp.screenWidth/2 - gp.tileSize/2, gp.screenHeight/2 - gp.tileSize/2, gp.tileSize, gp.tileSize, null);
            }

            if(gp.player.hasAcid > 0) {

                g2.drawImage(acidImage, gp.screenWidth/2 - gp.tileSize/2, gp.screenHeight/2 - gp.tileSize/2, gp.tileSize, gp.tileSize, null);
            }

            if(gp.player.hasKey > 0) {

                g2.drawImage(keyImage, gp.screenWidth/2 - gp.tileSize/2, gp.screenHeight/2 - gp.tileSize/2, gp.tileSize, gp.tileSize, null);
            }

            if(gp.player.hasCal > 0 && gp.player.hasFood == 0 && gp.player.hasPapyrus == 0 && gp.player.hasEye == 0 && gp.player.hasBuds == 0 && gp.player.hasHeart == 0) {

                g2.drawImage(picImage, gp.screenWidth/2 - gp.tileSize/2, gp.screenHeight/2 - 3*gp.tileSize/2, gp.tileSize, gp.tileSize, null);
            }

            if(gp.player.hasPapyrus > 0 && gp.player.hasFood == 0 && gp.player.hasEye == 0 && gp.player.hasCal == 0 && gp.player.hasBuds == 0 && gp.player.hasHeart == 0) {

                g2.drawImage(memoImage, gp.screenWidth/2 - gp.tileSize/2, gp.screenHeight/2 - 3*gp.tileSize/2, gp.tileSize, gp.tileSize, null);
            }

            if(gp.player.hasFood > 0 && gp.player.hasEye == 0 && gp.player.hasPapyrus == 0 && gp.player.hasCal == 0 && gp.player.hasBuds == 0 && gp.player.hasHeart == 0) {

                g2.drawImage(foodImage, gp.screenWidth/2 - gp.tileSize/2, gp.screenHeight/2 - 3*gp.tileSize/2, gp.tileSize, gp.tileSize, null);
            }

            if(gp.player.hasEye > 0 && gp.player.hasFood == 0 && gp.player.hasPapyrus == 0 && gp.player.hasCal == 0 && gp.player.hasBuds == 0 && gp.player.hasHeart == 0) {

                g2.drawImage(eyeImage, gp.screenWidth/2 - gp.tileSize/2, gp.screenHeight/2 - 3*gp.tileSize/2, gp.tileSize, gp.tileSize, null);
            }

            if(gp.player.hasBuds > 0 && gp.player.hasFood == 0 && gp.player.hasPapyrus == 0 && gp.player.hasCal == 0 && gp.player.hasEye == 0 && gp.player.hasHeart == 0) {

                g2.drawImage(budsImage, gp.screenWidth/2 - gp.tileSize/2, gp.screenHeight/2 - 3*gp.tileSize/2, gp.tileSize, gp.tileSize, null);
            }

            if(gp.player.hasHeart > 0 && gp.player.hasFood == 0 && gp.player.hasPapyrus == 0 && gp.player.hasCal == 0 && gp.player.hasEye == 0 && gp.player.hasBuds == 0) {

                g2.drawImage(heartImage, gp.screenWidth/2 - gp.tileSize/2, gp.screenHeight/2 - 3*gp.tileSize/2, gp.tileSize, gp.tileSize, null);
            }

            if(NPC_GingerPatient.hasObj) {

                g2.drawImage(dynamiteImage, 4*gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);

                text = "dinamit kazanıldı";

                //sendFeedback(text);
            }

            if(NPC_BlondPatient.hasObj) {

                g2.drawImage(pillImage, 6*gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);
                
                text = "hap kazanıldı";

                //sendFeedback(text);
            }

            if(NPC_PurpPatient.hasObj) {

                g2.drawImage(injectionImage, 8*gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);

                text = "aşı kazanıldı";

                //sendFeedback(text);
            }

            if(NPC_BluePatient.hasObj) {

                g2.drawImage(dollImage, 10*gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);

                text = "oyuncak bebek kazanıldı";

                //sendFeedback(text);
            }

            if(showItem) {

                g2.drawImage(noteImage, 0, 0, gp.screenWidth, gp.screenHeight, null);
            }

            if(messageOn == true) {

                x = getXforCenteredText(message);
                y = gp.screenHeight/2 - gp.tileSize/2 - 20;
                width = getWidthforCenteredRect(message);
                height = gp.tileSize/2 + 20;

                drawRect();

                g2.drawString(message, x, y);

                messageCounter++;

                if(messageCounter > 150) {
                    messageCounter = 0;
                    messageOn = false;
                }
            }
        }
    }

    public void drawFinishedScreen() {
        //text = "Sonraki kata ilerle";
        String text = "Go up to the next floor";
            
        x = getXforCenteredText(text);
        y = gp.screenHeight/2 - gp.tileSize  - 10;
        width = getWidthforCenteredRect(text);
        height = gp.tileSize/2 + 20;

        drawRect();
        g2.drawString(text, x, y);

        gp.gameThread = null;  // Stops game
    }

    public void drawGameOverScreen() {

        if (gp.player.endNum == 0) {
            //text = "Bir hastayı öldürdün, buradan çıkmayı hak etmiyorsun";
            String text = "You burned a patient, you don't deserve to be free";

            g2.setFont(g2.getFont().deriveFont(Font.PLAIN, 48F));
            
            x = getXforCenteredText(text);
            y = gp.screenHeight - gp.tileSize;

            g2.drawImage(endImage, 0, 0, gp.screenWidth, gp.screenHeight, null);
            
            g2.drawString(text, x, y);

            gp.gameThread = null;  // Stops game
        }
        if (gp.player.endNum == 1) {
            //text = "Bir hastayı öldürdün, buradan çıkmayı hak etmiyorsun";
            String text = "Monsters got you";

            g2.setFont(g2.getFont().deriveFont(Font.PLAIN, 48F));
            
            x = getXforCenteredText(text);
            y = gp.screenHeight - gp.tileSize;

            g2.drawImage(monsterImage, 0, 0, gp.screenWidth, gp.screenHeight, null);
            
            g2.drawString(text, x, y);

            gp.gameThread = null;  // Stops game
        }
        
    }

    public void drawTitleScreen() {
        
        g2.drawImage(titleImage, 0, 0, gp.screenWidth, gp.screenHeight, null);

        if(titleScreenState == 0) {
            //TITLE NAME
            g2.setFont(g2.getFont().deriveFont(Font.BOLD, 96F));
            String text = "Hospital of Nightmares";

            int x = getXforCenteredText(text);
            int y = gp.tileSize * 4;

            g2.setColor(Color.white);
            g2.drawString(text, x+2, y+2);

            g2.setColor(Color.black);
            g2.drawString(text, x, y);

            // MENU
            g2.setFont(g2.getFont().deriveFont(Font.BOLD, 30F));
            g2.setColor(Color.white);

            text = "new game";
            x = getXforCenteredText(text);
            y = gp.tileSize * 8;
            g2.drawString(text, x, y);
            if(commandNum == 0) {
                g2.drawString(">", x - gp.tileSize/2, y);
            }

            text = "load game";
            x = getXforCenteredText(text);
            y = gp.tileSize * 9;
            g2.drawString(text, x, y);
            if(commandNum == 1) {
                g2.drawString(">", x - gp.tileSize/2, y);
            }

            text = "quit";
            x = getXforCenteredText(text);
            y = gp.tileSize * 10;
            g2.drawString(text, x, y);
            if(commandNum == 2) {
                g2.drawString(">", x - gp.tileSize/2, y);
            }

        } else if(titleScreenState == 1) {
            
            g2.setFont(g2.getFont().deriveFont(Font.BOLD, 30F));
            g2.setColor(Color.white);

            String text = "select your character";
            x = getXforCenteredText(text);
            y = gp.tileSize * 3;
            g2.drawString(text, x, y);

            text = "male";
            x = getXforCenteredText(text);
            y = gp.tileSize * 6;
            g2.drawString(text, x, y);
            if(commandNum == 0) {
                g2.drawString(">", x - gp.tileSize/2, y);
            }

            text = "female";
            x = getXforCenteredText(text);
            y = gp.tileSize * 7;
            g2.drawString(text, x, y);
            if(commandNum == 1) {
                g2.drawString(">", x - gp.tileSize/2, y);
            }

            text = "back";
            x = getXforCenteredText(text);
            y = gp.tileSize * 10;
            g2.drawString(text, x, y);
            if(commandNum == 2) {
                g2.drawString(">", x - gp.tileSize/2, y);
            }
        } 
    }

    public void drawPauseScreen() {

        String text = "BEKLE";
        int x = getXforCenteredText(text);
        int y = gp.screenHeight/2 - gp.tileSize;

        g2.drawString(text, x, y);
    }

    public void showItem() {

        g2.drawImage(dollImage, 10*gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);
    }

    public int getXforCenteredText(String text) {

        int textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
        int x = gp.screenWidth/2 - textLength/2;

        return x;
    }

    //public void sendFeedback(String text) {

      //  g2.setFont(hometown_35);
        //g2.setFont(g2.getFont().deriveFont(Font.PLAIN, 30F));
            
        //x = getXforCenteredText(text);
        //y = gp.screenHeight - gp.tileSize/2;

        //g2.drawString(text, x, y);
    //}

    public int getWidthforCenteredRect(String message) {

        int messageLength = (int)g2.getFontMetrics().getStringBounds(message, g2).getWidth();
        int width = messageLength + 20;

        return width;
    }

    public void drawRect() {
        Color originalColor = g2.getColor();
        Color transparentGray = new Color(0, 0, 0, 50); //Change alpha for transparency
        g2.setColor(transparentGray);
        g2.fillRoundRect(x - 10, y - gp.tileSize/2 - 5, width, height, 20, 20);
        g2.setColor(originalColor);
    }

    public void drawDialogueScreen() {

        //WINDOW
        int x = gp.tileSize * 2;
        int y = gp.tileSize * 7;
        int width = gp.screenWidth - gp.tileSize*4;
        int height = gp.tileSize*4;

        drawSubWindow(x, y, width, height);

        g2.setFont(g2.getFont().deriveFont(Font.PLAIN, 35F));
        x += gp.tileSize;
        y += gp.tileSize;

        for(String line : currentDialogue.split("\n")) {
            g2.drawString(line, x, y);
            y += 70;
        }
    }

    public void drawSubWindow(int x, int y, int width, int height) {

        Color c = new Color(0,0,0, 210);
        g2.setColor(c);
        g2.fillRoundRect(x, y, width, height, 35, 35);
        
        c = new Color(255,255,255);
        g2.setColor(c);
        g2.setStroke(new BasicStroke(5));
        g2.drawRoundRect(x + 5, y + 5, width - 10, height - 10, 35, 35);
    }
}