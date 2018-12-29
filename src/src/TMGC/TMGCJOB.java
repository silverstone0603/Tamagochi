/*
 *	Project My Puppy Story
 *	2nd Job Function Class
 *	
 *	Team N1 _ Oh EunSeok, Kim MinYeong, Yoon GeonHui
 *	Since 17.09.12
 *	
 *	Version 0.2.0 Official
 *	Last update : 17.10.22
 */
package TMGC;
import java.util.*;

public class TMGCJOB {
	public static void set2ndJobRecmd(){
		/*
		 * ���� ��õ �ڵ�
		 *  S, SH : �����, ����
		 *  I, IH : Ž����, �ȳ���
		 *  D, DH : ��ġ���, ��Ÿ��
		 */
		String tmpRecmdJob="";
		int tmpArticleSTR=0,tmpArticleINT=0,tmpArticleDEB=0,tmpArticleHET=0;
		tmpArticleSTR=TMGCSYS.tmgcSTR;
		tmpArticleINT=TMGCSYS.tmgcINT;
		tmpArticleDEB=TMGCSYS.tmgcDEB;
		tmpArticleHET=TMGCSYS.tmgcHET;
		
		/*										STR												*/
		if(tmpArticleSTR>tmpArticleINT && tmpArticleINT>tmpArticleDEB) {
			//1>2>3
			tmpRecmdJob = "S";
		}else if(tmpArticleSTR>tmpArticleDEB && tmpArticleDEB>tmpArticleINT) {
			//1>3>2
			tmpRecmdJob = "S";
			
		/*										INT												*/
		}else if(tmpArticleINT>tmpArticleSTR && tmpArticleSTR>tmpArticleDEB) {
			//2>1>3
			tmpRecmdJob = "I";
		}else if(tmpArticleINT>tmpArticleDEB && tmpArticleDEB>tmpArticleSTR) {
			//2>3>1
			tmpRecmdJob = "I";
			
		/*										DEB												*/
		}else if(tmpArticleDEB>tmpArticleSTR && tmpArticleSTR>tmpArticleINT) {
			//3>1>2
			tmpRecmdJob = "D";
		}else if(tmpArticleDEB>tmpArticleINT && tmpArticleINT>tmpArticleSTR) {
			//3>2>1
			tmpRecmdJob = "D";
		}else if(tmpArticleSTR==tmpArticleINT || tmpArticleSTR==tmpArticleDEB || tmpArticleINT==tmpArticleDEB) {
			//3���� �ɷ�ġ�� �ΰ��� ���� ������ ��� ���� ���� ����
			switch(TMGC.setrnd(3)) {
			case 1:
				tmpRecmdJob = "S";
				break;
			case 2:
				tmpRecmdJob = "I";
				break;
			case 3:
				tmpRecmdJob = "D";
				break;
			}
		}
		
		//HET �ڵ�
		if(tmpArticleHET>=30){
			tmpRecmdJob = tmpRecmdJob+"H";
		}
		
		TMGCSYS.tmgc2ndJob = tmpRecmdJob;
	}
	
	//����, �����Ʒ�
	public static void strBattle(){
		int tmpNum, tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpNum = TMGC.setrnd(3);
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		switch(tmpNum) {
			case 1: //���� �Ʒ���
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (40+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (20+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (10+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(1, 0, 0, 0);
				
				TMGC.playMotion("normal", "���� �Ʒ��忡�� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "���� �Ʒ��忡�� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal", "���� �Ʒ��忡�� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "���� �Ʒ��忡�� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				
				System.out.println("���� �Ʒ��嵵 �����Ѱ� ��ŭ ������ �ʳ׿�... �׷��� �� ������? ����\n(���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 2: //�뱸 ����
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (60+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (30+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (20+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(2, 0, 0, 0);
				
				TMGC.playMotion("normal", "�뱸 ���� ��ȸ���� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "�뱸 ���� ��ȸ���� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal", "�뱸 ���� ��ȸ���� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "�뱸 ���� ��ȸ���� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				
				System.out.println("���� ���� ��ȸ�� �����ϰ� ���� �ƴѰ�����... �׷��� �� ��������? ����\n(���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 3: //���� ���� ��ȸ
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (80+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (40+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (30+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(3, 0, 0, 0);
				
				TMGC.playMotion("normal", "���� ���� ��ȸ���� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "���� ���� ��ȸ���� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal", "���� ���� ��ȸ���� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "���� ���� ��ȸ���� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				
				System.out.println("���� ���� ��ȸ�� �����ϰ� ���� �ƴѰ�����... �׷��� �� ��������? ����\n(���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
		}
	}
	public static void strGuard(){
		int tmpNum, tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpNum = TMGC.setrnd(3);
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		switch(tmpNum) {
			case 1: //���� �Ʒ���
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (40+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (20+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (10+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(1, 0, 0, 0);
				
				TMGC.playMotion("normal", "���� �Ʒ��忡�� ��ȣ �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "���� �Ʒ��忡�� ��ȣ �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal", "���� �Ʒ��忡�� ��ȣ �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "���� �Ʒ��忡�� ��ȣ �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				
				System.out.println("���� �Ʒ��嵵 �������� �����ϳ׿�... �׷��� �� ������? ����\n(���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 2: //���� ������� ���� �Ʒ�
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (60+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (30+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (20+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(2, 1, 0, 0);
				
				TMGC.playMotion("normal", "���� ������뿡�� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "���� ������뿡�� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal", "���� ������뿡�� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "���� ������뿡�� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				
				System.out.println("���� �������� �㿡�� ����� ���׿�... �׷��� �� ��������? ����\n(���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 3: //����û �߰� ���� �Ʒ�
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (80+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (40+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (30+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(3, 1, 0, 0);
				
				TMGC.playMotion("normal", "����û���� �߰� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "����û���� �߰� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal", "����û���� �߰� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "����û���� �߰� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				
				System.out.println("�߰� ���� �Ʒ��� �ʹ� ������ -_- a... �� ������� �� ���ƿ�...\n(���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
		}
	}
	
	//�����ñ�, ǥ�ñ����Ʒ�
	public static void intOlfaction(){
		int tmpNum, tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpNum = TMGC.setrnd(3);
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		switch(tmpNum) {
			case 1: //���� �Ʒ���
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (40+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (15+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (20+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(0, 1, 0, 0);
				
				TMGC.playMotion("normal", "���� �Ʒ��忡�� �İ� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "���� �Ʒ��忡�� �İ� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal", "���� �Ʒ��忡�� �İ� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "���� �Ʒ��忡�� �İ� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				
				System.out.println("���� �������� ���ݾ� �� �� ���ƿ�... �� ����ؾ߰ھ��!\n(���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 2: //ź�� ������� �İ� �Ʒ�
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (50+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (20+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (25+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(1, 2, 0, 0);
				
				TMGC.playMotion("normal", "ź�� ������뿡�� �İ� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "ź�� ������뿡�� �İ� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal", "ź�� ������뿡�� �İ� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "ź�� ������뿡�� �İ� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				
				System.out.println("ź�� �������� ���� ������ �� ���ƿ�... �ű⼭�� ���׸��� �Ҿ��� �����սô�!\n(���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 3: //�뱸�������� ���� Ž�� �İ� �Ʒ�
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (60+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (25+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (30+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(1, 3, 0, 0);
				
				TMGC.playMotion("normal", "�뱸�������׿��� ���� Ž�� �İ� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "�뱸�������׿��� ���� Ž�� �İ� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal", "�뱸�������׿��� ���� Ž�� �İ� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "�뱸�������׿��� ���� Ž�� �İ� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				
				System.out.println("���� Ž�� �Ʒ��� �ʹ� ������... �� ������� �� ���ƿ�...\n(���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
		}
	}
	public static void intDisplay(){
		int tmpNum, tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpNum = TMGC.setrnd(3);
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		switch(tmpNum) {
			case 1: //���� �Ʒ���
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (40+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (15+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (20+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(0, 1, 0, 0);
				
				TMGC.playMotion("common_1", "���� �Ʒ��忡�� ǥ�� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("common_2", "���� �Ʒ��忡�� ǥ�� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("common_1", "���� �Ʒ��忡�� ǥ�� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("common_2", "���� �Ʒ��忡�� ǥ�� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				
				System.out.println("���� ����(Sign)���� ���ݾ� �� �� ���ƿ�... �� ����ؾ߰ھ��!\n(���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 2: //���� ��� �� �߻� ���� ���� �Ʒ�
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (50+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (20+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (25+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(1, 2, 0, 0);
				
				TMGC.playMotion("common_1", "���� ��뿡�� �� �߻� ���� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("common_2", "���� ��뿡�� �� �߻� ���� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("common_1", "���� ��뿡�� �� �߻� ���� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("common_2", "���� ��뿡�� �� �߻� ���� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				
				System.out.println("���� ���� ���� ������ �� ���ƿ�... ���ѱ��� ��¦�� ���ϰڴ°ɿ�? ����\n(���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 3: //�뱸�������� ���߹� Ž�� �Ʒ�
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (60+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (25+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (30+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(1, 3, 0, 0);
				
				TMGC.playMotion("common_1", "�뱸�������׿��� ���߹� Ž�� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("common_2", "�뱸�������׿��� ���߹� Ž�� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("common_1", "�뱸�������׿��� ���߹� Ž�� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("common_2", "�뱸�������׿��� ���߹� Ž�� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				
				System.out.println("���߹� Ž�� �Ʒ��� �ʹ� ������... �� ������� �� ���ƿ�...\n(���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
		}
	}
	
	//��ȣ�Ʒ�, ���α�
	public static void debSign(){
		int tmpNum, tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpNum = TMGC.setrnd(3);
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		switch(tmpNum) {
			case 1: //�ֿϰ� ���� �Ƹ����� ���� �Ʒ�
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (40+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (15+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (20+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(0, 0, 1, 0);
				
				TMGC.playMotion("common_1", "�ֿϰ� ���� �Ƹ����̿��� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal", "�ֿϰ� ���� �Ƹ����̿��� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "�ֿϰ� ���� �Ƹ����̿��� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("common_2", "�ֿϰ� ���� �Ƹ����̿��� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				
				System.out.println("���� ����(Sign)���� ���ݾ� �� �� ���ƿ�... �� ����ؾ߰ھ��!\n(���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 2: //�� ��� �Կ� ���� ���� ���� ���� �Ʒ�
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (50+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (20+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (25+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(0, 1, 2, 0);
				
				TMGC.playMotion("common_1", "�� ��� �Կ� ���忡�� ���� ���� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal", "�� ��� �Կ� ���忡�� ���� ���� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "�� ��� �Կ� ���忡�� ���� ���� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("common_2", "�� ��� �Կ� ���忡�� ���� ���� ���� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				
				System.out.println("�� ��󸶵� ���� �е��� ������� ��������׿�... ��� �����ϼ̽��ϴ�!\n(���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 3: //���� TV ���� ���α׷� ���� �⿬
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (60+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (25+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (30+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(1, 2, 3, 0);
				
				TMGC.playMotion("common_1", "���� TV ���� ���α׷����� ���� �⿬���Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal", "���� TV ���� ���α׷����� ���� �⿬���Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "���� TV ���� ���α׷����� ���� �⿬���Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("common_2", "���� TV ���� ���α׷����� ���� �⿬���Դϴ�... ��ø� ��ٷ��ּ���...");
				
				System.out.println("ī�޶� ������ �뺻��� �ϱⰡ �β�������... ���� �� ����ؾ߰ھ��!\n(���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
		}
	}
	public static void debSkill(){
		int tmpNum, tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpNum = TMGC.setrnd(3);
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		switch(tmpNum) {
			case 1: //�ֿϰ� ���� �Ƹ����� ���α� �Ʒ�
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (40+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (15+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (20+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(0, 0, 1, 0);
				
				TMGC.playMotion("common_1", "�ֿϰ� ���� �Ƹ����̿��� ���α� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal", "�ֿϰ� ���� �Ƹ����̿��� ���α� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "�ֿϰ� ���� �Ƹ����̿��� ���α� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("common_2", "�ֿϰ� ���� �Ƹ����̿��� ���α� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				
				System.out.println("���� �������� �� ����ؾ߰ھ��! �������� ���δ�!\n(���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 2: //�� ��� �Կ� ���� ���� ���� ���α� �Ʒ�
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (50+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (20+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (25+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(0, 1, 2, 0);
				
				TMGC.playMotion("common_1", "�� ��� �Կ� ���忡�� ���� ���� ���α� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal", "�� ��� �Կ� ���忡�� ���� ���� ���α� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "�� ��� �Կ� ���忡�� ���� ���� ���α� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("common_2", "�� ��� �Կ� ���忡�� ���� ���� ���α� �Ʒ����Դϴ�... ��ø� ��ٷ��ּ���...");
				
				System.out.println("�� ��󸶵� ���� �е��� ������� ��������׿�... ��� �����ϼ̽��ϴ�!\n(���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 3: //���� TV ���� ���α׷� ���� �⿬
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (60+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (25+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (30+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(1, 2, 3, 0);
				
				TMGC.playMotion("common_1", "���� TV ���� ���α׷����� ���� �⿬���Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal", "���� TV ���� ���α׷����� ���� �⿬���Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("normal_reverse", "���� TV ���� ���α׷����� ���� �⿬���Դϴ�... ��ø� ��ٷ��ּ���...");
				TMGC.playMotion("common_2", "���� TV ���� ���α׷����� ���� �⿬���Դϴ�... ��ø� ��ٷ��ּ���...");
				
				System.out.println("ī�޶� ������ �뺻��� �ϱⰡ �β�������... ���� �� ����ؾ߰ھ��!\n(���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
		}
	}
	
	/*
	 ************************************************************************
	 * 
	 * 		3rd Part
	 *		Pro/Ama Section 
	 * 
	 ***********************************************************************
	 */
	
	//���ο� �Ƹ��߾� �Ǵ�
	public static void set3rdJobProAma(){
		if(TMGCSYS.tmgcHET>=50){
			//����
			TMGCSYS.tmgc3ndProAma = "PRO";
			
			switch(TMGCSYS.tmgc2ndJob) {
				case "S":
					TMGCSTORY.playStory("S_1_PRO", 0);
					break;
				case "SH":
					TMGCSTORY.playStory("SH_1_PRO", 0);
					break;
				case "I":
					TMGCSTORY.playStory("I_1_PRO", 0);
					break;
				case "IH":
					TMGCSTORY.playStory("IH_1_PRO", 0);
					break;
				case "D":
					TMGCSTORY.playStory("D_1_PRO", 0);
					break;
				case "DH":
					TMGCSTORY.playStory("DH_1_PRO", 0);
					break;
			}
		}else {
			//�Ƹ��߾�
			TMGCSYS.tmgc3ndProAma = "AMA";
			
			switch(TMGCSYS.tmgc2ndJob) {
			case "S":
				TMGCSTORY.playStory("S_1_AMA", 0);
				break;
			case "SH":
				TMGCSTORY.playStory("SH_1_AMA", 0);
				break;
			case "I":
				TMGCSTORY.playStory("I_1_AMA", 0);
				break;
			case "IH":
				TMGCSTORY.playStory("IH_1_AMA", 0);
				break;
			case "D":
				TMGCSTORY.playStory("D_1_AMA", 0);
				break;
			case "DH":
				TMGCSTORY.playStory("DH_1_AMA", 0);
				break;
		}
		}
	}
	
	/*
	 ************************************************************************
	 * 
	 * 		4th Part
	 *		Finall Pro/Ama Section 
	 * 
	 ***********************************************************************
	 */
	
	//���ο� �Ƹ��߾� ���� �Ǵ�
	public static void set4thFinall(){
		String tmgcFinallGrade = "";
		int tmpRndNum=0;
		
		tmpRndNum = TMGC.setrnd(100);
		switch(TMGCSYS.tmgc3ndProAma) {
			case "PRO":
				if(tmpRndNum>=20) {
					tmgcFinallGrade = "PRO";
				}else {
					tmgcFinallGrade = "AMA";
				}
				break;
			case "AMA":
				if(tmpRndNum>=80) {
					tmgcFinallGrade = "PRO";
				}else {
					tmgcFinallGrade = "AMA";
				}
				break;
		}

		switch(TMGCSYS.tmgc2ndJob) {
			case "S":
				TMGCSTORY.playStory("S_1_"+TMGCSYS.tmgc3ndProAma+"_"+tmgcFinallGrade,0);
				break;
			case "SH":
				TMGCSTORY.playStory("SH_2_"+TMGCSYS.tmgc3ndProAma+"_"+tmgcFinallGrade,0);
				break;
			case "I":
				TMGCSTORY.playStory("I_1_"+TMGCSYS.tmgc3ndProAma+"_"+tmgcFinallGrade,0);
				break;
			case "IH":
				TMGCSTORY.playStory("IH_2_"+TMGCSYS.tmgc3ndProAma+"_"+tmgcFinallGrade,0);
				break;
			case "D":
				TMGCSTORY.playStory("D_1_"+TMGCSYS.tmgc3ndProAma+"_"+tmgcFinallGrade,0);
				break;
			case "DH":
				TMGCSTORY.playStory("DH_2_"+TMGCSYS.tmgc3ndProAma+"_"+tmgcFinallGrade,0);
				break;
		}
	}
}
