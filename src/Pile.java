import java.util.Arrays;

public class Pile {
    private int top;
    private int max;
    private Object[] elements;

    public Pile(int max) {
        this.max = max;
        elements = new Object[max];
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "Pile{" +
                "top=" + top +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }

    // Insert in pile
    public void add(Object element){
        if (top == elements.length){
            System.out.println("OVERFLOW");
        }else {
            top++;
            elements[top] = element;
        }
    }

    // Remove in pile
    public Object remove(){
        Object element = null;
        if (top == 0){
            System.out.println("UNDERFLOW");
        }else{
            element = elements[top];
            top--;
        }
        return  element;
    }

    //verificar se uma pilha está vazia
    public boolean isEmpty(){
        return top == 0;
    }

    //verificar se há espaço na pilha
    public boolean haveSpace(){
        return top < max;
    }

    // recuperar o número de elementos da pilha
    public int numberOfElements(){
        return top;
    }

    // verificar se um determinado elemento está na pilha
    public boolean checkElement(Object element){
        if (checkElement(element)){
            for (int i = 0; i < elements.length; i++){
                if (elements[i].equals(element)){
                    return true;
                }
            }
        }
        return false;
    }

    //verificar se uma posição qualquer é válida
    public boolean checkIfIsValid(int position){
        if (position > 0 && position <= top){
            return true;
        }
        return false;
    }

    //recuperar um elemento da pilha
    public Object recoverElement(int position){
        for (int i = 1; i <= elements.length; i++){
            if (position == i){
                return elements[i];
            }
        }
        return false;
    }

    //recuperar a posição de um elemento da pilha
    public int recoverPosition(Object element){
        for (int i = 1; i <= elements.length; i++){
            if (elements[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    // Recupera o topo da pilha
    public int recoverTop(){
        return top;
    }

    public void show(){
        for (int i = 0; i <= top; i++){
            if (elements[i] != null){
                System.out.println("Elemento N°["+ i + "] Elemento: " + elements[i]);
            }
        }
    }


    public static void main(String[] args) {
        // Cria uma pilha
        Pile p = new Pile(20);

        System.out.println("\n  **  PILHA  ** \n");

        // Verifica se uma pilha está vazia
        System.out.println("+ Verifica se uma pilha está vazia: " + p.isEmpty());
        // Adiciona um elemento para teste
        p.add(10);
        System.out.println("+ Verifica se uma pilha está vazia: " + p.isEmpty());
        System.out.println();

        // Verifica se uma pilha tem espaço
        System.out.println("+ Verifica se uma pilha tem espaço: " + p.haveSpace());
        System.out.println();

        // Recupera número de elementos na pilha
        // Adiciona elemento para teste
        p.add(2);
        System.out.println("+ Recupera número de elementos na pilha: " + p.numberOfElements());
        System.out.println();

        // verificar se um determinado elemento está na pilha
        //System.out.println("+ verificar se um determinado elemento está na pilha: " + p.checkElement(2));
        System.out.println("+ verificar se um determinado elemento está na pilha: " );
        System.out.println();

        //verificar se uma posição qualquer é válida
        System.out.println("+ verificar se uma posição qualquer é válida: " + p.checkIfIsValid(1));
        System.out.println("+ verificar se uma posição qualquer é válida: " + p.checkIfIsValid(55));
        System.out.println();

        // recuperar um elemento da pilha
        System.out.println("+ recuperar um elemento da pilha: " + p.recoverElement(1));
        System.out.println();

        // recuperar a posição de um elemento da pilha
        System.out.println("+ recuperar a posição de um elemento da pilha: " + p.recoverPosition(10));
        System.out.println();

        // recuperar o topo da pilha
        System.out.println("+ recuperar o topo da pilha: " + p.recoverTop());
        System.out.println();

        System.out.println("+ Mostrar pilha: ");
        p.show();
        System.out.println();

        System.out.println("+ Inserir: 100, 500, A, B, C \n");
        p.add(100);
        p.add(500);
        p.add("A");
        p.add("B");
        p.add("C");

        System.out.println("+ Mostrar pilha: ");
        p.show();
        System.out.println();

        System.out.println("+ Remover: X2 = B, C");
        p.remove();
        p.remove();
        System.out.println();

        System.out.println("+ Mostrar pilha: ");
        p.show();
        System.out.println();

        System.out.println("**********************************************************\n");

        //Pile x = new Pile(499);

        Pile[] pile = new Pile[50];

        pile[0] = new Pile(10);
        pile[0].add(10);
        pile[0].add(20);
        pile[0].add(30);
        pile[0].add(40);
        pile[0].add(50);
        pile[0].add(60);
        pile[0].add(70);
        pile[0].add(80);
        pile[0].add(90);


        pile[0].show();

        for (int j = 0; j <= 48; j++){
            pile[j] = new Pile(11);
        }

        for (int i = 0; i <= 499; i ++){
            if (i < 10){
                pile[0].add(i);
            }else{
                if (i < 20){
                    pile[1].add(i);
                }else{
                    if (i < 30){
                        pile[2].add(i);
                    }else{
                        if (i < 40){
                            pile[3].add(i);
                        }else{
                            if (i < 50){
                                if (pile[i] != null){
                                    pile[4].add(i);
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println();
        for (int i = 0; i < 5; i++){
            System.out.println(pile[i]);
        }

        //Elabore um programa que faça a leitura de um número indeterminado de elementos no intervalo [0
        //.. 499] e distribua os elementos lidos em cinqüenta pilhas (na primeira pilha serão dispostos os
        //elementos de 0 a 9, na segunda pilha, os elementos de 10 a 19, na terceira pilha, os elementos de 20
        //a 29, e assim sucessivamente). Após ter empilhado todos os elementos, mostrar os valores
        //representados em cada pilha.
    }
}
