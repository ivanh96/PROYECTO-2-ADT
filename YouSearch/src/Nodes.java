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
 * Nodes.java
    Esta clase se encarga de la creación y manejo de los nodos
 */

import org.neo4j.graphdb.Label;

public enum Nodes implements Label{
    Pelicula, Protagonista, Usuario;
}
    

