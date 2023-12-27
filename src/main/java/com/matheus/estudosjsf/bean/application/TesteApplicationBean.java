package com.matheus.estudosjsf.bean.application;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

import static java.util.Arrays.asList;

@Named
@ApplicationScoped
public class TesteApplicationBean implements Serializable {
    private List<String> categoriaList;

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct do ApplicationScoped");
        categoriaList = asList("RPG", "SCI-FI", "Sandbox");
    }

    public void mudarList() {
        categoriaList = asList("RPG", "SCI-FI", "Sandbox", "Moba");
    }

    public List<String> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<String> categoriaList) {
        this.categoriaList = categoriaList;
    }
}
