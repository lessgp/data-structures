import java.util.Arrays;

public class ArrayExercises{

    public static int[] numbers = {1,3,3,6,8,9,9,10,-1};

    public static void main(String[] args){
        //System.out.println(Arrays.toString (numbers));

        //initArray(numbers);

        //System.out.println(containsElement(numbers, 10));

        //insertOrdered(numbers, 8);
        //System.out.println(Arrays.toString (numbers));
 
        //deleteElementFromArray(numbers, 4);

        //System.out.println(deleteElementFromArray(numbers, 10));

        //System.out.println(Arrays.toString(numbers));
        //removeIndex(numbers, 9);
        //System.out.println(Arrays.toString(numbers));

        //System.out.println(isPalindrome("dened"));

    }

    public static void initArray(int[] numArray){
        for(int i=0; i<numArray.length; i++){
            numArray[i]= -1;
        }
    }

    public static boolean containsElement(int[] numArray, int value){
        for(int i=0; i<numArray.length; i++){
            if(numArray[i] == value){
                return true;
            }
        }

        return false;
    }

    public static void insertOrdered(int [] numArray, int value) { 
        int insertIndex = 0, 
            shift = 0, 
            tmp = 0,
            lastIndex = numArray.length -1;

        if(numArray[lastIndex] == -1){
            for (int i = 0; i < numArray.length; i++) {
                if (numArray[i] > value || numArray[i] == -1) {
                    insertIndex = i ; 
                    break ;
                } 
            }
            shift = value;
            for (int i = insertIndex; i < numArray.length; i++) {
                tmp = numArray[i]; 
                numArray[i] = shift ;
                shift = tmp;
            }
        }else{
            
            // Crea una matriz
            int newArray[] = new int[numArray.length];

            //Asignarle los mismo valores
            newArray=numArray;

            // Realizar una copia de la matriz que es el doble del tamano 
            newArray = Arrays.copyOf (newArray, newArray.length * 2);

            for (int i = 0; i < newArray.length; i++) {
                //Si es mayor al valor asignado o igual a cero
                if (newArray[i] > value || newArray[i] == 0) {
                    insertIndex = i ; 
                    break ;
                } 
            }
            shift = value;
            for (int i = insertIndex; i < newArray.length; i++) {
                tmp = newArray[i]; 
                newArray[i] = shift ;
                shift = tmp;
            }
            
            System.out.println(Arrays.toString (newArray));
        
        }
    }

    public static boolean deleteElementFromArray(int[] numArray, int index) {
        int i = index;
        for (; i < numArray.length; i++) {
            if(numArray[i] == numArray[i + 1]){
                return true;
            }
        }
        return false;
    }

    public static void removeIndex(int[] numArray, int index) {
        int i = index;
        if(i <= numArray.length -1){
            for (; i < numArray.length - 1; i++) {
                if(numArray[i] == numArray[i - 1]){

                }
                numArray[i] = numArray[i + 1]; 
            }
            System.out.println("True");
            
        }else{
            System.out.println("False");
        }
        
    }

    public static boolean isPalindrome(String s) {
        int length = s.length();

        if (length < 2){
            // Si la cadena solo tiene 1 caracter o esta vacia
            return true;
        } 
        else {
            //Verifica los extremos opuestos de la cadena para ver si son iguales
            if (s.charAt(0) != s.charAt(length - 1)){
                return false;
            }else{
                //Llamada de funcion para cadena con los dos extremos cortados
                return isPalindrome(s.substring(1, length - 1));
            }
        }
    }

}
