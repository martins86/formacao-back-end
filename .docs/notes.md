## Clean Architecture

### (Enterprise Business Rules) - Camada central com as regras de negocio.

```sh
    - Entities
```
<br>

### (Application Business Rules) - Camada com as logicas que vai executar as regras de negocio.

```sh
    - Use Cases
```
<br>

### (Interface Adapters) - Camada com os adaptadores que conversão com a camada externa.

```sh
    - Controllers
    - Gateways
    - Presenters
```
<br>

### (Frameworks & Drivers) - Camada externa

```sh
    - DB
    - External Interfaces
    - Web
    - Devices
    - UI
```
<br>

### Criar Projeto Escola

```sh
    JAVA 11
    Maven 3

    br.com
    escola
```
<br>

### Entidade/Dominio Aluno

```sh
br.com.escola.domain.aluno

// Entidade: Classe com um identificador unico ex: aluno (cpf)

public class Aluno {
    private Cpf cpf;
    private String name;
    private Email email;

private List<Phone> phones = new ArrayList<>();

public void addPhone(String ddd, String numberPhone) {
this.phones.add(new Phone(ddd, numberPhone));
}
}
```
<br>

### Entidade/Dominio CPF

```sh

br.com.escola.domain.cpf

// VO - Value Object: Classe sem identificador unitáro ou id

public class Cpf {
    private String individualRegistration

    public Cpf(String individualRegistration) {
        if (individualRegistration == null ||
                !individualRegistration.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("CPF invalido!");

        }

        this.individualRegistration = individualRegistration
    }
}

```
<br>

### Entidade/Dominio Email

```sh

br.com.escola.domain.email

// VO - Value Object

public class Email {
    private String address

    public Email(String address) {
        if (address == null ||
                !address.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z{2,}$")) {
            throw new IllegalArgumentException("E-mail invalido!");

        }

        this.address = address
    }
}

```
<br>
