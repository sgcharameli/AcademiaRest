package es.sjn.academia.rest.cursos;

import es.sjn.academia.vo.Curso;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("cursos")
public class CursosRest {


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Curso>> obtenerTodosLosCursos() {

        final List<Curso> cursos = new ArrayList();
        cursos.add(new Curso("nombre", "desc"));
        return new ResponseEntity<List<Curso>>(cursos, HttpStatus.OK);
    }
}
