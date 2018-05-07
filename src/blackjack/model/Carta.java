package model;

public class Carta {

    
    private int numero;
    private int naipe;
    

    public Carta(int numero, int naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNaipe() {
        return naipe;
    }

    public void setNaipe(int naipe) {
        this.naipe = naipe;
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
        if (this.numero != other.numero) {
            return false;
        }
        if (this.naipe != other.naipe) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {

        String naipes, numeros;
        switch (this.naipe) {
            case 0:
                naipes = "♣";
                break;
            case 13:
                naipes = "♦";
                break;
            case 26:
                naipes = "♥";
                break;
            case 39:
                naipes = "♠";
                break;
            default:
                naipes = "";
        }
        switch (this.numero) {
            case 1:
                numeros = "A";
                break;
            case 11:
                numeros = "J";
                break;
            case 12:
                numeros = "Q";
                break;
            case 13:
                numeros = "K";
                break;
            default:
                numeros = Integer.toString(this.numero);
        }
        return numeros+naipes;
    }
}

