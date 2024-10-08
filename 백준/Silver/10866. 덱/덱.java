import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<N;i++){
            StringTokenizer st =new StringTokenizer(bf.readLine());
            switch (st.nextToken()){
                case "push_front":
                    int f = Integer.parseInt(st.nextToken());
                    dq.addFirst(f);
                    break;

                case "push_back":
                    int b = Integer.parseInt(st.nextToken());
                    dq.addLast(b);
                    break;

                case "pop_front":
                    if(dq.isEmpty()){
                        sb.append(-1+"\n");
                    }else{
                        sb.append(dq.removeFirst()+"\n");
                    }
                    break;
                case "pop_back":
                    if(dq.isEmpty()){
                        sb.append(-1+"\n");
                    }else{
                        sb.append(dq.removeLast()+"\n");
                    }
                    break;
                case "size":
                    sb.append(dq.size()+"\n");
                    break;
                case "empty":
                    if(dq.isEmpty()){
                        sb.append(1+"\n");
                    }else {
                        sb.append(0+"\n");
                    }
                    break;
                case "front":
                    if(dq.isEmpty()){
                        sb.append(-1+"\n");
                    }else{
                        sb.append(dq.getFirst()+"\n");
                    }
                    break;
                case "back":
                    if(dq.isEmpty()){
                        sb.append(-1+"\n");
                    }else{
                        sb.append(dq.getLast()+"\n");
                    }
                    break;
            }
        }
        System.out.println(sb);

    }
}
