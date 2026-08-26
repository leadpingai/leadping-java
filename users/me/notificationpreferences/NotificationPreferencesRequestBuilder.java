package ai.leadping.openapi.users.me.notificationpreferences;

import ai.leadping.openapi.models.ProblemDetails;
import ai.leadping.openapi.models.UserNotificationPreferences;
import ai.leadping.openapi.models.UserResponse;
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
 * Builds and executes requests for operations under /users/me/notification-preferences
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NotificationPreferencesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link NotificationPreferencesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NotificationPreferencesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/me/notification-preferences", pathParameters);
    }
    /**
     * Instantiates a new {@link NotificationPreferencesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NotificationPreferencesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/me/notification-preferences", rawUrl);
    }
    /**
     * Replaces the notification channel and delivery preferences stored for the authenticated user.
     * @param body Describes user notification preferences data used in Leadping API requests and responses.
     * @return a {@link UserResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 429 status code
     */
    @jakarta.annotation.Nullable
    public UserResponse put(@jakarta.annotation.Nonnull final UserNotificationPreferences body) {
        return put(body, null);
    }
    /**
     * Replaces the notification channel and delivery preferences stored for the authenticated user.
     * @param body Describes user notification preferences data used in Leadping API requests and responses.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link UserResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 429 status code
     */
    @jakarta.annotation.Nullable
    public UserResponse put(@jakarta.annotation.Nonnull final UserNotificationPreferences body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("401", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("429", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, UserResponse::createFromDiscriminatorValue);
    }
    /**
     * Replaces the notification channel and delivery preferences stored for the authenticated user.
     * @param body Describes user notification preferences data used in Leadping API requests and responses.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UserNotificationPreferences body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Replaces the notification channel and delivery preferences stored for the authenticated user.
     * @param body Describes user notification preferences data used in Leadping API requests and responses.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UserNotificationPreferences body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a {@link NotificationPreferencesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NotificationPreferencesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new NotificationPreferencesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
