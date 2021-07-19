package DynamicProgramming.KillProcess;

import java.util.*;

public class KillProcessFind {
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        Boolean[] arr = new Boolean[pid.size()];
        Arrays.fill(arr, null);
        arr[pid.indexOf(kill)] = true;
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < pid.size(); i++){
            findParent(pid, ppid, arr, pid.get(i));
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i]){
                ans.add(pid.get(i));
            }
        }
        return new ArrayList<>(ans);

    }
    public Boolean findParent(List<Integer> pid, List<Integer> ppid,
                             Boolean[] arr, int target){
        int index = pid.indexOf(target);
        int parent = ppid.get(index);
        if(arr[index] != null){
            return arr[index];
        }
        else if(parent == 0){
            arr[index] = false;
            return false;
        }
        else{
            arr[index] = findParent(pid, ppid, arr, parent);
            return arr[index];
        }
    }
    public static void main(String args[]){
        KillProcessFind killProcessFind = new KillProcessFind();
        List<Integer> pid = new ArrayList<>();
        List<Integer> ppid = new ArrayList<>();
        for(int i = 0; i < 50000; i++){
            pid.add(i+1);
            ppid.add(1);
        }
        ppid.set(0, 0);

        System.out.println(killProcessFind.killProcess(pid, ppid, 1));
    }
}
