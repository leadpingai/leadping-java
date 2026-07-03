package ai.leadping.openapi.phonecall.item;

import ai.leadping.openapi.phonecall.item.hangup.HangupRequestBuilder;
import ai.leadping.openapi.phonecall.item.status.StatusRequestBuilder;
import ai.leadping.openapi.phonecall.item.transfer.TransferRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /phone-call/{callId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithCallItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The hangup property
     * @return a {@link HangupRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HangupRequestBuilder hangup() {
        return new HangupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The status property
     * @return a {@link StatusRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StatusRequestBuilder status() {
        return new StatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The transfer property
     * @return a {@link TransferRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TransferRequestBuilder transfer() {
        return new TransferRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithCallItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCallItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/phone-call/{callId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithCallItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCallItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/phone-call/{callId}", rawUrl);
    }
}
