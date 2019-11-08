package jdbc;

import java.sql.*;

public class GetDB {
	String carID;
	String carPassword;

	public void LogIn(String inputID, String inputPassword) {
		this.carID = inputID;
		this.carPassword = inputPassword;

		Connection conn = null; // DB연결된 상태(세션)을 담은 객체
		PreparedStatement pstm = null; // SQL 문을 나타내는 객체
		ResultSet rs = null; // 쿼리문을 날린것에 대한 반환값을 담을 객체

		try {
			// SQL 문장을 만들고 만약 문장이 질의어(SELECT문) 라면
			// 그 결과를 담을 ResulSet 객체를 준비한 후 실행시킨다.
			String quary = "SELECT * FROM MEMBER WHERE ID = '" + carID + "' AND PASSWORD = '" + carPassword + "'";

			conn = getConnection();
			pstm = conn.prepareStatement(quary);
			rs = pstm.executeQuery();

			boolean loginConfirm = false;
			while (rs.next()) {
				String ID = rs.getString(1);
				// int employee_id = rs.getInt("employee_id"); 숫자 대신 컬럼 이름을 적어도 된다.
				String PASSWORD = rs.getString(2);

				String result = ID + " " + PASSWORD;
				if (ID.equals(carID) && PASSWORD.equals(carPassword)) {
					loginConfirm = true;
				}
			}
			if(loginConfirm == true) {
				System.out.println("우리 회원이 맞습니다 ㅠㅠ");
			}else {
				System.out.println("입력 정보가 올바르지 않습니다.");
			}

		} catch (SQLException sqle) {
			System.out.println("SELECT문에서 예외 발생");
			sqle.printStackTrace();

		} finally {
			// DB연결을 종료한다.
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				throw new RuntimeException(e.getMessage());
			}
		}

	}

	public static Connection getConnection() {
		String user = "hr";
		String pw = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println(" 로그인 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

}
