package locator.add;

import com.amazonaws.services.lambda.runtime.Context;

public class AddLocation {

    public static class AddLocationRequest {
        String hello;

        public String getHello() {
            return hello;
        }

        public void setHello(String hello) {
            this.hello = hello;
        }

        public AddLocationRequest(String hello) {
            this.hello = hello;
        }

        public AddLocationRequest() {
        }
    }

    public static class AddLocationResponse {
        String goodbye;

        public String getGoodbye() {
            return goodbye;
        }

        public void setGoodbye(String goodbye) {
            this.goodbye = goodbye;
        }

        public AddLocationResponse(String goodbye) {
            this.goodbye = goodbye;
        }

        public AddLocationResponse() {
        }
    }

    public AddLocationResponse handler(AddLocationRequest event, Context context) {
        AddLocationResponse response = new AddLocationResponse();
        response.setGoodbye("Cya");
        return response;
    }
}
