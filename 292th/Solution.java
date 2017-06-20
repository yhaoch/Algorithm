import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by u6001301 on 20/06/17.
 */
public class Solution {
    //when player facing the suitaion is nim-sum = 0, he/she will lose the game.
    //There will always true if we take (Xk - Yk) stones from one heap that makes Yk = sum XOR Xk true.
    public boolean canWinNim(int n) {
        //NIM-SUM
        int nim =0;
        nim ^= n;
        if(n == 1)
            return true;
        else if( n==2)
            return true;
        else if ( n == 3)
            return true;
        else if((nim ^ (n-1))<=3 && (nim ^ (n-1)) >=1)
            return true;
        else if((nim ^ (n-2))<=3 && (nim ^ (n-2)) >=1)
            return true;
        else if((nim ^ (n-3))<=3 && (nim ^ (n-3)) >=1)
            return true;
        else
            return false;
    }
}