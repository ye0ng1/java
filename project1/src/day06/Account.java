package day06;

public class Account {
	
	// ���� ��ü�� Ŭ������ ����� ������ �߻�ȭ��� ��
	
	// ��ü : 1) ����� ���� ��ü, 2) ������ ������ ���� ��ü

	// Account(���� ����)
	// - ����� Ư��(�Ӽ�) : ���¸�, ���¹�ȣ, ��й�ȣ, �ܾ�, ����
	// - ������ Ư��(���) : �����ϴ�, ����ϴ�, �ܾ���ȸ, ��ü
	
	//��������(�������-�Ӽ�)
	public String name;
	public String accountNumber;
	public String passwd;
	public long balance;
	public float interest;
	
	//�޼��� ����(���)
	//�����ϴ�
	public void saveMoney(long amount) {
		balance += amount;
	}
	//����ϴ�
	public void withdrawMoney(long amount) {
		balance -= amount;
	}
	//�ܾ� Ȯ��
	public long getBalance() {
		return balance;
	}
}
