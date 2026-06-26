package ai.leadping.openapi.events.conversations;

import ai.leadping.openapi.events.conversations.item.WithConversationItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /events/conversations
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConversationsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the ai.leadping.openapi.events.conversations.item collection
     * @param conversationId The ID of the conversation.
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
     * Instantiates a new {@link ConversationsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConversationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/events/conversations", pathParameters);
    }
    /**
     * Instantiates a new {@link ConversationsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConversationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/events/conversations", rawUrl);
    }
}
