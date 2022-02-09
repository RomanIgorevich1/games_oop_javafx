package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BishopBlackTest {

    @Test
    public void whenFigureStandStill() {
        BishopBlack figure = new BishopBlack(Cell.C1);
        assertThat(figure.position(), is(Cell.C1));
    }

    @Test
    public void whenEndPoint() {
        BishopBlack figure = new BishopBlack(Cell.C1);
        Cell dest = Cell.G5;
        assertThat(figure.copy(dest).position(), is(dest));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenWayOfMoving() {
        BishopBlack figure = new BishopBlack(Cell.C1);
        Cell[] rsl = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(figure.way(Cell.G5), is(rsl));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenNoDiagonal() {
        BishopBlack figure = new BishopBlack(Cell.C1);
        figure.way(Cell.C8);
    }
}