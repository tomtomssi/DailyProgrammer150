/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogrammer150;

import java.util.Scanner;

/**
 *
 * @author Tatu
 */
public class DailyProgrammer150 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mCharacters = scanner.nextLine();
        String mVowels = scanner.nextLine();
        ParseDictionary pd = new ParseDictionary(mVowels, mCharacters);
        pd.findWords();
    }
}
