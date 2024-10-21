/*

6. Queue Interface
o Write a program that simulates a job queue using a PriorityQueue. Add several jobs with priorities and print them in the order they are processed (i.e., based on their priority).

 */
import java.util.PriorityQueue;

class Job implements Comparable<Job> {
    private String name;
    private int priority;

    // Constructor
    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    // Override compareTo method to sort by priority (lower number means higher priority)
    @Override
    public int compareTo(Job otherJob) {
        return Integer.compare(this.priority, otherJob.priority);
    }

    // toString method for displaying the job
    @Override
    public String toString() {
        return "Job{" + "name='" + name + '\'' + ", priority=" + priority + '}';
    }
}


public class QueueInterface_6 {
    public static void main(String[] args) {
        // Create a PriorityQueue to store Job objects
        PriorityQueue<Job> jobQueue = new PriorityQueue<>();

        // Add jobs to the queue with different priorities
        jobQueue.add(new Job("Job1", 3)); // Medium priority
        jobQueue.add(new Job("Job2", 1)); // Highest priority
        jobQueue.add(new Job("Job3", 4)); // Low priority
        jobQueue.add(new Job("Job4", 2)); // High priority

        // Process jobs based on priority (sorted by lowest priority value)
        System.out.println("Jobs processed in priority order:");
        while (!jobQueue.isEmpty()) {
            System.out.println(jobQueue.poll()); // Poll removes and returns the highest priority job
        }
    }
}
