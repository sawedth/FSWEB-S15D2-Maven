package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks = new HashSet<>();
    private Set<Task> carolsTasks = new HashSet<>();
    private Set<Task> bobsTasks = new HashSet<>();
    private Set<Task> unassignedTasks = new HashSet<>();

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks,  Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.carolsTasks = carolsTasks;
        this.bobsTasks = bobsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String name){
        if(name.equals("ann")){
            return annsTasks;
        } else if (name.equals("bob")) {
            return bobsTasks;
        } else if (name.equals("carol")) {
            return carolsTasks;
        } else if (name.equals("all")) {
            Set<Task> all = new HashSet<>(annsTasks);
            all.addAll(carolsTasks);
            all.addAll(bobsTasks);
            return all;
        }else{
            return null;
        }
    }

    public Set<Task> getUnion(Set<Task> set1, Set<Task> set2){
        set1.addAll(set2);
        return set1;
    }
    public Set<Task> getIntersection(Set<Task> set1, Set<Task> set2){
        set1.retainAll(set2);
        return set1;
    }

    public Set<Task> getDifferences(Set<Task> set1, Set<Task> set2){
        set1.removeAll(set2);
        return set1;
    }

}
