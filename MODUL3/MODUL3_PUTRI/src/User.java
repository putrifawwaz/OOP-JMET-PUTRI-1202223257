public class User extends Bioskop{
   public static String nama;
   public static String noHandPhone;

   public User (String nama, String noHandPhone) {
      this.nama = nama;
      this.noHandPhone = noHandPhone;
   }

   public void setNama(String nama) {
      this.nama = nama;
   }

   public void setNoHandPhone(String noHandPhone) {
      this.noHandPhone = noHandPhone;
      }
   
   public void register(){
       System.out.println("Nama          : " + nama +
                           "No Handphone  : " + noHandPhone);    
    }
 
   public String getNama() {
      return nama;
   }

   public String getNoHandPhone() {
      return noHandPhone;
   }
}






  