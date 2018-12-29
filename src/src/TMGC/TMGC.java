/*
 *	Project My Puppy Story
 *	Core Class
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

public class TMGC{
	public void play() {
		int tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		if(TMGCSYS.tmgcDeath==1) {
			System.out.println("[System] ���� ������ �������ϴ�.\n������ �ٽ� �����ϼ���.\n");
		}else {
			if(TMGCSYS.tmgcStress>=50) System.out.println("[System] ���� ��Ʈ������ �ʹ� ���� �޾ҽ��ϴ�. ���ڱ����� �Ƿε��� Ǯ���ּ���.\n");
			
			TMGCGAME.minigame();
		}
	}
	public void eat() {
		int tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		if(TMGCSYS.tmgcDeath==1) {
			System.out.println("[System] ���� ������ �������ϴ�.\n������ �ٽ� �����ϼ���.\n");
		}else {
			if(TMGCSYS.tmgcStress>=50) System.out.println("[System] ���� ��Ʈ������ �ʹ� ���� �޾ҽ��ϴ�. ���ڱ�� �Ƿε��� Ǯ���ּ���.\n");
			if(TMGCSYS.tmgcLimitEat>=3) {
				System.out.println("[System] �ʹ� ���� �Ծ����ϴ�. ���ڱ� �Ǵ� ��å�ϱ�� �������� �ؼ��ϼ���.\n");
			}else {
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (1+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP += (5-TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (5+TMGCSYS.tmgcFeel);
				}
				
				TMGCSYS.tmgcLimitEat+=1;
				TMGCSYS.tmgcLimitSleep=0;
				
				if(TMGCSYS.tmgcLimitEat>=3)	TMGCSYS.tmgcCheckRegularHealth+=1;
					
				TMGC.setlevel();
				
				TMGC.playMotion("eat","��ø� ��ٷ� �ּ���... ���� ���� �԰� �ֽ��ϴ�...");
				TMGC.playMotion("eat_down","��ø� ��ٷ� �ּ���... ���� ���� �԰� �ֽ��ϴ�...");
				TMGC.playMotion("eat","��ø� ��ٷ� �ּ���... ���� ���� �԰� �ֽ��ϴ�...");
				TMGC.playMotion("eat_down","��ø� ��ٷ� �ּ���... ���� ���� �԰� �ֽ��ϴ�...");
				System.out.println("���δ�! �� �Ծ����ϴ�!\n(���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
			}
		}
	}
	public void sleep() {
		int tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		if(TMGCSYS.tmgcDeath==1) {
			System.out.println("[System] ���� ������ �������ϴ�.\n������ �ٽ� �����ϼ���.\n");
		}else {
			if(TMGCSYS.tmgcLimitSleep>=1 && TMGCSYS.tmgcStress<=50) {
				System.out.println("[System] �̹� ����� ����ϴ�. ���� Ȱ���ϵ��� �����ּ���.\n");
			}else {
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (3+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP += (15-TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress = (20+TMGCSYS.tmgcFeel);
				}
				
				if(TMGCSYS.tmgcCheckRegularHealth>=3) {
					//��Ģ���� ��Ȱ�� �� ��� �ǰ� ���� �ø�
					TMGC.setability(0, 0, 0, 1);
					TMGCSYS.tmgcCheckRegularHealth=0;
				}
				
				TMGCSYS.tmgcCheckRegularHealth+=1;
				
				TMGCSYS.tmgcLimitEat=0;
				TMGCSYS.tmgcLimitSleep=1;
				TMGCSYS.tmgcLimitWalk=0;
				TMGCSYS.tmgcLimitStudy=0;
				
				TMGC.setlevel();
				TMGCSYS.tmgcFeel=TMGC.setrnd(10);
				
				TMGC.playMotion("sleep","��! ���� �ڰ� �ֽ��ϴ�... ������ �����ּ���...");
				TMGC.playMotion("sleep_reverse","��! ���� �ڰ� �ֽ��ϴ�... ������ �����ּ���...");
				TMGC.playMotion("sleep","��! ���� �ڰ� �ֽ��ϴ�... ������ �����ּ���...");
				TMGC.playMotion("sleep_reverse","��! ���� �ڰ� �ֽ��ϴ�... ������ �����ּ���...");
				switch(TMGCSYS.tmgcFeel) {
					case 1 :
					case 2:
					case 3:
						System.out.println("���δ�~ �ȳ��� �ֹ��̾��? ^0^");
						break;
					case 4 :
					case 5:
					case 6:
						System.out.println("���δ�... �ڰ� �Ͼ�µ��� ���� ������ �Ϸ�׿�... �ȳ��� �ֹ��̾��...");
						break;
					case 7 :
					case 8:
					case 9:
						System.out.println("������ �Ǹ��� �ٴ� �ٶ��� �� ������... ��_��...");
						break;
					case 10:
						System.out.println("������ ����� ���� �����ƿ�... �� �������� ���ھ��...");
						break;
					default:
						System.out.println("���δ�, �ȳ��� �ֹ��̳���?");
						break;
				}
				System.out.println("(���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
			}
		}
	}
	public void walk() {
		int tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		if(TMGCSYS.tmgcDeath==1) {
			System.out.println("���� ������ �������ϴ�.\n������ �ٽ� �����ϼ���.\n");
		}else {
			if(TMGCSYS.tmgcStress>=50) System.out.println("[System] ���� ��Ʈ������ �ʹ� ���� �޾ҽ��ϴ�. ���ڱ�� �Ƿε��� Ǯ���ּ���.\n");
			if(TMGCSYS.tmgcLimitWalk>=2) {
				System.out.println("[System] �ʹ� ���� �ɾ����ϴ�. ���ڱ�� ���� �Ƿ����� �ʵ��� ���ּ���.\n");
			}else {
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (20+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (20+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (7+TMGCSYS.tmgcFeel);
				}
				
				TMGCSYS.tmgcLimitWalk+=1;
				TMGCSYS.tmgcLimitSleep=0;
				
				if(TMGCSYS.tmgcLimitWalk>=2)	TMGCSYS.tmgcCheckRegularHealth+=1;
				
				TMGC.setlevel();
				TMGC.setability(1, 1, 0, 0);
				
				TMGC.playMotion("play","���� ��Ű� �߿ܿ��� ��̰� ��å���Դϴ�... ��å�� ���������� ��ٷ��ּ���~");
				TMGC.playMotion("play_up","���� ��Ű� �߿ܿ��� ��̰� ��å���Դϴ�... ��å�� ���������� ��ٷ��ּ���~");
				TMGC.playMotion("play","���� ��Ű� �߿ܿ��� ��̰� ��å���Դϴ�... ��å�� ���������� ��ٷ��ּ���~");
				TMGC.playMotion("play_up","���� ��Ű� �߿ܿ��� ��̰� ��å���Դϴ�... ��å�� ���������� ��ٷ��ּ���~");
				System.out.println("���δ�~ ������ ��� ������ �� ���ƿ� ����\n(���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
			}
		}
	}
	public void study() {
		int tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		if(TMGCSYS.tmgcDeath==1) {
			System.out.println("���� ������ �������ϴ�.\n������ �ٽ� �����ϼ���.\n");
		}else {
			if(TMGCSYS.tmgcStress>=50) System.out.println("[System] ���� ��Ʈ������ �ʹ� ���� �޾ҽ��ϴ�. ���ڱ�� �Ƿε��� Ǯ���ּ���.\n");
			if(TMGCSYS.tmgcLimitStudy>=1) {
				System.out.println("[System] �̹� ���θ� �߽��ϴ�. �ٸ� Ȱ���� �ϵ��� ���ּ���.\n");
			}else {
				TMGCQNA.question();
			}
		}
	}
	public void setdata(String tmpName) {
		TMGCSYS.tmgcName = tmpName;
	}
	public void print() {
		//String tmpStr = String.format("%.2f", stdCredit);
		//stdCredit = Double.parseDouble(tmpStr);
		System.out.println("[System] �� �����Դϴ�.\n         �̸� : "+TMGCSYS.tmgcName+", ���� : "+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+TMGCSYS.tmgcHP+", ��Ʈ���� : "+TMGCSYS.tmgcStress);
	}
	public void print_dev() {
		//String tmpStr = String.format("%.2f", stdCredit);
		//stdCredit = Double.parseDouble(tmpStr);
		System.out.println(
									"[System] �� �����Դϴ�.\n         �̸� : "+TMGCSYS.tmgcName
								+	", ���� : "+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)
								+	", ü�� : "+TMGCSYS.tmgcHP+", ��Ʈ���� : "+TMGCSYS.tmgcStress+"\n\n\n"
								+	"         Function Limit Count\n"
								+	"         Eat : "+TMGCSYS.tmgcLimitEat+", Sleep : "+TMGCSYS.tmgcLimitSleep
								+	", Walk : "+TMGCSYS.tmgcLimitWalk+", Study : "+TMGCSYS.tmgcLimitStudy+"\n\n\n"
								+	"         Character Ability\n"
								+	"         STR : "+TMGCSYS.tmgcSTR+", INT : "+TMGCSYS.tmgcINT
								+	", DEB : "+TMGCSYS.tmgcDEB+", HET : "+TMGCSYS.tmgcHET+"\n\n\n"
								+	"         Character Job : "+TMGCSYS.tmgc2ndJob+"\n"
								+	"         Pro/Amateur Job : "+TMGCSYS.tmgc3ndProAma
								);
	}
	public static void setlevel() {
		if(TMGCSYS.tmgcEXP>=(100*TMGCSYS.tmgcLV)) {
			TMGCSYS.tmgcLV+=1;
			TMGCSYS.tmgcEXP=0;
		}
		if(TMGCSYS.tmgcHP<=0) TMGCSYS.tmgcDeath=1;
		if(TMGCSYS.tmgcHP>=100) TMGCSYS.tmgcHP=100;
		if(TMGCSYS.tmgcStress>=100) TMGCSYS.tmgcDeath=1;
		if(TMGCSYS.tmgcStress<=0) TMGCSYS.tmgcStress=0;
	}
    public static void setability(int tmpSTR, int tmpINT, int tmpDEB, int tmpHET){
    	//��, �����ɷ�, ������, �ǰ�����
    	//STR, INT, Debauchery, Heart
    	TMGCSYS.tmgcSTR+=tmpSTR;
    	TMGCSYS.tmgcINT+=tmpINT;
    	TMGCSYS.tmgcDEB+=tmpDEB;
    	TMGCSYS.tmgcHET+=tmpHET;
    	if(TMGCSYS.tmgcSTR<=0) TMGCSYS.tmgcSTR=0;
    	if(TMGCSYS.tmgcSTR>=100) TMGCSYS.tmgcSTR=100;
    	if(TMGCSYS.tmgcINT<=0) TMGCSYS.tmgcINT=0;
    	if(TMGCSYS.tmgcINT>=100) TMGCSYS.tmgcINT=100;
    	if(TMGCSYS.tmgcDEB<=0) TMGCSYS.tmgcDEB=0;
    	if(TMGCSYS.tmgcDEB>=100) TMGCSYS.tmgcDEB=100;
    	if(TMGCSYS.tmgcHET<=0) TMGCSYS.tmgcHET=0;
    	if(TMGCSYS.tmgcHET>=100) TMGCSYS.tmgcHET=100;
    }
    public static void setsleep(int tmpTime){
		try{
			Thread.sleep(tmpTime * 100);
							//�Է��� �ð� * 0.1��
		} catch (InterruptedException e) { }
    }
    public static void playMotion(String motionType, String motionText){
    	switch(motionType){
    		case "normal":
		    	System.out.println(
		    				"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n\n"
		    			+	motionText	+	"\n\n");
		    	break;
    		case "normal_reverse":
		    	System.out.println(
		    				"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n\n"
		    			+	motionText	+	"\n\n");
		    	break;
    		case "eat":
		    	System.out.println(
		    			"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n\n"
	    			+	motionText	+	"\n\n");
		    	break;
    		case "eat_down":
		    	System.out.println(
		    			"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n\n"
	    			+	motionText	+	"\n\n");
		    	break;
    		case "play":
		    	System.out.println(
		    			"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n\n"
	    			+	motionText	+	"\n\n");
		    	break;
    		case "play_up":
		    	System.out.println(
		    				"�����������������\n"
		    			+	"�����������������\n"
		    			+	"�����������������\n"
		    			+	"�����������������\n"
		    			+	"�����������������\n"
		    			+	"�����������������\n"
		    			+	"�����������������\n"
		    			+	"�����������������\n"
		    			+	"�����������������\n"
		    			+	"�����������������\n"
		    			+	"�����������������\n"
		    			+	"�����������������\n"
		    			+	"�����������������\n\n"
		    			+	motionText	+	"\n\n");
		    	break;
    		case "sleep":
		    	System.out.println(
		    				"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n\n"
		    			+	motionText	+	"\n\n");
		    	break;
    		case "sleep_reverse":
		    	System.out.println(
		    				"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n"
		    			+	"����������������\n\n"
		    			+	motionText	+	"\n\n");
		    	break;
    		case "study":
		    	System.out.println(
		    			"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n\n"
	    			+	motionText	+	"\n\n");
		    	break;
    		case "study_down":
		    	System.out.println(
		    			"�����������������\n"
		    	    +	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n\n"
	    			+	motionText	+	"\n\n");
		    	break;
    		case "common_1":
		    	System.out.println(
		    			"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n\n"
	    			+	motionText	+	"\n\n");
		    	break;
    		case "common_2":
		    	System.out.println(
		    			"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n"
	    			+	"�����������������\n\n"
	    			+	motionText	+	"\n\n");
		    	break;
    	}
    	int tmpClear;
		for(tmpClear=0;tmpClear<7;tmpClear++) {
			System.out.println("");
		}
		TMGC.setsleep(5);
    }
    public static int setrnd(int tmpNum){
    	int tmpRndNum=(int) (Math.random() * tmpNum) + 1;
    	return tmpRndNum;
    }
	public static void nocmd() {
		System.out.println(
				"[System] �ش� ��ɾ�� �������� �ʽ��ϴ�.\n"
			+	"         �ٽ� �ѹ� Ȯ�����ּ���.");
	}
	public static String loadVersion(){
		return TMGCSYS.tmgcVersion;
	}
	public static String loadName(){
		return TMGCSYS.tmgcName;
	}
	public static int loadLV(){
		return TMGCSYS.tmgcLV;
	}
	public static int loadEXP(){
		return TMGCSYS.tmgcEXP;
	}
	public static int loadHP(){
		return TMGCSYS.tmgcHP;
	}
	public static int loadStress(){
		return TMGCSYS.tmgcStress;
	}
	public static int loadDeath(){
		return TMGCSYS.tmgcDeath;
	}
}

