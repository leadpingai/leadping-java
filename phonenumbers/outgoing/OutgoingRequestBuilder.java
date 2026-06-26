package ai.leadping.openapi.phonenumbers.outgoing;

import ai.leadping.openapi.phonenumbers.outgoing.conversation.ConversationRequestBuilder;
import ai.leadping.openapi.phonenumbers.outgoing.manualoverride.ManualOverrideRequestBuilder;
import ai.leadping.openapi.phonenumbers.outgoing.newescaped.NewRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /phone-numbers/outgoing
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OutgoingRequestBuilder extends BaseRequestBuilder {
    /**
     * The conversation property
     * @return a {@link ConversationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConversationRequestBuilder conversation() {
        return new ConversationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The manualOverride property
     * @return a {@link ManualOverrideRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ManualOverrideRequestBuilder manualOverride() {
        return new ManualOverrideRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The new property
     * @return a {@link NewRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NewRequestBuilder newEscaped() {
        return new NewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link OutgoingRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OutgoingRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/phone-numbers/outgoing", pathParameters);
    }
    /**
     * Instantiates a new {@link OutgoingRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OutgoingRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/phone-numbers/outgoing", rawUrl);
    }
}
