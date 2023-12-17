public class Teacher extends User{
    
    public Teacher (String name, int id) {
        super(name, id);
    }

    public void teachClass (String course) {
        System.out.println(name + " is teaching " + course);
    }
    
    @Override
    public String getUserDetail() {
        return "Teacher - " + super.getUserDetail();
    }
}