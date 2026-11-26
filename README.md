# Calcolatrice Java

Una semplice calcolatrice da console, scritta in Java, che esegue le operazioni di base: addizione, sottrazione, moltiplicazione e divisione.

## Requisiti

È necessario avere installato il **JDK (Java Development Kit)**.

## Avvio

Salva il codice in un file chiamato `Start.java`, poi compila ed esegui da terminale:

```bash
javac Start.java
java Start
```

## Operazioni disponibili

| Metodo | Operazione |
|---|---|
| `somma(a, b)` | Addizione |
| `sottrai(a, b)` | Sottrazione |
| `moltiplica(a, b)` | Moltiplicazione |
| `dividi(a, b)` | Divisione |

I metodi accettano numeri decimali (`double`) e restituiscono il risultato dell'operazione.

## Nota

La divisione per zero non è attualmente gestita; il controllo potrà essere aggiunto in seguito.
