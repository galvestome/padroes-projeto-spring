package one.digitalinnovation.labpadroesprojetospring.service.implement;

import one.digitalinnovation.labpadroesprojetospring.model.Cliente;
import one.digitalinnovation.labpadroesprojetospring.service.ClienteService;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImplement implements ClienteService {

    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }
}
