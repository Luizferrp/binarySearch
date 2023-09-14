public class mymain {
  public static int binarySearch(int arr[], int l, int r, int x){
    if (r >= l && l <= arr.length - 1) {
      int mid = l + (r - l) / 2;
        if (arr[mid] == x)
          return mid;
        if (arr[mid] > x)
          return binarySearch(arr, l, mid - 1, x);
        return binarySearch(arr, mid + 1, r, x);
        }
      return -1;
    }

  public static int interativeBinarySearch(int arr[], int size, int toFind) {
    int l = 0, r = size - 1; 
    while (l <= r) {
      int m = l + (r - l) / 2;
      if (arr[m] == toFind)
                return m;
       if (arr[m] < toFind)
         l = m + 1;
       else
         r = m - 1;
      }
        return -1;
    }
  

  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    int size = 20;
    int toFind = 7;
    System.out.print("busca binaria interativa: ");
    System.out.println(interativeBinarySearch(arr, size, toFind));
    System.out.print("busca binaria: ");
    System.out.println(binarySearch(arr, 0, size - 1, toFind));
    toFind = 1;
    System.out.print("busca binaria interativa: ");
    System.out.println(interativeBinarySearch(arr, size, toFind));
    System.out.print("busca binaria: ");
    System.out.println(binarySearch(arr, 0, size - 1, toFind));

  }
}
