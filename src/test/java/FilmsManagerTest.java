import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class FilmsManagerTest {

    @Test
    public void ShouldAddFilms() {
        FilmsManager manager = new FilmsManager(10);

        manager.add("film1");
        manager.add("film2");
        manager.add("film3");

        String[] actual = manager.findAll();
        String[] expected = {"film1", "film2", "film3"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldNotAddFilmsOverTheLimit() {
        FilmsManager manager = new FilmsManager(10);

        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");
        manager.add("film10");
        manager.add("film11");
        manager.add("film12");

        String[] actual = manager.findAll();
        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10", "film11"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldAddFilmsEqualTheLimit() {
        FilmsManager manager = new FilmsManager(10);

        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");
        manager.add("film10");

        String[] actual = manager.findAll();
        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastWhenEqualTheLimit() {
        FilmsManager manager = new FilmsManager(10);

        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");
        manager.add("film10");

        String[] actual = manager.findLast();
        String[] expected = {"film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastWhenUnderTheLimit() {
        FilmsManager manager = new FilmsManager(10);

        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");

        String[] actual = manager.findLast();
        String[] expected = {"film5", "film4", "film3", "film2", "film1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastWhenOverTheLimit() {
        FilmsManager manager = new FilmsManager(10);

        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");
        manager.add("film10");
        manager.add("film11");
        manager.add("film12");

        String[] actual = manager.findLast();
        String[] expected = {"film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};

        Assertions.assertArrayEquals(expected, actual);
    }
}
