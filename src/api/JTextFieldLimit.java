package api;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * Class which makes sure that the JText  only has 500 characters
 */
public class JTextFieldLimit extends PlainDocument {
    private int limit;

    /**
     *
     * @param limit sets the limit
     */
    public JTextFieldLimit(int limit) {
        super();
        this.limit = limit;
    }

    /**
     *
     * @param offset the starting offset &gt;= 0
     * @param str the string to insert; does nothing with null/empty strings
     * @param attr the attributes for the inserted content
     * @throws BadLocationException
     */
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null)
            return;
        if ((getLength() + str.length()) <= limit) {
            super.insertString(offset, str, attr);
        }
    }
}