package org.kodluyoruz;

public class Queue<T>
{
    Node currentNode;
    Node first;
    Node last;

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
        Node nodeToCheck = new Node();

        if(currentNode != null)
        {
            nodeToCheck = currentNode;
            while(!nodeToCheck.equals(t))
            {
                nodeToCheck = nodeToCheck.back;
            }
            System.out.println(nodeToCheck);
            nodeToCheck.front.t = nodeToCheck.back.t;
        }
    }
}
