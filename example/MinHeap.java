public class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;
    public MinHeap(int capacity){
        this.capacity=capacity;
        this.size=0;
        heap=new int[capacity];
    }
    public void insert(int value){
        if(size==capacity){
            System.out.println("Heap is full!!!");
            return;
        }
        size++;
        heap[size]=value;
        heapifyUp(size);

    }
    private void heapifyUp(int index){
        while(index>1 && heap[index]<heap[parent(index)]){
            swap(index,parent(index));
            index=parent(index);
        }
    }
    public int extractMin(){
        if(isEmpty()){
            System.out.println("heap is empty");
            return -1;
        }
        int min=heap[1];
        heap[1]=heap[size];
        size--;
        heapifyDown(1);
        return min;
    }
    private void heapifyDown(int index){
        int smallest=index;
        int left=leftChild(index);
        int right=rightChild(index);
        if(left<=size && heap[left]<heap[smallest]){
            smallest=left;
        }
        if(right<=size && heap[right]<heap[smallest]){
            smallest=right;
        }
        if(smallest!=index){
            swap(index,smallest);
            heapifyDown(smallest);
        }
    }
    public boolean isEmpty(){
        return size==0;
    }
    private int parent(int index){
        return index/2;
    }
    private int rightChild(int index){
        return 2*index+1;
    }
    private int leftChild(int index){
        return 2*index;
    }
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    public class Main {
        public void main(String[] args) {
            
            MinHeap minHeap = new MinHeap(10);
            
            
            minHeap.insert(10);
            minHeap.insert(20);
            minHeap.insert(15);
            minHeap.insert(30);
            minHeap.insert(25);
            System.out.println("Min element extracted: " + minHeap.extractMin());
            System.out.println("Min element extracted: " + minHeap.extractMin());
        }
    }
    
    
}
