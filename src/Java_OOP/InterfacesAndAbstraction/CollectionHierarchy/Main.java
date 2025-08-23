package Java_OOP.InterfacesAndAbstraction.CollectionHierarchy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] items=scanner.nextLine().split("\\s+");

        StringBuilder addCollectionAddResult=new StringBuilder();
        StringBuilder addRemoveCollectionAddResult=new StringBuilder();
        StringBuilder myListAddResult=new StringBuilder();
        StringBuilder addRemoveCollectionRemoveResult=new StringBuilder();
        StringBuilder myListRemoveResult=new StringBuilder();

        Addable addCollection =new AddCollection();
        AddRemovable addRemovableCollection=new AddRemoveCollection();
        MyList myList=new MyListImpl();

        for (String item:items) {
            //dobavqme elementi kum razlichnite instancii
            addCollectionAddResult.append(addCollection.add(item)).append(" ");
            addRemoveCollectionAddResult.append(addRemovableCollection.add(item)).append(" ");
            myListAddResult.append(myList.add(item)).append(" ");

        }

        int removeCount=Integer.parseInt(scanner.nextLine());
        for (int i=1;i<=removeCount;i++) {
            addRemoveCollectionRemoveResult.append(addRemovableCollection.remove()).append(" ");
            myListRemoveResult.append(myList.remove()).append(" ");
        }

        System.out.println(addCollectionAddResult);
        System.out.println(addRemoveCollectionAddResult);
        System.out.println(myListAddResult);
        System.out.println(addRemoveCollectionRemoveResult);
        System.out.println(myListRemoveResult);
    }
}
