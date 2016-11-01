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
        String hello;

        public String getHello() {
            return hello;
        }

        public void setHello(String hello) {
            this.hello = hello;
        }

        public AddLocationResponse(String hello) {
            this.hello = hello;
        }

        public AddLocationResponse() {
        }
    }

    public AddLocationResponse handler(AddLocationRequest event, Context context) {
        return new AddLocationResponse("hello");
    }
}
