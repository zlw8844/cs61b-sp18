public class OffByOne implements CharacterComparator{
    @Override
    public boolean equalChars(char x, char y) {
        int diff = (int) x - (int) y;
        return (diff == 1 || diff == -1);
    }
}
