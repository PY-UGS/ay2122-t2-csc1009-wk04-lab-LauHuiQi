
public class Main {

    public static void main(String arg[]) {
        int sizeOfList = 10;
        StackOfInegers stack = new StackOfInegers(sizeOfList);

        for (int i = 0; i < sizeOfList; i++) {
            stack.push(i);
        }

        System.out.println();
        while (!stack.empty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }

    }
}
