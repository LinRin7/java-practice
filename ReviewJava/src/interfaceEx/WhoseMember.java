package interfaceEx;

/*
 * �~�Ӧh�ӦP�W����k�P�����ܼƪ�����
 */

interface P1{
	int i = 10;
	
	/*public abstrace*/void show();
}

interface P2{
	int i = 20;
	
	void show();
}

interface C extends P1, P2{//�l����
	void show(String s);//�h���w�q������
}

public class WhoseMember implements C{//��@����
	
	@Override
	public void show() {//��@��P1�MP2�~�ӨӪ���k
		show("");
	}

	@Override
	public void show(String s) {//��@C���h���w�q����k
		//System.out.println(s + "i:" + i);//�sĶ�|�o�Ϳ��~�A�L�k�T�wi�O���Ӥ�����i(P1 �٬O P2��i)
		System.out.println(s + "P1.i=" + P1.i + "\nP2.i=" + P2.i);
	}
	
	public static void main(String[] args) {
		
		WhoseMember wm = new WhoseMember();
		wm.show();
		System.out.println(wm);
	}
	
}

