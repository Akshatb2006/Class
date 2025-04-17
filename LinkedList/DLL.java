class Dll {
    int data;
    Dll prev;
    Dll next;

    Dll(int data) {
        this.data = data;
    }

    public static void main(String[] args) {
        Dll A = new Dll(50); 
        Dll B = new Dll(30);
        Dll C = new Dll(10);

        A.next = B;
        B.prev = A;
        B.next = C;
        C.prev = B;

        Dll temp = A.next; 
        C.next = B.next;
        B.next = temp;
        
        
}
}

