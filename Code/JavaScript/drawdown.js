const drawdown = (arr) => {

}
const checkPeak = (arr, index) => {
    if(index > 0 && index < arr.length - 1){
        if(arr[index] > arr[index-1] && arr[index] > arr[index+1]) return true;
        else return false;
    }
    if(index == 0){
        if(arr[0] > arr[1]) return true;
        else return false;
    }
    if(index == arr.length - 1){
        if(arr[index] > arr[index - 2]) return true;
        else return false;
    }
}