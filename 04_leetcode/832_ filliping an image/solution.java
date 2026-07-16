class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int p1 = 0;
            int p2 = image[i].length - 1;
            for (int j = 0; j < image.length; j++) {
                while (p1 < p2) {
                    // swap image[i][p1] and image[i][p2]
                    int temp = image[i][p1];
                    image[i][p1] = image[i][p2];
                    image[i][p2] = temp;
                    p1++;
                    p2--;
                }
                swap(image, i, j);
            }
        }
        return image;
    }

    void swap(int[][] img, int i, int j) {
        if (img[i][j] == 0) {
            img[i][j] = 1;
        } else {
            img[i][j] = 0;
        }
    }
}