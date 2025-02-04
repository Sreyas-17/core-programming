import java.util.*;

public class MatrixManipulation {
    public static void create(int rows, int columns){
        int[][] matrixOne=new int[rows][columns];
        int[][] matrixTwo=new int[rows][columns];
        int i, j;
        Random random = new Random();
        for (i = 0; i <rows; i++) {
            for (j = 0; j < columns; j++) {
                matrixOne[i][j] = random.nextInt(0,9);
                matrixTwo[i][j] = random.nextInt(0,9);
            }
        }
        int[][] matrix2x2=new int[2][2];
        for (i = 0; i <2; i++) {
            for (j = 0; j <2; j++) {
                matrix2x2[i][j] = random.nextInt(0,9);
            }
        }
        int[][] matrix3x3=new int[3][3];
        for (i = 0; i <3; i++) {
            for (j = 0; j <3; j++) {
                matrix3x3[i][j] = random.nextInt(0,9);
            }
        }


        displayMatrix(matrixOne,matrixTwo,rows,columns);
        calculateAddition(matrixOne,matrixTwo,rows,columns);
        calculateSubtraction(matrixOne,matrixTwo,rows,columns);
        calculateMultiplication(matrixOne,matrixTwo,rows,columns);
        findTransposeOfMatrix(matrixOne,rows,columns);
        int determinantOf2x2=calculateDeterminant2x2(matrix2x2);
        int determinant=calculateDeterminant3x3(matrixOne);
        findInverseOf2x2Matrix(matrix2x2,determinantOf2x2);
        findInverseOf3x3Matrix(matrix3x3,determinant);
    }

    public static void displayMatrix(int[][] matrixOne,int[][] matrixTwo,int rows,int columns) {
        int i,j;
        System.out.println("The first matrix is: ");
        for (i = 0; i <rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print(matrixOne[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nThe second matrix is: ");
        for (i = 0; i <rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print(matrixTwo[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void calculateAddition(int[][] matrixOne,int[][] matrixTwo,int rows,int columns){
        int i, j;
        int[][] additionMatrix=new int[rows][columns];
        for (i = 0; i <rows; i++) {
            for (j = 0; j < columns; j++) {
                additionMatrix[i][j]=matrixOne[i][j]+matrixTwo[i][j];
            }
        }
        System.out.println("\nThe addition of two matrices is: \n");

        for (i = 0; i <rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print(additionMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void calculateSubtraction(int[][] matrixOne,int[][] matrixTwo,int rows,int columns){
        int i, j;
        int[][] subtractionMatrix=new int[rows][columns];
        for (i = 0; i <rows; i++) {
            for (j = 0; j < columns; j++) {
                subtractionMatrix[i][j]=matrixOne[i][j]-matrixTwo[i][j];
            }
        }
        System.out.println("\nThe subtraction of two matrices is: \n");
        for (i = 0; i <rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print(subtractionMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void calculateMultiplication(int[][] matrixOne,int[][] matrixTwo,int rows,int columns){
        int i, j;
        int[][] multiplicationMatrix=new int[rows][columns];
        if (matrixOne[0].length != matrixTwo.length) {
            System.out.println("\nMatrices must have the same dimensions for multiplication.");
        }
        else {
            for (i = 0; i < rows; i++) {
                for (j = 0; j < columns; j++) {
                    multiplicationMatrix[i][j] = matrixOne[i][j] * matrixTwo[i][j];
                }
            }
        System.out.println("\nThe multiplication of two matrices is: \n");
            for (i = 0; i < rows; i++) {
                for (j = 0; j < columns; j++) {
                    System.out.print(multiplicationMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void findTransposeOfMatrix(int[][] matrix,int rows,int columns){
        int i, j;
        int[][] transposeMatrix=new int[rows][columns];
        for (i = 0; i <rows; i++) {
            for (j = 0; j < columns; j++) {
                transposeMatrix[i][j]=matrix[j][i];
            }
        }
        System.out.println("\nThe transpose of the matrix is: \n");
        for (i = 0; i <rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print(transposeMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int calculateDeterminant2x2(int[][] matrix){
        System.out.println("\nThe 2x2 matrix is: ");
        for (int i = 0; i <2; i++) {
            for (int j = 0; j <2; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int determinant=matrix[0][0]*matrix[1][1]-matrix[0][1]*matrix[1][0];
        System.out.println("\nThe determinant of 2*2 matrix is: "+determinant);
        return determinant;
    }
    public static int calculateDeterminant3x3(int[][] matrix){
        int determinantAB,determinantBC,determinantAC,determinant;
        determinantAB = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]);
        determinantBC = matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        determinantAC = matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        determinant=determinantAB-determinantBC+determinantAC;
        System.out.println("\nThe determinant of 3*3 matrix is: "+determinant);
        return determinant;
    }

    public static void findInverseOf2x2Matrix(int[][] matrix,int determinant){
            if (determinant == 0) {
                System.out.println("\nThe inverse does not exist because the determinant is 0.");
            } else {
                double inverseDet = 1.0 / determinant;
                int a = matrix[0][0];
                int b = matrix[0][1];
                int c = matrix[1][0];
                int d = matrix[1][1];

                double[][] inverseMatrix = new double[2][2];
                inverseMatrix[0][0] = d * inverseDet;
                inverseMatrix[0][1] = -b * inverseDet;
                inverseMatrix[1][0] = -c * inverseDet;
                inverseMatrix[1][1] = a * inverseDet;

                System.out.println("\nThe inverse of the 2x2 matrix is:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(String.format("%.2f ", inverseMatrix[i][j]));
                    }
                    System.out.println();
                }
            }
    }
    public static void findInverseOf3x3Matrix(int[][] matrix,int determinant){
        if (determinant == 0) {
            System.out.println("The inverse does not exist because the determinant is 0.");
        } else {
            int[][] cofactorMatrix = new int[3][3];

            cofactorMatrix[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
            cofactorMatrix[0][1] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
            cofactorMatrix[0][2] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];

            cofactorMatrix[1][0] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
            cofactorMatrix[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
            cofactorMatrix[1][2] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]);

            cofactorMatrix[2][0] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
            cofactorMatrix[2][1] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]);
            cofactorMatrix[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

            int[][] adjugateMatrix = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    adjugateMatrix[i][j] = cofactorMatrix[j][i];
                }
            }

            double inverseDet = 1.0 / determinant;
            double[][] inverseMatrix = new double[3][3];

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    inverseMatrix[i][j] = adjugateMatrix[i][j] * inverseDet;
                }
            }

            System.out.println("The inverse of the 3x3 matrix is:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(String.format("%.2f ", inverseMatrix[i][j]));
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number of rows and columns: ");
            int numberOfRows= input.nextInt();
            int numberOfColumns= input.nextInt();
            create(numberOfRows,numberOfColumns);
            input.close();
        }
    }
