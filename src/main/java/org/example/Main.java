package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));

        System.out.println(convertDecimalToBinary(5));  // Çıktı: 101
        System.out.println(convertDecimalToBinary(6));  // Çıktı: 110
        System.out.println(convertDecimalToBinary(13)); // Çıktı: 1101
    }

    public static boolean checkForPalindrome(String str) {
        String strClean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(strClean).reverse().toString();
        return strClean.equals(reversed);
    }

    public static String convertDecimalToBinary(int number) {
        if (number == 0) return "0"; // Özel durum: 0 için direkt dönüş yap

        StringBuilder binaryResult = new StringBuilder();

        // Sayıyı 2'ye bölerek kalanları StringBuilder'a ekle
        while (number > 0) {
            binaryResult.append(number % 2);  // Kalanı ekle
            number /= 2;                      // Sayıyı 2'ye böl
        }

        // StringBuilder'dan binary sonucu ters çevir ve döndür
        return binaryResult.reverse().toString();
    }

}