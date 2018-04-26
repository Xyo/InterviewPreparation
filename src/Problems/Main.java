package Problems;

public class Main {
    public static void main(String[] args) {
        /*UniqueMorseCodes.printMorse();*/
        UniqueMorseCodes c = new UniqueMorseCodes();
        String[] words = {"vtpke", "vngc", "vnqr", "gbzx", "qvdx"};
        System.out.println("\nUNIQUE MORSE CODES\nCount(2): " + c.uniqueMorseRepresentations(words));

        System.out.println("===============================================================");

        System.out.println("\nHAMMING DISTANCE\n25343: " + Integer.toBinaryString(25343)
                            + "\n51332: " + Integer.toBinaryString(51332) + "\n\n");
        System.out.println(HammingDistance.hammingDistance(25343, 51332));
        System.out.println("===============================================================");

    }
}
