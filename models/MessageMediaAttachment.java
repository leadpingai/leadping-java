package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Media attached to an SMS/MMS conversation event.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MessageMediaAttachment implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * MIME content type of the media attachment.
     */
    private String contentType;
    /**
     * Original file name of the media attachment, when available.
     */
    private String fileName;
    /**
     * SHA-256 digest of the media content, when available.
     */
    private String sha256;
    /**
     * Size of the media attachment in bytes.
     */
    private Long size;
    /**
     * URL from which the media attachment can be retrieved.
     */
    private String url;
    /**
     * Instantiates a new {@link MessageMediaAttachment} and sets the default values.
     */
    public MessageMediaAttachment() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MessageMediaAttachment}
     */
    @jakarta.annotation.Nonnull
    public static MessageMediaAttachment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageMediaAttachment();
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
     * Gets the contentType property value. MIME content type of the media attachment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentType() {
        return this.contentType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getStringValue()); });
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("sha256", (n) -> { this.setSha256(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileName property value. Original file name of the media attachment, when available.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.fileName;
    }
    /**
     * Gets the sha256 property value. SHA-256 digest of the media content, when available.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSha256() {
        return this.sha256;
    }
    /**
     * Gets the size property value. Size of the media attachment in bytes.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSize() {
        return this.size;
    }
    /**
     * Gets the url property value. URL from which the media attachment can be retrieved.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.url;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("contentType", this.getContentType());
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeStringValue("sha256", this.getSha256());
        writer.writeLongValue("size", this.getSize());
        writer.writeStringValue("url", this.getUrl());
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
     * Sets the contentType property value. MIME content type of the media attachment.
     * @param value Value to set for the contentType property.
     */
    public void setContentType(@jakarta.annotation.Nullable final String value) {
        this.contentType = value;
    }
    /**
     * Sets the fileName property value. Original file name of the media attachment, when available.
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.fileName = value;
    }
    /**
     * Sets the sha256 property value. SHA-256 digest of the media content, when available.
     * @param value Value to set for the sha256 property.
     */
    public void setSha256(@jakarta.annotation.Nullable final String value) {
        this.sha256 = value;
    }
    /**
     * Sets the size property value. Size of the media attachment in bytes.
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Long value) {
        this.size = value;
    }
    /**
     * Sets the url property value. URL from which the media attachment can be retrieved.
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.url = value;
    }
}
