package com.javarush.task.task25.task2515;

/**
 * Он будет ответственным за "отрисовку" объектов.
 * С его помощью они будут отрисовывать себя.
 * Вернее даже на нем.
 */
public class Canvas {
    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        matrix = new char[height][width];
    }

    /** будет "ставить точку в координатах x,y цветом c" */
    public void setPoint(double x, double y, char c){
        if (y >= 0 && x >= 0 && y < matrix.length && x < matrix[0].length)
            matrix[(int)Math.round(y)][(int) Math.round(x)] = c;
    }

    /** копирует переданную ему картинку (матрицу) в матрицу Canvas. начиная с координат x, y */
    public void drawMatrix(double x, double y, int[][] matrix, char c){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0){
                    setPoint(x + j, y + i, c);
                }
            }
        }
    }

    public void clear(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = ' ';
            }
        }
    }

    public void print(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public char[][] getMatrix() {
        return matrix;
    }
}
