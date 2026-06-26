package ai.leadping.openapi.phonenumbers.outgoing.conversation.item.override;

import ai.leadping.openapi.models.OutgoingNumberManualOverrideRequest;
import ai.leadping.openapi.models.OutgoingNumberSelectionResponse;
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
 * Builds and executes requests for operations under /phone-numbers/outgoing/conversation/{conversationId}/override
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OverrideRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link OverrideRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OverrideRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/phone-numbers/outgoing/conversation/{conversationId}/override", pathParameters);
    }
    /**
     * Instantiates a new {@link OverrideRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OverrideRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/phone-numbers/outgoing/conversation/{conversationId}/override", rawUrl);
    }
    /**
     * Clears a conversation&apos;s outgoing-number override so future lead messages return to automatic number selection.
     * @return a {@link OutgoingNumberSelectionResponse}
     * @throws ProblemDetails When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public OutgoingNumberSelectionResponse delete() {
        return delete(null);
    }
    /**
     * Clears a conversation&apos;s outgoing-number override so future lead messages return to automatic number selection.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OutgoingNumberSelectionResponse}
     * @throws ProblemDetails When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public OutgoingNumberSelectionResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OutgoingNumberSelectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Sets the outgoing phone number override for a conversation so future lead messages use the selected eligible number.
     * @param body Request schema for the Leadping API outgoing number manual override request, including the fields clients can send.
     * @return a {@link OutgoingNumberSelectionResponse}
     * @throws ProblemDetails When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public OutgoingNumberSelectionResponse post(@jakarta.annotation.Nonnull final OutgoingNumberManualOverrideRequest body) {
        return post(body, null);
    }
    /**
     * Sets the outgoing phone number override for a conversation so future lead messages use the selected eligible number.
     * @param body Request schema for the Leadping API outgoing number manual override request, including the fields clients can send.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OutgoingNumberSelectionResponse}
     * @throws ProblemDetails When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public OutgoingNumberSelectionResponse post(@jakarta.annotation.Nonnull final OutgoingNumberManualOverrideRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OutgoingNumberSelectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Clears a conversation&apos;s outgoing-number override so future lead messages return to automatic number selection.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Clears a conversation&apos;s outgoing-number override so future lead messages return to automatic number selection.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Sets the outgoing phone number override for a conversation so future lead messages use the selected eligible number.
     * @param body Request schema for the Leadping API outgoing number manual override request, including the fields clients can send.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final OutgoingNumberManualOverrideRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Sets the outgoing phone number override for a conversation so future lead messages use the selected eligible number.
     * @param body Request schema for the Leadping API outgoing number manual override request, including the fields clients can send.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final OutgoingNumberManualOverrideRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link OverrideRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OverrideRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OverrideRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
