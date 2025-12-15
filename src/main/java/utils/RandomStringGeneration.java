package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomStringGeneration {

    public static String generateRandomString() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }

        // Add timestamp: yyyyMMdd_HHmmss_SSS
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS");
        String timestamp = sdf.format(new Date());

        return sb.toString() + "_" + timestamp;
    }
}
