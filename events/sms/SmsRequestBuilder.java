package ai.leadping.openapi.events.sms;

import ai.leadping.openapi.events.sms.all.AllRequestBuilder;
import ai.leadping.openapi.events.sms.item.WithSmsEventItemRequestBuilder;
import ai.leadping.openapi.events.sms.lead.LeadRequestBuilder;
import ai.leadping.openapi.events.sms.phone.PhoneRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /events/sms
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SmsRequestBuilder extends BaseRequestBuilder {
    /**
     * The all property
     * @return a {@link AllRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AllRequestBuilder all() {
        return new AllRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The lead property
     * @return a {@link LeadRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LeadRequestBuilder lead() {
        return new LeadRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The phone property
     * @return a {@link PhoneRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PhoneRequestBuilder phone() {
        return new PhoneRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the ai.leadping.openapi.events.sms.item collection
     * @param smsEventId The ID of the SMS event to retrieve.
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
        super(requestAdapter, "{+baseurl}/events/sms", pathParameters);
    }
    /**
     * Instantiates a new {@link SmsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SmsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/events/sms", rawUrl);
    }
}
