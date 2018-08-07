public class Stack {
    private int maxSize=3;
    private int[] Storage = new int[maxSize];
    static int  index = -1;

    public void push(int pushedElement) {
        if(index<maxSize) {
            Storage[++index] = pushedElement;
        }
    }
    public long pop() {
        int temp = Storage[index];
        Storage[index] = 0;
        index--;
        return temp;
    }

    public void display(){
        for(int i = 0;i <Storage.length;i++){
            System.out.println(Storage[i]);
        }
    }

}