/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package working.with.clean.code;

/**
 *
 * @author Reynald Adolphe
 */
public class WorkingWithCleanCode
{

    // Talent demo, Note: Consider adding more code.
    public static void main(String[] args)
    {
        WriteThyName();
    }

    // Question - How are you so creative?
    private static void WriteThyName()
    {
        Talent talent = new Talent("Reynald", "20");
        System.out.println(talent.name
                + " is a tender age of "
                + talent.age);
    }
}
