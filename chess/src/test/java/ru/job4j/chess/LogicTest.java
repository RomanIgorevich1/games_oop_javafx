package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test(expected = OccupiedCellException.class)
    public void whenOccupiedCellException() throws OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.G5));
        logic.move(Cell.C1, Cell.G5);
    }

    @Test(expected = FigureNotFoundException.class)
    public void whenFigureNotFoundException() throws OccupiedCellException,
            FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.G5));
        logic.move(Cell.C1, Cell.G5);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenImpossibleMoveException() throws OccupiedCellException,
            FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.C8);
    }
}
