package ai.leadping.openapi.suppressions.item;

import ai.leadping.openapi.models.ProblemDetails;
import ai.leadping.openapi.models.SuppressionEntryResponse;
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
 * Builds and executes requests for operations under /suppressions/{id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SuppressionsItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link SuppressionsItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SuppressionsItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/suppressions/{id}", pathParameters);
    }
    /**
     * Instantiates a new {@link SuppressionsItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SuppressionsItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/suppressions/{id}", rawUrl);
    }
    /**
     * Returns one suppression entry for the current organization, including its recipient, channel, reason, status, and audit timestamps.
     * @return a {@link SuppressionEntryResponse}
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 403 status code
     * @throws ProblemDetails When receiving a 404 status code
     * @throws ProblemDetails When receiving a 429 status code
     */
    @jakarta.annotation.Nullable
    public SuppressionEntryResponse get() {
        return get(null);
    }
    /**
     * Returns one suppression entry for the current organization, including its recipient, channel, reason, status, and audit timestamps.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SuppressionEntryResponse}
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 403 status code
     * @throws ProblemDetails When receiving a 404 status code
     * @throws ProblemDetails When receiving a 429 status code
     */
    @jakarta.annotation.Nullable
    public SuppressionEntryResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("401", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("403", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("404", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("429", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SuppressionEntryResponse::createFromDiscriminatorValue);
    }
    /**
     * Returns one suppression entry for the current organization, including its recipient, channel, reason, status, and audit timestamps.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns one suppression entry for the current organization, including its recipient, channel, reason, status, and audit timestamps.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link SuppressionsItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SuppressionsItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SuppressionsItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
