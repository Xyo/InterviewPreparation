package Problems;

import java.util.HashSet;


class UniqueMorseCodes {
    public static final String[] morse = { ".-","-...","-.-.","-..",".","..-.","--.","....","..",
                                           ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                                           "...","-","..-","...-",".--","-..-","-.--","--.." };

    public static void printMorse(){
        UniqueMorseCodes c = new UniqueMorseCodes();
        String[] words = {"vtpke","vngc","vnqr","gbzx","qvdx"};
        System.out.println(c.uniqueMorseRepresentations(words));

        // Verify morse creation and resulting hashset
        String[] results = new String[4];
        results[0] = UniqueMorseCodes.wordToMorse("gin");
        results[1] = UniqueMorseCodes.wordToMorse("zen");
        results[2] = UniqueMorseCodes.wordToMorse("gig");
        results[3] = UniqueMorseCodes.wordToMorse("msg");
        System.out.println("\ngin: " + results[0]);
        System.out.println("\nzen: " + results[1]);
        System.out.println("\ngig: " + results[2]);
        System.out.println("\nmsg: " + results[3]);

        HashSet<String> testSet = new HashSet<>();
        for(String morse : results){
            testSet.add(morse);
        }
    }

    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> morseTrans = new HashSet<>();
        for(int i=0; i<words.length; i++){
            morseTrans.add(wordToMorse(words[i]));
        }
        return morseTrans.size();
    }

    public static String wordToMorse(String word){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<word.length(); i++){
            sb.append(charToMorse(word.charAt(i)));
        }
        return sb.toString();
    }

    public static String charToMorse(char c){
        int index = (int)c - (int)'a';
        return morse[index];
    }
}