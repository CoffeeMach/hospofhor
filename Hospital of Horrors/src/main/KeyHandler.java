package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{

    GamePanel gp;

    public boolean upPressed, downPressed, leftPressed, rightPressed, spaceBar, viewPressed;

    public KeyHandler(GamePanel gp) {

        this.gp = gp;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int code = e.getKeyCode();
        
        //TITLESTATE
        if(gp.gameState == gp.titleState) {
            if(gp.ui.titleScreenState == 0) {
                if(code == KeyEvent.VK_W) {
                    if(gp.ui.commandNum >= 1) {
                        gp.playSE(26);
                        gp.ui.commandNum--;
                    }
                }
                if(code == KeyEvent.VK_S) {
                    if(gp.ui.commandNum <= 1) {
                        gp.playSE(26);
                        gp.ui.commandNum++;
                    }
                }
                if(code == KeyEvent.VK_SPACE) {
                    gp.playSE(26);
                    if(gp.ui.commandNum == 0) {
                        gp.ui.titleScreenState = 1;
                        gp.ui.commandNum = 0;
                    }
                    if(gp.ui.commandNum == 1) {
                        System.out.println("You don't have any loaded games");
                    }
                    if(gp.ui.commandNum == 2) {
                        System.exit(0);
                    }
                }

            } else if(gp.ui.titleScreenState == 1) {
                if(code == KeyEvent.VK_W) {
                    if(gp.ui.commandNum >= 1) {
                        gp.playSE(26);
                        gp.ui.commandNum--;
                    }
                }
                if(code == KeyEvent.VK_S) {
                    if(gp.ui.commandNum <= 1) {
                        gp.playSE(26);
                        gp.ui.commandNum++;
                    }
                }
                if(code == KeyEvent.VK_SPACE) {
                    if(gp.ui.commandNum == 0) { //male
                        gp.stopMusic();
                        gp.player.playerState = 0;
                        gp.gameState = gp.playState;
                        gp.playMusic(12);
                    }
                    if(gp.ui.commandNum == 1) { //female
                        gp.stopMusic();
                        gp.player.playerState = 1;
                        gp.player.getPlayerImage();
                        gp.gameState = gp.playState;
                        gp.playMusic(12);
                    }
                    if(gp.ui.commandNum == 2) { //back
                        gp.playSE(26);
                        gp.ui.titleScreenState = 0;
                        gp.ui.commandNum = 0;
                    }
                }
            } 
        }

        if(gp.gameState == gp.finishState) {
            if(code == KeyEvent.VK_SPACE) {
                System.exit(0);  //for now
            }
        }

        //PLAYSTATE
        if(gp.gameState == gp.playState) {
            if(code == KeyEvent.VK_W) {
                upPressed = true;
            }
            if(code == KeyEvent.VK_S) {
                downPressed = true;
            }
            if(code == KeyEvent.VK_A) {
                leftPressed = true;
            }
            if(code == KeyEvent.VK_D) {
                rightPressed = true;
            }
            if(code == KeyEvent.VK_SPACE) {
                spaceBar = true;
            }
            if(code == KeyEvent.VK_P) {
                gp.gameState = gp.endState;
            }
            if(code == KeyEvent.VK_V) {
                viewPressed = true;
            }
        }
        
        //PAUSE STATE
        if(gp.gameState == gp.endState) {
            if(code == KeyEvent.VK_P) {
                gp.gameState = gp.playState;
            }
        }

        //Dialogue State
        if(gp.gameState == gp.dialogueState) {

            if(code == KeyEvent.VK_SPACE) {
                gp.gameState = gp.playState;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        int code = e.getKeyCode();

        if(code == KeyEvent.VK_W) {
            upPressed = false;
        }
        if(code == KeyEvent.VK_S) {
            downPressed = false;
        }
        if(code == KeyEvent.VK_A) {
            leftPressed = false;
        }
        if(code == KeyEvent.VK_D) {
            rightPressed = false;
        }
        if(code == KeyEvent.VK_SPACE) {
            spaceBar = false;
        }
        if(code == KeyEvent.VK_V) {
            viewPressed = false;
        }
    }
    
}