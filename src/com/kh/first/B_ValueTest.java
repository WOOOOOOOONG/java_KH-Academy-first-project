package com.kh.first;

/* <��� ��Ģ>
 * 1. ��Ű�� -> �ҹ��� ����
 * 2. Ŭ���� -> �빮�� ����(�Ľ�Į)
 * 3. �޼ҵ� -> �ҹ��� ����(ī��)
 */

public class B_ValueTest {
	public void printValue1() {
		
		// ���� ���
		System.out.println(123);
		System.out.println(1.23);
		
		// ���� ���
		System.out.println('a');
		System.out.println('b');
		
		// ���ڿ� ��� -> �ֵ���ǥ(���� �����̼�) ���
		System.out.println("�ȳ��ϼ���.");
		System.out.println("�ݰ����ϴ�.");
		
		// ���� ������
		System.out.println(123 + 456);
		System.out.println(1.23 - 0.12); //��ǻ�ʹ� �������ۿ� ǥ�� ���ؼ� �Ǽ��� ������ �ҿ�����
		
		// ���ڿ� ���ڴ� ���� ����
		// ��ǻ�ʹ� ���ڵ� ���ڷ� �ؼ�
		System.out.println('a' + 1);
		
		// ���ڿ��� ���ڷ� ����
		System.out.println("��������" + 1);
	}
}
