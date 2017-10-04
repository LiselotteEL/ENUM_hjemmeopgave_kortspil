public class Kortspil {
    public enum Rank {

        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, KNIGT, QUEEN, KING //definerer konstanter
    }

    public static void main(String[] args) {

        //1. + 2. Definerer variabler - highCard, faceCard, card1, card2 - samt tildeler dem værdi

        Rank highCard = Rank.ACE;
        Rank faceCard = Rank.KING;
        Rank card1 = Rank.FOUR;
        Rank card2 = Rank.EIGHT;

        //3. Udskriver en linje i consolen ved brug af highCard og faceCard
        System.out.println("A blackjack hand: " + highCard + " and " + faceCard);
        System.out.println(" ");

        //4. Deklarerer to int variabler card1Val og card2Val ud fra ordinal() metoden - dvs. ACE=0 , TWO=1, THREE=2 osv.
        //for at face værdien af kortet bliver korrekt må man derfor benytte ordinal()+1 - derved bliver ACE=1, TWO=2, THREE=3 osv.

        int card1Val; //definerer variabel
        int card2Val; //definnerer variabel

        card1Val = card1.ordinal()+1; //tildeler variablen cardVal2 værdien af card1, som i dette tilfælde er 3, og lægger 1 til (ved hjælp af ordinal() metoden)
        card2Val = card2.ordinal()+1; //tildeler variablen cardVal2 værdien af card1, som i dette tilfælde er 7, og lægger 1 til (ved hjælp af ordinal() metoden)

        System.out.println("A two card hand consisting of : " + card1 + " and " + card2);
        System.out.println("Hand value: " + (card1Val+card2Val));


        //System.out.println(card2.ordinal()+1);
        // ^ - her kalder man card2's værdi og lægger 1 til - men kan også blot kalde card2's værdi


    }
}