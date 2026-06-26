package ai.leadping.openapi.users;

import ai.leadping.openapi.users.changebillingplan.ChangeBillingPlanRequestBuilder;
import ai.leadping.openapi.users.compliance.ComplianceRequestBuilder;
import ai.leadping.openapi.users.me.MeRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /users
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UsersRequestBuilder extends BaseRequestBuilder {
    /**
     * The changeBillingPlan property
     * @return a {@link ChangeBillingPlanRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChangeBillingPlanRequestBuilder changeBillingPlan() {
        return new ChangeBillingPlanRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The compliance property
     * @return a {@link ComplianceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ComplianceRequestBuilder compliance() {
        return new ComplianceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The me property
     * @return a {@link MeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MeRequestBuilder me() {
        return new MeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link UsersRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UsersRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users", pathParameters);
    }
    /**
     * Instantiates a new {@link UsersRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UsersRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users", rawUrl);
    }
}
