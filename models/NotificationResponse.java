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
 * API DTO containing notification data used by Leadping API contracts.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NotificationResponse implements AdditionalDataHolder, Parsable {
    /**
     * The action button text value for this notification.
     */
    private String actionButtonText;
    /**
     * The URL associated with this notification.
     */
    private String actionUrl;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date and time when the entity was created.
     */
    private OffsetDateTime createdAt;
    /**
     * The details value for this notification.
     */
    private String details;
    /**
     * The unique identifier for the entity.
     */
    private String id;
    /**
     * Whether this notification is read.
     */
    private Boolean isRead;
    /**
     * The message value for this notification.
     */
    private String message;
    /**
     * The date and time when the entity was last modified, if applicable.
     */
    private OffsetDateTime modifiedAt;
    /**
     * The display name for the entity.
     */
    private String name;
    /**
     * The priority value for this notification.
     */
    private NotificationPriority priority;
    /**
     * The date and time for the read at value on this notification.
     */
    private OffsetDateTime readAt;
    /**
     * The related entity ID associated with this notification.
     */
    private String relatedEntityId;
    /**
     * The related entity type classification for this notification.
     */
    private String relatedEntityType;
    /**
     * The type classification for this notification.
     */
    private NotificationType type;
    /**
     * The user ID associated with this notification.
     */
    private String userId;
    /**
     * Instantiates a new {@link NotificationResponse} and sets the default values.
     */
    public NotificationResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link NotificationResponse}
     */
    @jakarta.annotation.Nonnull
    public static NotificationResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NotificationResponse();
    }
    /**
     * Gets the actionButtonText property value. The action button text value for this notification.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActionButtonText() {
        return this.actionButtonText;
    }
    /**
     * Gets the actionUrl property value. The URL associated with this notification.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActionUrl() {
        return this.actionUrl;
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
     * Gets the createdAt property value. The date and time when the entity was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the details property value. The details value for this notification.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDetails() {
        return this.details;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("actionButtonText", (n) -> { this.setActionButtonText(n.getStringValue()); });
        deserializerMap.put("actionUrl", (n) -> { this.setActionUrl(n.getStringValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("details", (n) -> { this.setDetails(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isRead", (n) -> { this.setIsRead(n.getBooleanValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getEnumValue(NotificationPriority::forValue)); });
        deserializerMap.put("readAt", (n) -> { this.setReadAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("relatedEntityId", (n) -> { this.setRelatedEntityId(n.getStringValue()); });
        deserializerMap.put("relatedEntityType", (n) -> { this.setRelatedEntityType(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(NotificationType::forValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The unique identifier for the entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the isRead property value. Whether this notification is read.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRead() {
        return this.isRead;
    }
    /**
     * Gets the message property value. The message value for this notification.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the modifiedAt property value. The date and time when the entity was last modified, if applicable.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * Gets the name property value. The display name for the entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the priority property value. The priority value for this notification.
     * @return a {@link NotificationPriority}
     */
    @jakarta.annotation.Nullable
    public NotificationPriority getPriority() {
        return this.priority;
    }
    /**
     * Gets the readAt property value. The date and time for the read at value on this notification.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReadAt() {
        return this.readAt;
    }
    /**
     * Gets the relatedEntityId property value. The related entity ID associated with this notification.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRelatedEntityId() {
        return this.relatedEntityId;
    }
    /**
     * Gets the relatedEntityType property value. The related entity type classification for this notification.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRelatedEntityType() {
        return this.relatedEntityType;
    }
    /**
     * Gets the type property value. The type classification for this notification.
     * @return a {@link NotificationType}
     */
    @jakarta.annotation.Nullable
    public NotificationType getType() {
        return this.type;
    }
    /**
     * Gets the userId property value. The user ID associated with this notification.
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
        writer.writeStringValue("actionButtonText", this.getActionButtonText());
        writer.writeStringValue("actionUrl", this.getActionUrl());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("details", this.getDetails());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isRead", this.getIsRead());
        writer.writeStringValue("message", this.getMessage());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("priority", this.getPriority());
        writer.writeOffsetDateTimeValue("readAt", this.getReadAt());
        writer.writeStringValue("relatedEntityId", this.getRelatedEntityId());
        writer.writeStringValue("relatedEntityType", this.getRelatedEntityType());
        writer.writeEnumValue("type", this.getType());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionButtonText property value. The action button text value for this notification.
     * @param value Value to set for the actionButtonText property.
     */
    public void setActionButtonText(@jakarta.annotation.Nullable final String value) {
        this.actionButtonText = value;
    }
    /**
     * Sets the actionUrl property value. The URL associated with this notification.
     * @param value Value to set for the actionUrl property.
     */
    public void setActionUrl(@jakarta.annotation.Nullable final String value) {
        this.actionUrl = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the createdAt property value. The date and time when the entity was created.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the details property value. The details value for this notification.
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final String value) {
        this.details = value;
    }
    /**
     * Sets the id property value. The unique identifier for the entity.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the isRead property value. Whether this notification is read.
     * @param value Value to set for the isRead property.
     */
    public void setIsRead(@jakarta.annotation.Nullable final Boolean value) {
        this.isRead = value;
    }
    /**
     * Sets the message property value. The message value for this notification.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the modifiedAt property value. The date and time when the entity was last modified, if applicable.
     * @param value Value to set for the modifiedAt property.
     */
    public void setModifiedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedAt = value;
    }
    /**
     * Sets the name property value. The display name for the entity.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the priority property value. The priority value for this notification.
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final NotificationPriority value) {
        this.priority = value;
    }
    /**
     * Sets the readAt property value. The date and time for the read at value on this notification.
     * @param value Value to set for the readAt property.
     */
    public void setReadAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.readAt = value;
    }
    /**
     * Sets the relatedEntityId property value. The related entity ID associated with this notification.
     * @param value Value to set for the relatedEntityId property.
     */
    public void setRelatedEntityId(@jakarta.annotation.Nullable final String value) {
        this.relatedEntityId = value;
    }
    /**
     * Sets the relatedEntityType property value. The related entity type classification for this notification.
     * @param value Value to set for the relatedEntityType property.
     */
    public void setRelatedEntityType(@jakarta.annotation.Nullable final String value) {
        this.relatedEntityType = value;
    }
    /**
     * Sets the type property value. The type classification for this notification.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final NotificationType value) {
        this.type = value;
    }
    /**
     * Sets the userId property value. The user ID associated with this notification.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
