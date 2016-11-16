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
 * Labels.java
    Esta clase se encarga de la creación y manejo de las etiquetas (como se relacionan)
 */

import org.neo4j.graphdb.RelationshipType;

public enum Labels implements RelationshipType{
        Like, esActor;
    }
