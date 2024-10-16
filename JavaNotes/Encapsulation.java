public class Encapsulation {
    private String firstname;
    private String lastname;
    private int DOB;
    public String getFirstname() {
        return firstname;
    }

    public int getDOB() {
        return DOB;
    }

    public void setDOB(int DOB) {
        this.DOB = DOB;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }



    Encapsulation (String firstname,String lastname,int DOB){
        this.DOB = DOB;
        this.firstname = firstname;
        this.lastname = lastname;
    }


    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation ("Kishore","kumar",1998);
        obj.setDOB(12);
        obj.setFirstname("ram");
       obj.setLastname("sai");
        System.out.println(obj.getDOB());
        System.out.println(obj.firstname);
        System.out.println(obj.getLastname());


    }


}
