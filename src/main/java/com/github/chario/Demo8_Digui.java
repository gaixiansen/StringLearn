package com.github.chario;

public class Demo8_Digui {

	/**
	 * @param args
	 * �ݹ�:�����Լ������Լ�
	 * 5!
	 * 5 * 4 * 3 * 2 * 1
	 * 
	 * 5 * fun(4)(����4!)
	 * 		4 * fun(3)(����3!)
	 * 				3 * fun(2)(����2!) 
	 * 						2 * fun(1)(����1!)
	 * �ݹ�ı׶�:���ܵ��ô�������,���׵���ջ�ڴ����
	 * �ݹ�ĺô�:����֪��ѭ������
	 * 
	 * ���췽���Ƿ���Եݹ����?
	 * ���췽������ʹ�õݹ����
	 * 
	 * �ݹ�����Ƿ�����з���ֵ?
	 * ��һ��(������,Ҳ����û��)
	 */
	public static void main(String[] args) {
		/*int result = 1;
		
		for(int i = 1; i <= 5; i++) {
			result = result * i;
		}
		
		System.out.println(result);*/
		System.out.println(fun(6000));
	}
	
	public static int fun(int num) {
		if(num == 1) {
			return 1;
		}else {
			return num * fun(num - 1);
		}
	}
}


