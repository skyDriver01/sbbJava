package generics_two.queue.aufg1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Processing implements ProcessingInterface {

    Deque <Job> work = new ArrayDeque <>();

    /**
     * Add a job to the system.
     *
     * @return true if the job is added.
     */
    public boolean addJob(Job job) {
        return work.offerLast(job);
    }

    /**
     * Get the next job for processing.
     */
    public Job getNextJob() {
        return work.pollFirst();
    }

    /**
     * Put the unprocessed job back to the system.
     */
    public void getJobBack(Job job) {
        work.offerFirst(job);
    }

    /**
     * Get the number of jobs in the system.
     */
    public int getJobs() {
        return work.size();
    }

    /**
     * Has jobs in the system for processing?
     */
    public boolean hasJobs() {
        return !work.isEmpty();
    }
}