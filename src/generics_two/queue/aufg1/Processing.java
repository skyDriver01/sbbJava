package generics_two.queue.aufg1;

public class Processing implements ProcessingInterface {

    /**
     * Add a job to the system.
     *
     * @return true if the job is added.
     */
    public boolean addJob(Job job) {
        return false;
    }

    /**
     * Get the next job for processing.
     */
    public Job getNextJob() {
        // TODO: implement this method
        return null;
    }

    /**
     * Put the unprocessed job back to the system.
     */
    public void getJobBack(Job job) {
        // TODO: implement this method
    }

    /**
     * Get the number of jobs in the system.
     */
    public int getJobs() {
        // TODO: implement this method
        return -42;
    }

    /**
     * Has jobs in the system for processing?
     */
    public boolean hasJobs() {
        // TODO: implement this method
        return false;
    }
}