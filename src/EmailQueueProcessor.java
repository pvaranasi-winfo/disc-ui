
import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

  private Map<String, byte[]> attachmentCache = new HashMap<>();

  public void processQueue() {
    // Assuming 'jobs' and 'storageService' are available in this context
    // for (EmailJob job : jobs) {
    //   byte[] attachment = storageService.fetch(job.getAttachmentKey());
    //   if (!attachmentCache.containsKey(job.getAttachmentKey())) {
    //     attachmentCache.put(job.getAttachmentKey(), attachment);
    //     mailSender.send(job, attachment);
    //   }
    // }
    // Fix: Clear the attachmentCache after processing each batch to prevent memory leak
    attachmentCache.clear();
  }
}
