package jdbc;

import java.sql.*;

public class GetDB {
	String carID;
	String carPassword;

	public void LogIn(String inputID, String inputPassword) {
		this.carID = inputID;
		this.carPassword = inputPassword;

		Connection conn = null; // DB����� ����(����)�� ���� ��ü
		PreparedStatement pstm = null; // SQL ���� ��Ÿ���� ��ü
		ResultSet rs = null; // �������� �����Ϳ� ���� ��ȯ���� ���� ��ü

		try {
			// SQL ������ ����� ���� ������ ���Ǿ�(SELECT��) ���
			// �� ����� ���� ResulSet ��ü�� �غ��� �� �����Ų��.
			String quary = "SELECT * FROM MEMBER WHERE ID = '" + carID + "' AND PASSWORD = '" + carPassword + "'";

			conn = getConnection();
			pstm = conn.prepareStatement(quary);
			rs = pstm.executeQuery();

			boolean loginConfirm = false;
			while (rs.next()) {
				String ID = rs.getString(1);
				// int employee_id = rs.getInt("employee_id"); ���� ��� �÷� �̸��� ��� �ȴ�.
				String PASSWORD = rs.getString(2);

				String result = ID + " " + PASSWORD;
				if (ID.equals(carID) && PASSWORD.equals(carPassword)) {
					loginConfirm = true;
				}
			}
			if(loginConfirm == true) {
				System.out.println("�츮 ȸ���� �½��ϴ� �Ф�");
			}else {
				System.out.println("�Է� ������ �ùٸ��� �ʽ��ϴ�.");
			}

		} catch (SQLException sqle) {
			System.out.println("SELECT������ ���� �߻�");
			sqle.printStackTrace();

		} finally {
			// DB������ �����Ѵ�.
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
			System.out.println(" �α��� ����");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

}
