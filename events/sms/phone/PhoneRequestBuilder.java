package ai.leadping.openapi.events.sms.phone;

import ai.leadping.openapi.events.sms.phone.item.WithPhoneNumberItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /events/sms/phone
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the ai.leadping.openapi.events.sms.phone.item collection
     * @param phoneNumber The phone number to search for.
     * @return a {@link WithPhoneNumberItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPhoneNumberItemRequestBuilder byPhoneNumber(@jakarta.annotation.Nonnull final String phoneNumber) {
        Objects.requireNonNull(phoneNumber);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("phoneNumber", phoneNumber);
        return new WithPhoneNumberItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link PhoneRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PhoneRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/events/sms/phone", pathParameters);
    }
    /**
     * Instantiates a new {@link PhoneRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PhoneRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/events/sms/phone", rawUrl);
    }
}
