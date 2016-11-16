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
 * Labels.java
    Esta clase se encarga de la creación y manejo de las etiquetas (como se relacionan)
 */

import org.neo4j.graphdb.RelationshipType;

public enum Labels implements RelationshipType{
        Like, esActor;
    }
