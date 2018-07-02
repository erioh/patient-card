package ua.clinic.patient.card.utill;

public class StringDivider {
    public String[] divideBy(String source, char divider, int maxLengthOfLine, int linesCount) {
        int currentPosition = 0;
        int startPosition = 0;
        int maxIndex = linesCount - 1;
        String[] result = new String[linesCount];
        char[] chars = source.toCharArray();
        int currentLine = 0;
        while (currentLine < maxIndex) {
            currentPosition += maxLengthOfLine;
            if (currentPosition >= chars.length) {
                break;
            }
            while (chars[currentPosition] != divider) {
                currentPosition--;
            }
            result[currentLine] = source.substring(startPosition, currentPosition);
            startPosition = currentPosition;
            currentLine++;
        }
        result[currentLine] = source.substring(startPosition, source.length());
        return result;
    }
}
