public class Matrix {
    public static void main(String[] args) {
        int[][] A = {{0, 1, 1}, {1, 0, 1}, {1, 1, 0}};
        int[][] B = {{2, 1, 5}, {1, 3, 5}, {2, 3, 5}};

        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        
        // 1. หาผลรวมของอาร์เรย์ A และ B
        int[][] sumArray = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                sumArray[i][j] = A[i][j] + B[i][j];
            }
        }

        // 2. หาผลต่างของอาร์เรย์ B กับ A
        int[][] diffArray = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                diffArray[i][j] = B[i][j] - A[i][j];
            }
        }



        if (A.length != B[0].length || A[0].length != B.length) {
            System.out.println("ไม่สามารถคูณ A และ B ได้ เนื่องจากขนาดไม่ตรงกัน");
            return;
        }

        // หาผลคูณของ A และ B
        int[][] productArray = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    productArray[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        // แสดงผลลัพธ์
        System.out.println("ผลรวมของ A และ B:");
        printArray(sumArray);
        
        System.out.println("ผลต่างของ B และ A:");
        printArray(diffArray);
        
        System.out.println("ผลคูณของ A และ B:");
        printArray(productArray);
    }

    // เมธอดสำหรับแสดงอาร์เรย์
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
            // 3. หาผลคูณของอาร์เรย์ A และ B
        // int[][] productArray = new int[A.length][A[0].length];
        // for (int i = 0; i < A.length; i++) {
        //     for (int j = 0; j < A[0].length; j++) {
        //         productArray[i][j] = A[i][j] * B[i][j];
        //     }
        // }
    
}