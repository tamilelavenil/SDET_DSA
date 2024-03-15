package redoPrograms;

public class CardProcessor {

    // Assume there is a backend service to get the client card status
    private BackendService backendService;

    public CardProcessor(BackendService backendService) {
        this.backendService = backendService;
    }

    // Method to get the client card in final status or null within 5 minutes
    public ClientCard getClientCardInFinalState(String cardId) {
        long startTime = System.currentTimeMillis();
        long timeout = TimeUnit.MINUTES.toMillis(5);

        while (System.currentTimeMillis() - startTime < timeout) {
            ClientCard clientCard = backendService.getClientCardStatus(cardId);

            if (clientCard != null && clientCard.isInFinalState()) {
                return clientCard;
            }

            // Sleep for a short interval before checking again
            try {
                TimeUnit.SECONDS.sleep(5); // You can adjust this interval based on your requirements
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // If the card doesn't reach final state within 5 minutes, return null
        return null;
    }
}
