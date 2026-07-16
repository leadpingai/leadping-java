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
 * API response containing suppression check result data returned to callers.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SuppressionCheckResult implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Whether this ion check result allows ed.
     */
    private Boolean allowed;
    /**
     * The business ID associated with this ion check result.
     */
    private String businessId;
    /**
     * The channel value for this ion check result.
     */
    private String channel;
    /**
     * The human-readable customer reason explaining this ion check result.
     */
    private String customerReason;
    /**
     * The normalized email value for this ion check result.
     */
    private String normalizedEmail;
    /**
     * The phone number associated with this ion check result.
     */
    private String normalizedPhoneNumber;
    /**
     * The recipient identifier value for this ion check result.
     */
    private String recipientIdentifier;
    /**
     * The source value on the active suppression entry that blocked this check.
     */
    private String source;
    /**
     * The date and time the blocking suppression became active.
     */
    private OffsetDateTime suppressedAt;
    /**
     * The suppression entry ID associated with this ion check result.
     */
    private String suppressionEntryId;
    /**
     * Instantiates a new {@link SuppressionCheckResult} and sets the default values.
     */
    public SuppressionCheckResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SuppressionCheckResult}
     */
    @jakarta.annotation.Nonnull
    public static SuppressionCheckResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SuppressionCheckResult();
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
     * Gets the allowed property value. Whether this ion check result allows ed.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowed() {
        return this.allowed;
    }
    /**
     * Gets the businessId property value. The business ID associated with this ion check result.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessId() {
        return this.businessId;
    }
    /**
     * Gets the channel property value. The channel value for this ion check result.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChannel() {
        return this.channel;
    }
    /**
     * Gets the customerReason property value. The human-readable customer reason explaining this ion check result.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomerReason() {
        return this.customerReason;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("allowed", (n) -> { this.setAllowed(n.getBooleanValue()); });
        deserializerMap.put("businessId", (n) -> { this.setBusinessId(n.getStringValue()); });
        deserializerMap.put("channel", (n) -> { this.setChannel(n.getStringValue()); });
        deserializerMap.put("customerReason", (n) -> { this.setCustomerReason(n.getStringValue()); });
        deserializerMap.put("normalizedEmail", (n) -> { this.setNormalizedEmail(n.getStringValue()); });
        deserializerMap.put("normalizedPhoneNumber", (n) -> { this.setNormalizedPhoneNumber(n.getStringValue()); });
        deserializerMap.put("recipientIdentifier", (n) -> { this.setRecipientIdentifier(n.getStringValue()); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getStringValue()); });
        deserializerMap.put("suppressedAt", (n) -> { this.setSuppressedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("suppressionEntryId", (n) -> { this.setSuppressionEntryId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the normalizedEmail property value. The normalized email value for this ion check result.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNormalizedEmail() {
        return this.normalizedEmail;
    }
    /**
     * Gets the normalizedPhoneNumber property value. The phone number associated with this ion check result.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNormalizedPhoneNumber() {
        return this.normalizedPhoneNumber;
    }
    /**
     * Gets the recipientIdentifier property value. The recipient identifier value for this ion check result.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecipientIdentifier() {
        return this.recipientIdentifier;
    }
    /**
     * Gets the source property value. The source value on the active suppression entry that blocked this check.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSource() {
        return this.source;
    }
    /**
     * Gets the suppressedAt property value. The date and time the blocking suppression became active.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSuppressedAt() {
        return this.suppressedAt;
    }
    /**
     * Gets the suppressionEntryId property value. The suppression entry ID associated with this ion check result.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSuppressionEntryId() {
        return this.suppressionEntryId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowed", this.getAllowed());
        writer.writeStringValue("businessId", this.getBusinessId());
        writer.writeStringValue("channel", this.getChannel());
        writer.writeStringValue("customerReason", this.getCustomerReason());
        writer.writeStringValue("normalizedEmail", this.getNormalizedEmail());
        writer.writeStringValue("normalizedPhoneNumber", this.getNormalizedPhoneNumber());
        writer.writeStringValue("recipientIdentifier", this.getRecipientIdentifier());
        writer.writeStringValue("source", this.getSource());
        writer.writeOffsetDateTimeValue("suppressedAt", this.getSuppressedAt());
        writer.writeStringValue("suppressionEntryId", this.getSuppressionEntryId());
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
     * Sets the allowed property value. Whether this ion check result allows ed.
     * @param value Value to set for the allowed property.
     */
    public void setAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.allowed = value;
    }
    /**
     * Sets the businessId property value. The business ID associated with this ion check result.
     * @param value Value to set for the businessId property.
     */
    public void setBusinessId(@jakarta.annotation.Nullable final String value) {
        this.businessId = value;
    }
    /**
     * Sets the channel property value. The channel value for this ion check result.
     * @param value Value to set for the channel property.
     */
    public void setChannel(@jakarta.annotation.Nullable final String value) {
        this.channel = value;
    }
    /**
     * Sets the customerReason property value. The human-readable customer reason explaining this ion check result.
     * @param value Value to set for the customerReason property.
     */
    public void setCustomerReason(@jakarta.annotation.Nullable final String value) {
        this.customerReason = value;
    }
    /**
     * Sets the normalizedEmail property value. The normalized email value for this ion check result.
     * @param value Value to set for the normalizedEmail property.
     */
    public void setNormalizedEmail(@jakarta.annotation.Nullable final String value) {
        this.normalizedEmail = value;
    }
    /**
     * Sets the normalizedPhoneNumber property value. The phone number associated with this ion check result.
     * @param value Value to set for the normalizedPhoneNumber property.
     */
    public void setNormalizedPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.normalizedPhoneNumber = value;
    }
    /**
     * Sets the recipientIdentifier property value. The recipient identifier value for this ion check result.
     * @param value Value to set for the recipientIdentifier property.
     */
    public void setRecipientIdentifier(@jakarta.annotation.Nullable final String value) {
        this.recipientIdentifier = value;
    }
    /**
     * Sets the source property value. The source value on the active suppression entry that blocked this check.
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final String value) {
        this.source = value;
    }
    /**
     * Sets the suppressedAt property value. The date and time the blocking suppression became active.
     * @param value Value to set for the suppressedAt property.
     */
    public void setSuppressedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.suppressedAt = value;
    }
    /**
     * Sets the suppressionEntryId property value. The suppression entry ID associated with this ion check result.
     * @param value Value to set for the suppressionEntryId property.
     */
    public void setSuppressionEntryId(@jakarta.annotation.Nullable final String value) {
        this.suppressionEntryId = value;
    }
}
