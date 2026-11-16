package homework10.abstractfactory;

public abstract class Factory {

    protected FactoryStore store;

    public Factory( String schoolName ) { 
        store = FactoryStore.makeFactoryStore(schoolName);
    }

    abstract Enchanted deliverItem();
}