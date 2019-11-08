package projectpractice;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; // 버튼 눌렀을때 다음 페이지로 전환되는 기능넣을때 사용

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
		System.out.println("와우");
		System.out.println("굿");
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
		frame.setTitle("ParkingSystem"); // 화면창 이름 임의로 설정 가능
		frame.setBounds(100, 100, 484, 352); // 화면 크기 설정
		frame.setLocationRelativeTo(null); // 화면이 중앙에서 뜨도록 설정해주는 메소드
		frame.setResizable(false); // 화면크기 마우스로 확대축소 못하도록 고정시키기
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// 비회원/장애인 페이지 시작
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

		// 회원가입 페이지 시작
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

		// 로그인 페이지 시작
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

		// 첫 주차화면 페이지 시작
		JPanel StartPage = new JPanel();
		StartPage.setBounds(0, 0, 478, 324);
		frame.getContentPane().add(StartPage);
		StartPage.setLayout(null);

		// 여기부터 첫화면 1~21번 주차번호 버튼
		Button[] button = new Button[21]; // 버튼이라는 타입의 21자리짜리 배열 생성
		for (int i = 0; i < button.length; i++) {
			button[i] = new Button(Integer.toString(i + 1)); // 배열안에 버튼객체를 생성해서 넣어준다
		}

		int count = 0;
		int init_value2 = 30;

		for (int j = 0; j < 3; j++) { // 0,1,2 일단 0번째 줄일때
			int init_value1 = 30;
			for (int i = 0; i < 7; i++) { // 7번 반복
				button[count].setBounds(init_value1, init_value2, 45, 68); // 45,68은 버튼의 크기 => 고정
				init_value1 += 60; // x좌표값 +60씩더해주면서 저장 => 반복해서 버튼찍을때마다 옆으로 +60만큼 이동하면서 찍음
				StartPage.add(button[count]); // 버튼을 창에서 보여지게함
				button[count].setBackground(Color.GREEN); // 색깔은 그린
				count++;
			}
			init_value2 += 90; // i=7일때 안쪽 for문 빠져나오고 y좌표값 +90해서 다음줄부터 찍어주기
		}

		// 주차번호 버튼 클릭시 로그인화면으로 전환되는것 반복
		for (int i = 0; i < 21; i++) {
			LoginPage.setVisible(false);
			button[i].addActionListener(new ActionListener() { // i=0일때 = 1번째 버튼클릭시 밑에꺼 실행

				@Override
				public void actionPerformed(ActionEvent e) {
					String str = e.getActionCommand(); // 클릭한버튼의 숫자(1)를 리턴값으로 받아오는 메소드.. 받아와서 str변수에 저장
					tmp = Integer.parseInt(str) - 1; // 스트링타입 "1"리턴값을 int로 변환.. 임시선언한 tmp라는 변수에 저장 tmp=1-1=0
					LoginPage.setVisible(true);
					StartPage.setVisible(false);

				}

			});
		}

		// 입차 버튼 클릭시
		EnrollPage.setVisible(false);
		StartPage.setVisible(false);

		btnCarIn.addActionListener(new ActionListener() { // 입차버튼 클릭시 아래 실행

			@Override
			public void actionPerformed(ActionEvent e) {
				button[tmp].setBackground(Color.RED); // tmp=0이면 버튼은 1번째버튼.. 그걸 레드로 변환
				StartPage.setVisible(true); // 화면전환하면 레드로 변환된 1번버튼이 보이는 창이 드러남
				LoginPage.setVisible(false); // 로그인창은 다시 숨김

			}

		});

		// 로그인화면에서 뒤로버튼 클릭시 굳이 반복문안써도되고 그냥 화면전환만 하도록..
		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				StartPage.setVisible(true);
				LoginPage.setVisible(false);

			}

		});

		// 로그인페이지에서회원가입버튼 클릭시 회원가입창이 뜨게하는 기능
		EnrollPage.setVisible(false);
		StartPage.setVisible(false);

		Enroll.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				EnrollPage.setVisible(true);
				LoginPage.setVisible(false);

			}

		});

		// 이제 다시 회원가입페이지에서 뒤로가기 버튼 눌렀을때 로그인 페이지로 돌아가는 기능 구현
		back2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				LoginPage.setVisible(true);
				EnrollPage.setVisible(false);

			}

		});

		// 로그인페이지에서 비회원/장애인 버튼 클릭시 비회원/장애인 페이지가 뜨게하는 기능
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

		// 비회원/장애인 페이지에서 뒤로가기 버튼 눌렀을때 그 전화면인 로그인 화면으로 돌아가는 기능
		back3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				LoginPage.setVisible(true);
				NonMemberPage.setVisible(false);

			}

		});

	}
}
