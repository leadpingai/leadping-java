package ai.leadping.openapi.sms;

import ai.leadping.openapi.sms.item.WithSmsEventItemRequestBuilder;
import ai.leadping.openapi.sms.send.SendRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /sms
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SmsRequestBuilder extends BaseRequestBuilder {
    /**
     * The send property
     * @return a {@link SendRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SendRequestBuilder send() {
        return new SendRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the ai.leadping.openapi.sms.item collection
     * @param smsEventId The sms event identifier.
     * @return a {@link WithSmsEventItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithSmsEventItemRequestBuilder bySmsEventId(@jakarta.annotation.Nonnull final String smsEventId) {
        Objects.requireNonNull(smsEventId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("smsEventId", smsEventId);
        return new WithSmsEventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link SmsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SmsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sms", pathParameters);
    }
    /**
     * Instantiates a new {@link SmsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SmsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sms", rawUrl);
    }
}
