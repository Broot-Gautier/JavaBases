import java.io.*;

class Notas
{   
    //Variables de instancia
    int inglesMark;
    int mathMark;
    int lpMark;
    //variables estaticas
    public static double promedio;
    public static String name = "hashiko";
}
 
class Grades
{
    public static void main(String args[])
    {   //first object
        Notas.promedio = 55;
        System.out.format("promedio de %s es %f\n",Notas.name,Notas.promedio);
        Notas obj1 = new Notas();
        obj1.inglesMark = 50;
        obj1.mathMark = 80;
        obj1.lpMark = 90;
 
        //second object
        Notas obj2 = new Notas();
        obj2.inglesMark = 80;
        obj2.mathMark = 60;
        obj2.lpMark = 85;
 
        //displaying marks for first object
        System.out.println("Notas para el primer objeto:");
        System.out.println(obj1.inglesMark);
        System.out.println(obj1.mathMark);
        System.out.println(obj1.lpMark);
     
        //displaying marks for second object
        System.out.println("Notas para el segundo objeto:");
        System.out.println(obj2.inglesMark);
        System.out.println(obj2.mathMark);
        System.out.println(obj2.lpMark);
    }
}