package edu.ifmt.cadastrovacinacovid.model;

//import java.math. BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.Objects; //para equals e hashcode

@Entity //Uma entidade JPA 
public class Titulo {

	@Id //identifica a Entidade
	@GeneratedValue(strategy = GenerationType.IDENTITY) //estratégia fica por conta do DB
	private Long id; //outros atributos a seguir
    private String cns;
    private String cpf;
    private String nomeCompleto;
    private String telefone;
    private String email;
    
    //@Temporal(TemporalType.DATE) //só data sem h e min 
    private String dataNascimento;
    
    private String sexo;
    private String mae;
    private String cep;
    private String bairro;
    private String endereco;
    private String numero;
    private String profissao;

    // Construtor vazio (obrigatório para uso do Hibernate)
    public Titulo() {
    }

    // Construtor com todos os atributos
    public Titulo(String cns, String cpf, String nomeCompleto, String telefone, String email, String dataNascimento, String sexo, String mae, String cep, String bairro, String endereco, String numero, String profissao) {
    	this.cns = cns;
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        setDataNascimento(dataNascimento);
        this.sexo = sexo;
        this.mae = mae;
        this.cep = cep;
        this.bairro = bairro;
        this.endereco = endereco;
        this.numero = numero;
        this.profissao = profissao;
    }

    // Getters e setters para os atributos

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCns() {
        return cns;
    }

    public void setCns(String cns) {
        this.cns = cns;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //hash code e equals a partir daqui
    @Override
    public int hashCode() {
        return Objects.hash(id, cns, cpf, nomeCompleto, telefone, email, dataNascimento, sexo, mae, cep, bairro, endereco, numero, profissao);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Titulo other = (Titulo) obj;
        return Objects.equals(id, other.id) &&
                Objects.equals(cns, other.cns) &&
                Objects.equals(cpf, other.cpf) &&
                Objects.equals(nomeCompleto, other.nomeCompleto) &&
                Objects.equals(telefone, other.telefone) &&
                Objects.equals(email, other.email) &&
                Objects.equals(dataNascimento, other.dataNascimento) &&
                Objects.equals(sexo, other.sexo) &&
                Objects.equals(mae, other.mae) &&
                Objects.equals(cep, other.cep) &&
                Objects.equals(bairro, other.bairro) &&
                Objects.equals(endereco, other.endereco) &&
                Objects.equals(numero, other.numero) &&
                Objects.equals(profissao, other.profissao);
    }

	public static void salvar(Titulo titulo) {
		// TODO Auto-generated method stub
		
	}

	public static void save(Titulo titulo) {
		// TODO Auto-generated method stub
		
	}
}