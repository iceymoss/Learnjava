package polymor.test;

import polymor.telphone.Camera;
import polymor.telphone.FourPhone;
import polymor.telphone.IPhone;

public class PhoneTest {
    public static void main(String[] args) {
        FourPhone phone = new FourPhone();
        phone.playGames();

        IPhone p = new Camera();
        p.photo();


    }
}
