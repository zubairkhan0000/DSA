public class maxHeap {
    private int[] heap;
    private int size;
    private int capacity;
    
    public maxHeap(int capacity){
        this.capacity = capacity;
        this.size = 0;
        heap = new int[capacity];
    }
    
    public void insert(int value){
        if(size == capacity){
            System.out.println("Heap is full!!!");
            return;
        }
        size++;
        heap[size] = value;
        heapifyUp(size);
    }
    
    private void heapifyUp(int index){
        while(index > 1 && heap[index] > heap[parent(index)]){
            swap(index, parent(index));
            index = parent(index);
        }
    }
    
    public int extractMax(){
        if(isEmpty()){
            System.out.println("Heap is empty");
            return -1;
        }
        int max = heap[1];
        heap[1] = heap[size];
        size--;
        heapifyDown(1);
        return max;
    }
    
    private void heapifyDown(int index){
        int largest = index;
        int left = leftChild(index);
        int right = rightChild(index);
        if(left <= size && heap[left] > heap[largest]){
            largest = left;
        }
        if(right <= size && heap[right] > heap[largest]){
            largest = right;
        }
        if(largest != index){
            swap(index, largest);
            heapifyDown(largest);
        }
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    private int parent(int index){
        return index / 2;
    }
    
    private int rightChild(int index){
        return 2 * index + 1;
    }
    
    private int leftChild(int index){
        return 2 * index;
    }
    
    private void swap(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    public class Main {
        public void main(String[] args) {
            
            maxHeap maxHeap = new maxHeap(10);
            maxHeap.insert(10);
            maxHeap.insert(20);
            maxHeap.insert(15);
            maxHeap.insert(30);
            maxHeap.insert(25);
            
            System.out.println("Max element extracted: " + maxHeap.extractMax());
            System.out.println("Max element extracted: " + maxHeap.extractMax());
        }
    }
    
}
