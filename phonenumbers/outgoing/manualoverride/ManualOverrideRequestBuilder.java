package ai.leadping.openapi.phonenumbers.outgoing.manualoverride;

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
 * Builds and executes requests for operations under /phone-numbers/outgoing/manual-override
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManualOverrideRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ManualOverrideRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ManualOverrideRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/phone-numbers/outgoing/manual-override", pathParameters);
    }
    /**
     * Instantiates a new {@link ManualOverrideRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ManualOverrideRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/phone-numbers/outgoing/manual-override", rawUrl);
    }
    /**
     * Validates a manual outgoing-number override before use, checking ownership, destination, and delivery eligibility.
     * @param body Request schema for the Leadping API outgoing number manual override request, including the fields clients can send.
     * @return a {@link OutgoingNumberSelectionResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 401 status code
     */
    @jakarta.annotation.Nullable
    public OutgoingNumberSelectionResponse post(@jakarta.annotation.Nonnull final OutgoingNumberManualOverrideRequest body) {
        return post(body, null);
    }
    /**
     * Validates a manual outgoing-number override before use, checking ownership, destination, and delivery eligibility.
     * @param body Request schema for the Leadping API outgoing number manual override request, including the fields clients can send.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OutgoingNumberSelectionResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 401 status code
     */
    @jakarta.annotation.Nullable
    public OutgoingNumberSelectionResponse post(@jakarta.annotation.Nonnull final OutgoingNumberManualOverrideRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("401", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OutgoingNumberSelectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Validates a manual outgoing-number override before use, checking ownership, destination, and delivery eligibility.
     * @param body Request schema for the Leadping API outgoing number manual override request, including the fields clients can send.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final OutgoingNumberManualOverrideRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Validates a manual outgoing-number override before use, checking ownership, destination, and delivery eligibility.
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
     * @return a {@link ManualOverrideRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ManualOverrideRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ManualOverrideRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
