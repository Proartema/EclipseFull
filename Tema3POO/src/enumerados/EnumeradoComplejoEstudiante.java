package enumerados;

public enum EnumeradoComplejoEstudiante {

   EXCHANGE_STUDENT("EXCHANGE STUDENT", 1, "INTERNATIONAL"), NATIONAL_STUDENT("NATIONAL STUDENT", 2, "NATIONAL"),
   STATE_STUDENT("STATE STUDENT", 3, "LOCAL");

	private String nameStudent;
   private int id;
   private String description;
  

   EnumeradoComplejoEstudiante( String nameStudent,int id,String description) {
       // TODO Auto-generated constructor stub
	   this.nameStudent = nameStudent;
       this.id = id;
       this.description = description;
       
   }

   public String getDescription() {

       return this.description;
   }

   public int getId() {
       return id;
   }

   public String getNameStudent() {
       return this.nameStudent;
   }
 
}