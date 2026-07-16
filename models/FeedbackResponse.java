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
     * Client application version that submitted this feedback item response.
     */
    private String clientVersion;
    /**
     * UTC timestamp when this feedback item response was created.
     */
    private OffsetDateTime createdAt;
    /**
     * Unique Leadping identifier for this feedback item response.
     */
    private String id;
    /**
     * Message text supplied by the user or returned by the Leadping API for this feedback item response.
     */
    private String message;
    /**
     * Application route where this feedback item response originated or should direct the user.
     */
    private String route;
    /**
     * Current lifecycle status for this feedback item response in the Leadping API.
     */
    private FeedbackStatus status;
    /**
     * Type classification used to route and interpret this feedback item response in the Leadping API.
     */
    private FeedbackType type;
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
     * Gets the clientVersion property value. Client application version that submitted this feedback item response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientVersion() {
        return this.clientVersion;
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("allowContact", (n) -> { this.setAllowContact(n.getBooleanValue()); });
        deserializerMap.put("area", (n) -> { this.setArea(n.getStringValue()); });
        deserializerMap.put("businessId", (n) -> { this.setBusinessId(n.getStringValue()); });
        deserializerMap.put("clientVersion", (n) -> { this.setClientVersion(n.getStringValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("route", (n) -> { this.setRoute(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(FeedbackStatus::forValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(FeedbackType::forValue)); });
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
     * Gets the route property value. Application route where this feedback item response originated or should direct the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRoute() {
        return this.route;
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
     * Gets the type property value. Type classification used to route and interpret this feedback item response in the Leadping API.
     * @return a {@link FeedbackType}
     */
    @jakarta.annotation.Nullable
    public FeedbackType getType() {
        return this.type;
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
        writer.writeBooleanValue("allowContact", this.getAllowContact());
        writer.writeStringValue("area", this.getArea());
        writer.writeStringValue("businessId", this.getBusinessId());
        writer.writeStringValue("clientVersion", this.getClientVersion());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("route", this.getRoute());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the clientVersion property value. Client application version that submitted this feedback item response.
     * @param value Value to set for the clientVersion property.
     */
    public void setClientVersion(@jakarta.annotation.Nullable final String value) {
        this.clientVersion = value;
    }
    /**
     * Sets the createdAt property value. UTC timestamp when this feedback item response was created.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
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
     * Sets the route property value. Application route where this feedback item response originated or should direct the user.
     * @param value Value to set for the route property.
     */
    public void setRoute(@jakarta.annotation.Nullable final String value) {
        this.route = value;
    }
    /**
     * Sets the status property value. Current lifecycle status for this feedback item response in the Leadping API.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final FeedbackStatus value) {
        this.status = value;
    }
    /**
     * Sets the type property value. Type classification used to route and interpret this feedback item response in the Leadping API.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final FeedbackType value) {
        this.type = value;
    }
    /**
     * Sets the userId property value. User ID for the person who submitted the feedback.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
