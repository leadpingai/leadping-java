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
 * Response schema for the Leadping API phone number messaging event returned to authenticated clients.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumberMessagingEventResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * UTC timestamp when this phone number messaging event was created.
     */
    private OffsetDateTime createdAt;
    /**
     * Communication direction for this phone number messaging event, such as inbound or outbound.
     */
    private String direction;
    /**
     * Event type used to classify this timeline, SMS, call, or automation event.
     */
    private String eventType;
    /**
     * Sender phone number used for this communication.
     */
    private String fromPhoneNumber;
    /**
     * Unique Leadping identifier for this phone number messaging event.
     */
    private String id;
    /**
     * Indicates whether the recipient has opted out of further SMS communication.
     */
    private Boolean isOptOut;
    /**
     * Short display label for this phone number messaging event, formatted for charts, filters, or list views.
     */
    private String label;
    /**
     * Short preview of the SMS or conversation text for this phone number messaging event.
     */
    private String textPreview;
    /**
     * Recipient phone number used for this communication.
     */
    private String toPhoneNumber;
    /**
     * Instantiates a new {@link PhoneNumberMessagingEventResponse} and sets the default values.
     */
    public PhoneNumberMessagingEventResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneNumberMessagingEventResponse}
     */
    @jakarta.annotation.Nonnull
    public static PhoneNumberMessagingEventResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneNumberMessagingEventResponse();
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
     * Gets the createdAt property value. UTC timestamp when this phone number messaging event was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the direction property value. Communication direction for this phone number messaging event, such as inbound or outbound.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDirection() {
        return this.direction;
    }
    /**
     * Gets the eventType property value. Event type used to classify this timeline, SMS, call, or automation event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEventType() {
        return this.eventType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("direction", (n) -> { this.setDirection(n.getStringValue()); });
        deserializerMap.put("eventType", (n) -> { this.setEventType(n.getStringValue()); });
        deserializerMap.put("fromPhoneNumber", (n) -> { this.setFromPhoneNumber(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isOptOut", (n) -> { this.setIsOptOut(n.getBooleanValue()); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("textPreview", (n) -> { this.setTextPreview(n.getStringValue()); });
        deserializerMap.put("toPhoneNumber", (n) -> { this.setToPhoneNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fromPhoneNumber property value. Sender phone number used for this communication.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFromPhoneNumber() {
        return this.fromPhoneNumber;
    }
    /**
     * Gets the id property value. Unique Leadping identifier for this phone number messaging event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the isOptOut property value. Indicates whether the recipient has opted out of further SMS communication.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOptOut() {
        return this.isOptOut;
    }
    /**
     * Gets the label property value. Short display label for this phone number messaging event, formatted for charts, filters, or list views.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.label;
    }
    /**
     * Gets the textPreview property value. Short preview of the SMS or conversation text for this phone number messaging event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTextPreview() {
        return this.textPreview;
    }
    /**
     * Gets the toPhoneNumber property value. Recipient phone number used for this communication.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getToPhoneNumber() {
        return this.toPhoneNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("direction", this.getDirection());
        writer.writeStringValue("eventType", this.getEventType());
        writer.writeStringValue("fromPhoneNumber", this.getFromPhoneNumber());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isOptOut", this.getIsOptOut());
        writer.writeStringValue("label", this.getLabel());
        writer.writeStringValue("textPreview", this.getTextPreview());
        writer.writeStringValue("toPhoneNumber", this.getToPhoneNumber());
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
     * Sets the createdAt property value. UTC timestamp when this phone number messaging event was created.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the direction property value. Communication direction for this phone number messaging event, such as inbound or outbound.
     * @param value Value to set for the direction property.
     */
    public void setDirection(@jakarta.annotation.Nullable final String value) {
        this.direction = value;
    }
    /**
     * Sets the eventType property value. Event type used to classify this timeline, SMS, call, or automation event.
     * @param value Value to set for the eventType property.
     */
    public void setEventType(@jakarta.annotation.Nullable final String value) {
        this.eventType = value;
    }
    /**
     * Sets the fromPhoneNumber property value. Sender phone number used for this communication.
     * @param value Value to set for the fromPhoneNumber property.
     */
    public void setFromPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.fromPhoneNumber = value;
    }
    /**
     * Sets the id property value. Unique Leadping identifier for this phone number messaging event.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the isOptOut property value. Indicates whether the recipient has opted out of further SMS communication.
     * @param value Value to set for the isOptOut property.
     */
    public void setIsOptOut(@jakarta.annotation.Nullable final Boolean value) {
        this.isOptOut = value;
    }
    /**
     * Sets the label property value. Short display label for this phone number messaging event, formatted for charts, filters, or list views.
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.label = value;
    }
    /**
     * Sets the textPreview property value. Short preview of the SMS or conversation text for this phone number messaging event.
     * @param value Value to set for the textPreview property.
     */
    public void setTextPreview(@jakarta.annotation.Nullable final String value) {
        this.textPreview = value;
    }
    /**
     * Sets the toPhoneNumber property value. Recipient phone number used for this communication.
     * @param value Value to set for the toPhoneNumber property.
     */
    public void setToPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.toPhoneNumber = value;
    }
}
