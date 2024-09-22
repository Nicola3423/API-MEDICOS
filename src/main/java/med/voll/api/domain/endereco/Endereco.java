package med.voll.api.domain.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.uf = dados.uf();
        this.cidade = dados.cidade();
        this.numero = dados.numero();
        this.complemento = dados.complemento();

    }

    public void atualizarInformacoes(DadosEndereco endereco) {
        if (this.logradouro != null) {
            this.logradouro = endereco.logradouro();
        }
        if (this.bairro != null) {
            this.bairro = endereco.bairro();
        }
        if (this.cep != null) {
            this.cep = endereco.cep();
        }
        if (this.numero != null) {
            this.numero = endereco.numero();
        }
        if (this.complemento != null) {
            this.complemento = endereco.complemento();
        }
        if (this.cidade != null) {
            this.cidade = endereco.cidade();
        }
        if (this.uf != null) {
            this.uf = endereco.uf();
        }
    }
}
