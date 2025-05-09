import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  mik
 * @version 0.1
 */
public class SalesItemTest
{
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Test that a comment can be added, and that the comment count is correct afterwards.
     */
    @Test
    public void testAddComment()
    {
        SalesItem salesIte1 = new SalesItem("Brain surgery for Dummies", 21998);
        assertEquals(true, salesIte1.addComment("James Duckling", "This book is great. I perform brain surgery every week now.", 4));
        assertEquals(1, salesIte1.getNumberOfComments());
    }

    @Test
    public void testAddCommentSameAuthor()
    {
        SalesItem salesIte1 = new SalesItem("Brain surgery for Dummies", 21998);
        assertEquals(true, salesIte1.addComment("James Duckling", "This book is great. I perform brain surgery every week now.", 4));
        assertEquals(false, salesIte1.addComment("James Duckling", "My friend's family is now suing me for causing him permanent brain damage.", 2));
        assertEquals(1, salesIte1.getNumberOfComments());
    }
    
    /**
     * Test that a comment using an illegal rating value is rejected.
     */
    @Test
    public void testIllegalRating()
    {
        SalesItem salesIte1 = new SalesItem("Java For Complete Idiots, Vol 2", 19900);
        assertEquals(false, salesIte1.addComment("Joshua Black", "Not worth the money. The font is too small.", -5));
        assertEquals(false, salesIte1.addComment("Joshua Black", "Not worth the money. The font is too small.", 6));
        assertEquals(false, salesIte1.addComment("Joshua Black", "Not worth the money. The font is too small.", 0));    
    }

    /**
     * Test that a sales item is correctly initialised (name and price).
     */
    @Test
    public void testInit()
    {
        SalesItem salesIte1 = new SalesItem("test name", 1000);
        assertEquals("test name", salesIte1.getName());
        assertEquals(1000, salesIte1.getPrice());
    }

    @Test
    public void addComment()
    {
        SalesItem salesIte1 = new SalesItem("Brain Surgery for Dummies.", 9899);
        assertEquals(true, salesIte1.addComment("Fred", "Great - I perform brain surgery every week now!", 4));
    }

    @Test
    public void NumberTest()
    {
        SalesItem salesIte1 = new SalesItem("e", 1);
        salesIte1.showInfo();
    }
    
    @Test
    public void testGetAuthorAndRating()
    {
        Comment comment1 = new Comment("Author", "Comment", 2);
        assertEquals("Author", comment1.getAuthor());
        assertEquals(2, comment1.getRating());
    }
    
    @Test
    public void getUpvoteCount()
    {
        Comment comment1 = new Comment("Author", "Comment", 2);
        comment1.upvote();
        assertEquals(1, comment1.getVoteCount());
    }
}




