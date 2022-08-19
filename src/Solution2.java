import java.util.*;

class Solution2 {
    int solution(int X, int Y, int[] A) {
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        int start=-1;
        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX += 1;
            else if (A[i] == Y)
                nY += 1;
            if (nX == nY)
                result = i;
            if((nX!=0 || nY!=0) && (start==-1)){
            	start=i;
            }
            if(nX==nY && nX !=0 && nY !=0) {
            	result=i;
            }
            if(start !=-1) && (result !=1)){
            	result =result-start;
            }
        }
        return result;
    }
}
