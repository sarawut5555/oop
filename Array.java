public class Array
{
  public static void main(String[] args) {

    int[][] array = new int[5][5];
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
		System.out.print("Enter number ");
        array[i][j] = Integer.parseInt(System.console().readLine());
      }
    }
    for (int i = 0; i < 5; i++) {
      array[4][i] = array[0][i] + array[1][i] + array[2][i] + array[3][i] + array[4][i];
    }
    for (int j = 0; j < 5; j++) {
      array[j][4] = array[j][0] + array[j][1] + array[j][2] + array[j][3] + array[j][4];
    }

    int sum = 0;
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        sum += array[i][j];
      }
    }
    array[4][4] = sum;

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
}



