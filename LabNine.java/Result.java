class Student {     
    private String name;     
    private int id;     
    private double cgpa;     
    
    public void setName(String name) {         
        this.name = name; 
    }     
    public void setId(int id) {         
        this.id = id; 
    } 
    public void setCgpa(double cgpa) {         
        this.cgpa = cgpa; 
    } 
   public String getName() {         
    return name; 
    }     public int getId() {         
        return id; 
    } 
    public double getCgpa() {         
        return cgpa; 
    } 
} public class Result {     
    public static void main(String[] args) {          
        Student s = new Student(); 
         s.setName("Samiul"); 
         s.setId(251045); 
         s.setCgpa(2.85);         
        
        System.out.println("Student Name: " + s.getName()); 
        System.out.println("Student ID: " + s.getId()); 
        System.out.println("Student CGPA: " + s.getCgpa()); 
    } 
} 
