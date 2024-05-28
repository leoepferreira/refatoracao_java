package br.com.alura;

import br.com.alura.client.ClientHttpConfig;
import br.com.alura.service.PetService;

import java.io.IOException;

public class ImportarPetsAbrigoCommand implements Command{

    @Override
    public void execute() {
        try {
            ClientHttpConfig clientHttpConfig = new ClientHttpConfig();
            PetService petService = new PetService(clientHttpConfig);
            petService.importarPetsAbrigo();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
