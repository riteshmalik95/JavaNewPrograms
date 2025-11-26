package com.miscellaneous;
//For passing the arguments to main() method - go to edit configurations and pass the arguments
// and run the program from there itself.
public class ParametersToMainMethod {
    public static void main(String[] args) {
        System.out.println(args.length);
        for(String value:args){
            System.out.println(value);
        }
    }
}
