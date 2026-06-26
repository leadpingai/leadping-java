package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Response schema for the Leadping API feedback item response returned to authenticated clients.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeedbackResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Internal admin note used to track feedback review or resolution.
     */
    private String adminNote;
    /**
     * Indicates whether the submitter permits Leadping support to contact them about the feedback.
     */
    private Boolean allowContact;
    /**
     * Product area or app section connected to this feedback item response.
     */
    private String area;
    /**
     * Business ID connected to the feedback item, when the feedback came from a business workspace.
     */
    private String businessId;
    /**
     * Business name snapshot captured when the user submitted the feedback.
     */
    private String businessNameSnapshot;
    /**
     * Client application version that submitted this feedback item response.
     */
    private String clientVersion;
    /**
     * UTC timestamp when this feedback item response was closed.
     */
    private OffsetDateTime closedAt;
    /**
     * User ID of the person who closed this item.
     */
    private String closedByUserId;
    /**
     * UTC timestamp when this feedback item response was created.
     */
    private OffsetDateTime createdAt;
    /**
     * Feedback item ID that this item duplicates, when applicable.
     */
    private String duplicateOfFeedbackItemId;
    /**
     * Deployment environment where this feedback item response was captured or processed.
     */
    private String environment;
    /**
     * External issue tracker URL linked to this feedback item.
     */
    private String externalIssueUrl;
    /**
     * Unique Leadping identifier for this feedback item response.
     */
    private String id;
    /**
     * Message text supplied by the user or returned by the Leadping API for this feedback item response.
     */
    private String message;
    /**
     * UTC timestamp when an admin reviewed this feedback item response.
     */
    private OffsetDateTime reviewedAt;
    /**
     * User ID of the admin who reviewed this item.
     */
    private String reviewedByUserId;
    /**
     * Application route where this feedback item response originated or should direct the user.
     */
    private String route;
    /**
     * Leadping API server version that processed this feedback item response.
     */
    private String serverVersion;
    /**
     * Current lifecycle status for this feedback item response in the Leadping API.
     */
    private FeedbackStatus status;
    /**
     * Billing plan snapshot captured when the user submitted the feedback.
     */
    private String subscriptionPlanSnapshot;
    /**
     * Type classification used to route and interpret this feedback item response in the Leadping API.
     */
    private FeedbackType type;
    /**
     * Browser or client user agent captured when this feedback item response was submitted.
     */
    private String userAgent;
    /**
     * User display name snapshot captured when the user submitted the feedback.
     */
    private String userDisplayNameSnapshot;
    /**
     * User email snapshot captured when the user submitted the feedback.
     */
    private String userEmailSnapshot;
    /**
     * User ID for the person who submitted the feedback.
     */
    private String userId;
    /**
     * Instantiates a new {@link FeedbackResponse} and sets the default values.
     */
    public FeedbackResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FeedbackResponse}
     */
    @jakarta.annotation.Nonnull
    public static FeedbackResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FeedbackResponse();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the adminNote property value. Internal admin note used to track feedback review or resolution.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdminNote() {
        return this.adminNote;
    }
    /**
     * Gets the allowContact property value. Indicates whether the submitter permits Leadping support to contact them about the feedback.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowContact() {
        return this.allowContact;
    }
    /**
     * Gets the area property value. Product area or app section connected to this feedback item response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getArea() {
        return this.area;
    }
    /**
     * Gets the businessId property value. Business ID connected to the feedback item, when the feedback came from a business workspace.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessId() {
        return this.businessId;
    }
    /**
     * Gets the businessNameSnapshot property value. Business name snapshot captured when the user submitted the feedback.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessNameSnapshot() {
        return this.businessNameSnapshot;
    }
    /**
     * Gets the clientVersion property value. Client application version that submitted this feedback item response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientVersion() {
        return this.clientVersion;
    }
    /**
     * Gets the closedAt property value. UTC timestamp when this feedback item response was closed.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getClosedAt() {
        return this.closedAt;
    }
    /**
     * Gets the closedByUserId property value. User ID of the person who closed this item.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClosedByUserId() {
        return this.closedByUserId;
    }
    /**
     * Gets the createdAt property value. UTC timestamp when this feedback item response was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the duplicateOfFeedbackItemId property value. Feedback item ID that this item duplicates, when applicable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDuplicateOfFeedbackItemId() {
        return this.duplicateOfFeedbackItemId;
    }
    /**
     * Gets the environment property value. Deployment environment where this feedback item response was captured or processed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEnvironment() {
        return this.environment;
    }
    /**
     * Gets the externalIssueUrl property value. External issue tracker URL linked to this feedback item.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalIssueUrl() {
        return this.externalIssueUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(25);
        deserializerMap.put("adminNote", (n) -> { this.setAdminNote(n.getStringValue()); });
        deserializerMap.put("allowContact", (n) -> { this.setAllowContact(n.getBooleanValue()); });
        deserializerMap.put("area", (n) -> { this.setArea(n.getStringValue()); });
        deserializerMap.put("businessId", (n) -> { this.setBusinessId(n.getStringValue()); });
        deserializerMap.put("businessNameSnapshot", (n) -> { this.setBusinessNameSnapshot(n.getStringValue()); });
        deserializerMap.put("clientVersion", (n) -> { this.setClientVersion(n.getStringValue()); });
        deserializerMap.put("closedAt", (n) -> { this.setClosedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("closedByUserId", (n) -> { this.setClosedByUserId(n.getStringValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("duplicateOfFeedbackItemId", (n) -> { this.setDuplicateOfFeedbackItemId(n.getStringValue()); });
        deserializerMap.put("environment", (n) -> { this.setEnvironment(n.getStringValue()); });
        deserializerMap.put("externalIssueUrl", (n) -> { this.setExternalIssueUrl(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("reviewedAt", (n) -> { this.setReviewedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("reviewedByUserId", (n) -> { this.setReviewedByUserId(n.getStringValue()); });
        deserializerMap.put("route", (n) -> { this.setRoute(n.getStringValue()); });
        deserializerMap.put("serverVersion", (n) -> { this.setServerVersion(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(FeedbackStatus::forValue)); });
        deserializerMap.put("subscriptionPlanSnapshot", (n) -> { this.setSubscriptionPlanSnapshot(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(FeedbackType::forValue)); });
        deserializerMap.put("userAgent", (n) -> { this.setUserAgent(n.getStringValue()); });
        deserializerMap.put("userDisplayNameSnapshot", (n) -> { this.setUserDisplayNameSnapshot(n.getStringValue()); });
        deserializerMap.put("userEmailSnapshot", (n) -> { this.setUserEmailSnapshot(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique Leadping identifier for this feedback item response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the message property value. Message text supplied by the user or returned by the Leadping API for this feedback item response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the reviewedAt property value. UTC timestamp when an admin reviewed this feedback item response.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReviewedAt() {
        return this.reviewedAt;
    }
    /**
     * Gets the reviewedByUserId property value. User ID of the admin who reviewed this item.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReviewedByUserId() {
        return this.reviewedByUserId;
    }
    /**
     * Gets the route property value. Application route where this feedback item response originated or should direct the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRoute() {
        return this.route;
    }
    /**
     * Gets the serverVersion property value. Leadping API server version that processed this feedback item response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServerVersion() {
        return this.serverVersion;
    }
    /**
     * Gets the status property value. Current lifecycle status for this feedback item response in the Leadping API.
     * @return a {@link FeedbackStatus}
     */
    @jakarta.annotation.Nullable
    public FeedbackStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the subscriptionPlanSnapshot property value. Billing plan snapshot captured when the user submitted the feedback.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubscriptionPlanSnapshot() {
        return this.subscriptionPlanSnapshot;
    }
    /**
     * Gets the type property value. Type classification used to route and interpret this feedback item response in the Leadping API.
     * @return a {@link FeedbackType}
     */
    @jakarta.annotation.Nullable
    public FeedbackType getType() {
        return this.type;
    }
    /**
     * Gets the userAgent property value. Browser or client user agent captured when this feedback item response was submitted.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserAgent() {
        return this.userAgent;
    }
    /**
     * Gets the userDisplayNameSnapshot property value. User display name snapshot captured when the user submitted the feedback.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserDisplayNameSnapshot() {
        return this.userDisplayNameSnapshot;
    }
    /**
     * Gets the userEmailSnapshot property value. User email snapshot captured when the user submitted the feedback.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserEmailSnapshot() {
        return this.userEmailSnapshot;
    }
    /**
     * Gets the userId property value. User ID for the person who submitted the feedback.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("adminNote", this.getAdminNote());
        writer.writeBooleanValue("allowContact", this.getAllowContact());
        writer.writeStringValue("area", this.getArea());
        writer.writeStringValue("businessId", this.getBusinessId());
        writer.writeStringValue("businessNameSnapshot", this.getBusinessNameSnapshot());
        writer.writeStringValue("clientVersion", this.getClientVersion());
        writer.writeOffsetDateTimeValue("closedAt", this.getClosedAt());
        writer.writeStringValue("closedByUserId", this.getClosedByUserId());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("duplicateOfFeedbackItemId", this.getDuplicateOfFeedbackItemId());
        writer.writeStringValue("environment", this.getEnvironment());
        writer.writeStringValue("externalIssueUrl", this.getExternalIssueUrl());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("message", this.getMessage());
        writer.writeOffsetDateTimeValue("reviewedAt", this.getReviewedAt());
        writer.writeStringValue("reviewedByUserId", this.getReviewedByUserId());
        writer.writeStringValue("route", this.getRoute());
        writer.writeStringValue("serverVersion", this.getServerVersion());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("subscriptionPlanSnapshot", this.getSubscriptionPlanSnapshot());
        writer.writeEnumValue("type", this.getType());
        writer.writeStringValue("userAgent", this.getUserAgent());
        writer.writeStringValue("userDisplayNameSnapshot", this.getUserDisplayNameSnapshot());
        writer.writeStringValue("userEmailSnapshot", this.getUserEmailSnapshot());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the adminNote property value. Internal admin note used to track feedback review or resolution.
     * @param value Value to set for the adminNote property.
     */
    public void setAdminNote(@jakarta.annotation.Nullable final String value) {
        this.adminNote = value;
    }
    /**
     * Sets the allowContact property value. Indicates whether the submitter permits Leadping support to contact them about the feedback.
     * @param value Value to set for the allowContact property.
     */
    public void setAllowContact(@jakarta.annotation.Nullable final Boolean value) {
        this.allowContact = value;
    }
    /**
     * Sets the area property value. Product area or app section connected to this feedback item response.
     * @param value Value to set for the area property.
     */
    public void setArea(@jakarta.annotation.Nullable final String value) {
        this.area = value;
    }
    /**
     * Sets the businessId property value. Business ID connected to the feedback item, when the feedback came from a business workspace.
     * @param value Value to set for the businessId property.
     */
    public void setBusinessId(@jakarta.annotation.Nullable final String value) {
        this.businessId = value;
    }
    /**
     * Sets the businessNameSnapshot property value. Business name snapshot captured when the user submitted the feedback.
     * @param value Value to set for the businessNameSnapshot property.
     */
    public void setBusinessNameSnapshot(@jakarta.annotation.Nullable final String value) {
        this.businessNameSnapshot = value;
    }
    /**
     * Sets the clientVersion property value. Client application version that submitted this feedback item response.
     * @param value Value to set for the clientVersion property.
     */
    public void setClientVersion(@jakarta.annotation.Nullable final String value) {
        this.clientVersion = value;
    }
    /**
     * Sets the closedAt property value. UTC timestamp when this feedback item response was closed.
     * @param value Value to set for the closedAt property.
     */
    public void setClosedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.closedAt = value;
    }
    /**
     * Sets the closedByUserId property value. User ID of the person who closed this item.
     * @param value Value to set for the closedByUserId property.
     */
    public void setClosedByUserId(@jakarta.annotation.Nullable final String value) {
        this.closedByUserId = value;
    }
    /**
     * Sets the createdAt property value. UTC timestamp when this feedback item response was created.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the duplicateOfFeedbackItemId property value. Feedback item ID that this item duplicates, when applicable.
     * @param value Value to set for the duplicateOfFeedbackItemId property.
     */
    public void setDuplicateOfFeedbackItemId(@jakarta.annotation.Nullable final String value) {
        this.duplicateOfFeedbackItemId = value;
    }
    /**
     * Sets the environment property value. Deployment environment where this feedback item response was captured or processed.
     * @param value Value to set for the environment property.
     */
    public void setEnvironment(@jakarta.annotation.Nullable final String value) {
        this.environment = value;
    }
    /**
     * Sets the externalIssueUrl property value. External issue tracker URL linked to this feedback item.
     * @param value Value to set for the externalIssueUrl property.
     */
    public void setExternalIssueUrl(@jakarta.annotation.Nullable final String value) {
        this.externalIssueUrl = value;
    }
    /**
     * Sets the id property value. Unique Leadping identifier for this feedback item response.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the message property value. Message text supplied by the user or returned by the Leadping API for this feedback item response.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the reviewedAt property value. UTC timestamp when an admin reviewed this feedback item response.
     * @param value Value to set for the reviewedAt property.
     */
    public void setReviewedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.reviewedAt = value;
    }
    /**
     * Sets the reviewedByUserId property value. User ID of the admin who reviewed this item.
     * @param value Value to set for the reviewedByUserId property.
     */
    public void setReviewedByUserId(@jakarta.annotation.Nullable final String value) {
        this.reviewedByUserId = value;
    }
    /**
     * Sets the route property value. Application route where this feedback item response originated or should direct the user.
     * @param value Value to set for the route property.
     */
    public void setRoute(@jakarta.annotation.Nullable final String value) {
        this.route = value;
    }
    /**
     * Sets the serverVersion property value. Leadping API server version that processed this feedback item response.
     * @param value Value to set for the serverVersion property.
     */
    public void setServerVersion(@jakarta.annotation.Nullable final String value) {
        this.serverVersion = value;
    }
    /**
     * Sets the status property value. Current lifecycle status for this feedback item response in the Leadping API.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final FeedbackStatus value) {
        this.status = value;
    }
    /**
     * Sets the subscriptionPlanSnapshot property value. Billing plan snapshot captured when the user submitted the feedback.
     * @param value Value to set for the subscriptionPlanSnapshot property.
     */
    public void setSubscriptionPlanSnapshot(@jakarta.annotation.Nullable final String value) {
        this.subscriptionPlanSnapshot = value;
    }
    /**
     * Sets the type property value. Type classification used to route and interpret this feedback item response in the Leadping API.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final FeedbackType value) {
        this.type = value;
    }
    /**
     * Sets the userAgent property value. Browser or client user agent captured when this feedback item response was submitted.
     * @param value Value to set for the userAgent property.
     */
    public void setUserAgent(@jakarta.annotation.Nullable final String value) {
        this.userAgent = value;
    }
    /**
     * Sets the userDisplayNameSnapshot property value. User display name snapshot captured when the user submitted the feedback.
     * @param value Value to set for the userDisplayNameSnapshot property.
     */
    public void setUserDisplayNameSnapshot(@jakarta.annotation.Nullable final String value) {
        this.userDisplayNameSnapshot = value;
    }
    /**
     * Sets the userEmailSnapshot property value. User email snapshot captured when the user submitted the feedback.
     * @param value Value to set for the userEmailSnapshot property.
     */
    public void setUserEmailSnapshot(@jakarta.annotation.Nullable final String value) {
        this.userEmailSnapshot = value;
    }
    /**
     * Sets the userId property value. User ID for the person who submitted the feedback.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
