package MockPrograms;

import java.util.ArrayList;

public class MatTraverse {
    public static void main(String[] args) {
        int row= 3;
        int col=3;
        String word = "ab";
        ArrayList<String> countList = new ArrayList();
        char array[] = word.toCharArray();
        int len = array.length;
        char mat[][] = {{'a','b','a'}
                ,{'d','b','d'}
                ,{'c','a','a'}};
        if(row>=len) {
            for (int i = 0; i < row; i++) {
                int k = 0, count = 0;
                int l = 0, start = 0;
                for (int j = 0; j <=col-len; j++) {
                    if (k < array.length && mat[i][j] == array[k]) {
                        if (l++ == 0)
                            start = j;
                        count++;
                        k++;
                    }
                }
                if (count == len)
                    countList.add(i + "," + start);
                k = 0;
                count = 0;
                l = 0;
                start = 0;
                for (int j = col - 1; j >= 0; j--) {
                    if (k < array.length && mat[i][j] == array[k]) {
                        if (l++ == 0)
                            start = j;
                        count++;
                        k++;
                    }
                }
                if (count == len)
                    countList.add(i + "," + start);
            }
        }
        if(col>=len) {
            for (int i = 0; i < row; i++) {
                int k = 0, count = 0;
                int l = 0, start = 0;
                for (int j = 0; j <=col-len; j++) {
                    if (k < array.length && mat[j][i] == array[k]) {
                        if (l++ == 0)
                            start = j;
                        count++;
                        k++;
                    }
                }
                if (count == len)
                    countList.add(start + "," + i);
                k = 0;
                count = 0;
                l = 0;
                start = 0;
                for (int j = col - 1; j >= 0; j--) {
                    if (k < array.length && mat[j][i] == array[k]) {
                        if (l++ == 0)
                            start = j;
                        count++;
                        k++;
                    }
                }
                if (count == len)
                    countList.add(start + "," + i);
            }
        }
        if(row>=len&&col>=len) {
            int temp = 0,count=0,l=0,start=0;
            for (int i = 0; i < row; i++) {
                if (temp < col && mat[i][temp] == array[i]){
                    count++;
                    temp++;
                }
            }
        }
        System.out.println(countList);
    }
    void counter(){

    }
}
