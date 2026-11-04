package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Controls demo presentation for an individual platform admin.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdminDemoPreferences implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The showDemoData property
     */
    private Boolean showDemoData;
    /**
     * The showDemoMarkers property
     */
    private Boolean showDemoMarkers;
    /**
     * Instantiates a new {@link AdminDemoPreferences} and sets the default values.
     */
    public AdminDemoPreferences() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AdminDemoPreferences}
     */
    @jakarta.annotation.Nonnull
    public static AdminDemoPreferences createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdminDemoPreferences();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("showDemoData", (n) -> { this.setShowDemoData(n.getBooleanValue()); });
        deserializerMap.put("showDemoMarkers", (n) -> { this.setShowDemoMarkers(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the showDemoData property value. The showDemoData property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShowDemoData() {
        return this.showDemoData;
    }
    /**
     * Gets the showDemoMarkers property value. The showDemoMarkers property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShowDemoMarkers() {
        return this.showDemoMarkers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("showDemoData", this.getShowDemoData());
        writer.writeBooleanValue("showDemoMarkers", this.getShowDemoMarkers());
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
     * Sets the showDemoData property value. The showDemoData property
     * @param value Value to set for the showDemoData property.
     */
    public void setShowDemoData(@jakarta.annotation.Nullable final Boolean value) {
        this.showDemoData = value;
    }
    /**
     * Sets the showDemoMarkers property value. The showDemoMarkers property
     * @param value Value to set for the showDemoMarkers property.
     */
    public void setShowDemoMarkers(@jakarta.annotation.Nullable final Boolean value) {
        this.showDemoMarkers = value;
    }
}
