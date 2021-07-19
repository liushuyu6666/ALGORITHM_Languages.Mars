package DynamicProgramming.KillProcess;

import java.util.*;

public class KillProcessRBFS {
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < ppid.size(); i++){
            List<Integer> list = map.getOrDefault(ppid.get(i), new ArrayList<>());
            list.add(pid.get(i));
            map.put(ppid.get(i), list);
        }
        Set<Integer> set = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        set.add(kill);
        BFS(map, kill, set, queue);
        return new ArrayList<>(set);
    }
    public void BFS(Map<Integer, List<Integer>> map, int kill, Set<Integer> set, Queue<Integer> queue){
        if(map.containsKey(kill)){
            set.addAll(map.get(kill));
            queue.addAll(map.get(kill));
            BFS(map, queue.poll(), set, queue);
        }
        if(!queue.isEmpty()){
            BFS(map, queue.poll(), set, queue);
        }
    }
    public static void main(String args[]){
        KillProcessRBFS KillProcessRBFS = new KillProcessRBFS();
        List<Integer> pid = new ArrayList<>();
        List<Integer> ppid = new ArrayList<>();
        for(int i = 0; i < 50000; i++){
            pid.add(i+1);
            ppid.add(1);
        }
        ppid.set(0, 0);
        System.out.println(KillProcessRBFS.killProcess(pid, ppid, 1));
    }
}
