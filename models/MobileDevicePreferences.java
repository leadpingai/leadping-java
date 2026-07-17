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
 * API DTO containing Leadping mobile preferences for a single user device.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileDevicePreferences implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ID and name for this device.
     */
    private IdNamePair device;
    /**
     * Whether inbound phone calls are enabled for this user device.
     */
    private Boolean inboundPhoneCallsEnabled;
    /**
     * The date and time this device preference was last updated.
     */
    private OffsetDateTime updatedAt;
    /**
     * Instantiates a new {@link MobileDevicePreferences} and sets the default values.
     */
    public MobileDevicePreferences() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MobileDevicePreferences}
     */
    @jakarta.annotation.Nonnull
    public static MobileDevicePreferences createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileDevicePreferences();
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
     * Gets the device property value. The ID and name for this device.
     * @return a {@link IdNamePair}
     */
    @jakarta.annotation.Nullable
    public IdNamePair getDevice() {
        return this.device;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("device", (n) -> { this.setDevice(n.getObjectValue(IdNamePair::createFromDiscriminatorValue)); });
        deserializerMap.put("inboundPhoneCallsEnabled", (n) -> { this.setInboundPhoneCallsEnabled(n.getBooleanValue()); });
        deserializerMap.put("updatedAt", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inboundPhoneCallsEnabled property value. Whether inbound phone calls are enabled for this user device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getInboundPhoneCallsEnabled() {
        return this.inboundPhoneCallsEnabled;
    }
    /**
     * Gets the updatedAt property value. The date and time this device preference was last updated.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("device", this.getDevice());
        writer.writeBooleanValue("inboundPhoneCallsEnabled", this.getInboundPhoneCallsEnabled());
        writer.writeOffsetDateTimeValue("updatedAt", this.getUpdatedAt());
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
     * Sets the device property value. The ID and name for this device.
     * @param value Value to set for the device property.
     */
    public void setDevice(@jakarta.annotation.Nullable final IdNamePair value) {
        this.device = value;
    }
    /**
     * Sets the inboundPhoneCallsEnabled property value. Whether inbound phone calls are enabled for this user device.
     * @param value Value to set for the inboundPhoneCallsEnabled property.
     */
    public void setInboundPhoneCallsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.inboundPhoneCallsEnabled = value;
    }
    /**
     * Sets the updatedAt property value. The date and time this device preference was last updated.
     * @param value Value to set for the updatedAt property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.updatedAt = value;
    }
}
