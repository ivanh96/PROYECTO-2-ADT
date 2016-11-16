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
 * DataBase.java
    Esta clase se encarga de levantar la base de datos y su manejo
 */

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.Transaction;

public class DataBase {
    
    public DataBase(){ }
    
    //Aquí se cargan todos los valores de la base de datos, donde se aloja todo lo que ya está contenido en ella
    public void levantarDataBase(GraphDatabaseService DB){
               
        //Se intenta realizar una transacción u operación en Neo4j
        try (Transaction tx = DB.beginTx()){
            
            //CREACIÓN DE NODOS
            
            // -> CREACION DE USUARIOS (ya predefinidos) *********************************************************************     
            Node user1 = DB.createNode(Nodes.Usuario);
            user1.setProperty("Id",1);
            user1.setProperty("Nombre", "Andres");
            
            Node user2 = DB.createNode(Nodes.Usuario);
            user2.setProperty("Id",2);
            user2.setProperty("Nombre", "Paulina");
            
            Node user3 = DB.createNode(Nodes.Usuario);
            user3.setProperty("Id",3);
            user3.setProperty("Nombre", "Brandon");
            
            Node user4 = DB.createNode(Nodes.Usuario);
            user4.setProperty("Id",4);
            user4.setProperty("Nombre", "Marlon");
            
            // --> CREACIÓN DE LAS PELÍCULAS ******************************************************************************
            Node movie1 = DB.createNode(Nodes.Pelicula);
            movie1.setProperty("Id",1);
            movie1.setProperty("Nombre", "La Propuesta");
            movie1.setProperty("Año", 2009);
            movie1.setProperty("Género", "Comedia");
            
            Node movie2 = DB.createNode(Nodes.Pelicula);
            movie2.setProperty("Id",2);
            movie2.setProperty("Nombre", "Empezar Otra Vez");
            movie2.setProperty("Año", 2014);
            movie2.setProperty("Género", "Drama");
            
            Node movie3 = DB.createNode(Nodes.Pelicula);
            movie3.setProperty("Id",3);
            movie3.setProperty("Nombre", "La Noche de expiación");
            movie3.setProperty("Año", 2013);
            movie3.setProperty("Género", "Suspenso");
            
            Node movie4 = DB.createNode(Nodes.Pelicula);
            movie4.setProperty("Id",4);
            movie4.setProperty("Nombre", "Harry Potter y la piedra filosofal");
            movie4.setProperty("Año", 2001);
            movie4.setProperty("Género", "Drama");
            
            Node movie5 = DB.createNode(Nodes.Pelicula);
            movie5.setProperty("Id",5);
            movie5.setProperty("Nombre", "Música, amigos y fiesta");
            movie5.setProperty("Año", 2015);
            movie5.setProperty("Género", "Comedia");
            
            Node movie6 = DB.createNode(Nodes.Pelicula);
            movie6.setProperty("Id",6);
            movie6.setProperty("Nombre", "La gran estafa");
            movie6.setProperty("Año", 2001);
            movie6.setProperty("Género", "Drama");
            
            Node movie7 = DB.createNode(Nodes.Pelicula);
            movie7.setProperty("Id",7);
            movie7.setProperty("Nombre", "Iron Man");
            movie7.setProperty("Año", 2013);
            movie7.setProperty("Género", "Accion");
            
            Node movie8 = DB.createNode(Nodes.Pelicula);
            movie8.setProperty("Id",8);
            movie8.setProperty("Nombre", "Guerra Mundial Z");
            movie8.setProperty("Año", 2013);
            movie8.setProperty("Género", "Accion");
            
            Node movie9 = DB.createNode(Nodes.Pelicula);
            movie9.setProperty("Id",9);
            movie9.setProperty("Nombre", "Marley y Yo");
            movie9.setProperty("Año", 2008);
            movie9.setProperty("Género", "Drama");
            
            Node movie10 = DB.createNode(Nodes.Pelicula);
            movie10.setProperty("Id",10);
            movie10.setProperty("Nombre", "Zapatero a tus zapatos");
            movie10.setProperty("Año", 2014);
            movie10.setProperty("Género", "Comedia");
            
            Node movie11 = DB.createNode(Nodes.Pelicula);
            movie11.setProperty("Id",11);
            movie11.setProperty("Nombre", "Antes de partir");
            movie11.setProperty("Año", 2007);
            movie11.setProperty("Género", "Suspenso");
            
            Node movie12 = DB.createNode(Nodes.Pelicula);
            movie12.setProperty("Id",12);
            movie12.setProperty("Nombre", "El niño");
            movie12.setProperty("Año", 2016);
            movie12.setProperty("Género", "Suspenso");
            
            Node movie13 = DB.createNode(Nodes.Pelicula);
            movie13.setProperty("Id",13);
            movie13.setProperty("Nombre", "El gran pequeño");
            movie13.setProperty("Año", 2015);
            movie13.setProperty("Género", "Drama");
            
            Node movie14 = DB.createNode(Nodes.Pelicula);
            movie14.setProperty("Id",14);
            movie14.setProperty("Nombre", "Lo Imposible");
            movie14.setProperty("Año", 2012);
            movie14.setProperty("Género", "Drama");
            
            Node movie15 = DB.createNode(Nodes.Pelicula);
            movie15.setProperty("Id",15);
            movie15.setProperty("Nombre", "Forrest Gump");
            movie15.setProperty("Año", 1994);
            movie15.setProperty("Género", "Drama");
            
            // --> CREACIÓN DE ACTORES ************************************************************************************+*
            Node actor1 = DB.createNode(Nodes.Protagonista);
            actor1.setProperty("Id",1);
            actor1.setProperty("Nombre", "Sandra Bullock");
            
            Node actor2 = DB.createNode(Nodes.Protagonista);
            actor2.setProperty("Id",2);
            actor2.setProperty("Nombre", "Ryan Reynolds");
            
            Node actor3 = DB.createNode(Nodes.Protagonista);
            actor3.setProperty("Id",3);
            actor3.setProperty("Nombre", "Keira Knightley");
            
            Node actor4 = DB.createNode(Nodes.Protagonista);
            actor4.setProperty("Id",4);
            actor4.setProperty("Nombre", "Mark Buffalo");
            
            Node actor5 = DB.createNode(Nodes.Protagonista);
            actor5.setProperty("Id",5);
            actor5.setProperty("Nombre", "Adam Levine");
            
            Node actor6 = DB.createNode(Nodes.Protagonista);
            actor6.setProperty("Id",6);
            actor6.setProperty("Nombre", "Ethan Hawke");
            
            Node actor7 = DB.createNode(Nodes.Protagonista);
            actor7.setProperty("Id",7);
            actor7.setProperty("Nombre", "Lena Headey");
            
            Node actor8 = DB.createNode(Nodes.Protagonista);
            actor8.setProperty("Id",8);
            actor8.setProperty("Nombre", "Daniel Radcliffe");
            
            Node actor9 = DB.createNode(Nodes.Protagonista);
            actor9.setProperty("Id",9);
            actor9.setProperty("Nombre", "Emma Watson");
            
            Node actor10 = DB.createNode(Nodes.Protagonista);
            actor10.setProperty("Id",10);
            actor10.setProperty("Nombre", "Rupert Grint");
            
            Node actor11 = DB.createNode(Nodes.Protagonista);
            actor11.setProperty("Id",11);
            actor11.setProperty("Nombre", "Zac Efron");
            
            Node actor12 = DB.createNode(Nodes.Protagonista);
            actor12.setProperty("Id",12);
            actor12.setProperty("Nombre", "George Clooney");
            
            Node actor13 = DB.createNode(Nodes.Protagonista);
            actor13.setProperty("Id",13);
            actor13.setProperty("Nombre", "Matt Damon");
            
            Node actor14 = DB.createNode(Nodes.Protagonista);
            actor14.setProperty("Id",14);
            actor14.setProperty("Nombre", "Andy García");
            
            Node actor15 = DB.createNode(Nodes.Protagonista);
            actor15.setProperty("Id",15);
            actor15.setProperty("Nombre", "Robert Downey Jr");
            
            Node actor16 = DB.createNode(Nodes.Protagonista);
            actor16.setProperty("Id",16);
            actor16.setProperty("Nombre", "Brad Pitt");
            
            Node actor17 = DB.createNode(Nodes.Protagonista);
            actor17.setProperty("Id",17);
            actor17.setProperty("Nombre", "Jennifer Aniston");
            
            Node actor18 = DB.createNode(Nodes.Protagonista);
            actor18.setProperty("Id",18);
            actor18.setProperty("Nombre", "Owen Wilson");
            
            Node actor19 = DB.createNode(Nodes.Protagonista);
            actor19.setProperty("Id",19);
            actor19.setProperty("Nombre", "Adam Sandler");
            
            Node actor20 = DB.createNode(Nodes.Protagonista);
            actor20.setProperty("Id",20);
            actor20.setProperty("Nombre", "Jack Nicholson");
            
            Node actor21 = DB.createNode(Nodes.Protagonista);
            actor21.setProperty("Id",21);
            actor21.setProperty("Nombre", "Morgan Freeman");
            
            Node actor22 = DB.createNode(Nodes.Protagonista);
            actor22.setProperty("Id",22);
            actor22.setProperty("Nombre", "Lauren Cohan");
            
            Node actor23 = DB.createNode(Nodes.Protagonista);
            actor23.setProperty("Id",23);
            actor23.setProperty("Nombre", "Jakob Salvati");
            
            Node actor24 = DB.createNode(Nodes.Protagonista);
            actor24.setProperty("Id",24);
            actor24.setProperty("Nombre", "Emly Watson");
            
            Node actor25 = DB.createNode(Nodes.Protagonista);
            actor25.setProperty("Id",25);
            actor25.setProperty("Nombre", "Cary Tagawa");
            
            Node actor26 = DB.createNode(Nodes.Protagonista);
            actor26.setProperty("Id",26);
            actor26.setProperty("Nombre", "Naomi Watts");
            
            Node actor27 = DB.createNode(Nodes.Protagonista);
            actor27.setProperty("Id",27);
            actor27.setProperty("Nombre", "Ewan McGregor");
            
            Node actor28 = DB.createNode(Nodes.Protagonista);
            actor28.setProperty("Id",28);
            actor28.setProperty("Nombre", "Tom Hanks");
            
            Node actor29 = DB.createNode(Nodes.Protagonista);
            actor29.setProperty("Id",29);
            actor29.setProperty("Nombre", "Robin Wright");
            
            //CREACIÓN DE RELACIONES
            
            // --> CREACION DE RELACION SI ES ACTOR
            
            //La Propuesta
            Relationship rel1 = movie1.createRelationshipTo(actor1,Labels.esActor);
            Relationship rel2 = movie1.createRelationshipTo(actor2,Labels.esActor);
            //Empezar Otra vez
            Relationship rel3 = movie2.createRelationshipTo(actor3,Labels.esActor);
            Relationship rel4 = movie2.createRelationshipTo(actor4,Labels.esActor);
            Relationship rel5 = movie2.createRelationshipTo(actor5,Labels.esActor);
            //La Noche de expiacion
            Relationship rel6 = movie1.createRelationshipTo(actor6,Labels.esActor);
            Relationship rel7 = movie1.createRelationshipTo(actor7,Labels.esActor);
            //Harry Potter
            Relationship rel8 = movie1.createRelationshipTo(actor8,Labels.esActor);
            Relationship rel9 = movie1.createRelationshipTo(actor9,Labels.esActor);
            Relationship rel10 = movie1.createRelationshipTo(actor10,Labels.esActor);
            //Musica, amigos y fiesta
            Relationship rel11 = movie1.createRelationshipTo(actor11,Labels.esActor);
            //La gran estafa
            Relationship rel12 = movie1.createRelationshipTo(actor12,Labels.esActor);
            Relationship rel13 = movie1.createRelationshipTo(actor13,Labels.esActor);
            Relationship rel14 = movie1.createRelationshipTo(actor14,Labels.esActor);
            //Iron Man
            Relationship rel15 = movie1.createRelationshipTo(actor15,Labels.esActor);
            //Guerra Mundial z
            Relationship rel16 = movie1.createRelationshipTo(actor16,Labels.esActor);
            //Marley y yo
            Relationship rel17 = movie1.createRelationshipTo(actor17,Labels.esActor);
            Relationship rel18 = movie1.createRelationshipTo(actor18,Labels.esActor);
            //zapatero a tus zapatos
            Relationship rel19 = movie1.createRelationshipTo(actor19,Labels.esActor);
            //antes de partir
            Relationship rel20 = movie1.createRelationshipTo(actor20,Labels.esActor);
            Relationship rel21 = movie1.createRelationshipTo(actor21,Labels.esActor);
            //el niño
            Relationship rel22 = movie1.createRelationshipTo(actor22,Labels.esActor);
            //el gran pequeño
            Relationship rel23 = movie1.createRelationshipTo(actor23,Labels.esActor);
            Relationship rel24 = movie1.createRelationshipTo(actor24,Labels.esActor);
            Relationship rel25 = movie1.createRelationshipTo(actor25,Labels.esActor);
            //lo imposible
            Relationship rel26 = movie1.createRelationshipTo(actor26,Labels.esActor);
            Relationship rel27 = movie1.createRelationshipTo(actor27,Labels.esActor);
            //forrest gump
            Relationship rel28 = movie1.createRelationshipTo(actor28,Labels.esActor);
            Relationship rel29 = movie1.createRelationshipTo(actor29,Labels.esActor);
            
            // --> RELACIONES SI LE GUSTA AL USUARIO
            
            //Andres
            Relationship rel30 = user1.createRelationshipTo(movie2,Labels.Like);
            Relationship rel31 = user1.createRelationshipTo(movie3,Labels.Like);
            Relationship rel32 = user1.createRelationshipTo(movie6,Labels.Like);
            Relationship rel33 = user1.createRelationshipTo(movie8,Labels.Like);
            Relationship rel34 = user1.createRelationshipTo(movie10,Labels.Like);
            Relationship rel35 = user1.createRelationshipTo(movie12,Labels.Like);
            Relationship rel36 = user1.createRelationshipTo(movie15,Labels.Like);
            
            //Paulina
            Relationship rel37 = user2.createRelationshipTo(movie1,Labels.Like);
            Relationship rel38 = user2.createRelationshipTo(movie2,Labels.Like);
            Relationship rel39 = user2.createRelationshipTo(movie4,Labels.Like);
            Relationship rel40 = user2.createRelationshipTo(movie9,Labels.Like);
            Relationship rel41 = user2.createRelationshipTo(movie10,Labels.Like);
            Relationship rel42 = user2.createRelationshipTo(movie11,Labels.Like);
            Relationship rel43 = user2.createRelationshipTo(movie13,Labels.Like);
            
            //Brandon
            Relationship rel44 = user3.createRelationshipTo(movie3,Labels.Like);
            Relationship rel45 = user3.createRelationshipTo(movie5,Labels.Like);
            Relationship rel46 = user3.createRelationshipTo(movie8,Labels.Like);
            Relationship rel47 = user3.createRelationshipTo(movie9,Labels.Like);
            Relationship rel48 = user3.createRelationshipTo(movie12,Labels.Like);
            Relationship rel49 = user3.createRelationshipTo(movie14,Labels.Like);
            
            //Marlon
            Relationship rel50 = user4.createRelationshipTo(movie3,Labels.Like);
            Relationship rel51 = user4.createRelationshipTo(movie6,Labels.Like);
            Relationship rel52 = user4.createRelationshipTo(movie6,Labels.Like);
            Relationship rel53 = user4.createRelationshipTo(movie10,Labels.Like);
            Relationship rel54 = user4.createRelationshipTo(movie13,Labels.Like);
            
            tx.success();
        }
    }
        
}
