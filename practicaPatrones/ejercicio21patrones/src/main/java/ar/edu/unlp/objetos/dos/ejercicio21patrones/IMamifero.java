package ar.edu.unlp.objetos.dos.ejercicio21patrones;

import java.time.LocalDate;
import java.util.Date;

public interface IMamifero {

    public String getIdentificador();
    public void setIdentificador(String id);

    public String getEspecie();
    public void setEspecie(String especie);

    public LocalDate getFechaNacimiento();
    public void setFechaNacimiento(LocalDate fecha);

    public IMamifero getPadre();
    public void setPadre(IMamifero padre);

    public IMamifero getMadre();
    public void setMadre(IMamifero madre);

    public IMamifero getAbueloMaterno();
    public IMamifero getAbuelaMaterna();

    public IMamifero getAbueloPaterno();
    public IMamifero getAbuelaPaterno();

    public boolean tieneComoAncestroA(IMamifero unMamifero);
}