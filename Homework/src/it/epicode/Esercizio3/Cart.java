package it.epicode.Esercizio3;

public class Cart {

    private String associatedClient;

    private String[] articlesArray;

    public int totalCost;


    public Cart(String _assClient, String[] _articleArr, int _totalCost) {
        this.associatedClient = _assClient;
        this.articlesArray = _articleArr;
        this.totalCost = _totalCost;

    }

}
