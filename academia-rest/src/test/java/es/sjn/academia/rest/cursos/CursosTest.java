package es.sjn.academia.rest.cursos;

import org.junit.Test;

import static org.junit.Assert.*;

public class CursosTest {

    @Test
    public void debeInstanciarCursos(){
        final Cursos cursos = new Cursos();
        assertNotNull(cursos);
    }
}