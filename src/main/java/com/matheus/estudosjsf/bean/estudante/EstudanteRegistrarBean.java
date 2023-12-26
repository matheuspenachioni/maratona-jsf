package com.matheus.estudosjsf.bean.estudante;

import com.matheus.estudosjsf.model.Estudante;

import javax.el.LambdaExpression;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

@Named
@ViewScoped
public class EstudanteRegistrarBean implements Serializable {
    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"DevDojo", "Alex JDev", "Gustavo Guanabara", "Lucas Montano", "Mano Deyvin"};
    private List<String> nomesList = asList("DevDojo", "Alex JDev", "Gustavo Guanabara", "Lucas Montano", "Mano Deyvin");
    private Set<String> nomesSet = new HashSet<>(asList("DevDojo", "Alex JDev", "Gustavo Guanabara", "Lucas Montano", "Mano Deyvin"));
    private Map<String, String> nomesMap = new HashMap<>();
    private boolean mostrarNotas;
    private boolean mostrarLink;

    {
        nomesMap.put("Java", "Spring Boot");
        nomesMap.put("PHP", "Laravel");
        nomesMap.put("Javascript", "React");
        nomesMap.put("Typescript", "Angular");
    }

    public void executar() {
        System.out.println("Executado com sucesso!");
    }

    public void executar(String params) {
        System.out.println("Executado com sucesso!");
        System.out.println("O parâmetro é: "+ params);
    }

    public String executarRetorno(String params) {
        System.out.println("Executado com sucesso!");
        return "O parâmetro é: "+ params;
    }

    public String irParaIndex2() {
        return "index2?faces-redirect=true";
    }

    public void exibirNotas() {
        this.mostrarNotas = true;
    }

    public void ocultarNotas() {
        this.mostrarNotas = false;
    }

    public void exibirLink() {
        this.mostrarLink = true;
    }

    public void ocultarLink() {
        this.mostrarLink = false;
    }

    public void calcularCubo(LambdaExpression le, long value) {
        long result = (long) le.invoke(FacesContext.getCurrentInstance().getELContext(), value);
        System.out.println("O resultado é: "+ result);
    }

    //Getters e Setters

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

    public boolean isMostrarNotas() {
        return mostrarNotas;
    }

    public void setMostrarNotas(boolean mostrarNotas) {
        this.mostrarNotas = mostrarNotas;
    }

    public boolean isMostrarLink() {
        return mostrarLink;
    }

    public void setMostrarLink(boolean mostrarLink) {
        this.mostrarLink = mostrarLink;
    }
}
