package ai.leadping.openapi.sms.media;

import ai.leadping.openapi.models.MessageMediaAttachment;
import ai.leadping.openapi.models.ProblemDetails;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.MultipartBody;
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
 * Builds and executes requests for operations under /sms/media
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MediaRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MediaRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MediaRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sms/media", pathParameters);
    }
    /**
     * Instantiates a new {@link MediaRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MediaRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sms/media", rawUrl);
    }
    /**
     * Uploads and validates one media attachment, returning the metadata needed to include the asset in a subsequent Leadping MMS send.
     * @param body The request body
     * @return a {@link MessageMediaAttachment}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 403 status code
     * @throws ProblemDetails When receiving a 429 status code
     */
    @jakarta.annotation.Nullable
    public MessageMediaAttachment post(@jakarta.annotation.Nonnull final MultipartBody body) {
        return post(body, null);
    }
    /**
     * Uploads and validates one media attachment, returning the metadata needed to include the asset in a subsequent Leadping MMS send.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link MessageMediaAttachment}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 403 status code
     * @throws ProblemDetails When receiving a 429 status code
     */
    @jakarta.annotation.Nullable
    public MessageMediaAttachment post(@jakarta.annotation.Nonnull final MultipartBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("401", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("403", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("429", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, MessageMediaAttachment::createFromDiscriminatorValue);
    }
    /**
     * Uploads and validates one media attachment, returning the metadata needed to include the asset in a subsequent Leadping MMS send.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final MultipartBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Uploads and validates one media attachment, returning the metadata needed to include the asset in a subsequent Leadping MMS send.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final MultipartBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "text/plain;q=0.9");
        requestInfo.setContentFromParsable(requestAdapter, "multipart/form-data", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link MediaRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MediaRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MediaRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
