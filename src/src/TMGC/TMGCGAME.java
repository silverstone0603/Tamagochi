/*
 *	Project My Puppy Story
 *	Game Fnc. Class
 *	
 *	Team N1 _ Oh EunSeok, Kim MinYeong, Yoon GeonHui
 *	Since 17.09.12
 *	
 *	Version 0.2.0 Official
 *	Last update : 17.10.22
 */
package TMGC;
import java.util.*;

public class TMGCGAME {
	public static void minigame() {
		/* feel�� ���� �̴ϰ����� ������ �׳� �������� �������� ����->���ο��� �ʿ� ���� �ٸ� Ŭ������ �θ���  */
		int tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		if(TMGCSYS.tmgcDeath==1) {
			System.out.println("[System] ���� ������ �������ϴ�.\\n������ �ٽ� �����ϼ���.\\n");
		}else if(TMGCSYS.tmgcStress>=50) { System.out.println("[System] ���� ��Ʈ������ �ʹ� ���� �޾ҽ��ϴ�. ���ڱ�� �Ƿε��� Ǯ���ּ���.\n");		
			}
		else {				
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (10+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (10+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (15+TMGCSYS.tmgcFeel);
				}	
		//���������� ����,,,? �ƴϸ� �������
		Scanner ScanGame=new Scanner(System.in);
		String GameCho="", RSPCho = "", CALCho="", RSPpet="";
		String tmNAME=TMGCSYS.tmgcName;
		
		System.out.print("[System] "+tmNAME+"(��)�� ���� ������ �ұ��? (����������, ���ڸ��߱����)\n         �Է� : ");
		GameCho=ScanGame.next();
		
		int RANpet=TMGC.setrnd(3);
		int RANans=0, RSPuser=0, answer=0;
		
		switch(GameCho) {
		case "����������":
					for(int tmpClear=0;tmpClear<4;tmpClear++) {
							System.out.println("");
					}

				System.out.print("[System] ���δ�! ���� �̱�ſ���!\n\n         ������ ���ðڽ��ϱ�? (����, ����, ��)\n         �Է� : ");
				RSPCho=ScanGame.next();
				switch(RSPCho) {
					case "����":
						RSPuser=0;
						break;
					case "����":
						RSPuser=1;
						break;
					case "��":
						RSPuser=2;
						break;
					default:
						System.out.println("[System] �ش� ��ɾ�� �������� �ʽ��ϴ�.");
						break;
				}
				TMGC.playMotion("normal","�����...?");
				TMGC.playMotion("normal_reverse","�����...?");
				TMGC.playMotion("normal","�����...?");
				TMGC.playMotion("normal_reverse","�����...?");
				
				//���������� ��
				//user-pet=-1,1:user�̱�  -2,2:user��, 0:���
				switch(RANpet) {
					case 0:
						RSPpet="����";
						break;
					case 1:
						RSPpet="����";
						break; 
					case 2:
						RSPpet ="��";
						break;
				}
				System.out.println(
											"[System] ����� �� �� : " + RSPCho
										+	"\n         " + tmNAME+"(��)�� �� �� : " + RSPpet + "\n\n");
				
				if((RSPuser-RANpet)==1||(RSPuser-RANpet)==-1) {
					System.out.println("[System] " + tmNAME+"(��)�� �����ϴ�.\n\n");
				}
				else if((RSPuser-RANpet)==-2||(RSPuser-RANpet)==2) {
					System.out.println("[System] " + tmNAME+"(��)�� �̰���ϴ�.\n\n");
				}
				else if((RSPuser-RANpet)==0) {
					System.out.println("[System] �����ϴ�.\n\n");
				}
				
				//Result
				System.out.print("[System] ������ ����Ǿ����ϴ�.\n"
						+"         "+TMGCSYS.tmgcName+"�� ���� ����ּ���~\n\n");
				
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (10+TMGCSYS.tmgcLV);
					if(TMGCSYS.tmgcHP<=90) TMGCSYS.tmgcHP -= (10+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (5+TMGCSYS.tmgcFeel);
				}
				
				TMGCSYS.tmgcCountPlay += 1;
				TMGC.setlevel();
				TMGC.setability(0, 0, 1, 0);
				
				System.out.println("         (���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			//���������� ���ӹ� �ݱ�
			
		    case "���ڸ��߱����" :
		    		System.out.println(tmNAME+"(��)�� ������ ���ڸ� ���纾�ô�!");
		    		TMGC.playMotion("normal","���ڸ� �����ϰ� �ֽ��ϴ�... ��ø� ��ٷ��ּ���~");
					TMGC.playMotion("normal_reverse","���ڸ� �����ϰ� �ֽ��ϴ�... ��ø� ��ٷ��ּ���~");
					TMGC.playMotion("normal","���ڸ� �����ϰ� �ֽ��ϴ�... ��ø� ��ٷ��ּ���~");
					TMGC.playMotion("normal_reverse","���ڸ� �����ϰ� �ֽ��ϴ�... ��ø� ��ٷ��ּ���~");
					System.out.println("\n\n[System] ���δ�! ���� ������ ���ڸ� ���纸����!");
					int USERans=0, PETthinkCount=0;
					
					if(TMGCSYS.tmgcLV>=10) {
						RANans=TMGC.setrnd(160);
						PETthinkCount=5;
					}else {
						RANans=TMGC.setrnd(80);
						PETthinkCount=0;
					}
					
					/*������ ���� �ѵ��� �ٸ��� 10���������� 10�� */
					while(true) {
						if(PETthinkCount==10) {
							System.out.print("[System] Ʋ�Ƚ��ϴ�... ������ ��ſ� �ð��̾��ٰ� �����ؿ�!\n"
									+"         "+TMGCSYS.tmgcName+"�� ���� �� �ȶ��� �����ϴ�!\n\n");
							
							if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
								TMGCSYS.tmgcEXP += (10+TMGCSYS.tmgcLV);
								if(TMGCSYS.tmgcHP<=90) TMGCSYS.tmgcHP -= (10+TMGCSYS.tmgcFeel);
								TMGCSYS.tmgcStress += (5+TMGCSYS.tmgcFeel);
							}
							
							TMGCSYS.tmgcCountPlay += 1;
							TMGC.setlevel();
							TMGC.setability(0, 1, 1, 0);
							
							System.out.println("         (���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
							break;
						}
						if(TMGCSYS.tmgcLV>=10) {
							System.out.print("\n\n[System] 0���� 160������ ���� �� "+tmNAME+"(��)�� ������ ���ڸ� �Է��ϼ���!\n�Է� : ");
							USERans=ScanGame.nextInt();
						}else {
							System.out.print("\n\n[System] 0���� 80������ ���� �� "+tmNAME+"(��)�� ������ ���ڸ� �Է��ϼ���!\n�Է� : ");
							USERans=ScanGame.nextInt();
						}
						
						if(USERans>RANans) {
							System.out.println(tmNAME+"[System] ���� ������ ���ڴ� "+USERans+" ���� ���� ���ڿ���!\n\n");
							PETthinkCount+=1;
							System.out.println("         ���� Ƚ�� : "+(10-PETthinkCount)+"��");
							continue;
						}
						else if(USERans<RANans) {
							System.out.println(tmNAME+"[System] ���� ������ ���ڴ� "+USERans+" ���� ���� ���ڿ���!\n\n");
							PETthinkCount+=1;
							System.out.println("         ���� Ƚ�� : "+(10-PETthinkCount)+"��");
							continue;
						}
						else if(USERans==RANans) {
							System.out.print("[System] �����Դϴ�!\n"
									+"         "+TMGCSYS.tmgcName+"�� ���� �� �ȶ��� �����ϴ�!\n\n");
							
							if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
								TMGCSYS.tmgcEXP += (10+TMGCSYS.tmgcLV);
								if(TMGCSYS.tmgcHP<=90) TMGCSYS.tmgcHP -= (10+TMGCSYS.tmgcFeel);
								TMGCSYS.tmgcStress += (5+TMGCSYS.tmgcFeel);
							}
							
							TMGCSYS.tmgcCountPlay += 1;
							TMGC.setlevel();
							TMGC.setability(0, 1, 1, 0);
							
							System.out.println("         (���� : "+tmpLV+"->"+TMGCSYS.tmgcLV+", ����ġ : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", ü�� : "+tmpHP+"->"+TMGCSYS.tmgcHP+", ��Ʈ���� : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
							break;
						}
					}
			}
		}}}