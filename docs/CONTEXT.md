# Contesto tecnico — Verifica Sec

Aggiornato: 2026-09-08

## Obiettivo corrente
Verificare in autonomia Spring Security/JWT e JPA avanzato in un progetto volutamente piccolo.

## Stato osservato nel repository
- Struttura MVC minima presente: entity/model, repository, service, controller.
- `Task` è associata a `User` con `@ManyToOne(fetch = FetchType.LAZY)`.
- `TaskRepository` usa una derived query owner-aware: `findAllByOwnerName(...)`.
- `TaskController` ricava il principal da `Authentication` e delega al service.
- `SecurityFilterChain` configura OAuth2 Resource Server JWT, CSRF disabilitato, sessione `STATELESS` e richieste autenticate.
- `JwtService` è presente ma non ancora implementato.

## Problemi aperti rilevati il 2026-09-08
- `UserService` contiene una dipendenza verso `UserService` stesso: da correggere prima di considerare verificato l'avvio runtime.
- `User.taskList` combina `@Column` e `@OneToMany`: mapping JPA da correggere.
- Su `Task.name` è usato `@Max(50)` su una `String`: verificare il vincolo Bean Validation appropriato per la lunghezza.
- `application.properties` contiene soltanto il nome applicazione; configurazione datasource/JWT necessaria al runtime non è ancora visibile nel repository.
- Il flusso JWT completo non è ancora presente: decoder/encoder/emissione token, refresh, rotation/revoca/logout restano da costruire secondo lo scope scelto.

## Regola per la prossima sessione
Non trasformare questi punti in una checklist di codice pronta. Fabio deve riprendere il progetto, scegliere autonomamente cosa correggere e in quale ordine, consultando documentazione quando serve. L'AI revisiona il risultato e aiuta nel debugging solo su richiesta.