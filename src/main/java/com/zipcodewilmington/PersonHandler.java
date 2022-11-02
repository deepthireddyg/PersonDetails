package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...

    public String whileLoop() {
        String result = "";
        // create a `counter`

        int i = 0;
        // while `counter` is less than length of array
        while (i < personArray.length) {
            // begin loop
            // use `counter` to identify the `current Person` in the array
            String currentperson = personArray[i].toString();


            // get `string Representation` of `currentPerson`


            // append `stringRepresentation` to `result` variable
            result = result + currentperson;
            // end loop
            i++;

        }
        return result;
    }


    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
        // begin loop
        for (int i = 0; i < personArray.length; i++) {
            // use `counter` to identify the `current Person` in the array
            Object currentperson = personArray[i];
            // get `string Representation` of `currentPerson`
            String str = currentperson.toString();
            // append `stringRepresentation` to `result` variable
            result = result + str;
            // end loop
        }
        return result;
    }


    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        // use the above discoveries to declare for-each-loop signature
        // begin loop

       // for (Person opr : personArray) {
          for(Person i :personArray){

             // for ( i = 0;i < =personArray.length;i++) {
                  // use `counter` to identify the `current Person` in the array
                  String  currentperson = String.valueOf(i);
                  // get `string Representation` of `currentPerson`

                  // append `stringRepresentation` to `result` variable
              System.out.println(currentperson);
                  result = result + currentperson;
                  // end loop
              }
       // }
        return result;
    }
}


        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop







