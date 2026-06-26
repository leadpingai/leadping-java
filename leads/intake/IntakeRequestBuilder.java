package ai.leadping.openapi.leads.intake;

import ai.leadping.openapi.models.LeadIntakeRequest;
import ai.leadping.openapi.models.LeadResponse;
import ai.leadping.openapi.models.ProblemDetails;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /leads/intake
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IntakeRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link IntakeRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IntakeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/leads/intake{?Address1*,Address2*,BirthDate*,City*,DateOfBirth*,DirectPostPrice*,Email*,ExternalId*,FirstName*,Gender*,LandingPage*,LastName*,Phone*,PhoneType*,PostalCode*,Price*,Product*,Referrer*,SellerLeadId*,SellerLeadIdentifier*,SourceMetadata*,State*,SubId*,TagIds*,TagNames*,TrustedFormUrl*,UtmCampaign*,UtmContent*,UtmMedium*,UtmSource*,UtmTerm*,Vertical*,Zip*,sourceKey*}", pathParameters);
    }
    /**
     * Instantiates a new {@link IntakeRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IntakeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/leads/intake{?Address1*,Address2*,BirthDate*,City*,DateOfBirth*,DirectPostPrice*,Email*,ExternalId*,FirstName*,Gender*,LandingPage*,LastName*,Phone*,PhoneType*,PostalCode*,Price*,Product*,Referrer*,SellerLeadId*,SellerLeadIdentifier*,SourceMetadata*,State*,SubId*,TagIds*,TagNames*,TrustedFormUrl*,UtmCampaign*,UtmContent*,UtmMedium*,UtmSource*,UtmTerm*,Vertical*,Zip*,sourceKey*}", rawUrl);
    }
    /**
     * Creates a source-authenticated lead from query parameters, supporting simple form posts, tracking metadata, and follow-up automation.
     * @return a {@link LeadResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 403 status code
     */
    @jakarta.annotation.Nullable
    public LeadResponse get() {
        return get(null);
    }
    /**
     * Creates a source-authenticated lead from query parameters, supporting simple form posts, tracking metadata, and follow-up automation.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link LeadResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 403 status code
     */
    @jakarta.annotation.Nullable
    public LeadResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("401", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("403", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, LeadResponse::createFromDiscriminatorValue);
    }
    /**
     * Creates a source-authenticated lead from a flat intake payload, capturing contact fields, metadata, and automation-ready lead details.
     * @param body Request schema for the Leadping API lead intake request, including the fields clients can send.
     * @return a {@link LeadResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 403 status code
     */
    @jakarta.annotation.Nullable
    public LeadResponse post(@jakarta.annotation.Nonnull final LeadIntakeRequest body) {
        return post(body, null);
    }
    /**
     * Creates a source-authenticated lead from a flat intake payload, capturing contact fields, metadata, and automation-ready lead details.
     * @param body Request schema for the Leadping API lead intake request, including the fields clients can send.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link LeadResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 403 status code
     */
    @jakarta.annotation.Nullable
    public LeadResponse post(@jakarta.annotation.Nonnull final LeadIntakeRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("401", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("403", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, LeadResponse::createFromDiscriminatorValue);
    }
    /**
     * Creates a source-authenticated lead from query parameters, supporting simple form posts, tracking metadata, and follow-up automation.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Creates a source-authenticated lead from query parameters, supporting simple form posts, tracking metadata, and follow-up automation.
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
     * Creates a source-authenticated lead from a flat intake payload, capturing contact fields, metadata, and automation-ready lead details.
     * @param body Request schema for the Leadping API lead intake request, including the fields clients can send.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final LeadIntakeRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Creates a source-authenticated lead from a flat intake payload, capturing contact fields, metadata, and automation-ready lead details.
     * @param body Request schema for the Leadping API lead intake request, including the fields clients can send.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final LeadIntakeRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link IntakeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IntakeRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new IntakeRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Creates a source-authenticated lead from query parameters, supporting simple form posts, tracking metadata, and follow-up automation.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * First street address line submitted by the lead intake source.
         */
        @jakarta.annotation.Nullable
        public String address1;
        /**
         * Second street address line submitted by the lead intake source.
         */
        @jakarta.annotation.Nullable
        public String address2;
        /**
         * Lead birth date used for demographic matching and insurance intake workflows.
         */
        @jakarta.annotation.Nullable
        public LocalDate birthDate;
        /**
         * City for the lead or business postal address.
         */
        @jakarta.annotation.Nullable
        public String city;
        /**
         * Lead date of birth supplied by intake sources and normalized into the lead profile.
         */
        @jakarta.annotation.Nullable
        public LocalDate dateOfBirth;
        /**
         * Direct-post price supplied by the lead source during intake.
         */
        @jakarta.annotation.Nullable
        public Double directPostPrice;
        /**
         * Email address for the person represented by this lead intake request.
         */
        @jakarta.annotation.Nullable
        public String email;
        /**
         * External system identifier used to reconcile this lead intake request across integrations.
         */
        @jakarta.annotation.Nullable
        public String externalId;
        /**
         * First name of the lead, user, or contact represented by this lead intake request.
         */
        @jakarta.annotation.Nullable
        public String firstName;
        /**
         * Lead gender supplied by intake sources and normalized when possible.
         */
        @jakarta.annotation.Nullable
        public String gender;
        /**
         * Landing page URL where the lead submitted their information.
         */
        @jakarta.annotation.Nullable
        public String landingPage;
        /**
         * Last name of the lead, user, or contact represented by this lead intake request.
         */
        @jakarta.annotation.Nullable
        public String lastName;
        /**
         * Phone details for the lead, user, or business represented by this lead intake request.
         */
        @jakarta.annotation.Nullable
        public String phone;
        /**
         * Source-provided phone type, such as mobile, landline, or VoIP, used during lead intake normalization.
         */
        @jakarta.annotation.Nullable
        public String phoneType;
        /**
         * Postal code for the lead or business address.
         */
        @jakarta.annotation.Nullable
        public String postalCode;
        /**
         * Lead price or transaction price supplied to the Leadping API.
         */
        @jakarta.annotation.Nullable
        public Double price;
        /**
         * Product or offer associated with the lead or source.
         */
        @jakarta.annotation.Nullable
        public String product;
        /**
         * Referring page or traffic source that sent the lead into Leadping.
         */
        @jakarta.annotation.Nullable
        public String referrer;
        /**
         * Seller-provided lead identifier used to deduplicate and reconcile lead delivery.
         */
        @jakarta.annotation.Nullable
        public String sellerLeadId;
        /**
         * Alternate seller-provided lead identifier used during intake normalization.
         */
        @jakarta.annotation.Nullable
        public String sellerLeadIdentifier;
        /**
         * The Leadping source key supplied as a query string parameter.
         */
        @jakarta.annotation.Nullable
        public String sourceKey;
        /**
         * Source-provided key-value metadata retained for lead attribution and integration troubleshooting.
         */
        @jakarta.annotation.Nullable
        public String sourceMetadata;
        /**
         * State, province, or region for the lead or business postal address.
         */
        @jakarta.annotation.Nullable
        public String state;
        /**
         * Affiliate or publisher sub ID captured for lead attribution.
         */
        @jakarta.annotation.Nullable
        public String subId;
        /**
         * Tag IDs assigned to or filtered against this lead.
         */
        @jakarta.annotation.Nullable
        public String[] tagIds;
        /**
         * Tag names assigned to this lead when matching existing tags by name.
         */
        @jakarta.annotation.Nullable
        public String[] tagNames;
        /**
         * TrustedForm certificate URL used as proof of consumer consent.
         */
        @jakarta.annotation.Nullable
        public String trustedFormUrl;
        /**
         * UTM campaign parameter captured for lead attribution reporting.
         */
        @jakarta.annotation.Nullable
        public String utmCampaign;
        /**
         * UTM content parameter captured for lead attribution reporting.
         */
        @jakarta.annotation.Nullable
        public String utmContent;
        /**
         * UTM medium parameter captured for lead attribution reporting.
         */
        @jakarta.annotation.Nullable
        public String utmMedium;
        /**
         * UTM source parameter captured for lead attribution reporting.
         */
        @jakarta.annotation.Nullable
        public String utmSource;
        /**
         * UTM term parameter captured for lead attribution reporting.
         */
        @jakarta.annotation.Nullable
        public String utmTerm;
        /**
         * Industry vertical used for lead routing, compliance review, and reporting.
         */
        @jakarta.annotation.Nullable
        public String vertical;
        /**
         * ZIP code submitted by the lead intake source.
         */
        @jakarta.annotation.Nullable
        public String zip;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("Address1", address1);
            allQueryParams.put("Address2", address2);
            allQueryParams.put("BirthDate", birthDate);
            allQueryParams.put("City", city);
            allQueryParams.put("DateOfBirth", dateOfBirth);
            allQueryParams.put("DirectPostPrice", directPostPrice);
            allQueryParams.put("Email", email);
            allQueryParams.put("ExternalId", externalId);
            allQueryParams.put("FirstName", firstName);
            allQueryParams.put("Gender", gender);
            allQueryParams.put("LandingPage", landingPage);
            allQueryParams.put("LastName", lastName);
            allQueryParams.put("Phone", phone);
            allQueryParams.put("PhoneType", phoneType);
            allQueryParams.put("PostalCode", postalCode);
            allQueryParams.put("Price", price);
            allQueryParams.put("Product", product);
            allQueryParams.put("Referrer", referrer);
            allQueryParams.put("SellerLeadId", sellerLeadId);
            allQueryParams.put("SellerLeadIdentifier", sellerLeadIdentifier);
            allQueryParams.put("sourceKey", sourceKey);
            allQueryParams.put("SourceMetadata", sourceMetadata);
            allQueryParams.put("State", state);
            allQueryParams.put("SubId", subId);
            allQueryParams.put("TrustedFormUrl", trustedFormUrl);
            allQueryParams.put("UtmCampaign", utmCampaign);
            allQueryParams.put("UtmContent", utmContent);
            allQueryParams.put("UtmMedium", utmMedium);
            allQueryParams.put("UtmSource", utmSource);
            allQueryParams.put("UtmTerm", utmTerm);
            allQueryParams.put("Vertical", vertical);
            allQueryParams.put("Zip", zip);
            allQueryParams.put("TagIds", tagIds);
            allQueryParams.put("TagNames", tagNames);
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
    /**
     * Creates a source-authenticated lead from a flat intake payload, capturing contact fields, metadata, and automation-ready lead details.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostQueryParameters implements QueryParameters {
        /**
         * The Leadping source key supplied as a query string parameter.
         */
        @jakarta.annotation.Nullable
        public String sourceKey;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("sourceKey", sourceKey);
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
