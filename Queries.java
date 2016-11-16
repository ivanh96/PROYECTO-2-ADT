/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * PROYECTO 2 - YouSearch
 * Descripción:
    Sistema de recomendación de películas
 * Integrantes:
    Paulina Cano - 15053
    Marlon Hernández - 15144
    Andrés Girón - 15174
    Brandon Hernández - 15326
 * Queries.java
    Esta clase se encarga de realizar las busquedas especificas
 */

import java.util.Iterator;
import java.util.LinkedList;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;

public class Queries {
    
    static Result resultado, resultado1, resultado2, resultado3,resultado4;
    
    public Node findUser(GraphDatabaseService DB, String nombre){
        
        return DB.findNode(Nodes.Usuario, "Nombre", nombre);
        
    }
    
    //Query para determinar que peliculas le gustan a un usuario en específico
    public LinkedList<String> gustos(GraphDatabaseService DB, String nombre){
                       
        try (Transaction tx = DB.beginTx()){
            resultado = DB.execute("MATCH (P1:Usuario)-[C:Like]->(P2:Pelicula) RETURN P1.Nombre");
            resultado1 = DB.execute("MATCH (P1:Usuario)-[C:Like]->(P2:Pelicula) RETURN P2.Nombre");
            Iterator<String>r1=resultado.columnAs("P1.Nombre");
            Iterator<String>r2=resultado1.columnAs("P2.Nombre");
            //Se crearon listas para insertar los datos del iterador
            LinkedList<String> res1 = new LinkedList();            
            //Se agregan los datos a la lista
            while (r1.hasNext()){
                if(r1.next().equals(nombre)){
                    res1.add(r2.next());
                }else{
                    r2.next();
                }
            }
            tx.success();
            return res1;
        }       
    }
    
    public LinkedList<String> recomendacion(GraphDatabaseService DB, String nombre){
        
        try (Transaction tx = DB.beginTx()){
            resultado2 = DB.execute("MATCH (P1:Usuario)-[C:Like]->(P2:Pelicula) RETURN P1.Nombre");
            resultado3 = DB.execute("MATCH (P1:Usuario)-[C:Like]->(P2:Pelicula) RETURN P2.Nombre");
            Iterator<String>r1=resultado2.columnAs("P1.Nombre");
            Iterator<String>r2=resultado3.columnAs("P2.Nombre");
            //Se crearon listas para insertar los datos del iterador
            LinkedList<String> res1 = new LinkedList();            
            //Se agregan los datos a la lista
            while (r1.hasNext()){
                if(r1.next().equals(nombre)){
                    r2.next();
                }else{
                    res1.add(r2.next());
                }
            }
            tx.success();
            return res1;
        }     
    }
    
    public LinkedList<String> pelis(GraphDatabaseService DB){
        
        try (Transaction tx = DB.beginTx()){
            resultado2 = DB.execute("MATCH (P1:Pelicula) RETURN P1.Nombre");
            Iterator<String>r1=resultado2.columnAs("P1.Nombre");
            //Se crearon listas para insertar los datos del iterador
            LinkedList<String> res1 = new LinkedList();            
            //Se agregan los datos a la lista
            while (r1.hasNext()){
                res1.add("-"+ r1.next()+"\n");
            }
            tx.success();
            return res1;
        }     
    }
    
    
    public String toString(LinkedList<String> lista){
        String converted = "";
        for(int i=0;i<lista.size()-1;i++){
            converted = converted + lista.get(i) + ", ";
        }
        return converted;
    }
}
