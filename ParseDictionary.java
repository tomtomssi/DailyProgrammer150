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

    private final String _Characters;
    private final String _Vowels;

    private final String _UniqueCharacters;

    public ParseDictionary(String v, String c) {
        this._Characters = c;
        this._Vowels = v;

        this._UniqueCharacters = getUniqueCharacters(_Characters.concat(_Vowels));
    }

    private final String file = "D:\\Programming\\Netbeans\\DailyProgrammer150\\src\\dailyprogrammer150\\enable1.txt";

    public void findWords() {
        BufferedReader br = null;
        try {
            String sLine;
            int count = 0;
            br = new BufferedReader(new FileReader(file));
            while ((sLine = br.readLine()) != null) {
                if (!containsCharacters(sLine.toCharArray())) {
                    ++count;
                    //Print six items per line
                    if(count % 6 == 0) System.out.println();
                    System.out.print(sLine + " ");
                }
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
    private String getUniqueCharacters(String word) {
        char[] chars = word.toCharArray();
        Set<Character> charSet = new LinkedHashSet<>();
        for (char c : chars) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }

        return sb.toString();
    }

    //Check if the file item has characters that aren't present in the input
    private boolean containsCharacters(char[] word) {
        int index = word.length;
        for (char c : word) {
            if (!this._UniqueCharacters.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }
}
