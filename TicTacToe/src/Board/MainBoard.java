package Board;

public interface MainBoard {
    SignEnum executeRules();
    void markPosition(SignEnum sign, int x, int y);

}
