package Basics;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Product {
    static String productName = "REPLACE WITH PRODUCT NAME";
    public static void main(String[] args) {
        try {
            File myObj = new File((productName+".html"));
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter((productName+".html"));
            myWriter.write("<!DOCTYPE html>\r\n" + //
                                "<html lang=\"en\">\r\n" + //
                                "<head>\r\n" + //
                                "    <meta charset=\"UTF-8\">\r\n" + //
                                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + //
                                "    <title>Product Page</title>\r\n" + //
                                "    <link rel=\"stylesheet\" href=\"Clock.css\"> <!-- Link to your CSS file -->\r\n" + //
                                "</head>\r\n" + //
                                "<body>\r\n" + //
                                "    <header>\r\n" + //
                                "        <div class=\"logo\">CircuitSpark Crates</div>\r\n" + //
                                "        <nav>\r\n" + //
                                "            <ul>\r\n" + //
                                "                <li><a href=\"Home.html\">Home</a></li>\r\n" + //
                                "                <li><a href=\"Kits.html\">Our Kits</a></li>\r\n" + //
                                "                <li><a href=\"about.html\">About</a></li>\r\n" + //
                                "                <li><a href=\"contact.html\">Contact</a></li>\r\n" + //
                                "                <li><a href=\"cartpage.html\">Cart</a></li>\r\n" + //
                                "            </ul>\r\n" + //
                                "        </nav>\r\n" + //
                                "    </header>\r\n" + //
                                "\r\n" + //
                                "    <main>\r\n" + //
                                "        <div class=\"titlecard\">\r\n" + //
                                "            <h1>NAME OF PRODUCT</h1>\r\n" + //
                                "        </div>\r\n" + //
                                "        <img src=\"clock.png\" alt=\"Clock Kit\" class=\"kit-image\" width=\"42.5%\" height=\"auto\">\r\n" + //
                                "        <div class=\"description\">\r\n" + //
                                "            <h2>Product Description</h2>\r\n" + //
                                "            <p>PRODUCT DESCRIPTION<br>\r\n" + //
                                "            <strong class=\"stronk\">Features:</strong><br>\r\n" + //
                                "            <div class=\"features\">\r\n" + //
                                "                - Easy to assemble<br>\r\n" + //
                                "                - Educational<br>\r\n" + //
                                "                - Fun and engaging<br>\r\n" + //
                                "                - Great for all ages<br>\r\n" + //
                                "                - Includes all necessary components<br>\r\n" + //
                                "                - Detailed instructions<br>\r\n" + //
                                "                - customisable design<br>\r\n" + //
                                "            </div>\r\n" + //
                                "            </p>\r\n" + //
                                "        </div>\r\n" + //
                                "        <a class=\"purchase\" href=\"cartpage.html\"> Buy Now!</a>\r\n" + //
                                "    </main>\r\n" + //
                                "\r\n" + //
                                "    <footer>\r\n" + //
                                "        <p>&copy; 2023 CircuitSpark Labs. All rights reserved.</p>\r\n" + //
                                "    </footer>\r\n" + //
                                "</body>\r\n" + //
                                "</html>\r\n" + //
                                "");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}
