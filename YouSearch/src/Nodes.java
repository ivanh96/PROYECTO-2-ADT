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
 * Nodes.java
    Esta clase se encarga de la creación y manejo de los nodos
 */

import org.neo4j.graphdb.Label;

public enum Nodes implements Label{
    Pelicula, Protagonista, Usuario;
}
    

