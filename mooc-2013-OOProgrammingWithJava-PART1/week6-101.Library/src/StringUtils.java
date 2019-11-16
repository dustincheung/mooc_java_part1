public class StringUtils {

    public static boolean included(String word, String searched){
        searched = searched.trim().toUpperCase();
        word = word.toUpperCase();

        return word.contains(searched);
    }
}
