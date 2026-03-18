package Projects.Portfolio;
import java.util.Random;
public class ChangePassword {
    private String username;

    private final int otp = GenerateOtp();

    public void setUsername(String username) {
        this.username = username;
    }

    //methods:=

    Random rand = new Random();
    public int GenerateOtp(){
        int min = 1000;
        int max = 9999;
        return rand.nextInt(max - min + 1) + min;
    }

    public int getOtp() {
        return otp;
    }
}
