package ai.leadping.openapi.users.me;

import ai.leadping.openapi.models.ProblemDetails;
import ai.leadping.openapi.models.UserRequest;
import ai.leadping.openapi.models.UserResponse;
import ai.leadping.openapi.users.me.lastlogin.LastLoginRequestBuilder;
import ai.leadping.openapi.users.me.paymentmethod.PaymentmethodRequestBuilder;
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
 * Builds and executes requests for operations under /users/me
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MeRequestBuilder extends BaseRequestBuilder {
    /**
     * The lastLogin property
     * @return a {@link LastLoginRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LastLoginRequestBuilder lastLogin() {
        return new LastLoginRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The paymentmethod property
     * @return a {@link PaymentmethodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PaymentmethodRequestBuilder paymentmethod() {
        return new PaymentmethodRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link MeRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/me", pathParameters);
    }
    /**
     * Instantiates a new {@link MeRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/me", rawUrl);
    }
    /**
     * Returns the current user&apos;s profile, roles, business context, billing state, and compliance settings for portal sessions.
     * @return a {@link UserResponse}
     * @throws ProblemDetails When receiving a 404 status code
     */
    @jakarta.annotation.Nullable
    public UserResponse get() {
        return get(null);
    }
    /**
     * Returns the current user&apos;s profile, roles, business context, billing state, and compliance settings for portal sessions.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link UserResponse}
     * @throws ProblemDetails When receiving a 404 status code
     */
    @jakarta.annotation.Nullable
    public UserResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("404", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, UserResponse::createFromDiscriminatorValue);
    }
    /**
     * Updates the current user&apos;s profile fields, contact details, preferences, or business context used across Leadping.
     * @param body Request schema for the Leadping API user profile request, including the fields clients can send.
     * @return a {@link UserResponse}
     * @throws ProblemDetails When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public UserResponse put(@jakarta.annotation.Nonnull final UserRequest body) {
        return put(body, null);
    }
    /**
     * Updates the current user&apos;s profile fields, contact details, preferences, or business context used across Leadping.
     * @param body Request schema for the Leadping API user profile request, including the fields clients can send.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link UserResponse}
     * @throws ProblemDetails When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public UserResponse put(@jakarta.annotation.Nonnull final UserRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, UserResponse::createFromDiscriminatorValue);
    }
    /**
     * Returns the current user&apos;s profile, roles, business context, billing state, and compliance settings for portal sessions.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns the current user&apos;s profile, roles, business context, billing state, and compliance settings for portal sessions.
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
     * Updates the current user&apos;s profile fields, contact details, preferences, or business context used across Leadping.
     * @param body Request schema for the Leadping API user profile request, including the fields clients can send.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UserRequest body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Updates the current user&apos;s profile fields, contact details, preferences, or business context used across Leadping.
     * @param body Request schema for the Leadping API user profile request, including the fields clients can send.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UserRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a {@link MeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MeRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MeRequestBuilder(rawUrl, requestAdapter);
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
