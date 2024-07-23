package spring.app1.test.weather.services;

public class sqrtService {

    public int calcSqrt(int x) {
        for (int i = 1; i <= x; i++) {
            if (i * i >= x) {
                return i;
            }
        }

        return -1;
    }

}