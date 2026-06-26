package ai.leadping.openapi.events;

import ai.leadping.openapi.events.all.AllRequestBuilder;
import ai.leadping.openapi.events.businesses.BusinessesRequestBuilder;
import ai.leadping.openapi.events.calls.CallsRequestBuilder;
import ai.leadping.openapi.events.conversations.ConversationsRequestBuilder;
import ai.leadping.openapi.events.item.WithEventItemRequestBuilder;
import ai.leadping.openapi.events.leads.LeadsRequestBuilder;
import ai.leadping.openapi.events.sms.SmsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /events
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EventsRequestBuilder extends BaseRequestBuilder {
    /**
     * The all property
     * @return a {@link AllRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AllRequestBuilder all() {
        return new AllRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The businesses property
     * @return a {@link BusinessesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BusinessesRequestBuilder businesses() {
        return new BusinessesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The calls property
     * @return a {@link CallsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CallsRequestBuilder calls() {
        return new CallsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The conversations property
     * @return a {@link ConversationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConversationsRequestBuilder conversations() {
        return new ConversationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The leads property
     * @return a {@link LeadsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LeadsRequestBuilder leads() {
        return new LeadsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The sms property
     * @return a {@link SmsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SmsRequestBuilder sms() {
        return new SmsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the ai.leadping.openapi.events.item collection
     * @param eventId The ID of the event.
     * @return a {@link WithEventItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithEventItemRequestBuilder byEventId(@jakarta.annotation.Nonnull final String eventId) {
        Objects.requireNonNull(eventId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("eventId", eventId);
        return new WithEventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link EventsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EventsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/events", pathParameters);
    }
    /**
     * Instantiates a new {@link EventsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EventsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/events", rawUrl);
    }
}
