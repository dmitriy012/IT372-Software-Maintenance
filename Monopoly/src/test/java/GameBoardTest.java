import junit.framework.TestCase;

public class GameBoardTest extends TestCase
{
    public GameBoardTest(String name)
    {
        super(name);
    }

    public void testAddCell()
    {
        GameBoard gameBoard = new GameBoard();
        assertEquals(1,gameBoard.getCellNumber());
        Cell cell = new Cell();
        gameBoard.addCell(cell);
        assertEquals(2,gameBoard.getCellNumber());
    }

    public void testFirstCell()
    {
        GameBoard gameBoard = new GameBoard();
        Cell firstCell = gameBoard.getCell(0);
        assertSame(GoCell.class, firstCell.getClass());
    }
}
