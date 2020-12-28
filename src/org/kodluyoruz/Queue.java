package org.kodluyoruz;

public class Queue<T>
{
    Node<T> head;
    Node<T> tail;

    public void add(T t)
    {
        Node<T> newNode = new Node<>();
        newNode.value = t;
        if(head == null)
        {
            this.head = newNode;
            this.tail = newNode;
        }
        else
            {
                this.tail.back = newNode;
               this.tail = this.tail.back;
            }

    }

    public Node<T> peak()
    {
        if(head != null)
        {
            return this.head;
        }
        return null;
    }

    public Node<T> poll()
    {
        Node<T> nodeToPrint;
        if(head != null)
        {
            nodeToPrint = head;
            head = head.back;
            return nodeToPrint;
        }
        return null;
    }
}
