package form.template.method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArticleTest {
    public static final String TITLE = "Launch new Galaxy";
    public static final String INTRO = "Innovative user experience";
    public static final String BODY = "Samsung launched new Galaxy!";
    public static final String AUTHOR = "Johnny Walker";
    public static final String DATE = "3 Mar 2020";
    Article article;

    @BeforeEach
    public void setUp() {
        article = new Article();
        article.title = TITLE;
        article.intro = INTRO;
        article.body = BODY;
        article.author = AUTHOR;
        article.date = DATE;
    }

    @Test
    public void testMarkDownView() {
        assertEquals(expectedMarkDownView(), article.markdownView());
    }

    private String expectedMarkDownView() {
        return "# " + TITLE + "\n\n" + "> " + INTRO + "\n\n"
                + BODY + "\n\n" + "_Written by " + AUTHOR + " on " + DATE + "_";
    }

    @Test
    public void testHtmlView() {
        assertEquals(expectedHtmlView(), article.htmlView());
    }

    private String expectedHtmlView() {
        return "<h2>" + TITLE + "</h2>\n" + "<blockquote>" + INTRO + "</blockquote>\n"
                + "<p>" + BODY + "</p>\n" + "<em>Written by " + AUTHOR + " on " + DATE + "</em>";
    }
}