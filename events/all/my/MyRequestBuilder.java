package ai.leadping.openapi.events.all.my;

import ai.leadping.openapi.models.PagedResultOfEventTableRow;
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
 * Builds and executes requests for operations under /events/all/my
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MyRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MyRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/events/all/my{?category*,endAt*,startAt*}", pathParameters);
    }
    /**
     * Instantiates a new {@link MyRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/events/all/my{?category*,endAt*,startAt*}", rawUrl);
    }
    /**
     * Lists event records visible to the current user with paging, sorting, and filters across lead, SMS, call, and automation events.
     * @param body Options for flexible, efficient, and explicit querying in Cosmos DB or similar repositories.
     * @return a {@link PagedResultOfEventTableRow}
     * @throws ProblemDetails When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public PagedResultOfEventTableRow post(@jakarta.annotation.Nonnull final RequestDataOptions body) {
        return post(body, null);
    }
    /**
     * Lists event records visible to the current user with paging, sorting, and filters across lead, SMS, call, and automation events.
     * @param body Options for flexible, efficient, and explicit querying in Cosmos DB or similar repositories.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PagedResultOfEventTableRow}
     * @throws ProblemDetails When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public PagedResultOfEventTableRow post(@jakarta.annotation.Nonnull final RequestDataOptions body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PagedResultOfEventTableRow::createFromDiscriminatorValue);
    }
    /**
     * Lists event records visible to the current user with paging, sorting, and filters across lead, SMS, call, and automation events.
     * @param body Options for flexible, efficient, and explicit querying in Cosmos DB or similar repositories.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RequestDataOptions body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Lists event records visible to the current user with paging, sorting, and filters across lead, SMS, call, and automation events.
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
     * @return a {@link MyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MyRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MyRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Lists event records visible to the current user with paging, sorting, and filters across lead, SMS, call, and automation events.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public String category;
        @jakarta.annotation.Nullable
        public OffsetDateTime endAt;
        @jakarta.annotation.Nullable
        public OffsetDateTime startAt;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("category", category);
            allQueryParams.put("endAt", endAt);
            allQueryParams.put("startAt", startAt);
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
