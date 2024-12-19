package br.com.linkwhatsapp.service;

import br.com.linkwhatsapp.model.ContactModel;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    public String create(ContactModel contactModel) {

        String requestNumber = contactModel.getNumber();
        String codigoDoPais = requestNumber.substring(0, 2);
        String requestDdd = requestNumber.substring(2, 4);
        int dddConvertido = Integer.parseInt(requestDdd);

        if(requestNumber.length() != 13) {
            throw new IllegalArgumentException("Número inválido");
        }
        else if(!(codigoDoPais.startsWith("55"))) {
            throw new IllegalArgumentException("Por favor use o DDI do Brasil: 55");
        } else if (dddConvertido < 11 || dddConvertido > 99) {
            throw new IllegalArgumentException("Por favor use o DDD de algum Estado do Brasil: entre 11 - 99");
        } else{
            String api = "https://wa.me/";
            String number = contactModel.getNumber();
            String apiText = "?text=";
            String requestText = contactModel.getText().replace(" ", "+");
            return api + number + apiText + requestText;
        }

    }
}