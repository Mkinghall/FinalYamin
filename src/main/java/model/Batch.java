package model;

public class Batch {

	

		public int bid;
		public String batchName;
		public String studentName;
		public String studentSkill;
		
		public Batch() {}

		public Batch(int bid, String batchName, String studentName, String studentSkill) {
			super();
			this.bid = bid;
			this.batchName = batchName;
			this.studentName = studentName;
			this.studentSkill = studentSkill;
		}

		public int getBid() {
			return bid;
		}

		public void setBid(int bid) {
			this.bid = bid;
		}

		public String getBatchName() {
			return batchName;
		}

		public void setBatchName(String batchName) {
			this.batchName = batchName;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		

		

		public String getStudentSkill() {
			return studentSkill;
		}

		public void setStudentSkill(String studentSkill) {
			this.studentSkill = studentSkill;
		}

		@Override
		public String toString() {
			return "Batch [bid=" + bid + ", batchName=" + batchName + ", studentName=" + studentName + ",  studentSkill=" + studentSkill + "]";
		}
		
		
	}

