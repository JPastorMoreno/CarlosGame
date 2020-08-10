/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosgame;

import java.util.ArrayList;

/**
 *
 * @author JAWFTD
 */
public class CarlosGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Card> deck = new ArrayList();

        //Inicializacion de las distintas cartas ( por una de cada tipo junto con el verbo luego realizaremos las duplicaremos)
        //Cartas blue
        Card blue1 = new Card(1, "blue", "Ser / Estar");
        Card blue2 = new Card(2, "blue", "Tener");
        Card blue3 = new Card(3, "blue", "Comprar");
        Card blue4 = new Card(4, "blue", "Comer");
        Card blue5 = new Card(5, "blue", "Olvidar");
        Card blue6 = new Card(6, "blue", "Conocer");
        Card blue7 = new Card(7, "blue", "Romper");
        Card blue8 = new Card(8, "blue", "Hacer");
        Card blue9 = new Card(9, "blue", "Ver");
        
        //Cartas Red
        Card red1 = new Card(1, "red", "Be");
        Card red2 = new Card(2, "red", "Have");
        Card red3 = new Card(3, "red", "Buy");
        Card red4 = new Card(4, "red", "Eat");
        Card red5 = new Card(5, "red", "Forget");
        Card red6 = new Card(6, "red", "Know");
        Card red7 = new Card(7, "red", "Breack");
        Card red8 = new Card(8, "red", "Do");
        Card red9 = new Card(9, "red", "See");
        
          //Cartas Green
        Card green1 = new Card(1, "Green", "Was / Were");
        Card green2 = new Card(2, "Green", "Had");
        Card green3 = new Card(3, "Green", "Bought");
        Card green4 = new Card(4, "Green", "Ate");
        Card green5 = new Card(5, "Green", "Forgot");
        Card green6 = new Card(6, "Green", "Knew");
        Card green7 = new Card(7, "Green", "Broke");
        Card green8 = new Card(8, "Green", "Did");
        Card green9 = new Card(9, "Green", "Saw");
        
        //Cartas Yellow
        Card yellow1 = new Card(1, "yellow", "Been");
        Card yellow2 = new Card(2, "yellow", "Had");
        Card yellow3 = new Card(3, "yellow", "Bought");
        Card yellow4 = new Card(4, "yellow", "Eaten");
        Card yellow5 = new Card(5, "yellow", "Forgotten");
        Card yellow6 = new Card(6, "yellow", "Known");
        Card yellow7 = new Card(7, "yellow", "Broken");
        Card yellow8 = new Card(8, "yellow", "Done");
        Card yellow9 = new Card(9, "yellow", "Seen");
        
        Card blues[] = {blue1,blue2,blue3,blue4,blue5,blue6,blue7,blue8,blue9} ;
        Card reds[] = {red1,red2,red3,red4,red5,red6,red7,red8,red9};
        Card greens[] = {green1,green2,green3,green4,green5,green6,green7,green8,green9};
        Card yellows[] = {yellow1,yellow2,yellow3,yellow4,yellow5,yellow6,yellow7,yellow8,yellow9};
        
        inicializarDeck(blues,deck);inicializarDeck(reds,deck);inicializarDeck(greens,deck);inicializarDeck(yellows,deck);
        
       for(int i=0;i<deck.size();i++){
            System.out.print(deck.get(i).verb);
       }
        
        
        

    }
    
    public static void inicializarDeck(Card palo[],ArrayList<Card> deck){
        
        for(int i=0;i<palo.length;i++){
            for(int j=0;j<2;j++)
            {
                deck.add(palo[i]);
            }
        }
        
    }

}
