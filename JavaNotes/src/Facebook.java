public class Facebook {
String user,password;
     Facebook(String user, String password){
        this.user = user;
        this.password= password;
    }
    void login(){
         if(this.user=="DINESH")
         {
             if(this.password=="SSHHSHS"){
                 System.out.println(user + "Login is successfull");
             } else {
                 System.out.println("user is correct but password is wrong");
             }

         }else {
             System.out.println(user + "is invalid ");
         }

    }

    public static void main(String[] args) {
        Facebook cons = new Facebook("DINESerH","SSHrtrtHSHS");
        cons.login();

    }
}
