class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor) {
            return image;
        }
        
        int startColor = image[sr][sc];
        
        fill(image, sr, sc, startColor, newColor);
        return image;
    }
    
    public void fill(int[][] image, int sr, int sc, int startColor, int newColor) {
        if(sr < 0 || sc < 0 || sr >= image.length || 
             sc >= image[0].length || image[sr][sc] != startColor) { // 더 이상 검증할 수 없을 때
            return;
        }
        
        image[sr][sc] = newColor;
        
        fill(image, sr - 1, sc, startColor, newColor);
        fill(image, sr + 1, sc, startColor, newColor);
        fill(image, sr, sc - 1, startColor, newColor);
        fill(image, sr, sc + 1, startColor, newColor);
    }
}