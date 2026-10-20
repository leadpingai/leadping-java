package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Preferred contact language, channel, and callback windows; does not grant consent.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadContactPreferences implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Preferred callback windows in the contact time zone.
     */
    private java.util.List<LeadCallbackWindow> callbackWindows;
    /**
     * Supported LeadContactChannel values.
     */
    private LeadContactPreferencesChannel channel;
    /**
     * Preferred BCP 47 language tag, such as en-US.
     */
    private String language;
    /**
     * Instantiates a new {@link LeadContactPreferences} and sets the default values.
     */
    public LeadContactPreferences() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LeadContactPreferences}
     */
    @jakarta.annotation.Nonnull
    public static LeadContactPreferences createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LeadContactPreferences();
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
     * Gets the callbackWindows property value. Preferred callback windows in the contact time zone.
     * @return a {@link java.util.List<LeadCallbackWindow>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LeadCallbackWindow> getCallbackWindows() {
        return this.callbackWindows;
    }
    /**
     * Gets the channel property value. Supported LeadContactChannel values.
     * @return a {@link LeadContactPreferencesChannel}
     */
    @jakarta.annotation.Nullable
    public LeadContactPreferencesChannel getChannel() {
        return this.channel;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("callbackWindows", (n) -> { this.setCallbackWindows(n.getCollectionOfObjectValues(LeadCallbackWindow::createFromDiscriminatorValue)); });
        deserializerMap.put("channel", (n) -> { this.setChannel(n.getEnumValue(LeadContactPreferencesChannel::forValue)); });
        deserializerMap.put("language", (n) -> { this.setLanguage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the language property value. Preferred BCP 47 language tag, such as en-US.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLanguage() {
        return this.language;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("callbackWindows", this.getCallbackWindows());
        writer.writeEnumValue("channel", this.getChannel());
        writer.writeStringValue("language", this.getLanguage());
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
     * Sets the callbackWindows property value. Preferred callback windows in the contact time zone.
     * @param value Value to set for the callbackWindows property.
     */
    public void setCallbackWindows(@jakarta.annotation.Nullable final java.util.List<LeadCallbackWindow> value) {
        this.callbackWindows = value;
    }
    /**
     * Sets the channel property value. Supported LeadContactChannel values.
     * @param value Value to set for the channel property.
     */
    public void setChannel(@jakarta.annotation.Nullable final LeadContactPreferencesChannel value) {
        this.channel = value;
    }
    /**
     * Sets the language property value. Preferred BCP 47 language tag, such as en-US.
     * @param value Value to set for the language property.
     */
    public void setLanguage(@jakarta.annotation.Nullable final String value) {
        this.language = value;
    }
}
