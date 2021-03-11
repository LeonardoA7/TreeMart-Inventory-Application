import java.util.List;
import java.util.NoSuchElementException;
public interface BackendInterface {
  public boolean restock(int ID, int amount) throws NoSuchElementException, IllegalArgumentException; 
  public boolean destock(int ID, int amount) throws NoSuchElementException, IllegalArgumentException;
  public boolean addNewItem(String name, int ID) throws IllegalArgumentException;
  public ProductInterface getItem(int ID);
  public List<String> getAllStock();
  public List<ProductInterface> getRestockItems();

}

