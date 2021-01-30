import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PuzzleJava {
    public static void main(String[] args) {

        System.out.println("*****************************");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);
        numbers.add(9);
        numbers.add(8);
        numbers.add(13);
        numbers.add(25);
        numbers.add(32);
        ArrayList<Integer> newnumbers = gretertandsum(numbers);

        System.out.println("*****************************");
        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        ArrayList<String> newname = Shuffleandlongerthan5(names);

        System.out.println("*****************************");

        ArrayList<Character> ArrayAlph = new ArrayList<Character>();
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            ArrayAlph.add(letter);
        }
        Shuffleandvowel(ArrayAlph);
        System.out.println("*****************************");
        RandomNumAndSort();

        System.out.println("*****************************");
        randomString();

    }

    public static ArrayList<Integer> gretertandsum(ArrayList<Integer> arr) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (arr.get(i) > 10) {
                newArray.add(arr.get(i));
            }
        }
        System.out.println("the Sum = " + sum);
        System.out.println(newArray);
        return newArray;
    }

    public static ArrayList<String> Shuffleandlongerthan5(ArrayList<String> arr) {
        Collections.shuffle(arr);
        ArrayList<String> newArray = new ArrayList<String>();
        for (String name : arr) {
            if (name.length() > 5) {
                newArray.add(name);
            }
        }
        System.out.println(arr);
        System.out.println(newArray);
        return newArray;
    }

    public static void Shuffleandvowel(ArrayList<Character> arr) {
        Collections.shuffle(arr);
        System.out.println(" First letter: " + arr.get(0) + "   Last letter : " + arr.get(25));
        if (arr.get(0) == 'A' || arr.get(0) == 'E' || arr.get(0) == 'I' || arr.get(0) == 'O' || arr.get(0) == 'U') {
            System.out.println("The first letter is a vowel");
        }
    }

    public static ArrayList<Integer> RandomNumAndSort() {
        ArrayList<Integer> randomnum = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++) {
            randomnum.add(ThreadLocalRandom.current().nextInt(55, 101));
        }
        System.out.println(randomnum);
        Collections.sort(randomnum);
        System.out.println(randomnum);
        System.out.println("the minimum  Value = " + randomnum.get(0) + "The maximum value =" + randomnum.get(10 - 1));
        return randomnum;
    }

    public static void randomString() {
        Random rand = new Random();
        StringBuilder randomString = new StringBuilder();
        ArrayList<String> randList = new ArrayList<String>(10);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int str = 0; str < 10; str++) {
            for (int i = 0; i < 5; i++) {
                randomString.append(alphabet.charAt(rand.nextInt(alphabet.length())));
            }
            String finalString = randomString.toString();
            randList.add(finalString);
            randomString.setLength(0);
        }
        System.out.println(randList);
    }

}