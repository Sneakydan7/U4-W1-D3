package it.epicode.Esercizio3;

public class Article {

    private int articleCode;

    private String articleDescription;

    private int price;

    private int availableItems;


    public Article(int _articleCode, String _articleDesc, int _price, int _availableItems) {
        this.articleCode = _articleCode;
        this.articleDescription = _articleDesc;
        this.price = _price;
        this.availableItems = _availableItems;

    }

}
