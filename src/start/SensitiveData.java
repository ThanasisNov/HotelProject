package start;

/**
 * Προσωπικά δεδομένα χρηστών
 */
public class SensitiveData {
    String ονομα,επιθετο,τυπος;
    void setΟνομα(String ονομα)
    {
        this.ονομα=ονομα;
    }
    void setΕπιθετο(String επιθετο)
    {
        this.επιθετο=επιθετο;
    }
    void setΤυπος(String τυπος)
    {
        this.τυπος=τυπος;
    }
    String getΟνομα()
    {
        return ονομα;
    }
    String getΕπιθετο()
    {
        return επιθετο;
    }
    String getΤυπος()
    {
        return  τυπος;
    }
}
