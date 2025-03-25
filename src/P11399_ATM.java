import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P11399_ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());;

        List<Integer> pList = new ArrayList<>();
        for(int i=0; i<N; i++){
            pList.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(pList);

        int waitT = 0;
        int totalT = 0;

        for(int i=0; i<N; i++){
            waitT = waitT + pList.get(i);
            totalT = totalT + waitT;
        }

        System.out.println(totalT);
    }
}