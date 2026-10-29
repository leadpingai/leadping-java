package ai.leadping.openapi.conversations.item;

import ai.leadping.openapi.conversations.item.markhandled.MarkHandledRequestBuilder;
import ai.leadping.openapi.conversations.item.markread.MarkReadRequestBuilder;
import ai.leadping.openapi.conversations.item.markreplyneeded.MarkReplyNeededRequestBuilder;
import ai.leadping.openapi.conversations.item.outboundreadiness.OutboundReadinessRequestBuilder;
import ai.leadping.openapi.models.ConversationResponse;
import ai.leadping.openapi.models.ProblemDetails;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /conversations/{id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConversationsItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The markHandled property
     * @return a {@link MarkHandledRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MarkHandledRequestBuilder markHandled() {
        return new MarkHandledRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The markRead property
     * @return a {@link MarkReadRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MarkReadRequestBuilder markRead() {
        return new MarkReadRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The markReplyNeeded property
     * @return a {@link MarkReplyNeededRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MarkReplyNeededRequestBuilder markReplyNeeded() {
        return new MarkReplyNeededRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The outboundReadiness property
     * @return a {@link OutboundReadinessRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OutboundReadinessRequestBuilder outboundReadiness() {
        return new OutboundReadinessRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ConversationsItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConversationsItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/conversations/{id}", pathParameters);
    }
    /**
     * Instantiates a new {@link ConversationsItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConversationsItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/conversations/{id}", rawUrl);
    }
    /**
     * Returns a conversation accessible to the current user, including its current event version for tracking inbox updates.
     * @return a {@link ConversationResponse}
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 403 status code
     * @throws ProblemDetails When receiving a 404 status code
     * @throws ProblemDetails When receiving a 429 status code
     */
    @jakarta.annotation.Nullable
    public ConversationResponse get() {
        return get(null);
    }
    /**
     * Returns a conversation accessible to the current user, including its current event version for tracking inbox updates.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ConversationResponse}
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 403 status code
     * @throws ProblemDetails When receiving a 404 status code
     * @throws ProblemDetails When receiving a 429 status code
     */
    @jakarta.annotation.Nullable
    public ConversationResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("401", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("403", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("404", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("429", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ConversationResponse::createFromDiscriminatorValue);
    }
    /**
     * Returns a conversation accessible to the current user, including its current event version for tracking inbox updates.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns a conversation accessible to the current user, including its current event version for tracking inbox updates.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "text/plain;q=0.9");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ConversationsItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConversationsItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ConversationsItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
