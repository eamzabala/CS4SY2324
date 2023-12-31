/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4zabala;

/**
 *
 * @author Emily Zabala
 */
public class CS4Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // book one
        String name1 = "The Inheritance Games";
        int rating1 = 5;
        int pubYear1 = 2020;

        // book two
        String name2 = "Hani and Ishu's Guide to Fake Dating";
        int rating2 = 5;
        int pubYear2 = 2021;

        // book three
        String name3 = "A Good Girls' Guide to Murder"; //disclaimer: I have not and will not ever murder someone
        int rating3 = 4;
        int pubYear3 = 2019;

        
        // average rating
        int ratingTotal = rating1 + rating2 + rating3;
        double ratingAve = ratingTotal / 3;
        System.out.print("The average rating of the books is: ");
        System.out.println((double)ratingAve);
        
        // newest release
        int newRelease = Math.max(Math.max(pubYear1, pubYear2), pubYear3);
        String newBook = "";
        switch(newRelease) {
            case 2020 -> newBook = name1;
            case 2021 -> newBook = name2;
            case 2022 -> newBook = name3;
        }
        System.out.print("The newest release is ");
        System.out.print(newBook);
        System.out.print(", which was released on ");
        System.out.println(newRelease);
        
        // was agggtm released after tig
        boolean olderBook = pubYear3 > pubYear1;
        if (olderBook) {
            System.out.println("A Good Girl's Guide to Murder was released after The Inheritance Games.");
        } else {
            System.out.println("A Good Girl's Guide to Murder was not released after The Inheritance Games.");
        }
    }
    
}
