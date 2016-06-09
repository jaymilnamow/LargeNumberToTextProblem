import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;
import static com.sun.tools.doclint.Entity.nu;

/**
 * Created by jaymilnamow on 6/9/16.
 */


public class NumberToText {

    private String s;
    private String number;
    private String[] sSplitArray = {};
    private int numberLength;


    NumberToText (String s){
        this.number=s;
        this.s=s;
    }


    /**
     * first split number into an array
     **/
    private void splitNumberToArray() {

        System.out.println("number entering split to array " + number);
        sSplitArray = number.split("");
        numberLength = sSplitArray.length;
        System.out.println(numberLength);

    }

    private void decodeNumber(){

        if(numberLength<2){
            normalNumberDecoder(number);
        }


        for(int i=sSplitArray.length - 1; i >= 0; i--) {
            System.out.println(sSplitArray[0]);
        }

    }

    /**
     * counter for normal number locations 0-9
     **/
    private void normalNumberDecoder(){

        System.out.print(s.replace("0","Zero").replace("1","One").replace("2","Two").replace("3","Three").replace("4","Four").replace("5","Five").replace("6","Six").replace("7","Seven").replace("8","Eight").replace("9","Nine"));

    }

    /**
     * counter for tens 10, 20, 30, 40, 50, 60, 70, 80, 90
     */
    private void tensNumberDecoder(){

        System.out.print(s.replace("1","Ten").replace("2","Twenty").replace("3","Thirty").replace("4","Forty").replace("5","Fifty").replace("6","Sixty").replace("7","Seventy").replace("8","Eighty").replace("9","Ninety"));

    }

    /**
     * counter for eleven-teens .. should add two sSplitArray values and then use switch
     */
    private void teensNumberDecoder(){

    }

    /**
     * counter for hundreds
     **/
    private void hundredsNumberDecoder(){

        System.out.print(s + "Hundred");

    }

// }


    public static void main(String[] args) {

        NumberToText numbertotext = new NumberToText("1111");
        numbertotext.splitNumberToArray();

    }
}



//public class Main {
//
//    public static void main(String[] args) throws IOException {
//
//
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//
//        String s;
//
//        while ((s = in.readLine()) != null) {
//
//            NumberToText numbertotext = new NumberToText(s);
//            numbertotext.splitNumberToArray();
//
//          System.out.println(s);
//        }
//    }
//}

// @40min: I ran into an issue running this code, so I switched to Intellij for a second.. Attempted to hard-code an input, but can't get it to work either.. pretty sure this issue can be solved quickly, but it's caused by a simple misunderstanding
// I believe it may be most useful to split the number into an array and loop through it from it's greatest value position, back to 0, because then the Array positions will stay constant

/**
 * Major issues arise when hitting teens, because after interpreting the first value and adding an additional value, I would like to not have to override the initial value
 *  1=one, but 11 = one + override to eleven, which doubles up processes.. I would like to plan this a little further.. good thing I have the weekend.
 **/

// Realized use of replaceAll() is not needed; changed to replace()

//
