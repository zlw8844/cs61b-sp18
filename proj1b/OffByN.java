public class OffByN implements CharacterComparator{
    private int N;
    public OffByN(int x) {
        N = x;
    }
    @Override
    public boolean equalChars(char x, char y) {
        int diff = (int) x - (int) y;
        return (diff == N || diff == -N);
    }
}
