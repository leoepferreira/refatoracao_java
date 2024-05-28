package br.com.alura;

import br.com.alura.client.ClientHttpConfig;
import br.com.alura.service.AbrigoService;
import br.com.alura.service.PetService;

import java.io.IOException;

public class ListarPetsAbrigoCommand implements Command{

    @Override
    public void execute() {
        try {
            ClientHttpConfig clientHttpConfig = new ClientHttpConfig();
            PetService petService = new PetService(clientHttpConfig);
            petService.listarPetsAbrigo();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
