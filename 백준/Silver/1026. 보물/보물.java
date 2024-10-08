import java.io.IOException;
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.util.StringTokenizer;


public class Main {
	static int N;
	static int A[];
	static int B[];
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		A = new int[N];
		B = new int[N];
		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		st= new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		int ans=0;
		for(int i=0;i<N;i++) {
			ans+=(A[i]*B[N-1-i]);
		}
		System.out.println(ans);
	}
	
}

