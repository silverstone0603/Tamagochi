/*
 *	Project My Puppy Story
 *	Story Mode Class
 *	
 *	Team N1 _ Oh EunSeok, Kim MinYeong, Yoon GeonHui
 *	Since 17.09.12
 *	
 *	Version 0.2.0 Official
 *	Last update : 17.10.22
 */
package TMGC;
import java.util.*;

public class TMGCSTORY {
	public static void playStory(String motionJob, int motionDelay){
    	Scanner scanStory = new Scanner(System.in);
    	String tmpText = "";
    	int tmpTime=0;
    	
    	switch(motionJob){
    	case "Intro_1":
	    	System.out.print(
		    				"��\n"
		    			+	"�� ���ѷα�...\n"
		    			+	"��\n"
		    			+	"��\n"
		     			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� ��� �� �б� ������ ��ġ�� ������ ���ư��� ��, ������ �� ������ �ڽ����� \"����..��\"�ϴ� �Ҹ��� ����Դ�.\n"
		    			+	"�� �ñ����� ���� �� �ڽ��� ���� Ȯ�� �� ���� �� �¾ �������� �������־���.\n"
		    			+	"��\n"
		    			+	"�� �װ��� �׳� ����ġ�� ���ϴ� ���� ��¿�� �����ϸ� �켱 ���� ������ ���� �� ���̽��ϰ� �ֺ� ģ���� �Բ�\n"
		    			+	"�� ������ ã�ƺ�������, ������ ��Ÿ���� �ʾ� ��¿ �� ���� ���� Ű���� ���� �Ծ���.\n"
		    			+	"�� �̿� Ű���� ������ �� �������� �������� �� Ű�� ������� �����Ͽ���.\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� ������ ���۵˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
		    	break;
    		case "S_1":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� �����\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��	"+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� �츮 "+TMGCSYS.tmgcName+"��(��) ���麸�� ���� ü���� �پ��\n"
		    			+	"�� � �ο򿡼��� �����ʴ� ��������� Ű�� ���߰ڴ�!\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� ������ ���۵˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
		    	break;
    		case "SH_1":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��	"+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� �츮 "+TMGCSYS.tmgcName+"��(��) ���麸�� ��, ü���ϸ� ������ ���� �پ��\n"
		    			+	"�� ��� ���￡�� � ������ �ӹ� �޾Ƶ� ��� ���� �� �� �ִ� �������� Ű������ �ڴ�!\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� ������ ���۵˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
		    	break;
    		case "I_1":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� �ȳ���\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� �츮 "+TMGCSYS.tmgcName+"��(��) ���麸�� ���ɰ� å�Ӱ��� ���ϴ�\n"
		    			+	"�� ������ �ʿ��� �е鲲 ����� �ȵ� �ȳ������� Ű������ �ڴ�!\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� ������ ���۵˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			    	break;
    		case "IH_1":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� Ž����\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� �츮 "+TMGCSYS.tmgcName+"��(��) ���麸�� �İ��� ������ �پ�ϱ�\n"
		    			+	"�� ��� ��ֹ��̵� ���� Ȯ���� ���� ��Ҹ� ���� ���ִ� Ž�������� Ű�� ���߰ڴ�!\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� ������ ���۵˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			    	break;
    		case "D_1":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ��ġ���\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� �츮 "+TMGCSYS.tmgcName+"��(��) ���麸�� Ȱ���ϱ⵵ �ϰ� å�Ӱ��� �����ϱ�\n"
		    			+	"�� ��� ���� ������� ������ �� �ִ� ��ġ������� Ű������ �ڴ�!\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� ������ ���۵˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			    	break;
    		case "DH_1":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ��Ÿ��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� �츮 "+TMGCSYS.tmgcName+"��(��) ���麸�� ��Ÿ���� �پ�� ���α⵵ �����ϱ�\n"
		    			+	"�� ���ߵ鿡�� �����ް� Ȱ���ϴ� ��Ÿ������ Ű������ �ڴ�!\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� ������ ���۵˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "S_1_PRO":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ���� �����\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ��... �������� �츮 "+TMGCSYS.tmgcName+"(��)�� ��¥ ������ �ִ� �� ����...\n"
		    			+	"�� ���� ��¥ �������� ���� �������� �����Ϸ� ������!\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� ������ ���۵˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "S_1_AMA":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� �Ϲ� �����\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ��... �� ������ ��... �� �ڶ�Ծ�... ������ �̿��Ͽ� �� Ű������!\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� ������ ���۵˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "SH_1_PRO":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� Ư�� ����\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ��... �������� �츮 "+TMGCSYS.tmgcName+"(��)�� ��¥ ������ �ִ� �� ����...\n"
		    			+	"�� ���δ�� ���� ���� ������ �� ��ƺ���!\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� ������ ���۵˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "SH_1_AMA":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ��...�� ������ ��... �� �ڶ�Ծ�~\n"
		    			+	"�� ���� ������ ���ؼ� ������ �� �淯����!\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� ������ ���۵˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "I_1_PRO":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� Ư�� �ȳ���\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ��... �������� �츮 "+TMGCSYS.tmgcName+"(��)�� ��¥ ������ �ִ� �� ����...\n"
		    			+	"�� ���� ���� �����Ͻźе鿡�� ���� �帮�� ����!\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� ������ ���۵˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "I_1_AMA":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� �ȳ���\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ��...�� ������ ��... �� �ڶ�Ծ�~\n"
		    			+	"�� ������ �ʿ��Ͻ� �е��� ã�� �Ƹ鼭 �� ���Ѻ���!\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� ������ ���۵˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "IH_1_PRO":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ���� Ž����\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ��... �������� �츮 "+TMGCSYS.tmgcName+"(��)�� ��¥ ������ �ִ� �� ����...\n"
		    			+ "�� ���δ�� ���� ���ڳ� ã�ƺ���?\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� ������ ���۵˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "IH_1_AMA":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ���� Ž����\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ��...�� ������ �� �� �ڶ�Ծ�~\n"
		    			+	"�� �츮 "+TMGCSYS.tmgcName+"(��)���� �´� ���׿� ���ڸ��� ã���� ������?\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� ������ ���۵˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "D_1_PRO":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� �������� ���� ������\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ��... �������� �츮 "+TMGCSYS.tmgcName+"(��)�� ��¥ ������ �ִ� �� ����...\n"
		    			+ "�� ���������� ���� �����ߵ� �Ͻðڴ�, Ȯ���Ϸ� ������ !\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� ������ ���۵˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "D_1_AMA":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ��ġ���\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ��... �� ������ ��... �� �ڶ�Ծ�~\n"
		    			+ "�� �Ҿƹ��� ���忡�� �� �غ��鼭 �� ��� ������!\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� ������ ���۵˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "DH_1_PRO":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� �ѷ� ��Ÿ��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ��... �������� �츮 "+TMGCSYS.tmgcName+"(��)�� ��¥ ���� ����...\n"
		    			+	"�� �Ҽӻ絵 �˾ƺ��� ������ ���뿡�� �÷� �����߰ڱ�...\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� ������ ���۵˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "DH_1_AMA":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ��Ÿ��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ��... �� ������ �� �� �ڶ�Ծ�~ ���� ���븦 ���鼭 ���ߵ鿡�� �������� �������� �׾Ƴ�������!\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� ������ ���۵˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "S_2_PRO_PRO":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ���� �����\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ���� �츮 "+TMGCSYS.tmgcName+"! ���� �� �ڶ����!\n"
		    			+	"�� � ���������� �̰ܿ��� ���� ���� �̸��� �� �ٸ� ����ߵ��� ���� ���ٴ���...\n"
		    			+	"��\n"
		    			+	"�� �׵��� ���� ���Ҵ٢�\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "S_2_PRO_AMA":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� �Ϲ� �����\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� �������� �ణ �ƽ��� ������ ���²� �����༭ ���� ����!\n"
		    			+	"�� �ʰ� ���� �ڶ���������\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "S_1_AMA_PRO":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ���� �����\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� �̾�~ �츮 "+TMGCSYS.tmgcName+"!\n"
		    			+	"�� ���� ������ �������� �ʰ� �� ����ͼ� �ʹ� ����! ��¥ ���� ���Ҵ٢�\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "S_1_AMA_AMA":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� �Ϲ� �����\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ������~ ������! ���²� �� �ڶ��༭ ����! �׵��� ���� ���Ҵ٢�\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "SH_2_PRO_PRO":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� Ư�� ����\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ���� �츮 "+TMGCSYS.tmgcName+"(��)��~ ���� �� �ڶ���ᱸ��!\n"
		    			+	"�� ū ���￡ ���� �̷��� ������ �����... ��Ư�� �װھ�~ �׵��� ���� ���Ҵ٢�\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "SH_2_PRO_AMA":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� �������� �ణ �ƽ��� ������ �����༭ ���� ����!\n"
		    			+	"�� �ʰ� ���� �ڶ���������\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "SH_2_AMA_PRO":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� Ư�� ����\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� �̾�~ �츮 "+TMGCSYS.tmgcName+"...\n"
		    			+	"�� ������ �������� �ʰ� �� ����ͼ� �ʹ� ����! ��¥ ���� ���Ҵ٢�\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "SH_2_AMA_AMA":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ������~ ������! ���� �� �ؿԾ�!\n"
		    			+	"�� ���²� �� �ڶ��༭ ����! �׵��� ���� ���Ҵ٢�\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "I_1_PRO_PRO":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� Ư�� �ȳ���\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ���� �츮 "+TMGCSYS.tmgcName+", ���� �� �ڶ���ᱸ�� ����\n"
		    			+	"�� ������ ������ �ʿ��� �� ���� ������ �������! �׵��� ���� ���Ҵ٢�\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "I_1_PRO_AMA":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� �ȳ���\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� �������� �ణ �ƽ��� ������ ���²� ���� ���� ���Ҵ�!\n"
		    			+	"�� �ʰ� ���� �ڶ���������\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "I_1_AMA_PRO":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ���� �ȳ���\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� �̾�~ �츮 "+TMGCSYS.tmgcName+", ������ �� ������༭ �ʹ� ����!\n"
		    			+	"�� ��¥ ���� ���Ҵ٢�\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "I_1_AMA_AMA":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� �ȳ���\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ������~ ������! ���� �� �ؿԾ�!\n"
		    			+	"�� ���²� �� �ڶ�ͼ� ����~ �׵��� ���� ���Ҵ٢�\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "IH_2_PRO_PRO":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ���� Ž����\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ���� �츮 "+TMGCSYS.tmgcName+"! ���� �� �ڶ���ᱸ��!\n"
		    			+	"�� �����̵� ����Ư���뿡����... �ʿ��� �� ���� �׻� ������ �ǵ��� ��!\n"
		    			+	"��\n"
		    			+	"�� �׵��� ���� ���Ҵ٢�\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "IH_2_PRO_AMA":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ���� Ž����\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� �������� �ణ �ƽ��� ������ ���²� ���� ���� ���Ҿ�!\n"
		    			+	"�� �ʰ� ���� �ڶ���������\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "IH_2_AMA_PRO":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ���� Ž����\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� �̾�~ �츮 "+TMGCSYS.tmgcName+"!\n"
		    			+	"�� ������ �������� �ʰ� �� ������༭ �ʹ� ����! ��¥ ���� ���Ҵ٢�\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "IH_2_AMA_AMA":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ���� Ž����\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ������~ ������! ���²� �� �ڶ�ͼ� ����!\n"
		    			+	"�� �׵��� ���� ���Ҵ٢�\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "D_1_PRO_PRO":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� �������� ���� ������\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ���� �츮 "+TMGCSYS.tmgcName+"! ���� �� �ڶ���ᱸ��!\n"
		    			+	"�� �Ҿƹ������� ����� �ȵȴٳ�! ��Ư�� �װھ� ����...\n"
		    			+	"��\n"
		    			+	"��׵��� ���� ���Ҵ٢�\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "D_1_PRO_AMA":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ��ġ���\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ������~ ������! ���²� �� �ڶ�ͼ� ����!\n"
		    			+	"�� �׵��� ���� ���Ҵ٢�\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "D_1_AMA_PRO":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� �������� ���� ������\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� �̾�~ �츮 "+TMGCSYS.tmgcName+"!\n"
		    			+	"�� ������ �������� �ʰ� �� ������༭ �ʹ� ����! ��¥ ���� ���Ҵ٢�\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "D_1_AMA_AMA":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ��ġ���\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ������~ ������! ���²� �� �ڶ�ͼ� ����!\n"
		    			+	"�� �׵��� ���� ���Ҵ٢�\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "DH_2_PRO_PRO":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� �ѷ� ��Ÿ��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ���� �츮 "+TMGCSYS.tmgcName+"! ���� �� �ڶ���ᱸ��!\n"
		    			+	"�� ���ߵ鿡�� ������ �ް�, �� ���嵵 �ް�... �׵��� ���� ���Ҵ٢�\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "DH_2_PRO_AMA":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ��Ÿ��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� �������� �ణ �ƽ��� ������ ���²� ���� ���� ���Ҿ�!\n"
		    			+	"�� �ʰ� ���� �ڶ���������\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "DH_2_AMA_PRO":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� �ѷ� ��Ÿ��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� �̾�~ �츮 "+TMGCSYS.tmgcName+"!\n"
		    			+	"�� ������ �������� �ʰ� �� ������༭ �ʹ� ����! ��¥ ���� ���Ҵ٢�\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "DH_2_AMA_AMA":
		    	System.out.print(
		    				"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ��Ÿ��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� "+TMGCSYS.tmgcName+"�� ����\n"
		    			+	"�� ������~ ������! ���� �� �ؿԾ�!\n"
		    			+	"�� ���²� �� �ڶ�ͼ� ����! �׵��� ���� ���Ҵ٢�\n"
		    			+	"��\n"
		    			+	"��\n"
		    			+	"�� 10�� �Ŀ� Ending Credit�� ǥ�õ˴ϴ�...\n"
		    			+	"��\n"
		    			+	"�� ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"��] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    	}
    	int tmpClear;
		for(tmpClear=0;tmpClear<7;tmpClear++) {
			System.out.println("");
		}
		TMGC.setsleep(motionDelay);
    }
    
    public static void playEndingCredit(){
    	String[] tmgcCredits = new String[91];
    	int tmpNum=0, tmpNum2nd=0;
    	
    	tmgcCredits[0]=	"���������������";
		tmgcCredits[1]=	"���������������";
		tmgcCredits[2]=	"���������������";
		tmgcCredits[3]=	"���������������";
		tmgcCredits[4]=	"���������������";
    								
    	tmgcCredits[8] = "My Puppy Story";
    	tmgcCredits[9] = "made by Team N1";
    	
    	tmgcCredits[13] = "�� Producer";
    	tmgcCredits[14] = "     Oh EunSeok";
    	
    	tmgcCredits[18] = "�� Director";
    	tmgcCredits[19] = "     Members of Team N1";
		
    	tmgcCredits[23] = "�� Game Designer";
    	tmgcCredits[24] = "     Kim MinYeong";
		
    	tmgcCredits[28] = "�� Senario Writer";
    	tmgcCredits[29] = "     Yoon GeonHui";
		
    	tmgcCredits[33] = "�� Game Design Assistant";
    	tmgcCredits[34] = "     Kim KiJong (Professor)";
		
    	tmgcCredits[38] = "�� Early Game Concept by";
    	tmgcCredits[39] = "     Members of Team N1";
		
    	tmgcCredits[42] = "�� Lead Engineer & Module System Programmer";
    	tmgcCredits[43] = "     Oh EunSeok";
		
    	tmgcCredits[47] = "�� Main Scripter";
    	tmgcCredits[48] = "     Kim MinYeong";
		
    	tmgcCredits[52] = "�� Script Engine Designer";
    	tmgcCredits[53] = "     Oh EunSeok";
		
    	tmgcCredits[57] = "�� Function System Programmer";
    	tmgcCredits[58] = "     Oh EunSeok";
    	tmgcCredits[59] = "     Kim MinYeong";
    	tmgcCredits[60] = "     Yoon GeonHui";
		
    	tmgcCredits[64] = "�� Game Level Designer";
    	tmgcCredits[65] = "     Oh EunSeok";
    	tmgcCredits[66] = "     Kim MinYeong";
		
    	tmgcCredits[70] = "�� Special Thanks to:";
		
    	tmgcCredits[71] = "     �� Programing Advisor";
    	tmgcCredits[72] = "          Kim KiJong (Professor)";
    	tmgcCredits[73] = "          Lee MinGi";
    	tmgcCredits[74] = "          Kim TaeHyun";
    	tmgcCredits[75] = "          Lee MoonHui";
		
    	tmgcCredits[79] = "          And You!";
		
    	tmgcCredits[83] = "Thanks to playing.";
		
    	tmgcCredits[87] = "Presented by Team N1.";
    	tmgcCredits[88] = "(C) Team N1, All rights reserved.";
    	
    	for(tmpNum=0;tmpNum<=90;tmpNum++) {
    		if(tmgcCredits[tmpNum]!=null) {
    			System.out.print("		"+tmgcCredits[tmpNum]+"\n");
    			TMGC.setsleep(1);
    		}else{
    			for(tmpNum2nd=0;tmpNum2nd<10;tmpNum2nd++) {
    				System.out.print("\n");
    				TMGC.setsleep(1);
    			}
    		}
    	}
    }
}
