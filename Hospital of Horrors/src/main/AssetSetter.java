package main;

import entity.NPC_BlackPatient;
import entity.NPC_BlondPatient;
import entity.NPC_BluePatient;
import entity.NPC_GingerPatient;
import entity.NPC_VitiligoPatient;
import entity.NPC_PurpPatient;
import object.OBJ_Acid;
import object.OBJ_AsylumBed;
import object.OBJ_Bed;
import object.OBJ_Bin;
import object.OBJ_Intercom;
import object.OBJ_Blood;
import object.OBJ_Blood2;
import object.OBJ_Blood3;
import object.OBJ_Brain;
import object.OBJ_Food;
import object.OBJ_Door;
import object.OBJ_Dooray;
import object.OBJ_Eye;
import object.OBJ_Heart;
import object.OBJ_Jar;
import object.OBJ_Key;
import object.OBJ_Kidney;
import object.OBJ_LeftBedOccupied;
import object.OBJ_MonsterBed;
import object.OBJ_PatientBed;
import object.OBJ_Picture;
import object.OBJ_Pillow;
import object.OBJ_RightBed;
import object.OBJ_RightBedOccupied;
import object.OBJ_Sink;
import object.OBJ_Stairs;
import object.OBJ_Toilet;
import object.OBJ_Tree;
import object.OBJ_VerticalDoor;

public class AssetSetter {
    
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {

        gp.obj[137] = new OBJ_Acid(gp);
        gp.obj[137].worldX = 34 * gp.tileSize;
        gp.obj[137].worldY = 16 * gp.tileSize;

        gp.obj[138] = new OBJ_Acid(gp);
        gp.obj[138].worldX = 21 * gp.tileSize;
        gp.obj[138].worldY = 24 * gp.tileSize;

        gp.obj[139] = new OBJ_Acid(gp);
        gp.obj[139].worldX = 9 * gp.tileSize;
        gp.obj[139].worldY = 24 * gp.tileSize;

        gp.obj[141] = new OBJ_Acid(gp);
        gp.obj[141].worldX = 25 * gp.tileSize;
        gp.obj[141].worldY = 1 * gp.tileSize;

        gp.obj[140] = new OBJ_Acid(gp);
        gp.obj[140].worldX = 1 * gp.tileSize;
        gp.obj[140].worldY = 2 * gp.tileSize;

        gp.obj[1] = new OBJ_Door(gp);
        gp.obj[1].worldX = 4 * gp.tileSize;
        gp.obj[1].worldY = 21 * gp.tileSize;

        gp.obj[2] = new OBJ_Door(gp);
        gp.obj[2].worldX = 16 * gp.tileSize;
        gp.obj[2].worldY = 20 * gp.tileSize;

        gp.obj[3] = new OBJ_Door(gp);
        gp.obj[3].worldX = 4 * gp.tileSize;
        gp.obj[3].worldY = 16 * gp.tileSize;

        gp.obj[4] = new OBJ_Door(gp);
        gp.obj[4].worldX = 16 * gp.tileSize;
        gp.obj[4].worldY = 16 * gp.tileSize;

        gp.obj[5] = new OBJ_Door(gp);
        gp.obj[5].worldX = 28 * gp.tileSize;
        gp.obj[5].worldY = 16 * gp.tileSize;

        gp.obj[6] = new OBJ_Dooray(gp);
        gp.obj[6].worldX = 23 * gp.tileSize;
        gp.obj[6].worldY = 2 * gp.tileSize;

        gp.obj[7] = new OBJ_Door(gp);
        gp.obj[7].worldX = 28 * gp.tileSize;
        gp.obj[7].worldY = 21 * gp.tileSize;

        gp.obj[8] = new OBJ_VerticalDoor(gp);
        gp.obj[8].worldX = 32 * gp.tileSize;
        gp.obj[8].worldY = 18 * gp.tileSize;

        gp.obj[9] = new OBJ_Tree(gp);
        gp.obj[9].worldX = 3 * gp.tileSize;
        gp.obj[9].worldY = 19 * gp.tileSize;

        gp.obj[10] = new OBJ_Tree(gp);
        gp.obj[10].worldX = 5 * gp.tileSize;
        gp.obj[10].worldY = 19 * gp.tileSize;

        gp.obj[11] = new OBJ_Tree(gp);
        gp.obj[11].worldX = 15 * gp.tileSize;
        gp.obj[11].worldY = 19 * gp.tileSize;

        gp.obj[12] = new OBJ_Tree(gp);
        gp.obj[12].worldX = 17 * gp.tileSize;
        gp.obj[12].worldY = 19 * gp.tileSize;

        gp.obj[13] = new OBJ_Tree(gp);
        gp.obj[13].worldX = 27 * gp.tileSize;
        gp.obj[13].worldY = 19 * gp.tileSize;

        gp.obj[14] = new OBJ_Tree(gp);
        gp.obj[14].worldX = 29 * gp.tileSize;
        gp.obj[14].worldY = 19 * gp.tileSize;

        gp.obj[15] = new OBJ_Tree(gp);
        gp.obj[15].worldX = 33 * gp.tileSize;
        gp.obj[15].worldY = 16 * gp.tileSize;

        gp.obj[16] = new OBJ_Tree(gp);
        gp.obj[16].worldX = 15 * gp.tileSize;
        gp.obj[16].worldY = 2 * gp.tileSize;

        gp.obj[17] = new OBJ_LeftBedOccupied(gp);
        gp.obj[17].worldX = 1 * gp.tileSize;
        gp.obj[17].worldY = 4 * gp.tileSize;

        gp.obj[18] = new OBJ_Bed(gp);
        gp.obj[18].worldX = 25 * gp.tileSize;
        gp.obj[18].worldY = 4 * gp.tileSize;

        gp.obj[19] = new OBJ_Bed(gp);
        gp.obj[19].worldX = 1 * gp.tileSize;
        gp.obj[19].worldY = 8 * gp.tileSize;

        gp.obj[20] = new OBJ_LeftBedOccupied(gp);
        gp.obj[20].worldX = 25 * gp.tileSize;
        gp.obj[20].worldY = 8 * gp.tileSize;

        gp.obj[21] = new OBJ_LeftBedOccupied(gp);
        gp.obj[21].worldX = 1 * gp.tileSize;
        gp.obj[21].worldY = 12 * gp.tileSize;

        gp.obj[22] = new OBJ_Bed(gp);
        gp.obj[22].worldX = 25 * gp.tileSize;
        gp.obj[22].worldY = 12 * gp.tileSize;

        gp.obj[23] = new OBJ_RightBed(gp);
        gp.obj[23].worldX = 7 * gp.tileSize;
        gp.obj[23].worldY = 4 * gp.tileSize;

        gp.obj[24] = new OBJ_RightBedOccupied(gp);
        gp.obj[24].worldX = 31 * gp.tileSize;
        gp.obj[24].worldY = 4 * gp.tileSize;

        gp.obj[25] = new OBJ_RightBedOccupied(gp);
        gp.obj[25].worldX = 7 * gp.tileSize;
        gp.obj[25].worldY = 8 * gp.tileSize;

        gp.obj[26] = new OBJ_RightBed(gp);
        gp.obj[26].worldX = 31 * gp.tileSize;
        gp.obj[26].worldY = 8 * gp.tileSize;

        gp.obj[27] = new OBJ_RightBed(gp);
        gp.obj[27].worldX = 7 * gp.tileSize;
        gp.obj[27].worldY = 12 * gp.tileSize;

        gp.obj[28] = new OBJ_RightBedOccupied(gp);
        gp.obj[28].worldX = 31 * gp.tileSize;
        gp.obj[28].worldY = 12 * gp.tileSize;

        gp.obj[29] = new OBJ_PatientBed(gp);
        gp.obj[29].worldX = 35 * gp.tileSize;
        gp.obj[29].worldY = 20 * gp.tileSize;

        gp.obj[30] = new OBJ_AsylumBed(gp);
        gp.obj[30].worldX = 1 * gp.tileSize;
        gp.obj[30].worldY = 24 * gp.tileSize;

        gp.obj[31] = new OBJ_AsylumBed(gp);
        gp.obj[31].worldX = 13 * gp.tileSize;
        gp.obj[31].worldY = 24 * gp.tileSize;

        gp.obj[32] = new OBJ_MonsterBed(gp);
        gp.obj[32].worldX = 25 * gp.tileSize;
        gp.obj[32].worldY = 24 * gp.tileSize;

        gp.obj[33] = new OBJ_Brain(gp);
        gp.obj[33].worldX = 16 * gp.tileSize;
        gp.obj[33].worldY = 12 * gp.tileSize;

        gp.obj[34] = new OBJ_Heart(gp);
        gp.obj[34].worldX = 13 * gp.tileSize;
        gp.obj[34].worldY = 12 * gp.tileSize;

        gp.obj[35] = new OBJ_Kidney(gp);
        gp.obj[35].worldX = 11 * gp.tileSize;
        gp.obj[35].worldY = 12 * gp.tileSize;

        gp.obj[36] = new OBJ_Kidney(gp);
        gp.obj[36].worldX = 17 * gp.tileSize;
        gp.obj[36].worldY = 12 * gp.tileSize;

        gp.obj[37] = new OBJ_Kidney(gp);
        gp.obj[37].worldX = 23 * gp.tileSize;
        gp.obj[37].worldY = 13 * gp.tileSize;

        gp.obj[38] = new OBJ_Kidney(gp);
        gp.obj[38].worldX = 10 * gp.tileSize;
        gp.obj[38].worldY = 24 * gp.tileSize;

        gp.obj[39] = new OBJ_Kidney(gp);
        gp.obj[39].worldX = 23 * gp.tileSize;
        gp.obj[39].worldY = 24 * gp.tileSize;

        gp.obj[40] = new OBJ_Eye(gp);
        gp.obj[40].worldX = 19 * gp.tileSize;
        gp.obj[40].worldY = 13 * gp.tileSize;

        gp.obj[41] = new OBJ_Jar(gp);
        gp.obj[41].worldX = 19 * gp.tileSize;
        gp.obj[41].worldY = 12 * gp.tileSize;

        gp.obj[42] = new OBJ_Jar(gp);
        gp.obj[42].worldX = 14 * gp.tileSize;
        gp.obj[42].worldY = 13 * gp.tileSize;

        gp.obj[43] = new OBJ_Jar(gp);
        gp.obj[43].worldX = 18 * gp.tileSize;
        gp.obj[43].worldY = 13 * gp.tileSize;

        gp.obj[44] = new OBJ_Jar(gp);
        gp.obj[44].worldX = 13 * gp.tileSize;
        gp.obj[44].worldY = 15 * gp.tileSize;


        gp.obj[45] = new OBJ_Blood(gp);
        gp.obj[45].worldX = 1 * gp.tileSize;
        gp.obj[45].worldY = 1 * gp.tileSize;

        gp.obj[46] = new OBJ_Blood(gp);
        gp.obj[46].worldX = 4 * gp.tileSize;
        gp.obj[46].worldY = 1 * gp.tileSize;

        gp.obj[47] = new OBJ_Blood(gp);
        gp.obj[47].worldX = 27 * gp.tileSize;
        gp.obj[47].worldY = 1 * gp.tileSize;

        gp.obj[48] = new OBJ_Blood(gp);
        gp.obj[48].worldX = 7 * gp.tileSize;
        gp.obj[48].worldY = 3 * gp.tileSize;

        gp.obj[49] = new OBJ_Blood(gp);
        gp.obj[49].worldX = 30 * gp.tileSize;
        gp.obj[49].worldY = 3 * gp.tileSize;

        gp.obj[50] = new OBJ_Blood(gp);
        gp.obj[50].worldX = 31 * gp.tileSize;
        gp.obj[50].worldY = 6 * gp.tileSize;

        gp.obj[51] = new OBJ_Blood(gp);
        gp.obj[51].worldX = 6 * gp.tileSize;
        gp.obj[51].worldY = 7 * gp.tileSize;

        gp.obj[52] = new OBJ_Blood(gp);
        gp.obj[52].worldX = 26 * gp.tileSize;
        gp.obj[52].worldY = 8 * gp.tileSize;

        gp.obj[53] = new OBJ_Blood(gp);
        gp.obj[53].worldX = 7 * gp.tileSize;
        gp.obj[53].worldY = 11 * gp.tileSize;

        gp.obj[54] = new OBJ_Blood(gp);
        gp.obj[54].worldX = 9 * gp.tileSize;
        gp.obj[54].worldY = 12 * gp.tileSize;

        gp.obj[55] = new OBJ_Blood(gp);
        gp.obj[55].worldX = 18 * gp.tileSize;
        gp.obj[55].worldY = 12 * gp.tileSize;

        gp.obj[56] = new OBJ_Blood(gp);
        gp.obj[56].worldX = 21 * gp.tileSize;
        gp.obj[56].worldY = 12 * gp.tileSize;

        gp.obj[57] = new OBJ_Blood(gp);
        gp.obj[57].worldX = 26 * gp.tileSize;
        gp.obj[57].worldY = 12 * gp.tileSize;

        gp.obj[58] = new OBJ_Blood(gp);
        gp.obj[58].worldX = 2 * gp.tileSize;
        gp.obj[58].worldY = 14 * gp.tileSize;

        gp.obj[59] = new OBJ_Blood(gp);
        gp.obj[59].worldX = 23 * gp.tileSize;
        gp.obj[59].worldY = 14 * gp.tileSize;

        gp.obj[60] = new OBJ_Blood(gp);
        gp.obj[60].worldX = 35 * gp.tileSize;
        gp.obj[60].worldY = 17 * gp.tileSize;

        gp.obj[61] = new OBJ_Blood(gp);
        gp.obj[61].worldX = 6 * gp.tileSize;
        gp.obj[61].worldY = 15 * gp.tileSize;

        gp.obj[62] = new OBJ_Blood(gp);
        gp.obj[62].worldX = 11 * gp.tileSize;
        gp.obj[62].worldY = 15 * gp.tileSize;

        gp.obj[63] = new OBJ_Blood(gp);
        gp.obj[63].worldX = 25 * gp.tileSize;
        gp.obj[63].worldY = 15 * gp.tileSize;

        gp.obj[64] = new OBJ_Blood(gp);
        gp.obj[64].worldX = 11 * gp.tileSize;
        gp.obj[64].worldY = 17 * gp.tileSize;

        gp.obj[65] = new OBJ_Blood(gp);
        gp.obj[65].worldX = 17 * gp.tileSize;
        gp.obj[65].worldY = 17 * gp.tileSize;

        gp.obj[66] = new OBJ_Blood(gp);
        gp.obj[66].worldX = 27 * gp.tileSize;
        gp.obj[66].worldY = 17 * gp.tileSize;

        gp.obj[67] = new OBJ_Blood(gp);
        gp.obj[67].worldX = 31 * gp.tileSize;
        gp.obj[67].worldY = 17 * gp.tileSize;

        gp.obj[68] = new OBJ_Blood(gp);
        gp.obj[68].worldX = 23 * gp.tileSize;
        gp.obj[68].worldY = 18 * gp.tileSize;

        gp.obj[69] = new OBJ_Blood(gp);
        gp.obj[69].worldX = 6 * gp.tileSize;
        gp.obj[69].worldY = 19 * gp.tileSize;

        gp.obj[70] = new OBJ_Blood(gp);
        gp.obj[70].worldX = 11 * gp.tileSize;
        gp.obj[70].worldY = 20 * gp.tileSize;

        gp.obj[71] = new OBJ_Blood(gp);
        gp.obj[71].worldX = 22 * gp.tileSize;
        gp.obj[71].worldY = 20 * gp.tileSize;

        gp.obj[72] = new OBJ_Blood(gp);
        gp.obj[72].worldX = 34 * gp.tileSize;
        gp.obj[72].worldY = 20 * gp.tileSize;

        gp.obj[73] = new OBJ_Blood(gp);
        gp.obj[73].worldX = 11 * gp.tileSize;
        gp.obj[73].worldY = 24 * gp.tileSize;

        gp.obj[74] = new OBJ_Blood(gp);
        gp.obj[74].worldX = 22 * gp.tileSize;
        gp.obj[74].worldY = 24 * gp.tileSize;

        gp.obj[75] = new OBJ_Blood(gp);
        gp.obj[75].worldX = 13 * gp.tileSize;
        gp.obj[75].worldY = 13 * gp.tileSize;

        gp.obj[76] = new OBJ_Blood(gp);
        gp.obj[76].worldX = 1 * gp.tileSize;
        gp.obj[76].worldY = 10 * gp.tileSize;

        gp.obj[142] = new OBJ_Blood(gp);
        gp.obj[142].worldX = 2 * gp.tileSize;
        gp.obj[142].worldY = 2 * gp.tileSize;


        gp.obj[77] = new OBJ_Blood2(gp);
        gp.obj[77].worldX = 5 * gp.tileSize;
        gp.obj[77].worldY = 1 * gp.tileSize;

        gp.obj[101] = new OBJ_Blood2(gp);
        gp.obj[101].worldX = 3 * gp.tileSize;
        gp.obj[101].worldY = 2 * gp.tileSize;

        gp.obj[78] = new OBJ_Blood2(gp);
        gp.obj[78].worldX = 35 * gp.tileSize;
        gp.obj[78].worldY = 16 * gp.tileSize;

        gp.obj[79] = new OBJ_Blood2(gp);
        gp.obj[79].worldX = 31 * gp.tileSize;
        gp.obj[79].worldY = 1 * gp.tileSize;

        gp.obj[80] = new OBJ_Blood2(gp);
        gp.obj[80].worldX = 2 * gp.tileSize;
        gp.obj[80].worldY = 8 * gp.tileSize;

        gp.obj[81] = new OBJ_Blood2(gp);
        gp.obj[81].worldX = 25 * gp.tileSize;
        gp.obj[81].worldY = 10 * gp.tileSize;

        gp.obj[82] = new OBJ_Blood2(gp);
        gp.obj[82].worldX = 10 * gp.tileSize;
        gp.obj[82].worldY = 12 * gp.tileSize;

        gp.obj[83] = new OBJ_Blood2(gp);
        gp.obj[83].worldX = 22 * gp.tileSize;
        gp.obj[83].worldY = 12 * gp.tileSize;

        gp.obj[84] = new OBJ_Blood2(gp);
        gp.obj[84].worldX = 9 * gp.tileSize;
        gp.obj[84].worldY = 13 * gp.tileSize;

        gp.obj[85] = new OBJ_Blood2(gp);
        gp.obj[85].worldX = 21 * gp.tileSize;
        gp.obj[85].worldY = 13 * gp.tileSize;

        gp.obj[86] = new OBJ_Blood2(gp);
        gp.obj[86].worldX = 7 * gp.tileSize;
        gp.obj[86].worldY = 14 * gp.tileSize;

        gp.obj[87] = new OBJ_Blood2(gp);
        gp.obj[87].worldX = 17 * gp.tileSize;
        gp.obj[87].worldY = 14 * gp.tileSize;

        gp.obj[88] = new OBJ_Blood2(gp);
        gp.obj[88].worldX = 30 * gp.tileSize;
        gp.obj[88].worldY = 14 * gp.tileSize;

        gp.obj[89] = new OBJ_Blood2(gp);
        gp.obj[89].worldX = 10 * gp.tileSize;
        gp.obj[89].worldY = 16 * gp.tileSize;

        gp.obj[90] = new OBJ_Blood2(gp);
        gp.obj[90].worldX = 22 * gp.tileSize;
        gp.obj[90].worldY = 16 * gp.tileSize;

        gp.obj[91] = new OBJ_Blood2(gp);
        gp.obj[91].worldX = 18 * gp.tileSize;
        gp.obj[91].worldY = 17 * gp.tileSize;

        gp.obj[92] = new OBJ_Blood2(gp);
        gp.obj[92].worldX = 22 * gp.tileSize;
        gp.obj[92].worldY = 17 * gp.tileSize;

        gp.obj[93] = new OBJ_Blood2(gp);
        gp.obj[93].worldX = 1 * gp.tileSize;
        gp.obj[93].worldY = 18 * gp.tileSize;

        gp.obj[94] = new OBJ_Blood2(gp);
        gp.obj[94].worldX = 9 * gp.tileSize;
        gp.obj[94].worldY = 19 * gp.tileSize;

        gp.obj[95] = new OBJ_Blood2(gp);
        gp.obj[95].worldX = 14 * gp.tileSize;
        gp.obj[95].worldY = 19 * gp.tileSize;

        gp.obj[96] = new OBJ_Blood2(gp);
        gp.obj[96].worldX = 21 * gp.tileSize;
        gp.obj[96].worldY = 19 * gp.tileSize;

        gp.obj[97] = new OBJ_Blood2(gp);
        gp.obj[97].worldX = 10 * gp.tileSize;
        gp.obj[97].worldY = 22 * gp.tileSize;

        gp.obj[98] = new OBJ_Blood2(gp);
        gp.obj[98].worldX = 21 * gp.tileSize;
        gp.obj[98].worldY = 22 * gp.tileSize;

        gp.obj[99] = new OBJ_Blood2(gp);
        gp.obj[99].worldX = 5 * gp.tileSize;
        gp.obj[99].worldY = 17 * gp.tileSize;

        gp.obj[100] = new OBJ_Blood2(gp);
        gp.obj[100].worldX = 2 * gp.tileSize;
        gp.obj[100].worldY = 12 * gp.tileSize;

        gp.obj[143] = new OBJ_Bin(gp);
        gp.obj[143].worldX = 14 * gp.tileSize;
        gp.obj[143].worldY = 26 * gp.tileSize;

        gp.obj[102] = new OBJ_Blood2(gp);
        gp.obj[102].worldX = 21 * gp.tileSize;
        gp.obj[102].worldY = 2 * gp.tileSize;


        gp.obj[103] = new OBJ_Blood3(gp);
        gp.obj[103].worldX = 3 * gp.tileSize;
        gp.obj[103].worldY = 1 * gp.tileSize;
        
        gp.obj[104] = new OBJ_Blood3(gp);
        gp.obj[104].worldX = 6 * gp.tileSize;
        gp.obj[104].worldY = 1 * gp.tileSize;
        
        gp.obj[105] = new OBJ_Blood3(gp);
        gp.obj[105].worldX = 26 * gp.tileSize;
        gp.obj[105].worldY = 2 * gp.tileSize;
        
        gp.obj[106] = new OBJ_Blood3(gp);
        gp.obj[106].worldX = 25 * gp.tileSize;
        gp.obj[106].worldY = 5 * gp.tileSize;
        
        gp.obj[107] = new OBJ_Blood3(gp);
        gp.obj[107].worldX = 30 * gp.tileSize;
        gp.obj[107].worldY = 4 * gp.tileSize;
        
        gp.obj[108] = new OBJ_Blood3(gp);
        gp.obj[108].worldX = 1 * gp.tileSize;
        gp.obj[108].worldY = 6 * gp.tileSize;
        
        gp.obj[109] = new OBJ_Blood3(gp);
        gp.obj[109].worldX = 30 * gp.tileSize;
        gp.obj[109].worldY = 8 * gp.tileSize;
        
        gp.obj[110] = new OBJ_Blood3(gp);
        gp.obj[110].worldX = 30 * gp.tileSize;
        gp.obj[110].worldY = 11 * gp.tileSize;
        
        gp.obj[111] = new OBJ_Blood3(gp);
        gp.obj[111].worldX = 6 * gp.tileSize;
        gp.obj[111].worldY = 12 * gp.tileSize;
        
        gp.obj[112] = new OBJ_Blood3(gp);
        gp.obj[112].worldX = 23 * gp.tileSize;
        gp.obj[112].worldY = 12 * gp.tileSize;
        
        gp.obj[113] = new OBJ_Blood3(gp);
        gp.obj[113].worldX = 10 * gp.tileSize;
        gp.obj[113].worldY = 13 * gp.tileSize;
        
        gp.obj[114] = new OBJ_Blood3(gp);
        gp.obj[114].worldX = 9 * gp.tileSize;
        gp.obj[114].worldY = 14 * gp.tileSize;
        
        gp.obj[115] = new OBJ_Blood3(gp);
        gp.obj[115].worldX = 15 * gp.tileSize;
        gp.obj[115].worldY = 14 * gp.tileSize;
        
        gp.obj[116] = new OBJ_Blood3(gp);
        gp.obj[116].worldX = 21 * gp.tileSize;
        gp.obj[116].worldY = 14 * gp.tileSize;
        
        gp.obj[117] = new OBJ_Blood3(gp);
        gp.obj[117].worldX = 5 * gp.tileSize;
        gp.obj[117].worldY = 15 * gp.tileSize;
        
        gp.obj[118] = new OBJ_Blood3(gp);
        gp.obj[118].worldX = 27 * gp.tileSize;
        gp.obj[118].worldY = 15 * gp.tileSize;
        
        gp.obj[119] = new OBJ_Blood3(gp);
        gp.obj[119].worldX = 19 * gp.tileSize;
        gp.obj[119].worldY = 17 * gp.tileSize;
        
        gp.obj[120] = new OBJ_Blood3(gp);
        gp.obj[120].worldX = 2 * gp.tileSize;
        gp.obj[120].worldY = 18 * gp.tileSize;
        
        gp.obj[121] = new OBJ_Blood3(gp);
        gp.obj[121].worldX = 9 * gp.tileSize;
        gp.obj[121].worldY = 18 * gp.tileSize;
        
        gp.obj[122] = new OBJ_Blood3(gp);
        gp.obj[122].worldX = 25 * gp.tileSize;
        gp.obj[122].worldY = 18 * gp.tileSize;
        
        gp.obj[123] = new OBJ_Blood3(gp);
        gp.obj[123].worldX = 29 * gp.tileSize;
        gp.obj[123].worldY = 18 * gp.tileSize;
        
        gp.obj[124] = new OBJ_Blood3(gp);
        gp.obj[124].worldX = 1 * gp.tileSize;
        gp.obj[124].worldY = 19 * gp.tileSize;
        
        gp.obj[125] = new OBJ_Blood3(gp);
        gp.obj[125].worldX = 7 * gp.tileSize;
        gp.obj[125].worldY = 19 * gp.tileSize;
        
        gp.obj[126] = new OBJ_Blood3(gp);
        gp.obj[126].worldX = 12 * gp.tileSize;
        gp.obj[126].worldY = 19 * gp.tileSize;
        
        gp.obj[127] = new OBJ_Blood3(gp);
        gp.obj[127].worldX = 19 * gp.tileSize;
        gp.obj[127].worldY = 19 * gp.tileSize;
        
        gp.obj[128] = new OBJ_Blood3(gp);
        gp.obj[128].worldX = 22 * gp.tileSize;
        gp.obj[128].worldY = 19 * gp.tileSize;
        
        gp.obj[129] = new OBJ_Blood3(gp);
        gp.obj[129].worldX = 25 * gp.tileSize;
        gp.obj[129].worldY = 19 * gp.tileSize;
        
        gp.obj[130] = new OBJ_Blood3(gp);
        gp.obj[130].worldX = 30 * gp.tileSize;
        gp.obj[130].worldY = 19 * gp.tileSize;
        
        gp.obj[131] = new OBJ_Blood3(gp);
        gp.obj[131].worldX = 10 * gp.tileSize;
        gp.obj[131].worldY = 21 * gp.tileSize;
        
        gp.obj[132] = new OBJ_Blood3(gp);
        gp.obj[132].worldX = 23 * gp.tileSize;
        gp.obj[132].worldY = 22 * gp.tileSize;
        
        gp.obj[133] = new OBJ_Blood3(gp);
        gp.obj[133].worldX = 11 * gp.tileSize;
        gp.obj[133].worldY = 23 * gp.tileSize;
        
        gp.obj[134] = new OBJ_Blood3(gp);
        gp.obj[134].worldX = 21 * gp.tileSize;
        gp.obj[134].worldY = 23 * gp.tileSize;

        
        gp.obj[135] = new OBJ_Bin(gp);
        gp.obj[135].worldX = 2 * gp.tileSize;
        gp.obj[135].worldY = 26 * gp.tileSize;
        
        gp.obj[136] = new OBJ_Bin(gp);
        gp.obj[136].worldX = 26 * gp.tileSize;
        gp.obj[136].worldY = 26 * gp.tileSize;
        
        gp.obj[0] = new OBJ_Dooray(gp);
        gp.obj[0].worldX = 8 * gp.tileSize;
        gp.obj[0].worldY = 2 * gp.tileSize;
        
        gp.obj[144] = new OBJ_Jar(gp);
        gp.obj[144].worldX = 19 * gp.tileSize;
        gp.obj[144].worldY = 15 * gp.tileSize;
        
        gp.obj[145] = new OBJ_Stairs(gp);
        gp.obj[145].worldX = 16 * gp.tileSize;
        gp.obj[145].worldY = 1 * gp.tileSize;

        gp.obj[146] = new OBJ_Picture(gp);
        gp.obj[146].worldX = 28 * gp.tileSize;
        gp.obj[146].worldY = 0 * gp.tileSize;
        
        gp.obj[147] = new OBJ_Toilet(gp);
        gp.obj[147].worldX = 3 * gp.tileSize;
        gp.obj[147].worldY = 26 * gp.tileSize;

        gp.obj[148] = new OBJ_Toilet(gp);
        gp.obj[148].worldX = 15 * gp.tileSize;
        gp.obj[148].worldY = 26 * gp.tileSize;

        gp.obj[149] = new OBJ_Toilet(gp);
        gp.obj[149].worldX = 27 * gp.tileSize;
        gp.obj[149].worldY = 26 * gp.tileSize;

        gp.obj[150] = new OBJ_Sink(gp);
        gp.obj[150].worldX = 5 * gp.tileSize;
        gp.obj[150].worldY = 26 * gp.tileSize;

        gp.obj[151] = new OBJ_Sink(gp);
        gp.obj[151].worldX = 17 * gp.tileSize;
        gp.obj[151].worldY = 26 * gp.tileSize;

        gp.obj[152] = new OBJ_Sink(gp);
        gp.obj[152].worldX = 29 * gp.tileSize;
        gp.obj[152].worldY = 26 * gp.tileSize;

        gp.obj[153] = new OBJ_Pillow(gp);
        gp.obj[153].worldX = 31 * gp.tileSize;
        gp.obj[153].worldY = 21 * gp.tileSize;

        gp.obj[154] = new OBJ_Intercom(gp);
        gp.obj[154].worldX = 30 * gp.tileSize;
        gp.obj[154].worldY = 20 * gp.tileSize;

        gp.obj[155] = new OBJ_Food(gp);
        gp.obj[155].worldX = 27 * gp.tileSize;
        gp.obj[155].worldY = 22 * gp.tileSize;

        gp.obj[156] = new OBJ_Key(gp);
        gp.obj[156].worldX = 5 * gp.tileSize;
        gp.obj[156].worldY = 28 * gp.tileSize;

        gp.obj[157] = new OBJ_Key(gp);
        gp.obj[157].worldX = 17 * gp.tileSize;
        gp.obj[157].worldY = 28 * gp.tileSize;
    }

    public void setNPC() {

        gp.npc[0] = new NPC_BlondPatient(gp);
        gp.npc[0].worldX =  25 * gp.tileSize;
        gp.npc[0].worldY =  13 * gp.tileSize;

        gp.npc[1] = new NPC_BlackPatient(gp);
        gp.npc[1].worldX =  26 * gp.tileSize;
        gp.npc[1].worldY =  4 * gp.tileSize;

        gp.npc[2] = new NPC_GingerPatient(gp);
        gp.npc[2].worldX =  31 * gp.tileSize;
        gp.npc[2].worldY =  7 * gp.tileSize;

        gp.npc[3] = new NPC_PurpPatient(gp);
        gp.npc[3].worldX =  1 * gp.tileSize;
        gp.npc[3].worldY =  9 * gp.tileSize;

        gp.npc[4] = new NPC_BluePatient(gp);
        gp.npc[4].worldX =  6 * gp.tileSize;
        gp.npc[4].worldY =  4 * gp.tileSize;

        gp.npc[5] = new NPC_VitiligoPatient(gp);
        gp.npc[5].worldX =  6 * gp.tileSize;
        gp.npc[5].worldY =  11 * gp.tileSize;
    }
}