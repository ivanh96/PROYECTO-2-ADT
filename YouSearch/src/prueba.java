/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * PROYECTO 2 - YouSearch
 * Descripción:
    Sistema de recomendación de películas
 * Integrantes:
    Paulina Cano - 15
    Marlon Hernández - 15
    Andrés Girón - 15
    Brandon Hernández - 15
 * prueba.java
    clase para probar el funcionamiento del programa
 */

import java.io.File;
import java.util.Scanner;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

public class prueba {
       
    public static void main(String args[]){
        
        //Se crea una fabrica para crear bases de datos
        GraphDatabaseFactory dbFactory = new GraphDatabaseFactory();
        //Se obtiene la dirección de la base de datos, esta cambia en cada computadora:
        File directorio = new File("C:\\Users\\usuario\\Documents\\Neo4j\\default.graphdb");
        //Se utiliza el objeto tipo file para ingresar al archivo del grafoDataBase = dbFactory.newEmbeddedDatabase(directorio);
        GraphDatabaseService DB = dbFactory.newEmbeddedDatabase(directorio);
        DB.execute("MATCH (n)\n" + "OPTIONAL MATCH (n)-[r]-()\n" + "DELETE n,r");
        //Se crea la base de datos, llena con valores predeterminados
        DataBase Base = new DataBase();
        Base.levantarDataBase(DB);
        Queries query = new Queries();
        
        String gustos, recomendacion;
        
        Scanner teclado = new Scanner(System.in); //Variable para leer los datos ingresados por el usuario
        int option = 0;
        
        System.out.println("BIENVENIDO A LA PRUEBA DEL PROGRAMA\n");
        System.out.println("Por favor, elija uno de los usuarios que se le presentan a continuación\n");
        System.out.println("***********************************************************************************************************\n");
                
        while (option != 5) {
            //Se muestra en pantalla el menu
            System.out.println("------------------------- \n"+ 
                    "| 1. Andrés Girón       |\n" +
                    "| 2. Paulina Cano       |\n" +
                    "| 3. Brandon Hernandez  |\n" +
                    "| 4. Marlon Hernandez   |\n" +
                    "| 5. Salir              |\n" +
                    "-------------------------");

            //Se lee la opcion del usuario
            option = (int)teclado.nextDouble();

            //Codigo para la primera opcion
            if (option == 1) {
                System.out.println("A Andres");
                gustos = query.toString(query.gustos(DB, "Andres"));
                recomendacion = query.toString(query.recomendacion(DB, "Andres"));
                
                System.out.println("Le gustan: \n" + "     "+gustos);
                System.out.println("Le recomendamos: \n" + "     "+recomendacion + "\n");
            }else if(option == 2){
                System.out.println("A Paulina");
                gustos = query.toString(query.gustos(DB, "Paulina"));
                recomendacion = query.toString(query.recomendacion(DB, "Paulna"));
                
                System.out.println("Le gustan: \n" + "     "+gustos);
                System.out.println("Le recomendamos: \n" + "     "+recomendacion + "\n");
            }else if(option == 3){
                System.out.println("A Brandon");
                gustos = query.toString(query.gustos(DB, "Brandon"));
                recomendacion = query.toString(query.recomendacion(DB, "Brandon"));
                
                System.out.println("Le gustan: \n" + "     "+gustos);
                System.out.println("Le recomendamos: \n" + "     "+recomendacion + "\n");
            }else if(option == 4){
                System.out.println("A Marlon");
                gustos = query.toString(query.gustos(DB, "Marlon"));
                recomendacion = query.toString(query.recomendacion(DB, "Marlon"));
                
                System.out.println("Le gustan: \n" + "     "+gustos);
                System.out.println("Le recomendamos: \n" + "     "+recomendacion + "\n");
            }else if(option == 5){
                System.out.println("GRACIAS POR UTILIZAR NUESTRO SERVICIO");
            }
        }
        
    }
    
}
