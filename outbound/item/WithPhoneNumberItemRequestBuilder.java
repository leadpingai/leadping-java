package ai.leadping.openapi.outbound.item;

import ai.leadping.openapi.outbound.item.capacity.CapacityRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /outbound/{phoneNumberId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithPhoneNumberItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The capacity property
     * @return a {@link CapacityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CapacityRequestBuilder capacity() {
        return new CapacityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithPhoneNumberItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPhoneNumberItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/outbound/{phoneNumberId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithPhoneNumberItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPhoneNumberItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/outbound/{phoneNumberId}", rawUrl);
    }
}
