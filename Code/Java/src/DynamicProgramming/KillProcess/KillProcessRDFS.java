package DynamicProgramming.KillProcess;

import java.util.*;

public class KillProcessRDFS {
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < ppid.size(); i++){
            List<Integer> list = map.getOrDefault(ppid.get(i), new ArrayList<>());
            list.add(pid.get(i));
            map.put(ppid.get(i), list);
        }
        Set<Integer> set = new HashSet<>();
        set.add(kill);
        DFS(map, kill, set);
        return new ArrayList<>(set);
    }
    public void DFS(Map<Integer, List<Integer>> map, int kill, Set<Integer> set){
        if(map.containsKey(kill)){
            for(int p : map.get(kill)){
                set.add(p);
                DFS(map, p, set);
            }
        }
    }
    public static void main(String args[]){
        KillProcessRDFS killProcessRDFS = new KillProcessRDFS();
        List<Integer> pid = new ArrayList<>();
        List<Integer> ppid = new ArrayList<>();
        for(int i = 0; i < 50000; i++){
            pid.add(i+1);
            ppid.add(1);
        }
        ppid.set(0, 0);
        System.out.println(killProcessRDFS.killProcess(pid, ppid, 1));
    }
}
