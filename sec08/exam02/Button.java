package sec08.exam02;

public class Button {
	OnClickListener listener;//�������̽� Ÿ���� �ʵ� ����
	
	void setOnClickListener(OnClickListener listener) {//�������̽� Ÿ�� �Ű����� ����
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener {
		void onClick();//�߻� �޼ҵ� ����->Ŭ���� ������ ������(Override).
	}

}
