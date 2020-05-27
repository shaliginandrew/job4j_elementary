import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;
import ru.job4j.condition.Triangle;

public class TriangleTest {

    @Test
    public void whenAreaHaveTest1() {
        Point a = new Point(8, 1);
        Point b = new Point(3, 2);
        Point c = new Point(5, 4);
        double expected = 6;
        Triangle result = new Triangle(a, b, c);
        double out = result.area();
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenAreaHaveTest2() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 5);
        Point c = new Point(5, 3);
        double expected = 7;
        Triangle result = new Triangle(a, b, c);
        double out = result.area();
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenAreaNotHaveTest1() {
        Point a = new Point(0, 1);
        Point b = new Point(0, 0);
        Point c = new Point(0, 3);
        double expected = -1;
        Triangle result = new Triangle(a, b, c);
        double out = result.area();
        Assert.assertEquals(expected, out, 0);
    }

    @Test
    public void whenAreaNotHaveTest2() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        Point c = new Point(3, 0);
        double expected = -1;
        Triangle result = new Triangle(a, b, c);
        double out = result.area();
        Assert.assertEquals(expected, out, 0);
    }
}



