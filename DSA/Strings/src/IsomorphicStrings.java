public class IsomorphicStrings {
    public static void main(String[] args){
        String a = "egg";
        String b = "add";

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for(int i = 0 ; i < a.length() ; i++){
            if(map1[a.charAt(i)] != map2[b.charAt(i)]){
                System.out.println("False");
                return;
            }

            map1[a.charAt(i)] = i + 1;
            map2[b.charAt(i)] = i + 1;
        }

        System.out.println("True");
    }
}
