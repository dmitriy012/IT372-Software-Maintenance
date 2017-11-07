import junit.framework.TestCase;
import org.junit.Before;

public class GameMasterTest extends TestCase
{
    GameMaster master;

    @Before
    public void setUp()
    {
        master = GameMaster.instance();
        master.setGameBoard(new SimpleGameBoard());
    }

    //This method tests if we can make a singleton instance and make sure they are not null
    public void testSingleton()
    {
        GameMaster instance1 = GameMaster.instance();
        assertNotNull(instance1);
        GameMaster instance2 = GameMaster.instance();
        assertNotNull(instance2);
        assertSame(instance1, instance2);
    }

    //This test shows that the players can enter the number of players at the beginning of the game
    //and that they all start at the Go cell
    public void testPlayerInit()
    {
        master.setNumberOfPlayers(6);
        assertEquals(6,master.getNumberOfPlayers());
        Cell go = master.getGameBoard().getCell(0);
        for(int i = 0; i < 6; i++)
        {
            Player player = master.getPlayer(i);
            assertSame(go,player.getPosition());
        }
    }

    //In this test we get the index of the player and their dice roll and then we move them.
    // We first move the player 2 steps forward, and check if it lands on Blue 2,
    // and then we move him three steps further, and check if it lands on Green 2.
    public void testMovePlayerSimple()
    {
        master.setNumberOfPlayers(1);
        Player player = master.getPlayer(0);
        master.movePlayer(0,2);
        assertEquals("Blue 2", player.getPosition().getName());
        master.movePlayer(0,3);
        assertEquals("Blue 2", player.getPosition().getName());
    }

    //This method tests if a player reaches the end of the game board, they shall cycle around.
    //We move the player 2 steps then five steps. The player should reach the end of the game board,
    //and then start again from the Go cell, and finally land on Blue 1.
    public void testMovePlayerCycle()
    {
        master.setNumberOfPlayers(1);
        Player player = master.getPlayer(0);
        master.movePlayer(0,2);
        master.movePlayer(0,5);
        assertEquals("Blue 1", player.getPosition().getName());
    }

}
