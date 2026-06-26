package ai.leadping.openapi.feedback.admin;

import ai.leadping.openapi.feedback.admin.item.AdminItemRequestBuilder;
import ai.leadping.openapi.models.PagedResultOfFeedbackResponse;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /feedback/admin
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdminRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the ai.leadping.openapi.feedback.admin.item collection
     * @param id Unique identifier of the item
     * @return a {@link AdminItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AdminItemRequestBuilder byId(@jakarta.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new AdminItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link AdminRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdminRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/feedback/admin{?Area*,BusinessId*,ContinuationToken*,CreatedEnd*,CreatedStart*,PageSize*,Search*,Status*,Type*}", pathParameters);
    }
    /**
     * Instantiates a new {@link AdminRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdminRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/feedback/admin{?Area*,BusinessId*,ContinuationToken*,CreatedEnd*,CreatedStart*,PageSize*,Search*,Status*,Type*}", rawUrl);
    }
    /**
     * Lists submitted feedback for admin triage with query filters, paging, status, and category review fields.
     * @return a {@link PagedResultOfFeedbackResponse}
     */
    @jakarta.annotation.Nullable
    public PagedResultOfFeedbackResponse get() {
        return get(null);
    }
    /**
     * Lists submitted feedback for admin triage with query filters, paging, status, and category review fields.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PagedResultOfFeedbackResponse}
     */
    @jakarta.annotation.Nullable
    public PagedResultOfFeedbackResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, PagedResultOfFeedbackResponse::createFromDiscriminatorValue);
    }
    /**
     * Lists submitted feedback for admin triage with query filters, paging, status, and category review fields.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Lists submitted feedback for admin triage with query filters, paging, status, and category review fields.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link AdminRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AdminRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AdminRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Lists submitted feedback for admin triage with query filters, paging, status, and category review fields.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Product area or app section connected to this feedback admin query request.
         */
        @jakarta.annotation.Nullable
        public String area;
        /**
         * Business ID used to filter feedback items for admin review.
         */
        @jakarta.annotation.Nullable
        public String businessId;
        /**
         * Pagination token used to request the next page of Leadping API results.
         */
        @jakarta.annotation.Nullable
        public String continuationToken;
        /**
         * End of the created-at date range filter for Leadping API results.
         */
        @jakarta.annotation.Nullable
        public OffsetDateTime createdEnd;
        /**
         * Start of the created-at date range filter for Leadping API results.
         */
        @jakarta.annotation.Nullable
        public OffsetDateTime createdStart;
        /**
         * Maximum number of results requested for this Leadping API page.
         */
        @jakarta.annotation.Nullable
        public Integer pageSize;
        /**
         * Search text used to filter Leadping API results.
         */
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Current lifecycle status for this feedback admin query request in the Leadping API.
         */
        @jakarta.annotation.Nullable
        public String status;
        /**
         * Type classification used to route and interpret this feedback admin query request in the Leadping API.
         */
        @jakarta.annotation.Nullable
        public String type;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("Area", area);
            allQueryParams.put("BusinessId", businessId);
            allQueryParams.put("ContinuationToken", continuationToken);
            allQueryParams.put("CreatedEnd", createdEnd);
            allQueryParams.put("CreatedStart", createdStart);
            allQueryParams.put("PageSize", pageSize);
            allQueryParams.put("Search", search);
            allQueryParams.put("Status", status);
            allQueryParams.put("Type", type);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
