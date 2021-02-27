package creational.factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Which social media details do you need 1:Insta, 2:Whatsapp, 3:Snap");
        String option = "";
        if(in.hasNext()) {
            option = in.next();
        }
        Factory factory = new Factory();
        SocialMedia socialMedia = factory.getSocialMedia(option);
        System.out.println(socialMedia.getMediaName());
        System.out.println(socialMedia.getMyAccountId());
    }
}
