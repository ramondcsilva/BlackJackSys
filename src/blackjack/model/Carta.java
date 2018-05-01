package blackjack.model;

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
        String naipe, numero;
        switch (this.naipe) {
            case 0:
                naipe = "♣";
                break;
            case 13:
                naipe = "♦";
                break;
            case 26:
                naipe = "♥";
                break;
            case 39:
                naipe = "♠";
                break;
            default:
                naipe = "";
        }
        switch (this.numero) {
            case 1:
                numero = "A";
                break;
            case 11:
                numero = "J";
                break;
            case 12:
                numero = "Q";
                break;
            case 13:
                numero = "K";
                break;
            default:
                numero = Integer.toString(this.numero);
        }
        return numero+naipe;
    }
}
