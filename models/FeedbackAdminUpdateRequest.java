package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Request schema for the Leadping API feedback admin update request, including the fields clients can send.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeedbackAdminUpdateRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Internal admin note used to track feedback review or resolution.
     */
    private String adminNote;
    /**
     * Product area or app section connected to this feedback admin update request.
     */
    private String area;
    /**
     * Feedback item ID that this item duplicates, when applicable.
     */
    private String duplicateOfFeedbackItemId;
    /**
     * External issue tracker URL linked to this feedback item.
     */
    private String externalIssueUrl;
    /**
     * Defines admin triage statuses for durable product feedback.
     */
    private FeedbackAdminUpdateRequestStatus status;
    /**
     * Defines the type of product feedback submitted from inside Leadping.
     */
    private FeedbackAdminUpdateRequestType type;
    /**
     * Instantiates a new {@link FeedbackAdminUpdateRequest} and sets the default values.
     */
    public FeedbackAdminUpdateRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FeedbackAdminUpdateRequest}
     */
    @jakarta.annotation.Nonnull
    public static FeedbackAdminUpdateRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FeedbackAdminUpdateRequest();
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
     * Gets the area property value. Product area or app section connected to this feedback admin update request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getArea() {
        return this.area;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("adminNote", (n) -> { this.setAdminNote(n.getStringValue()); });
        deserializerMap.put("area", (n) -> { this.setArea(n.getStringValue()); });
        deserializerMap.put("duplicateOfFeedbackItemId", (n) -> { this.setDuplicateOfFeedbackItemId(n.getStringValue()); });
        deserializerMap.put("externalIssueUrl", (n) -> { this.setExternalIssueUrl(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(FeedbackAdminUpdateRequestStatus::forValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(FeedbackAdminUpdateRequestType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the status property value. Defines admin triage statuses for durable product feedback.
     * @return a {@link FeedbackAdminUpdateRequestStatus}
     */
    @jakarta.annotation.Nullable
    public FeedbackAdminUpdateRequestStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the type property value. Defines the type of product feedback submitted from inside Leadping.
     * @return a {@link FeedbackAdminUpdateRequestType}
     */
    @jakarta.annotation.Nullable
    public FeedbackAdminUpdateRequestType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("adminNote", this.getAdminNote());
        writer.writeStringValue("area", this.getArea());
        writer.writeStringValue("duplicateOfFeedbackItemId", this.getDuplicateOfFeedbackItemId());
        writer.writeStringValue("externalIssueUrl", this.getExternalIssueUrl());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the area property value. Product area or app section connected to this feedback admin update request.
     * @param value Value to set for the area property.
     */
    public void setArea(@jakarta.annotation.Nullable final String value) {
        this.area = value;
    }
    /**
     * Sets the duplicateOfFeedbackItemId property value. Feedback item ID that this item duplicates, when applicable.
     * @param value Value to set for the duplicateOfFeedbackItemId property.
     */
    public void setDuplicateOfFeedbackItemId(@jakarta.annotation.Nullable final String value) {
        this.duplicateOfFeedbackItemId = value;
    }
    /**
     * Sets the externalIssueUrl property value. External issue tracker URL linked to this feedback item.
     * @param value Value to set for the externalIssueUrl property.
     */
    public void setExternalIssueUrl(@jakarta.annotation.Nullable final String value) {
        this.externalIssueUrl = value;
    }
    /**
     * Sets the status property value. Defines admin triage statuses for durable product feedback.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final FeedbackAdminUpdateRequestStatus value) {
        this.status = value;
    }
    /**
     * Sets the type property value. Defines the type of product feedback submitted from inside Leadping.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final FeedbackAdminUpdateRequestType value) {
        this.type = value;
    }
}
