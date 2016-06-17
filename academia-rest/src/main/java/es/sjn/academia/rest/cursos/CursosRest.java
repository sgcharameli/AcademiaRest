package es.sjn.academia.rest.cursos;

import es.sjn.academia.vo.Curso;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursosRest {

    private static final Logger LOG = LoggerFactory.getLogger(CursosRest.class);

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Curso>> obtenerTodosLosCursos() {
        LOG.info("Obteniendo todos los cursos");
        final List<Curso> cursos = new ArrayList();
        cursos.add(new Curso("nombre", "desc"));
        return new ResponseEntity<List<Curso>>(cursos, HttpStatus.OK);
    }
}
