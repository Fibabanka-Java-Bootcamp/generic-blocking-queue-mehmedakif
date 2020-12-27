package org.kodluyoruz;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        Queue simitci = new Queue();

        String isim = new String("Akif");
        Integer yas = 11;

        simitci.add(yas);
        simitci.add(isim);

        simitci.pull(yas);
    }
}
