# Verifica Sec — esercizio minimo JPA/JWT

Mini-progetto per ricostruire autonomamente il flusso principal → service → repository e una relazione Task–User.

## Stato

**Bozza incompleta; avvio funzionante non verificato.** Non è un'API pronta né un flusso di login completo. Rimane un esercizio mirato, da riprendere solo quando utile a una verifica specifica.

## Parti presenti

- Entity `Task` e `User` con `ManyToOne` lazy e lato inverso `OneToMany(mappedBy = "owner")`.
- Derived query `findAllByOwnerName(...)`.
- `GET /api/tasks`: il controller ricava il nome da `Authentication` e delega al service.
- Configurazione Resource Server JWT, policy `STATELESS`, CSRF disabilitato e richieste autenticate.
- Java 21, Spring Boot 4.1.1, JPA/MySQL, Security, Validation e Lombok dichiarati nel `pom.xml`.

## Limiti osservati nel codice

- `JwtService` è vuoto: non è implementata l'emissione dei token.
- Mancano configurazione datasource e configurazione del decoder JWT; `application.properties` contiene solo il nome dell'applicazione.
- `UserService` presenta un import incompleto/errato del repository; la compilazione deve essere verificata prima dell'avvio.
- `Task.name` usa `@Max` su una stringa: il vincolo di lunghezza è da correggere.
- Non sono presenti registrazione, login, refresh, rotazione, revoca o logout completi.
- Il test del contesto non equivale a una verifica del comportamento di sicurezza.

Il codice corrente prevale sulle note storiche in `docs/CONTEXT.md`, che possono descrivere problemi già cambiati.

## Verifica locale

Richiede JDK 21 e Maven Wrapper. Il comando seguente è un controllo, non una garanzia di successo dello stato attuale:

```bash
./mvnw test
```

Il runtime richiede prima correzione dei blocchi e configurazione esplicita di database e validazione JWT. Non usare segreti o dati reali nel repository.

## Confine dell'esercizio

GET e una relazione minima sono sufficienti per la prova. Non espandere automaticamente il CRUD: scegliere un meccanismo, fare il primo tentativo e verificare ragionamento e risultato. Per un'applicazione completa consultare [Expense Tracker](https://github.com/fabiozagaria/expense-tracker-api).
