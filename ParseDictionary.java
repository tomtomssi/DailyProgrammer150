/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogrammer150;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Tatu
 */
public class ParseDictionary {

    private String mCharacters;
    private String mVowels;
    
    private String mUniqueVowels;
    private String mUniqueCharacters;

    public ParseDictionary(String v, String c) {
        this.mCharacters = c;
        this.mVowels = v;
        
        this.mUniqueCharacters = getUniqueCharacters(mCharacters);
        this.mUniqueVowels = getUniqueCharacters(mVowels);
    }

    private final String file = "D:\\Programming\\Netbeans\\DailyProgrammer150\\src\\dailyprogrammer150\\enable1.txt";

    public void wordCount() {
        BufferedReader br = null;
        try {
            String sLine;
            br = new BufferedReader(new FileReader(file));
            while ((sLine = br.readLine()) != null) {
                System.out.println(sLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    //Generate a list of unique characters from the inputs
    private String getUniqueCharacters(String word){
        char[] chars = word.toCharArray();
        Set<Character> charSet = new LinkedHashSet<>();
        for(char c : chars){
            charSet.add(c);
        }
        
        StringBuilder sb = new StringBuilder();
        for(Character character : charSet){
            sb.append(character);
        }
        
        return sb.toString();
    }
}
