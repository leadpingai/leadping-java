package ai.leadping.openapi.leadstatuses;

import ai.leadping.openapi.leadstatuses.item.LeadStatusesItemRequestBuilder;
import ai.leadping.openapi.models.LeadStatusRequest;
import ai.leadping.openapi.models.LeadStatusResponse;
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
 * Builds and executes requests for operations under /lead-statuses
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadStatusesRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the ai.leadping.openapi.leadStatuses.item collection
     * @param id Unique identifier of the item
     * @return a {@link LeadStatusesItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LeadStatusesItemRequestBuilder byId(@jakarta.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new LeadStatusesItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link LeadStatusesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LeadStatusesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/lead-statuses", pathParameters);
    }
    /**
     * Instantiates a new {@link LeadStatusesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LeadStatusesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/lead-statuses", rawUrl);
    }
    /**
     * Lists the current business&apos;s active lead statuses for organizing and tracking leads through the sales workflow.
     * @return a {@link java.util.List<LeadStatusResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LeadStatusResponse> get() {
        return get(null);
    }
    /**
     * Lists the current business&apos;s active lead statuses for organizing and tracking leads through the sales workflow.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link java.util.List<LeadStatusResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LeadStatusResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.sendCollection(requestInfo, null, LeadStatusResponse::createFromDiscriminatorValue);
    }
    /**
     * Creates a reusable lead status for the current business to categorize leads in its sales workflow.
     * @param body The request body
     * @return a {@link LeadStatusResponse}
     */
    @jakarta.annotation.Nullable
    public LeadStatusResponse post(@jakarta.annotation.Nonnull final LeadStatusRequest body) {
        return post(body, null);
    }
    /**
     * Creates a reusable lead status for the current business to categorize leads in its sales workflow.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link LeadStatusResponse}
     */
    @jakarta.annotation.Nullable
    public LeadStatusResponse post(@jakarta.annotation.Nonnull final LeadStatusRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, LeadStatusResponse::createFromDiscriminatorValue);
    }
    /**
     * Lists the current business&apos;s active lead statuses for organizing and tracking leads through the sales workflow.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Lists the current business&apos;s active lead statuses for organizing and tracking leads through the sales workflow.
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
     * Creates a reusable lead status for the current business to categorize leads in its sales workflow.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final LeadStatusRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Creates a reusable lead status for the current business to categorize leads in its sales workflow.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final LeadStatusRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json, text/plain;q=0.9");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link LeadStatusesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LeadStatusesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new LeadStatusesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
