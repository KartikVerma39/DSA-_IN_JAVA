public class MinimumNumberOfNotes {
    public static void main(String[] args){
        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 1};
        int[] currency = new int[9];

        int totalmoney = 10800;

        for(int i = 0 ; i < 9 ; i++){
            if(totalmoney >= notes[i]){
                currency[i] = totalmoney/notes[i];
                totalmoney = totalmoney - (currency[i]*notes[i]);
            }
        }


        for(int i = 0 ; i < 9 ; i++){
            System.out.println("The number of " + notes[i] + " are " + currency[i]);
        }
    }
}
