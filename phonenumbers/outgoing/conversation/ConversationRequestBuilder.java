package ai.leadping.openapi.phonenumbers.outgoing.conversation;

import ai.leadping.openapi.phonenumbers.outgoing.conversation.item.WithConversationItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /phone-numbers/outgoing/conversation
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConversationRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the ai.leadping.openapi.phoneNumbers.outgoing.conversation.item collection
     * @param conversationId The conversation identifier.
     * @return a {@link WithConversationItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithConversationItemRequestBuilder byConversationId(@jakarta.annotation.Nonnull final String conversationId) {
        Objects.requireNonNull(conversationId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("conversationId", conversationId);
        return new WithConversationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ConversationRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConversationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/phone-numbers/outgoing/conversation", pathParameters);
    }
    /**
     * Instantiates a new {@link ConversationRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConversationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/phone-numbers/outgoing/conversation", rawUrl);
    }
}
