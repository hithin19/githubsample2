public class ter {


    static int ternary(int arr[], int x, int l, int r) {
        while (r >= l) {
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;
    
            if (arr[mid1] == x) {
                return mid1;
            }
            if (arr[mid2] == x) {
                return mid2;
            }
    
            if (x < arr[mid1]) {
                r = mid1 - 1;  // Search in the left third
            } else if (x > arr[mid2]) {
                l = mid2 + 1;  // Search in the right third
            } else {
                l = mid1 + 1;
                r = mid2 - 1;  // Search in the middle third
            }
        }
        return -1;  // Element not found
    }
    static int ternarySearch(int l, int r, int key, int ar[])

    {
        while (r >= l) {

            // Find the mid1  mid2
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;

            // Check if key is present at any mid
            if (ar[mid1] == key) {
                return mid1;
            }
            if (ar[mid2] == key) {
                return mid2;
            }

            // Since key is not present at mid,
            // check in which region it is present
            // then repeat the Search operation
            // in that region

            if (key < ar[mid1]) {

                // The key lies in between l and mid1
                r = mid1 - 1;
            }
            else if (key > ar[mid2]) {

                // The key lies in between mid2 and r
                l = mid2 + 1;
            }
            else {

                // The key lies in between mid1 and mid2
                l = mid1 + 1;
                r = mid2 - 1;
            }
        }

        // Key not found
        return -1;
    }
    public static void main(String args[]) {
        int l, r, p, key;
    
        // Get the array
        int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    
        // Starting index
        l = 0;
    
        // end element index
        r = ar.length - 1;
    
        // Checking for 5
        key = 5;
        p = ternarySearch(l, r, key, ar);
        System.out.println("Index of " + key + " is " + p);
    
        // Checking for 50
        key = 50;
        p = ternary(ar, key, l, r);
        System.out.println("Index of " + key + " is " + p);
    }
}
