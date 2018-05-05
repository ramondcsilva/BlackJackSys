package blackjack.model;

import java.util.Objects;

public class Carta{
    private String naipe;
    private String numero;
    private int id;

    public Carta(String naipe, String numero) {
        this.naipe = naipe;
        this.numero = numero;
        id = 0;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.naipe, other.naipe)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return naipe+numero;
    }
}