public class PersonalInfo {
    public static void main(String[] args) {
        String name = "Mohammmad Samiul Alam";
        String studentId = "E251045";
        int age = 20;
        String email = "samiulalam468@gmail.com";
        String phone = "+88018******51";
        String address = " Hathazari, Chattogram";

        
        System.out.println("Personal Information:");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);

       
        System.out.printf("\nFormatted Information:\nName: %s\nStudent ID: %s\nAge: %d\nEmail: %s\nPhone: %s\nAddress: %s\n", name, studentId, age, email, phone, address);
    }
}
