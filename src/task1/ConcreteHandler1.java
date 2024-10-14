package task1;

class ConcreteHandler1 implements Handler {
    private Handler next;


    public void setNext(Handler handler) {
        next = handler;
    }

    public void handleRequest(String request) {
        if (request.equals("Task1")) {
            System.out.println("Handled by Handler1");
        } else if (next != null) {
            System.out.println("Handler1 passing the request to next handler");
            next.handleRequest(request);
        } else {
            System.out.println("Request cannot be handled");
        }

    }
}
