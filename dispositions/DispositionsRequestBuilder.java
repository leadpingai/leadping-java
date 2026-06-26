package ai.leadping.openapi.dispositions;

import ai.leadping.openapi.dispositions.item.DispositionsItemRequestBuilder;
import ai.leadping.openapi.dispositions.lead.LeadRequestBuilder;
import ai.leadping.openapi.models.DispositionRequest;
import ai.leadping.openapi.models.DispositionResponse;
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
 * Builds and executes requests for operations under /dispositions
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DispositionsRequestBuilder extends BaseRequestBuilder {
    /**
     * The lead property
     * @return a {@link LeadRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LeadRequestBuilder lead() {
        return new LeadRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the ai.leadping.openapi.dispositions.item collection
     * @param id The ID of the disposition.
     * @return a {@link DispositionsItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DispositionsItemRequestBuilder byId(@jakarta.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new DispositionsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link DispositionsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DispositionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dispositions", pathParameters);
    }
    /**
     * Instantiates a new {@link DispositionsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DispositionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dispositions", rawUrl);
    }
    /**
     * Sets a lead&apos;s current structured outcome while recording the disposition change in history for audit, automation, and reporting.
     * @param body Request model for creating or updating a disposition.
     * @return a {@link DispositionResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 404 status code
     */
    @jakarta.annotation.Nullable
    public DispositionResponse post(@jakarta.annotation.Nonnull final DispositionRequest body) {
        return post(body, null);
    }
    /**
     * Sets a lead&apos;s current structured outcome while recording the disposition change in history for audit, automation, and reporting.
     * @param body Request model for creating or updating a disposition.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DispositionResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 404 status code
     */
    @jakarta.annotation.Nullable
    public DispositionResponse post(@jakarta.annotation.Nonnull final DispositionRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("404", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DispositionResponse::createFromDiscriminatorValue);
    }
    /**
     * Sets a lead&apos;s current structured outcome while recording the disposition change in history for audit, automation, and reporting.
     * @param body Request model for creating or updating a disposition.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DispositionRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Sets a lead&apos;s current structured outcome while recording the disposition change in history for audit, automation, and reporting.
     * @param body Request model for creating or updating a disposition.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DispositionRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link DispositionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DispositionsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DispositionsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
