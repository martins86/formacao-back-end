## Clean Architecture - Arquitetura Limpa

### (Enterprise Business Rules) - Camada central com as regras de negocio.

```sh
    - Entities
	- Domain
```

<br>

### (Application Business Rules) - Camada com as logicas que vai executar as regras de negocio.

```sh
    - Use Cases
	- Aplication
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

> O conceito de modelarmos a nossa aplicação pensando primeiramente no domínio é chamado de `Domain Driven Design`, ou `design orientado a domínio`. <br>

  <br>
  
 > O conceito de classes Services e mais especifico `Domain, Application e Infrastructure Services`. <br>
 > `Domain Services` são classes que representam uma ação entre mais de uma entidade. <br>
 > `Application Services` controlam o fluxo de alguma regra em nossa aplicação. <br>
 > `Infrastructure Services` são implementações de interfaces presentes nas camadas de domínio ou de aplicação. <br>
 
 
 
### Projeto Escola - Java + Maven

```sh
    JAVA 11
    Maven 3

    br.com
    escola

	Camadas:
		- Aplication (br.com.escola.aplication)
			- Recommendation
			- Student
				- Matriculate
					- Matriculate
					- MatriculateDto
		- Domain (br.com.escola.domain)
			- Student
				- Student
				- CPF
				- Email
				- FactoryStudent
				- RepositoryStudent
				- Phone
				- PasswordEncryptor
			- Recommendation
		- Infrastructure (br.com.escola.infrastructure)
			- Student
				- RepositoryStudentWithJDBC
				- RepositoryStudentInMemory
				- PasswordEncryptorWithMD5
			- Recommendation
				- SendMailRecommendedWithJavaMail
		- MatriculateNewStudentWithCommandLine


	br.com.escola.domain.student -> class student // Entidade: Classe com um identificador unico ex: aluno (cpf)
	br.com.escola.domain.student -> class cpf     // VO - Value Object: Classe sem identificador unitáro ou id
```

<br>
