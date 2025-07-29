// Number of Ways to Paint N × 3 Grid
// với 3 màu tương đương 1 2 3 => sẽ có thể quy về 2 kiểu chẵn(1 2 1, 2 1 2,...) và lẻ (1 2 3,  2 1 3, ...)
// từ 1 dòng chẵn có thể tạo ra 5 dòng mới (3 chẵn, 2 lẻ) (1 2 1) => (2 1 2), (3 1 3) (2 3 2) (2 1 3) (3 2 1)
// tử 1 dòng lẻ có thể tạo ra 4 dòng mới (2 chẵn 2 lẻ) (1 2 3) => (2 1 2) (2 3 2) (2 3 1) (3 1 2)
// ban đầu n = 1 sẽ có 6 chẵn 6 lẻ => từ đó scale lên n dựa vào số chẵn lẻ từng dòng tạo ra

public class Solution {
    public int NumOfWays(int n) {
        long even = 6;
        long odd = 6;
        long mod = (long)Math.Pow(10,9) + 7;
        for(int i = 1; i< n ; i++){
            long newEven = even * 3 + odd * 2;
            long newOdd = even * 2 + odd * 2;

            even = newEven % mod;
            odd = newOdd % mod;
        }

        return (int)((even+odd) % mod);
    }
}