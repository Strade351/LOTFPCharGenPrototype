public class Attribute {
    String name;
    int count;
    int modifier;

    Attribute() {

    }

    void createModifiers() {
        if (count == 3)
            modifier = -3;
        if (count > 3 && count < 6)
            modifier = -2;
        if (count > 5 && count < 9)
            modifier = -1;
        if (count > 8 && count < 13)
            modifier = 0;
        if (count > 12 && count < 16)
            modifier = 1;
        if (count > 15 && count < 18)
            modifier = 2;

        if (count == 18)
            modifier = 3;

    }
}
