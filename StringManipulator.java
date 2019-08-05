public class StringManipulator {
public String trimAndConcat(String first, String second) {
        return first.trim() + second.trim();
}
public Integer getIndexOrNull(String source, char itemToFind) {
        return (source.indexOf(itemToFind) == -1 ? null : source.indexOf(itemToFind));
}
public Integer getIndexOrNull(String source, String itemToFind) {
        return (source.indexOf(itemToFind) == -1 ? null : source.indexOf(itemToFind));
}
public String concatSubstring(String firstWord, int startingIndex, int endingIndex, String secondWord) {
        return firstWord.substring(startingIndex, endingIndex) + secondWord;
}
}
