package server.respositories;

public class MessageLogRepository {
    private static final MessageLogRepository messageLogRepository = new MessageLogRepository();
    private MessageLogRepository(){}
    public static MessageLogRepository getInstance(){
        return messageLogRepository;
    }


}
