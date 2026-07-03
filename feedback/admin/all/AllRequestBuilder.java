package ai.leadping.openapi.feedback.admin.all;

import ai.leadping.openapi.models.PagedResultOfFeedbackResponse;
import ai.leadping.openapi.models.ProblemDetails;
import ai.leadping.openapi.models.RequestDataOptions;
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
 * Builds and executes requests for operations under /feedback/admin/all
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AllRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link AllRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AllRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/feedback/admin/all{?Area*,BusinessId*,ContinuationToken*,CreatedEnd*,CreatedStart*,PageSize*,Search*,Status*,Type*}", pathParameters);
    }
    /**
     * Instantiates a new {@link AllRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AllRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/feedback/admin/all{?Area*,BusinessId*,ContinuationToken*,CreatedEnd*,CreatedStart*,PageSize*,Search*,Status*,Type*}", rawUrl);
    }
    /**
     * Lists submitted feedback for admin triage with table search, paging, and sorting in the request body.
     * @param body Options for flexible, efficient, and explicit querying in Cosmos DB or similar repositories.
     * @return a {@link PagedResultOfFeedbackResponse}
     * @throws ProblemDetails When receiving a 401 status code
     */
    @jakarta.annotation.Nullable
    public PagedResultOfFeedbackResponse post(@jakarta.annotation.Nonnull final RequestDataOptions body) {
        return post(body, null);
    }
    /**
     * Lists submitted feedback for admin triage with table search, paging, and sorting in the request body.
     * @param body Options for flexible, efficient, and explicit querying in Cosmos DB or similar repositories.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PagedResultOfFeedbackResponse}
     * @throws ProblemDetails When receiving a 401 status code
     */
    @jakarta.annotation.Nullable
    public PagedResultOfFeedbackResponse post(@jakarta.annotation.Nonnull final RequestDataOptions body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("401", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PagedResultOfFeedbackResponse::createFromDiscriminatorValue);
    }
    /**
     * Lists submitted feedback for admin triage with table search, paging, and sorting in the request body.
     * @param body Options for flexible, efficient, and explicit querying in Cosmos DB or similar repositories.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RequestDataOptions body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Lists submitted feedback for admin triage with table search, paging, and sorting in the request body.
     * @param body Options for flexible, efficient, and explicit querying in Cosmos DB or similar repositories.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RequestDataOptions body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link AllRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AllRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AllRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Lists submitted feedback for admin triage with table search, paging, and sorting in the request body.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostQueryParameters implements QueryParameters {
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public PostQueryParameters queryParameters = new PostQueryParameters();
    }
}
