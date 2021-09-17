/* ZCrowell_Module7_JavaIPO.java
 * Asks for city name and converts temperature from C to F
 * For CSCI 111 Section 002
 * last edited Oct. 27, 2020 by Zane Crowell
 */

package TempCalc;

import javax.swing.*;
import java.lang.Math;

public class Main {
    // define Main class
    public static void main(String[] args) {
        // declare variables
        String cityName;    // name of city
        String tempString;    // user input city temp
        double cityTemp;    // temp (celsius)
        double newTemp;     // temp (fahrenheit)
        String degreeSymb = "\u00b0";  // Unicode degree symbol
        double num = 9;    // numerator for fraction in conversion formula
        double denom = 5;   // denominator for fraction in conversion formula

        // ask for name of city
        cityName = JOptionPane.showInputDialog("Hello, please provide the name of the city:");

        // ask for temp of city in Celsius
        tempString = JOptionPane.showInputDialog("Provide the current temperature of " + cityName + " in degrees Celsius:");

        // convert input temperature to float
        cityTemp = Double.parseDouble(tempString);

        // calculate converted temperature
        newTemp = ((num/denom)*cityTemp)+32;

        // print results
        JOptionPane.showMessageDialog(null, "The current temperature in " + cityName +
                " is " + Math.round(cityTemp) + degreeSymb + "C, which is " + Math.round(newTemp) + degreeSymb +"F.",
                "Temperature Conversion", JOptionPane.INFORMATION_MESSAGE);

    } // end main()

} // end class TempCalc