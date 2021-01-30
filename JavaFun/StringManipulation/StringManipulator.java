
public class StringManipulator {

    public String trimAndConcat(String str1, String str2) {
        return str1.trim().concat(str2.trim());
    }

    public Integer getIndexOrNull(String str1, char letter) {
        int index = str1.indexOf(letter);
        if (index < 0) {
            return null;
        } else {
            return index;
        }
    }

    public Integer getIndexOrNull(String str, String subString) {
        int index = str.indexOf(subString);
        if (index < 0) {
            return null;
        } else {
            return index;
        }
    }

    public String concatSubstring(String str, int A, int B , String str2){
        return str.substring(A ,B).concat(str2);
    }
}
