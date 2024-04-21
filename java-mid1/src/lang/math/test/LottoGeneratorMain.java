package lang.math.test;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] lotto = lottoGenerator.generate();

        for (int i : lotto) {
            System.out.print(i + " ");
        }

    }
}
