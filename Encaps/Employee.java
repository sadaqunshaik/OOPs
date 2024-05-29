package encaps;

public class Name {
    private int eid;
    private String ename;
    private double esal;
    private String email;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getEsal() {
        return esal;
    }

    public void setEsal(double esal) {
        this.esal = esal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        Name e1=new Name();
        e1.setEid(101);
        e1.setEname("Rahul");
        e1.setEsal(45000.00);
        e1.setEmail("rg@gmail.com");
        System.out.println("Name Id::::"+e1.getEid()+"-Name Name"+e1.getEname());
    }
}