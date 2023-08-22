package yaminDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import yaminDAO.DBConnection;
import model.Batch;

public class batchDAO {

	public class BatchDAO {
		
		Connection conn = null;
		
		public boolean createBatch(Batch batch) throws SQLException{
			conn = DBConnection.initConnection();
			
			String INSERT_BATCH = "insert into batch(0, batchName, studentName, studentSkill";
			
			PreparedStatement pstm = conn.prepareCall(INSERT_BATCH);
			pstm.setString(1, batch.getBatchName());
			pstm.setString(2,  batch.getStudentName());
			pstm.setString(3,  batch.getStudentSkill());
			
			int rowAffected = pstm.executeUpdate();
			pstm.close();
			conn.close();
			
			return(rowAffected >0) ? true : false;
			
			
		}

	}

}
