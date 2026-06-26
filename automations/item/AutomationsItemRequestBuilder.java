package ai.leadping.openapi.automations.item;

import ai.leadping.openapi.models.AutomationRequest;
import ai.leadping.openapi.models.AutomationResponse;
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
 * Builds and executes requests for operations under /automations/{id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomationsItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link AutomationsItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AutomationsItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/automations/{id}", pathParameters);
    }
    /**
     * Instantiates a new {@link AutomationsItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AutomationsItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/automations/{id}", rawUrl);
    }
    /**
     * Deletes an automation for the current business so it no longer schedules follow-up or routing work for captured leads.
     * @return a {@link Boolean}
     * @throws ProblemDetails When receiving a 404 status code
     */
    @jakarta.annotation.Nullable
    public Boolean delete() {
        return delete(null);
    }
    /**
     * Deletes an automation for the current business so it no longer schedules follow-up or routing work for captured leads.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Boolean}
     * @throws ProblemDetails When receiving a 404 status code
     */
    @jakarta.annotation.Nullable
    public Boolean delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("404", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Boolean.class);
    }
    /**
     * Returns one automation for the current business, including trigger criteria, message steps, routing settings, and enabled state.
     * @return a {@link AutomationResponse}
     * @throws ProblemDetails When receiving a 404 status code
     */
    @jakarta.annotation.Nullable
    public AutomationResponse get() {
        return get(null);
    }
    /**
     * Returns one automation for the current business, including trigger criteria, message steps, routing settings, and enabled state.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AutomationResponse}
     * @throws ProblemDetails When receiving a 404 status code
     */
    @jakarta.annotation.Nullable
    public AutomationResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("404", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AutomationResponse::createFromDiscriminatorValue);
    }
    /**
     * Updates an automation for current-business leads, changing triggers, message steps, routing, or active follow-up settings.
     * @param body Request schema for the Leadping API automation configuration request, including the fields clients can send.
     * @return a {@link AutomationResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 404 status code
     */
    @jakarta.annotation.Nullable
    public AutomationResponse put(@jakarta.annotation.Nonnull final AutomationRequest body) {
        return put(body, null);
    }
    /**
     * Updates an automation for current-business leads, changing triggers, message steps, routing, or active follow-up settings.
     * @param body Request schema for the Leadping API automation configuration request, including the fields clients can send.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AutomationResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 404 status code
     */
    @jakarta.annotation.Nullable
    public AutomationResponse put(@jakarta.annotation.Nonnull final AutomationRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("404", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AutomationResponse::createFromDiscriminatorValue);
    }
    /**
     * Deletes an automation for the current business so it no longer schedules follow-up or routing work for captured leads.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Deletes an automation for the current business so it no longer schedules follow-up or routing work for captured leads.
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
     * Returns one automation for the current business, including trigger criteria, message steps, routing settings, and enabled state.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns one automation for the current business, including trigger criteria, message steps, routing settings, and enabled state.
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
     * Updates an automation for current-business leads, changing triggers, message steps, routing, or active follow-up settings.
     * @param body Request schema for the Leadping API automation configuration request, including the fields clients can send.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final AutomationRequest body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Updates an automation for current-business leads, changing triggers, message steps, routing, or active follow-up settings.
     * @param body Request schema for the Leadping API automation configuration request, including the fields clients can send.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final AutomationRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link AutomationsItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AutomationsItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AutomationsItemRequestBuilder(rawUrl, requestAdapter);
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
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
