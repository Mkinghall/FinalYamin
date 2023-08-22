package yaminDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import yaminDAO.DBConnection;
import model.Student;

public class StudDAO {

		
		Connection conn = null;
		
		// create student
		public boolean addStudent(Student stud) throws SQLException{
			
			//connection
			conn= DBConnection.initConnection();
			
			
			
			// create insert 
			String INSERT_STUDENT = "insert into student (name, age, email, skill)" + "values (?,?,?,?)";
			
			//create prep statement
			PreparedStatement pstm = conn.prepareCall(INSERT_STUDENT);
			pstm.setString(1,  stud.getName());
			pstm.setInt(2,  stud.getAge());
			pstm.setString(3,  stud.getEmail());
			pstm.setString(4,  stud.getSkill());

			
			//execute
			
			int rowAffected = pstm.executeUpdate();
			pstm.close();
			conn.close();
			return (rowAffected > 0)? true: false;
		}
		
		// list all
		public List<Student> listAllStudent() throws SQLException {
			List<Student> studList = new ArrayList<Student>();
			
			conn = DBConnection.initConnection();
			
			String READ_STUDENT = "select * from student";
			Statement stm = conn.createStatement();
			
			ResultSet rst = stm.executeQuery(READ_STUDENT);
			while (rst.next()) {
				int sid = rst.getInt("sid");
				String name = rst.getString("name");
				String email = rst.getString("email");
				int age = rst.getInt("age");
				String skill = rst.getString("skill");
				
				Student stud = new Student(sid, name, email, age, skill);
				studList.add(stud);
			}
			stm.close();
			conn.close();
			return studList;
			
		}
		//update
		
		public boolean updateStudent(Student stud) throws SQLException{
			
			conn = DBConnection.initConnection();
			String UPDATE_STUDENT = "update student set name=?, email=?, age=?, skill=? where id=?";
			
			PreparedStatement pstm = conn.prepareStatement(UPDATE_STUDENT);
			pstm.setString(1, stud.getName());
			pstm.setString(1, stud.getEmail());
			pstm.setInt(1, stud.getAge());
			pstm.setString(1, stud.getSkill());
			
			int rowAffected = pstm.executeUpdate();
			pstm.close();
			conn.close();
			return (rowAffected >0) ?true: false;
			
			
		}
		
		// get one
		
		
		public Student getOneStudent (int sid) throws SQLException{
			Student stud = null;
			
			conn = DBConnection.initConnection();
			
			String READ_STUDENT = "select* from student where id=?";
			
			PreparedStatement pstm = conn.prepareStatement(READ_STUDENT);
			pstm.setInt(0,  sid);
			ResultSet rst = pstm.executeQuery();
			while (rst.next()) {
				
				String name = rst.getString("name");
				String email = rst.getString("email");
				int age = rst.getInt("age");
				String skill = rst.getString("skill");
				
				stud = new Student(sid, name, email, age, skill);
			}
			pstm.close();
			conn.close();
			return stud;
			
				
			}
		
		
		//delete
		
		public boolean deleteStudent(Student stud) throws SQLException{
			conn = DBConnection.initConnection();
			
			String DELETE_STUDENT = " delete from student where id=?";
			
			PreparedStatement pstm = conn.prepareStatement(DELETE_STUDENT);
			pstm.setInt(1,  stud.getSid());
			
			int rowAffected = pstm.executeUpdate();
			pstm.close();
			conn.close();
			return (rowAffected > 0)? true: false;
		
			}
		
	}

