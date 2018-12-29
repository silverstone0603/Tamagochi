/*
 *	Project My Puppy Story
 *	Q&A Fnc. of Study Mode Class
 *	
 *	Team N1 _ Oh EunSeok, Kim MinYeong, Yoon GeonHui
 *	Since 17.09.12
 *	
 *	Version 0.2.0 Official
 *	Last update : 17.10.22
 */
package TMGC;
import java.util.*;
import java.text.*;
import java.io.*;

public class TMGCQNA {
	public static void question() {
		Scanner scanQNA = new Scanner(System.in);
		String tmpText="";
		
		int tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		String[][] tmpQst= new String[2][41];
		int tmpQstRst=0;
		
		for(int tmpClear=0;tmpClear<7;tmpClear++) {
			System.out.println("");
		}
		
		TMGC.playMotion("study","������ �غ��ϰ� �ֽ��ϴ�... ��ø� ��ٷ��ּ���~");
		TMGC.playMotion("study_down","������ �غ��ϰ� �ֽ��ϴ�... ��ø� ��ٷ��ּ���~");
		TMGC.playMotion("study","������ �غ��ϰ� �ֽ��ϴ�... ��ø� ��ٷ��ּ���~");
		TMGC.playMotion("study_down","������ �غ��ϰ� �ֽ��ϴ�... ��ø� ��ٷ��ּ���~");
		
		//0 : ����, 1 : ����
		tmpQst[0][0] = "�ѱ��� ������ �뱸�̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";              //�� : X
		tmpQst[1][0] = "Ʋ����";
		tmpQst[0][1] = "�Ϻ��� ������ �����̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";              //�� : O
		tmpQst[1][1] = "�´�";
		tmpQst[0][2] = "�߱��� ������ ����¡�̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";             //�� : O
		tmpQst[1][2] = "�´�";
		tmpQst[0][3] = "�̱��� ������ �������̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";             //�� : O
		tmpQst[1][3] = "�´�";
		tmpQst[0][4] = "�̽����� ������ ������̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";          //�� : X
		tmpQst[1][4] = "Ʋ����";
		tmpQst[0][5] = "�̶��� ������ ������̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";             //�� : O
		tmpQst[1][5] = "�´�";
		tmpQst[0][6] = "������ ������ �������̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";             //�� : O
		tmpQst[1][6] = "�´�";
		tmpQst[0][7] = "����θ�ũ�� ������ ����θ�ũ�̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";       //�� : O
		tmpQst[1][7] = "�´�";
		tmpQst[0][8] = "��Ƽĭ�� ������ ��Ƽĭ�̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";            //�� : O
		tmpQst[1][8] = "�´�";
		tmpQst[0][9] = "�׸����� ������ ���׳��̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";            //�� : O
		tmpQst[1][9] = "�´�";
		tmpQst[0][10] = "�븣������ ������ �븣�����̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";        //�� : X
		tmpQst[1][10] = "Ʋ����";
		tmpQst[0][11] = "������ ������ ��ó����������Ƽ���̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";     //�� : X  
		tmpQst[1][11] = "Ʋ����";
		tmpQst[0][12] = "�������� ������ �ĸ��̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";             //�� : O
		tmpQst[1][12] = "�´�";
		tmpQst[0][13] = "��Ż������ ������ �θ��̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";            //�� : O
		tmpQst[1][13] = "�´�";
		tmpQst[0][14] = "�������� ������ �����̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";             //�� : O
		tmpQst[1][14] = "�´�";
		tmpQst[0][15] = "���⿡�� ������ �긮���̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";            //�� : O
		tmpQst[1][15] = "�´�";
		tmpQst[0][16] = "���׸����� ������ ���׸����̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";         //�� : O
		tmpQst[1][16] = "�´�";
		tmpQst[0][17] = "������������ ������ �ƺ����̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";         //�� : O
		tmpQst[1][17] = "�´�";
		tmpQst[0][18] = "�ε��� ������ �ε��׽þ��̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";          //�� : X
		tmpQst[1][18] = "Ʋ����";
		tmpQst[0][19] = "ȣ���� ������ �˹����̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";             //�� : O
		tmpQst[1][19] = "�´�";
		tmpQst[0][20] = "�ɳ����� ������ ��Ÿ���̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";            //�� : O
		tmpQst[1][20] = "�´�";
		tmpQst[0][21] = "���̽������� ������ ���̽������̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";      //�� : X
		tmpQst[1][21] = "Ʋ����";
		tmpQst[0][22] = "��Ű�� ������ ��ī���̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";             //�� : O
		tmpQst[1][22] = "�´�";
		tmpQst[0][23] = "ü���� ������ �������̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";             //�� : O
		tmpQst[1][23] = "�´�";
		tmpQst[0][24] = "������� ������ ����������̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";         //�� : O
		tmpQst[1][24] = "�´�";
		tmpQst[0][25] = "��۶󵥽��� ������ ��۶󵥽þ��̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";     //�� : X
		tmpQst[1][25] = "Ʋ����";
		tmpQst[0][26] = "��Ʈ���� ������ �ϳ����̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";            //�� : O
		tmpQst[1][26] = "�´�";
		tmpQst[0][27] = "Ÿ�̿��� ������ Ÿ�̿��̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";           //�� : X
		tmpQst[1][27] = "Ʋ����";
		tmpQst[0][28] = "�ʸ����� ������ ���Ҷ��̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";           //�� : O
		tmpQst[1][28] = "�´�";
		tmpQst[0][29] = "�̰������� ������ ��ī�����̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";         //�� : O
		tmpQst[1][29] = "�´�";
		tmpQst[0][30] = "��ũ���̳��� ������ ��ũ���̳��̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";      //�� : X
		tmpQst[1][30] = "Ʋ����";
		tmpQst[0][31] = "�ɶ����� ������ ���Ű�̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";           //�� : O
		tmpQst[1][31] = "�´�";
		tmpQst[0][32] = "�Ұ������� ������ ���Ǿ��̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";          //�� : O
		tmpQst[1][32] = "�´�";
		tmpQst[0][33] = "������� ������ �����̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";             //�� : O
		tmpQst[1][33] = "�´�";
		tmpQst[0][34] = "��ź�� ������ ��ź�̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";              //�� : X
		tmpQst[1][34] = "Ʋ����";
		tmpQst[0][35] = "���ٳ��� ������ ���ٳ��̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";           //�� : X
		tmpQst[1][35] = "Ʋ����";
		tmpQst[0][36] = "����ƶ����� ������ ���ߵ��̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";      //�� : O
		tmpQst[1][36] = "�´�";
		tmpQst[0][37] = "�ٷ����� ������ �ٷ����̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";           //�� : X
		tmpQst[1][37] = "Ʋ����";
		tmpQst[0][38] = "������ ������ īƮ�����̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";            //�� : O
		tmpQst[1][38] = "�´�";
		tmpQst[0][39] = "���þ��� ������ ��ũ���̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";          //�� : O
		tmpQst[1][39] = "�´�";
		tmpQst[0][40] = "ũ�ξ�Ƽ���� ������ ũ�ξ�Ƽ���̴�. (�´� �Ǵ� Ʋ���� �� �Է�)";	   //�� : X
		tmpQst[1][40] = "Ʋ����";
		
		for(int tmpClear=0;tmpClear<15;tmpClear++) {
			System.out.println("");
		}
		
		//���� ����
		if(TMGCSYS.tmgcLV>0 && TMGCSYS.tmgcLV<=5) {
			//�ʱ�
			tmpQstRst = TMGC.setrnd(10);
			System.out.print("\n\n[System] " + tmpQst[0][tmpQstRst] + "\n         ���� �Է� : ");
			tmpText = scanQNA.next();
			
			//tmp TMGC.setrnd(10)
		}else if(TMGCSYS.tmgcLV>5 && TMGCSYS.tmgcLV<=9) {
			//�߱�
			tmpQstRst = TMGC.setrnd(9)+11;
			System.out.print("\n\n[System] " + tmpQst[0][tmpQstRst] + "\n         ���� �Է� : ");
			tmpText = scanQNA.next();
			
			//tmpQst[0][TMGC.setrnd(9)+11]
		}else if(TMGCSYS.tmgcLV>9 && TMGCSYS.tmgcLV<=14) {
			//���
			tmpQstRst = TMGC.setrnd(9)+21;
			System.out.print("\n\n[System] " + tmpQst[0][tmpQstRst] + "\n         ���� �Է� : ");
			tmpText = scanQNA.next();
			//tmpQst[0][TMGC.setrnd(9)+21]
		}else{
			//�׿� ����
			tmpQstRst = TMGC.setrnd(9)+31;
			System.out.print("\n\n[System] " + tmpQst[0][tmpQstRst] + "\n         ���� �Է� : ");
			tmpText = scanQNA.next();
			//tmpQst[0][TMGC.setrnd(9)+31]
		}
		
		for(int tmpClear=0;tmpClear<5;tmpClear++) {
			System.out.println("");
		}
		
		//���� üũ
		if(tmpText.equals(tmpQst[1][tmpQstRst])) {
				//������ ���
				System.out.print("[System] �����Դϴ�!\n"
						+"         "+TMGCSYS.tmgcName+"�� ���� �� �ȶ��� �����!\n\n");
	
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (10+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (10+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (5+TMGCSYS.tmgcFeel);
				}
				
				TMGCSYS.tmgcLimitStudy += 1;
				TMGCSYS.tmgcCountStudy += 1;
				
				if(TMGCSYS.tmgcLimitStudy>=1)	TMGCSYS.tmgcCheckRegularHealth+=1;
				
				TMGC.setlevel();
				TMGC.setability(0, 1, 0, 0);
				
				System.out.println("         (���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
		}else {
				//������ ���
				System.out.print("[System] ������ �ƴմϴ�...\n"
						+"         "+TMGCSYS.tmgcName+"�� ����� ����������...�̤���\n\n");
				
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (10+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (10+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (15+TMGCSYS.tmgcFeel);
				}
				
				TMGCSYS.tmgcLimitStudy += 1;
				TMGCSYS.tmgcCountStudy += 1;
				
				if(TMGCSYS.tmgcLimitStudy>=1)	TMGCSYS.tmgcCheckRegularHealth+=1;
				
				TMGC.setlevel();
				
				System.out.println("         (���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
		}
	}
}
