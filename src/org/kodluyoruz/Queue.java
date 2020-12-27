package org.kodluyoruz;

public class Queue<T>
{
    Node currentNode;

    public void add(T t)
    {
        this.currentNode.back.t = t;
    }

    public void peak(T t)
    {
        while(currentNode.back != null)
        {
            if(currentNode.back.equals(t))
            {
                System.out.println(currentNode);
            }
            else
            {
                System.out.println("Bu nesne yok.");
            }
        }
    }

    public void pull(T t)
    {
        while(currentNode.back != null)
        {
            if(currentNode.back.equals(t))
            {
                System.out.println(currentNode);
                currentNode.front.t = currentNode.back.t;
            }
            else
            {
                System.out.println("Bu nesne yok.");
            }
        }
    }
}
