package herarquia;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class ErpPessoaFornecedor   {
    private int id;
    private String cnpj;
    private String responsavel;
    private String contato;
    private String telefone;
    private String fantasia;
    private String razao_social;
    private boolean ativo;
    private LocalDateTime data_lancamento;

    public ErpPessoaFornecedor(int id, String cnoj, String responsavel, String contaro, String telefone, String fantasia, String razao_social, boolean ativo, LocalDateTime data_lancamento) {

        this.id = id;
        this.cnpj = cnpj;
        this.responsavel = responsavel;
        this.contato = contato;
        this.telefone = telefone;
        this.fantasia = fantasia;
        this.razao_social = razao_social;
        this.ativo = ativo;
        this.data_lancamento = data_lancamento;


    }

    public int getId() {
        return id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public String getContato() {
        return contato;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getFantasia() {
        return fantasia;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public LocalDateTime getData_lancamento() {
        return data_lancamento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setData_lancamento(LocalDateTime data_lancamento) {
        this.data_lancamento = data_lancamento;
    }
}
