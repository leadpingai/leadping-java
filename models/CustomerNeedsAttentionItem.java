package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomerNeedsAttentionItem implements AdditionalDataHolder, Parsable {
    /**
     * The actionHref property
     */
    private String actionHref;
    /**
     * The actionText property
     */
    private String actionText;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The detail property
     */
    private String detail;
    /**
     * The severity property
     */
    private String severity;
    /**
     * The title property
     */
    private String title;
    /**
     * Instantiates a new {@link CustomerNeedsAttentionItem} and sets the default values.
     */
    public CustomerNeedsAttentionItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomerNeedsAttentionItem}
     */
    @jakarta.annotation.Nonnull
    public static CustomerNeedsAttentionItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomerNeedsAttentionItem();
    }
    /**
     * Gets the actionHref property value. The actionHref property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActionHref() {
        return this.actionHref;
    }
    /**
     * Gets the actionText property value. The actionText property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActionText() {
        return this.actionText;
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
     * Gets the detail property value. The detail property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDetail() {
        return this.detail;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("actionHref", (n) -> { this.setActionHref(n.getStringValue()); });
        deserializerMap.put("actionText", (n) -> { this.setActionText(n.getStringValue()); });
        deserializerMap.put("detail", (n) -> { this.setDetail(n.getStringValue()); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the severity property value. The severity property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSeverity() {
        return this.severity;
    }
    /**
     * Gets the title property value. The title property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actionHref", this.getActionHref());
        writer.writeStringValue("actionText", this.getActionText());
        writer.writeStringValue("detail", this.getDetail());
        writer.writeStringValue("severity", this.getSeverity());
        writer.writeStringValue("title", this.getTitle());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionHref property value. The actionHref property
     * @param value Value to set for the actionHref property.
     */
    public void setActionHref(@jakarta.annotation.Nullable final String value) {
        this.actionHref = value;
    }
    /**
     * Sets the actionText property value. The actionText property
     * @param value Value to set for the actionText property.
     */
    public void setActionText(@jakarta.annotation.Nullable final String value) {
        this.actionText = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the detail property value. The detail property
     * @param value Value to set for the detail property.
     */
    public void setDetail(@jakarta.annotation.Nullable final String value) {
        this.detail = value;
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final String value) {
        this.severity = value;
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
}
