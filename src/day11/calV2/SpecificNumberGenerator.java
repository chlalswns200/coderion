package day11.calV2;

public class SpecificNumberGenerator implements NumberGenerator{
    @Override
    public int generate(int number) {
        return 2000 * number;
    }
}
