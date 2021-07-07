package Sort;

public class HeapSort {
    public void maxHeapify(int[] arr, int i, int size){
        int left = 2 * i + 1;
        int right = 2 * (i + 1);
        int max = i;
        if(left < size && arr[left] > arr[max]){
            max = left;
        }
        if(right < size && arr[right] > arr[max]){
            max = right;
        }
        if(max != i){
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
    }

    public void buildHeap(int[] arr){
        int size = arr.length;
        for(int i = size / 2; i >= 0; i--){
            maxHeapify(arr, i, size);
        }
    }

    public void heapSort(int[] arr){
        buildHeap(arr);
        int temp, size = arr.length;
        for(int i = size - 1; i >= 1; i--){
            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            size--;
            maxHeapify(arr, 0, size);
        }
    }

    public static void main(String args[]){
        HeapSort heapSort = new HeapSort();
        int[] arr = {19, 3, 5, 8};
        heapSort.heapSort(arr);
        for(int a : arr){
            System.out.println(a);
        }
    }
}
