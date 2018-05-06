package util;

public interface IList{
    public boolean isEmpty();

    public int size();

    public void addStart(Object o);

    public void addLast(Object o);

    public boolean remove(Object data);

    public Object get(int index);

    public Iterator iterator();
	
}
