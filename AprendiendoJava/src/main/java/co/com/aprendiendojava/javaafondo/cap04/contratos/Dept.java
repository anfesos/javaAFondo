package co.com.aprendiendojava.javaafondo.cap04.contratos;

import co.com.aprendiendojava.javaafondo.cap04.dto.DeptDTO;

import java.util.Collection;

public interface Dept {

    public Collection<DeptDTO> buscarTodos();
}
