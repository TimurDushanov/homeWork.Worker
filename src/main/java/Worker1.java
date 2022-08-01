public class Worker1{
    private OnTaskDoneListener callback;
    public OnTaskErrorListener errorCallback;


    public Worker1(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 33; i++) {
            callback.onDone("Task " + i + " is done");
        }
        errorCallback.onError("Task 33" + " is not done");

        for (int i = 34; i < 100; i++) {
            callback.onDone("Task " + i + " is done");
        }
    }
}