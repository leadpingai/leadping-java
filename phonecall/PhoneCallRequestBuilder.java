package ai.leadping.openapi.phonecall;

import ai.leadping.openapi.phonecall.initiate.InitiateRequestBuilder;
import ai.leadping.openapi.phonecall.item.WithCallItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /phone-call
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneCallRequestBuilder extends BaseRequestBuilder {
    /**
     * The initiate property
     * @return a {@link InitiateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InitiateRequestBuilder initiate() {
        return new InitiateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the ai.leadping.openapi.phoneCall.item collection
     * @param callId The unique identifier of the call to end.
     * @return a {@link WithCallItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCallItemRequestBuilder byCallId(@jakarta.annotation.Nonnull final String callId) {
        Objects.requireNonNull(callId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("callId", callId);
        return new WithCallItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link PhoneCallRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PhoneCallRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/phone-call", pathParameters);
    }
    /**
     * Instantiates a new {@link PhoneCallRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PhoneCallRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/phone-call", rawUrl);
    }
}
