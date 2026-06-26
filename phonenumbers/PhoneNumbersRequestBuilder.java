package ai.leadping.openapi.phonenumbers;

import ai.leadping.openapi.models.PhoneNumberRequest;
import ai.leadping.openapi.models.PhoneNumberResponse;
import ai.leadping.openapi.models.ProblemDetails;
import ai.leadping.openapi.phonenumbers.all.AllRequestBuilder;
import ai.leadping.openapi.phonenumbers.isavailableforpurchase.IsAvailableForPurchaseRequestBuilder;
import ai.leadping.openapi.phonenumbers.item.PhoneNumberItemRequestBuilder;
import ai.leadping.openapi.phonenumbers.outgoing.OutgoingRequestBuilder;
import ai.leadping.openapi.phonenumbers.search.SearchRequestBuilder;
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
 * Builds and executes requests for operations under /phone-numbers
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumbersRequestBuilder extends BaseRequestBuilder {
    /**
     * The all property
     * @return a {@link AllRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AllRequestBuilder all() {
        return new AllRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The isAvailableForPurchase property
     * @return a {@link IsAvailableForPurchaseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IsAvailableForPurchaseRequestBuilder isAvailableForPurchase() {
        return new IsAvailableForPurchaseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The outgoing property
     * @return a {@link OutgoingRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OutgoingRequestBuilder outgoing() {
        return new OutgoingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The search property
     * @return a {@link SearchRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SearchRequestBuilder search() {
        return new SearchRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the ai.leadping.openapi.phoneNumbers.item collection
     * @param phoneNumberId The phone number identifier.
     * @return a {@link PhoneNumberItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PhoneNumberItemRequestBuilder byPhoneNumberId(@jakarta.annotation.Nonnull final String phoneNumberId) {
        Objects.requireNonNull(phoneNumberId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("phoneNumber%2Did", phoneNumberId);
        return new PhoneNumberItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link PhoneNumbersRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PhoneNumbersRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/phone-numbers", pathParameters);
    }
    /**
     * Instantiates a new {@link PhoneNumbersRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PhoneNumbersRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/phone-numbers", rawUrl);
    }
    /**
     * Purchases or creates a phone number for the current business so it can be assigned to messaging, calls, and lead follow-up.
     * @param body Request schema for the Leadping API phone number update request, including the fields clients can send.
     * @return a {@link PhoneNumberResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PhoneNumberResponse post(@jakarta.annotation.Nonnull final PhoneNumberRequest body) {
        return post(body, null);
    }
    /**
     * Purchases or creates a phone number for the current business so it can be assigned to messaging, calls, and lead follow-up.
     * @param body Request schema for the Leadping API phone number update request, including the fields clients can send.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PhoneNumberResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PhoneNumberResponse post(@jakarta.annotation.Nonnull final PhoneNumberRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("500", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PhoneNumberResponse::createFromDiscriminatorValue);
    }
    /**
     * Purchases or creates a phone number for the current business so it can be assigned to messaging, calls, and lead follow-up.
     * @param body Request schema for the Leadping API phone number update request, including the fields clients can send.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PhoneNumberRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Purchases or creates a phone number for the current business so it can be assigned to messaging, calls, and lead follow-up.
     * @param body Request schema for the Leadping API phone number update request, including the fields clients can send.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PhoneNumberRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link PhoneNumbersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PhoneNumbersRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PhoneNumbersRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
