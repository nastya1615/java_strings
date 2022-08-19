package practice.regex;

public class SplitText {

  public static void main(String[] args) {
    System.out.println(splitTextIntoWords("Ghbdtn!! ghsajdf 555"));

  }

  public static String splitTextIntoWords(String text) {
    StringBuilder splitText = new StringBuilder();
    String regex = "[^A-z ]";
    text = text.replaceAll(regex,"");
    String word[] = text.split("\\s+");

    for(int i = 0; i < word.length ;i++){
      if (i == word.length-1){
        splitText.append(word[i].replaceAll(regex,""));
      }
      else {
        splitText.append(word[i]).append(System.lineSeparator());
      }

    }
    return splitText.toString();
  }

}