package org.kodluyoruz;

public class Queue<T>
{
    Node currentNode;

    public void add(T t)
    {
        Node newNode = new Node();
        newNode.t = t;
        if(currentNode == null)
        {
            this.currentNode = newNode;
        }
        else
            {
               this.currentNode.back = currentNode;
            }

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
                break;
            }
        }
    }

    public void pull(T t)
    {
        while(currentNode.back != null)
        {
            if(currentNode.equals(t))
            {
                System.out.println(currentNode);
                currentNode.front.t = currentNode.back.t;
            }
            else
            {
                System.out.println("I cant pull.");
                break;
            }
        }
    }
}
