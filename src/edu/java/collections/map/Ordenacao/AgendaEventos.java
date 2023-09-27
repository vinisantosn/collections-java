package edu.java.collections.map.Ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
    }

    public void obterProximoEvento() {
//        Set<LocalDate> dataSet = eventoMap.keySet();
//        Collection<Evento> values = eventoMap.values();

        LocalDate dataAtual = LocalDate.now();
        Evento proximoEvento = null;
        LocalDate proximaData = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()
        ) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
    }
}
