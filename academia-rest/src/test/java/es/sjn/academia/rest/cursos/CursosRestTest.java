package es.sjn.academia.rest.cursos;

import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CursosRestTest {

    @Test
    public void debeInstanciarCursos(){
        final CursosRest cursosRest = new CursosRest();
        assertNotNull(cursosRest);
    }

    @Test
    public void debeDevolverTodosLosCursos(){
        final CursosRest cursosRest = new CursosRest();
        final ResponseEntity responseEntity = cursosRest.obtenerTodosLosCursos();
        assertNotNull(responseEntity);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }
}