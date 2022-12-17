package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
// import java.sql.Statement;

public class DBConn2 {
	public static void main(String[] args) {
// 데이터베이스 라이브러리 추가하기
// 프로젝트 우클릭->properties->java build path->class path->add external JARs...->mysql-connector-j-8.0.31.jar
// Mysql설치경로 : C:\Program Files (x86)\MySQL\Connector J 8.0
		
		MyDB2 db = new MyDB2();
		
//		db.connect();
//		db.insert();
		
//		db.connect();
//		db.update();
		
//		db.connect();
//		db.delete();
		
		db.connect();
		db.select();
	}
}

class MyDB2{
	private Connection conn;
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/company";	// 스키마명
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
	}
	
	public void connect() {
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void select() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM worker";	// select All
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {								// 위에서부터 한 행씩 반복문
				int id = rs.getInt("id");					// 첫번째 열의 값을 가져오겠다
				String name = rs.getString(2);				// 두번째 열의 값을 가져오겠다
				String gender = rs.getString("gender");		// 세번째 열의 값을 가져오겠다
				
				System.out.println(id+" "+name+" "+gender); 				// 한 행씩 실행할 때마다 출력
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// insert : 입력
	public void insert() {
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO worker (name, gender) VALUES (?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			// ?에 해당하는 값을 채워줌 (pstmt는 뒤늦게 ?를 채워줘도 된다)
			pstmt.setString(1, "pink");  			// 첫번째 ? 에 문자열 넣음
			pstmt.setString(2, "woman");  			// 두번째 ? 에 문자열 넣음
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("입력 성공");
			}else {
				System.out.println("입력 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// update : 수정
	public void update() {
		PreparedStatement pstmt = null;
		String sql = "UPDATE worker SET gender=? WHERE id=?";		// id=6의 gender를 변경한다 
		
		try {
			pstmt = conn.prepareStatement(sql);
			// ? 채워주기
			pstmt.setString(1, "man");
			pstmt.setInt(2, 7);
			
			
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("수정 성공");
			}else {
				System.out.println("수정 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// delete : 삭제
	public void delete() {
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM worker WHERE id=?";			// id=6의 내용을 삭제한다.
		try {
			pstmt = conn.prepareStatement(sql);
			// ? 채워넣기
			pstmt.setInt(1, 1);
			
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("삭제 성공");
			}else {
				System.out.println("삭제 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}