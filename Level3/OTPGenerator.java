import java.util.*;

public class OTPGenerator {

    public static int generateOTP() {
        return (int)(100000 + Math.random() * 900000);
    }

    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] != otps[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }

        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }

        if (areOTPsUnique(otpArray)) {
            System.out.println("All OTPs are not the same. Validation passed.");
        } else {
            System.out.println("All OTPs are the same. Validation failed.");
        }
    }
}

