public class BannerApp_User {

   public static void main(String[] args){

       // 1D String Array – each array represents one letter
       String[] O = {
               " **** ",
               "*    *",
               "*    *",
               "*    *",
               " **** "
       };

       String[] P = {
               "***** ",
               "*    *",
               "***** ",
               "*     ",
               "*     "
       };

       String[] S = {
               " **** ",
               "*     ",
               " **** ",
               "     *",
               " **** "
       };

       // Store all letters in a 2D structure for easy traversal
       String[][] banner = {O, O, P, S};

       // Using for loop to print banner row by row
       for (int i = 0; i < O.length; i++) {
           String[] row = new String[banner.length];

           // Enhanced for loop to collect each letter's row
           for (int j = 0; j < banner.length; j++) {
               row[j] = banner[j][i];
           }

           // String.join() to concatenate each row
           System.out.println(String.join("   ", row));
       }
   }
}
