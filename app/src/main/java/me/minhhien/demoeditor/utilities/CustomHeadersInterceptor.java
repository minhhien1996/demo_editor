package me.minhhien.demoeditor.utilities;

/**
 * Created by minhhien1996 on 5/21/17.
 */

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by IRSHU on 28/2/2017.
 */
public class CustomHeadersInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();

        // TODO: change your header here
        Request.Builder requestBuilder = original.newBuilder()
                .header("Authorization", "Basic fwefhwefw8f7wefwegfhsdhdsuysd")
                .header("Accept", "application/json")
                .method(original.method(), original.body());
        Request request = requestBuilder.build();
        Response response = chain.proceed(request);
        return response;
    }
}