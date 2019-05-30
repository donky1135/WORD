import java.util.*;
class Scratch {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Put in a word, any word");
        StringBuilder sb = new StringBuilder(k.nextLine());
        for(int i = 0; i < sb.length(); i++){
            sb.setCharAt(i, '_');
            System.out.println(sb);
        }
    }
}