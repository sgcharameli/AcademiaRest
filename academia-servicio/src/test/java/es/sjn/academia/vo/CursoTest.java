package es.sjn.academia.vo;

import org.junit.Test;

import java.io.Serializable;

import static org.junit.Assert.*;

public class CursoTest {

    @Test
    public void debeTenerConstructorVacio(){
        final Curso curso = new Curso();
        assertNotNull(curso);
    }

    @Test
    public void debeImplementarSerializable(){
        final Curso curso = new Curso();
        assertTrue(curso instanceof Serializable);
    }

    @Test
    public void debeVerificarToString(){
        final String nombreCurso = "Java Básico";
        final String descripcion = "Introducción a Java";
        final Curso curso = new Curso(nombreCurso, descripcion);
        assertEquals("Curso[" +
                "nombre=" + nombreCurso + "," +
                "descripcion=" + descripcion +
            "]", curso.toString());
    }
}