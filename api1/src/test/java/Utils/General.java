package Utils;

import java.util.Random;

public class General {
    Random rand = new Random();

    public String randomFullname(){
        return "dwi erna" + + rand.nextInt(1000);
    }

    public String randomEmail(){
        return "Dwierna" + + rand.nextInt(1000) + "@gmail.com";
    }

    public String randomPassword(){
        return "September" + + rand.nextInt(1000);
    }
}

