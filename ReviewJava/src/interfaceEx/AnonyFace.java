package interfaceEx;

/*
 * �ΦW���O�g�`�ϥΦb"�ݭn��@�Y�Ӥ����Ӳ��ͪ���"
 * �H�ΦW�覡��@�����ò��ͪ���
 */

interface Face{
	void smile();
}

public class AnonyFace {

	public static void main(String[] args) {
		
		//��@Face�������ΦW���O�A�ëإߪ���öǦ^���ܼ�c
		Face c = new Face() {
			/*
			 * ��H���O�P����������Ψӫإߪ���(new Face(); -> error)
			 * ���o�i�H�Ψӫŧi�ܼƥH�ѷӨ�l����A�p15��
			 */
			@Override
			public void smile() {//��@��������k
				
				System.out.println("^_^");
			}
			
		};
		c.smile();
		
		//�p�G�u�n����@��smile()�A����]�i�N�ܼ�c�ٲ���
		new Face() {

			@Override
			public void smile() {
				System.out.println("(^_^)");
				
			}
			
		}.smile();
	}

}
