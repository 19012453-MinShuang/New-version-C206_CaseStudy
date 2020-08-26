//Done by Elizabeth
public class procedure {
	private int adminstrator_id; 
	private int procedure_id; 
	private String procedure;
	private String date;
	
	public procedure(int adminstrator_id, int procedure_id, String procedure, String date)  { 
		this.setAdminstrator_id(adminstrator_id);
		this.setProcedure_id(procedure_id); 
		this.procedure = procedure;
		this.setDate(date);
	} 
	public String getProcedure() { 
		return procedure; 	
	}
	public void setProcedure(String procedure) { 
		this.procedure = procedure; 	
	}
	public int getAdminstrator_id() { 
		return adminstrator_id; 
	}
	public void setAdminstrator_id (int adminstrator_id) {  
		this.adminstrator_id = adminstrator_id; 
	}
	public int getProcedure_id() { 
		return procedure_id; 
	}
	public void setProcedure_id(int procedure_id) { 
		this.procedure_id = procedure_id; 
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

}

