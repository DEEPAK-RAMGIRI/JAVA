public class SortingAlgorithms {
    public static void BubbleSorting(int a[]) {
        // BubbleSorting
        // Time Complexcity O(n^2)
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {// -1 bcoz index are starting from 0 :)
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorting By Bubble sorting: ");
        for (int i = 0; i <= a.length - 1; i++)
            System.out.print(a[i] + " ");
    }

    public static void SelectionSorting(int a[]) {
        // SelectionSorting
        // Time Complexcity O(n^2)
        for (int i = 0; i < a.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < a.length - 1; j++) {// -1 bcoz index are starting from 0 :)
                if (a[smallest] > a[j])
                    smallest = j;
            }
            int temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;
        }
        System.out.print("Sorting By Selection sorting: ");
        for (int i = 0; i <= a.length - 1; i++)
            System.out.print(a[i] + " ");
    }

    public static void InsertionSorting(int a[]) {
        // Insertionsorting
        // Time Complexcity O(n^2)
        for (int i = 1; i < a.length; i++) {
            int current = a[i];
            int j = i - 1;
            while (j >= 0 && current < a[j]) {
                a[j - 1] = a[j];
                j--;
            }
            a[j + 1] = current;
        }
        System.out.print("Sorting By Insertion sorting: ");
        for (int i = 0; i <= a.length - 1; i++)
            System.out.print(a[i] + " ");
    }

    // merge sorting
    public static void conquer(int a[], int si, int ei, int mid) { // si: startingindex, ei:endingindex
        // Mergesorting
        // Time Complexcity O(nlogn)
        int merged[] = new int[ei - si + 1]; // midvalue for competitive exams to avoid time complexicity.
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (a[idx1] <= a[idx2])
                merged[x++] = a[idx1++];
            else
                merged[x++] = a[idx2++];
        }
        while (idx1 <= mid)
            merged[x++] = a[idx1++];
        while (idx2 <= ei)
            merged[x++] = a[idx2++];
        for (int i = 0, j = si; i < merged.length; i++, j++)
            a[j] = merged[i];
    }

    public static void divide(int a[], int si, int ei) {
        if (si >= ei)
            return;
        int mid = si + (ei - si) / 2;
        divide(a, si, mid);
        divide(a, mid + 1, ei);
        conquer(a, si, ei, mid);
    }

    public static int parition(int a[], int low, int high) {
        int pivot = a[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        i++;
        int temp = a[i];
        a[i] = pivot;
        a[high] = temp;
        return i;
    }

    public static void QuickSorting(int a[], int low, int high) {
        if (low < high) {
            int pidx = parition(a, low, high);// pidx : pivot index
            QuickSorting(a, low, pidx - 1);
            QuickSorting(a, pidx + 1, high);
        }

    }

    public static void main(String[] args) {
        int a[] = { 7, 8, 3, 1, 2 };
        int b[] = { 17, 28, 33, 41, 52 };
        BubbleSorting(a);
        System.out.println();
        SelectionSorting(a);
        System.out.println();
        InsertionSorting(a);
        System.out.println();
        divide(b, 0, 4);
        System.out.print("Sorting By Merge sorting: ");
        for (int i = 0; i <= b.length - 1; i++)
            System.out.print(b[i] + " ");
        System.out.println();
        int c[] = { 7, 8, 3, 1, 2 };
        QuickSorting(c, 0, 4);
        System.out.print("Sorting By Quick sorting: ");
        for (int i = 0; i <= c.length - 1; i++)
            System.out.print(c[i] + " ");
    }

}
