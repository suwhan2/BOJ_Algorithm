import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int arr[][] = new int[2][7];
        for(int i=0;i<N;i++) {
            int s = sc.nextInt();
            int grade = sc.nextInt();
            arr[s][grade]+=1;
        }
        int ans=0;
        for(int i=0;i<2;i++) {
            for(int j=1;j<=6;j++) {
                if(arr[i][j]%K==0) {
                    ans+=arr[i][j]/K;
                }
                else {
                    ans+=(arr[i][j]/K+1);
                }

            }
        }

        System.out.println(ans);
    }
}
