package estructuras;

public class Matrices {

    public static void main(String[] args) {
        //Declare array
        int[] array;
        //storing array in memory
        array = new int[5];
        System.out.println(array);
        System.out.println("***********************************************");
        int[] array1 = new int[] {10,20,30,40,50};
        for (int i = 0;i<array1.length;i++){
            System.out.println(array1[i]);
        }
        System.out.println("***********************************************");
        int[] array2 = new int[5];
        array2[0]=11;
        array2[1]=22;
        array2[2]=33;
        array2[3]=44;
        array2[4]=55;
        for (int i:array2){
            System.out.println("El numero es: " + i);
        }
        System.out.println("***********************************************");
        String[] alumnos = new String[]{"Alan Israel","Jose Alfredo","Carlos Alexander"};
        for(String i : alumnos){
            System.out.println("El alumno se llama: "+i);
        }
    }
}
