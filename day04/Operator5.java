package day04;

public class Operator5 {

	public static void main(String[] args) {
//		Shift ������: >>, <<, >>>
//		-��Ʈ �̵�
		int a=3;
//		��Ʈ�� �ٲپ� ����.
//		3   : 00000000 00000000 00000000 00000011
//		3>>2: 00000000 00000000 00000000 00000000
//		3<<2: 00000000 00000000 00000000 00001100
		System.out.println("a>>2: "+(a>>2));
		System.out.println("a>>1: "+(a>>1));
		System.out.println("a<<2: "+(a<<2));
		System.out.println("a>>>2: "+(a>>>2));
		System.out.println("--------------------");
/*      [1] >>: ���������� ��Ʈ �� ��ŭ �̵�. ������ ���� ��ĭ�� ��ȣ��Ʈ�� ä���.
 *      [2] <<: �������� ��Ʈ �� ��ŭ �̵�. �����ʿ� ���� ��ĭ�� 0���� ä���.
 *      [3}>>>: ���������� ��Ʈ �� ��ŭ �̵�. ���ʿ� ���� ��ĭ�� 0���� ä���.(����� ����)
 * 
 */
//		���� ǥ��

		int b=-3;
		System.out.println("b>>2: "+(b>>2));
		System.out.println("b>>>2: "+(b>>>2));
		System.out.println("b<<2: "+(b<<2));

	}

}