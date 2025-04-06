
public class OptimizedStringProcessing {
    static final int TIMES = 100000;
    public static void main (String[] args) {
        long stringTime = testStringAppend();
        System.out.println("Appending 100,000 times using String took: " + (stringTime / 1_000_000) + "ms");

        long builderTime = testStringBuilderAppend();
        System.out.println("Appending 100,000 times using StringBuilder took: " + (builderTime / 1_000_000) + "ms");

        long bufferTime = testStringBufferAppend();
        System.out.println("Appending 100,000 times using StringBuffer took: " + (bufferTime / 1_000_000) + "ms");

        // determine and display the fastest method
        String fastest;
        if (stringTime < builderTime && stringTime < bufferTime) {
            fastest = "String";
        } else if (builderTime < bufferTime) {
            fastest = "StringBuilder";
        } else {
            fastest = "StringBuffer";
        }

        System.out.println("Fastest method: " + fastest);
    }

    //method for using Test String append
    public static long testStringAppend() {
        long startTime = System.nanoTime();// start timing
        String result = "";

        // for loop 
        for (int i = 0; i < TIMES; i++){
            result += "Java";
        }

        long endTime = System.nanoTime(); // end timing
        return endTime - startTime; //return duration
    }

    // method for using test Stringbuilder append
    public static long testStringBuilderAppend() {
        StringBuilder builder = new StringBuilder(); //initialize StringBuilder
        long startTime = System.nanoTime(); //start timing

        for (int i = 0; i < TIMES; i++){
            builder.append("Java");
        }

        long endTime = System.nanoTime();
        return endTime - startTime;
    }   

    //method for using test Stringbuffer append
    public static long testStringBufferAppend() {
        StringBuffer buffer = new StringBuffer(); //initialize string buffer
        long startTime = System.nanoTime(); //Start timing

        //for loop
        for (int i = 0; i < TIMES; i++) {
            buffer.append("Java");
        }

        long endTime = System.nanoTime(); 
        return endTime - startTime;
    }
}
