package linkedlist;

public class LinkedList {

    public static void main(String[] args) {

        Alumnito alumn1 = new Alumnito("Daniel", 25, "216578", 10.00);
        Alumnito alumn2 = new Alumnito("Mario", 25, "216677", 10.00);
        Alumnito alumn3 = new Alumnito("Jose", 50, "002121", 9.00);
        Alumnito alumn4 = new Alumnito("Carlos", 25, "235689", 10.00);
        Alumnito alumn5 = new Alumnito("Dante", 23, "262847", 10.00);

        ListaEnlazada<Alumnito> lista = new ListaEnlazada<>();
        
        System.out.println("=== PRUEBAS DE LA LISTA ENLAZADA ===\n");

        lista.append(alumn1);
        lista.append(alumn2);
        lista.append(alumn3);
        System.out.println("==========================================");
        System.out.println("1. Despues de append (alumn1, alumn2, alumn3):");
        System.out.println("   " + lista);
        System.out.println("   Tamano actual (size): " + lista.size() + "\n");

        lista.insert(alumn4, 1);
        System.out.println("==========================================");
        System.out.println("2. Despues de insert(alumn4, en indice 1):");
        System.out.println("   " + lista);
        System.out.println("   Tamano actual (size): " + lista.size() + "\n");

        Alumnito elementoObtenido = lista.get(2);
        System.out.println("==========================================");
        System.out.println("3. Elemento recuperado con get(2):");
        System.out.println("   " + elementoObtenido + "\n");

        Alumnito elementoEliminado = lista.remove(0);
        System.out.println("==========================================");
        System.out.println("4. Elemento removido con remove(0): " + elementoEliminado);
        System.out.println("   Lista resultante: " + lista);
        System.out.println("   Tamano actual (size): " + lista.size() + "\n");

        lista.invertir();
        System.out.println("==========================================");
        System.out.println("5. Despues de aplicar invertir():");
        System.out.println("   " + lista + "\n");

        ListaEnlazada<Alumnito> otraLista = new ListaEnlazada<>();
        otraLista.append(alumn5);
        
        System.out.println("==========================================");
        System.out.println("6. Segunda lista a concatenar: " + otraLista);
        
        lista.concatenar(otraLista);
        System.out.println("   Despues de concatenar(otraLista):");
        System.out.println("   " + lista);
        System.out.println("   Tamano final (size): " + lista.size() + "\n");

        lista.clear();
        System.out.println("==========================================");
        System.out.println("7. Despues de clear():");
        System.out.println("   Lista: " + lista);
        System.out.println("   Tamano (size): " + lista.size());
        System.out.println("   Esta vacia? (empty): " + lista.empty());
    }
}