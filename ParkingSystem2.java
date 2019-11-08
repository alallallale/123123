package projectpractice;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; // ��ư �������� ���� �������� ��ȯ�Ǵ� ��ɳ����� ���

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JCheckBox;

public class ParkingSystem2 {

	private JFrame frame;
	private JTextField txt_id;
	private JTextField txt_pw;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	int i = 0;
	int tmp = 0; // temp

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					ParkingSystem2 window = new ParkingSystem2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ParkingSystem2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setTitle("ParkingSystem"); // ȭ��â �̸� ���Ƿ� ���� ����
		frame.setBounds(100, 100, 484, 352); // ȭ�� ũ�� ����
		frame.setLocationRelativeTo(null); // ȭ���� �߾ӿ��� �ߵ��� �������ִ� �޼ҵ�
		frame.setResizable(false); // ȭ��ũ�� ���콺�� Ȯ����� ���ϵ��� ������Ű��
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// ��ȸ��/����� ������ ����
		JPanel NonMemberPage = new JPanel();
		NonMemberPage.setBounds(0, 0, 478, 324);
		frame.getContentPane().add(NonMemberPage);
		NonMemberPage.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("\uCC28\uBC88(ID):");
		lblNewLabel_6.setBounds(64, 48, 57, 15);
		NonMemberPage.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("\uCC28\uC885:");
		lblNewLabel_7.setBounds(64, 73, 57, 15);
		NonMemberPage.add(lblNewLabel_7);

		JCheckBox chckbxNewCheckBox = new JCheckBox("\uC7A5\uC560");
		chckbxNewCheckBox.setBounds(64, 105, 115, 23);
		NonMemberPage.add(chckbxNewCheckBox);

		textField_6 = new JTextField();
		textField_6.setBounds(115, 45, 116, 21);
		NonMemberPage.add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(115, 73, 116, 21);
		NonMemberPage.add(textField_7);
		textField_7.setColumns(10);

		JButton completion2 = new JButton("\uC644\uB8CC");
		completion2.setBounds(240, 44, 67, 50);
		NonMemberPage.add(completion2);

		JButton back3 = new JButton("\uB4A4\uB85C");
		back3.setBounds(240, 105, 67, 23);
		NonMemberPage.add(back3);

		// ȸ������ ������ ����
		JPanel EnrollPage = new JPanel();
		EnrollPage.setBounds(0, 0, 478, 324);
		frame.getContentPane().add(EnrollPage);
		EnrollPage.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("\uC774\uB984:");
		lblNewLabel_2.setBounds(39, 60, 57, 15);
		EnrollPage.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("\uCC28\uBC88(ID):");
		lblNewLabel_3.setBounds(39, 85, 57, 15);
		EnrollPage.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("\uCC28\uC885:");
		lblNewLabel_4.setBounds(39, 110, 57, 15);
		EnrollPage.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("PW:");
		lblNewLabel_5.setBounds(39, 136, 57, 15);
		EnrollPage.add(lblNewLabel_5);

		textField_2 = new JTextField();
		textField_2.setBounds(95, 57, 116, 21);
		EnrollPage.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(95, 82, 116, 21);
		EnrollPage.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(95, 107, 116, 21);
		EnrollPage.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(95, 133, 116, 21);
		EnrollPage.add(textField_5);
		textField_5.setColumns(10);

		JButton completion = new JButton("\uC644\uB8CC");
		completion.setBounds(223, 57, 83, 70);
		EnrollPage.add(completion);

		JButton back2 = new JButton("\uB4A4\uB85C");
		back2.setBounds(223, 132, 83, 23);
		EnrollPage.add(back2);

		// �α��� ������ ����
		JPanel LoginPage = new JPanel();
		LoginPage.setBounds(0, 0, 478, 324);
		frame.getContentPane().add(LoginPage);
		LoginPage.setLayout(null);

		JLabel lblNewLabel = new JLabel("\uCC28\uBC88(ID):");
		lblNewLabel.setBounds(35, 9, 49, 15);
		LoginPage.add(lblNewLabel);

		txt_id = new JTextField();
		txt_id.setBounds(89, 6, 116, 21);
		LoginPage.add(txt_id);
		txt_id.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("PW       :");
		lblNewLabel_1.setBounds(210, 9, 50, 15);
		LoginPage.add(lblNewLabel_1);

		txt_pw = new JTextField();
		txt_pw.setBounds(265, 6, 116, 21);
		LoginPage.add(txt_pw);
		txt_pw.setColumns(10);

		JButton btnCarIn = new JButton("\uC785\uCC28");
		btnCarIn.setBounds(386, 5, 80, 23);
		LoginPage.add(btnCarIn);

		JButton Enroll = new JButton("\uD68C\uC6D0\uAC00\uC785");
		Enroll.setBounds(90, 34, 92, 23);
		LoginPage.add(Enroll);

		JButton NonMember_handicap = new JButton("\uBE44\uD68C\uC6D0/\uC7A5\uC560\uC778");
		NonMember_handicap.setBounds(194, 34, 116, 23);
		LoginPage.add(NonMember_handicap);

		JButton btnBack = new JButton("\uB4A4\uB85C");
		btnBack.setBounds(322, 34, 92, 23);
		LoginPage.add(btnBack);

		// ù ����ȭ�� ������ ����
		JPanel StartPage = new JPanel();
		StartPage.setBounds(0, 0, 478, 324);
		frame.getContentPane().add(StartPage);
		StartPage.setLayout(null);

		// ������� ùȭ�� 1~21�� ������ȣ ��ư
		Button[] button = new Button[21]; // ��ư�̶�� Ÿ���� 21�ڸ�¥�� �迭 ����
		for (int i = 0; i < button.length; i++) {
			button[i] = new Button(Integer.toString(i + 1)); // �迭�ȿ� ��ư��ü�� �����ؼ� �־��ش�
		}

		int count = 0;
		int init_value2 = 30;

		for (int j = 0; j < 3; j++) { // 0,1,2 �ϴ� 0��° ���϶�
			int init_value1 = 30;
			for (int i = 0; i < 7; i++) { // 7�� �ݺ�
				button[count].setBounds(init_value1, init_value2, 45, 68); // 45,68�� ��ư�� ũ�� => ����
				init_value1 += 60; // x��ǥ�� +60�������ָ鼭 ���� => �ݺ��ؼ� ��ư���������� ������ +60��ŭ �̵��ϸ鼭 ����
				StartPage.add(button[count]); // ��ư�� â���� ����������
				button[count].setBackground(Color.GREEN); // ������ �׸�
				count++;
			}
			init_value2 += 90; // i=7�϶� ���� for�� ���������� y��ǥ�� +90�ؼ� �����ٺ��� ����ֱ�
		}

		// ������ȣ ��ư Ŭ���� �α���ȭ������ ��ȯ�Ǵ°� �ݺ�
		for (int i = 0; i < 21; i++) {
			LoginPage.setVisible(false);
			button[i].addActionListener(new ActionListener() { // i=0�϶� = 1��° ��ưŬ���� �ؿ��� ����

				@Override
				public void actionPerformed(ActionEvent e) {
					String str = e.getActionCommand(); // Ŭ���ѹ�ư�� ����(1)�� ���ϰ����� �޾ƿ��� �޼ҵ�.. �޾ƿͼ� str������ ����
					tmp = Integer.parseInt(str) - 1; // ��Ʈ��Ÿ�� "1"���ϰ��� int�� ��ȯ.. �ӽü����� tmp��� ������ ���� tmp=1-1=0
					LoginPage.setVisible(true);
					StartPage.setVisible(false);

				}

			});
		}

		// ���� ��ư Ŭ����
		EnrollPage.setVisible(false);
		StartPage.setVisible(false);

		btnCarIn.addActionListener(new ActionListener() { // ������ư Ŭ���� �Ʒ� ����

			@Override
			public void actionPerformed(ActionEvent e) {
				button[tmp].setBackground(Color.RED); // tmp=0�̸� ��ư�� 1��°��ư.. �װ� ����� ��ȯ
				StartPage.setVisible(true); // ȭ����ȯ�ϸ� ����� ��ȯ�� 1����ư�� ���̴� â�� �巯��
				LoginPage.setVisible(false); // �α���â�� �ٽ� ����

			}

		});

		// �α���ȭ�鿡�� �ڷι�ư Ŭ���� ���� �ݺ����Ƚᵵ�ǰ� �׳� ȭ����ȯ�� �ϵ���..
		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				StartPage.setVisible(true);
				LoginPage.setVisible(false);

			}

		});

		// �α�������������ȸ�����Թ�ư Ŭ���� ȸ������â�� �߰��ϴ� ���
		EnrollPage.setVisible(false);
		StartPage.setVisible(false);

		Enroll.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				EnrollPage.setVisible(true);
				LoginPage.setVisible(false);

			}

		});

		// ���� �ٽ� ȸ���������������� �ڷΰ��� ��ư �������� �α��� �������� ���ư��� ��� ����
		back2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				LoginPage.setVisible(true);
				EnrollPage.setVisible(false);

			}

		});

		// �α������������� ��ȸ��/����� ��ư Ŭ���� ��ȸ��/����� �������� �߰��ϴ� ���
		LoginPage.setVisible(false);
		EnrollPage.setVisible(false);
		NonMemberPage.setVisible(false);
		StartPage.setVisible(true);

		NonMember_handicap.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				NonMemberPage.setVisible(true);
				LoginPage.setVisible(false);

			}

		});

		// ��ȸ��/����� ���������� �ڷΰ��� ��ư �������� �� ��ȭ���� �α��� ȭ������ ���ư��� ���
		back3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				LoginPage.setVisible(true);
				NonMemberPage.setVisible(false);

			}

		});

	}
}