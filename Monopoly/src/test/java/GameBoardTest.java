import junit.framework.TestCase;

public class GameBoardTest extends TestCase
{
    public GameBoardTest(String name)
    {
        super(name);
    }

    //This test shows that when we initialize the game board there should be no cells.
    //Then when we add a cell to the game board there should be one cell
    public void testAddCell()
    {
        GameBoard gameBoard = new GameBoard();
        assertEquals(1,gameBoard.getCellNumber());
        Cell cell = new Cell();
        gameBoard.addCell(cell);
        assertEquals(2,gameBoard.getCellNumber());
    }

    //This method tests to see if the first cell is the Go cell
    public void testFirstCell()
    {
        GameBoard gameBoard = new GameBoard();
        Cell firstCell = gameBoard.getCell(0);
        assertSame(GoCell.class, firstCell.getClass());
    }

    //This test shows that if the cell is found, the index is returned.
    //However, if the cell is not found the method returns -1.
    public void testGetCellIndex()
    {
        GameBoard gameBoard = new SimpleGameBoard();
        Cell blue2 = gameBoard.getCell(2);
        int index = gameBoard.getCellIndex(blue2);
        assertEquals(2, index);
        Cell notExist = new Cell();
        index = gameBoard.getCellIndex(notExist);
        assertEquals(-1, index);

    }
}
