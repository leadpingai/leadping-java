package ai.leadping.openapi.sources;

import ai.leadping.openapi.models.ProblemDetails;
import ai.leadping.openapi.models.SourceRequest;
import ai.leadping.openapi.models.SourceResponse;
import ai.leadping.openapi.sources.all.AllRequestBuilder;
import ai.leadping.openapi.sources.item.SourcesItemRequestBuilder;
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
 * Builds and executes requests for operations under /sources
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SourcesRequestBuilder extends BaseRequestBuilder {
    /**
     * The all property
     * @return a {@link AllRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AllRequestBuilder all() {
        return new AllRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the ai.leadping.openapi.sources.item collection
     * @param id The ID of the source to update.
     * @return a {@link SourcesItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SourcesItemRequestBuilder byId(@jakarta.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new SourcesItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link SourcesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SourcesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sources", pathParameters);
    }
    /**
     * Instantiates a new {@link SourcesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SourcesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sources", rawUrl);
    }
    /**
     * Creates a lead source for the current business, storing intake credentials and routing context for captured external leads.
     * @param body Request schema for the Leadping API lead source request, including the fields clients can send.
     * @return a {@link SourceResponse}
     * @throws ProblemDetails When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public SourceResponse post(@jakarta.annotation.Nonnull final SourceRequest body) {
        return post(body, null);
    }
    /**
     * Creates a lead source for the current business, storing intake credentials and routing context for captured external leads.
     * @param body Request schema for the Leadping API lead source request, including the fields clients can send.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SourceResponse}
     * @throws ProblemDetails When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public SourceResponse post(@jakarta.annotation.Nonnull final SourceRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SourceResponse::createFromDiscriminatorValue);
    }
    /**
     * Creates a lead source for the current business, storing intake credentials and routing context for captured external leads.
     * @param body Request schema for the Leadping API lead source request, including the fields clients can send.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SourceRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Creates a lead source for the current business, storing intake credentials and routing context for captured external leads.
     * @param body Request schema for the Leadping API lead source request, including the fields clients can send.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SourceRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link SourcesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SourcesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SourcesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
