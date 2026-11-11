package homework9.iterator;

public interface Iterator<ItemType> {
    public ItemType next();
    public boolean hasNext();
}