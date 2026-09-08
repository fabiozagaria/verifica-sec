# Verifica Sec — istruzioni per assistenti AI

## Scopo
Questo repository è un mini-progetto di verifica autonoma su Spring Security, JWT e JPA/Spring Data JPA.
Lo scopo non è completare un CRUD, ma verificare la capacità di trasformare la teoria in decisioni tecniche autonome.

## Metodo di lavoro
- L'utente decide struttura, ordine dei passi e componenti da implementare.
- Non fornire implementazioni complete o percorsi riga-per-riga salvo richiesta esplicita.
- Prima di suggerire una modifica, leggere il codice esistente interessato.
- Preferire code review, spiegazione di errori, debugging e indizi minimi.
- La consultazione di documentazione, reference, motori di ricerca e AI per API o sintassi è compatibile con il lavoro autonomo; distingue invece quando una soluzione esterna sostituisce il ragionamento.
- Valutare come evidenza solo ciò che è realmente presente nel repository o spiegato e verificato dall'utente.

## Scope
- Focus corrente: Spring Security/JWT e JPA/Spring Data JPA.
- Mantenere il dominio minimo.
- GET, eventuale GET by id e POST sono sufficienti se servono al focus.
- Evitare PUT, PATCH, DELETE, exception handling completo e funzionalità laterali se non necessarie alla competenza verificata.
- Usare Postman o client equivalente per verificare i flussi HTTP.

## Fonti di verità
- Il codice GitHub è la fonte di verità sullo stato tecnico del progetto.
- Notion resta la fonte ufficiale per stato didattico, sessioni, valutazioni, punti deboli, ripassi e prossime azioni.
- Leggere `docs/CONTEXT.md` per lo stato tecnico sintetico prima di una revisione ampia.

## Sicurezza
Non inserire in questo repository password, token reali, JWT secret, credenziali database o dati personali.