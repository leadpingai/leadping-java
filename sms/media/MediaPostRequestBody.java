package ai.leadping.openapi.sms.media;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MediaPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ContentDisposition property
     */
    private String contentDisposition;
    /**
     * The ContentType property
     */
    private String contentType;
    /**
     * The FileName property
     */
    private String fileName;
    /**
     * The Headers property
     */
    private MediaPostRequestBodyHeaders headers;
    /**
     * The Length property
     */
    private Long length;
    /**
     * The Name property
     */
    private String name;
    /**
     * Instantiates a new {@link MediaPostRequestBody} and sets the default values.
     */
    public MediaPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MediaPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static MediaPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MediaPostRequestBody();
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
     * Gets the ContentDisposition property value. The ContentDisposition property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentDisposition() {
        return this.contentDisposition;
    }
    /**
     * Gets the ContentType property value. The ContentType property
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("ContentDisposition", (n) -> { this.setContentDisposition(n.getStringValue()); });
        deserializerMap.put("ContentType", (n) -> { this.setContentType(n.getStringValue()); });
        deserializerMap.put("FileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("Headers", (n) -> { this.setHeaders(n.getObjectValue(MediaPostRequestBodyHeaders::createFromDiscriminatorValue)); });
        deserializerMap.put("Length", (n) -> { this.setLength(n.getLongValue()); });
        deserializerMap.put("Name", (n) -> { this.setName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the FileName property value. The FileName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.fileName;
    }
    /**
     * Gets the Headers property value. The Headers property
     * @return a {@link MediaPostRequestBodyHeaders}
     */
    @jakarta.annotation.Nullable
    public MediaPostRequestBodyHeaders getHeaders() {
        return this.headers;
    }
    /**
     * Gets the Length property value. The Length property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getLength() {
        return this.length;
    }
    /**
     * Gets the Name property value. The Name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("ContentDisposition", this.getContentDisposition());
        writer.writeStringValue("ContentType", this.getContentType());
        writer.writeStringValue("FileName", this.getFileName());
        writer.writeObjectValue("Headers", this.getHeaders());
        writer.writeLongValue("Length", this.getLength());
        writer.writeStringValue("Name", this.getName());
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
     * Sets the ContentDisposition property value. The ContentDisposition property
     * @param value Value to set for the ContentDisposition property.
     */
    public void setContentDisposition(@jakarta.annotation.Nullable final String value) {
        this.contentDisposition = value;
    }
    /**
     * Sets the ContentType property value. The ContentType property
     * @param value Value to set for the ContentType property.
     */
    public void setContentType(@jakarta.annotation.Nullable final String value) {
        this.contentType = value;
    }
    /**
     * Sets the FileName property value. The FileName property
     * @param value Value to set for the FileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.fileName = value;
    }
    /**
     * Sets the Headers property value. The Headers property
     * @param value Value to set for the Headers property.
     */
    public void setHeaders(@jakarta.annotation.Nullable final MediaPostRequestBodyHeaders value) {
        this.headers = value;
    }
    /**
     * Sets the Length property value. The Length property
     * @param value Value to set for the Length property.
     */
    public void setLength(@jakarta.annotation.Nullable final Long value) {
        this.length = value;
    }
    /**
     * Sets the Name property value. The Name property
     * @param value Value to set for the Name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
}
