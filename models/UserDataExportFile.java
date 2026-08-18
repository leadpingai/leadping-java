package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Response model containing user data export file data returned by the Leadping API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserDataExportFile implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Category classification for this Leadping user data export file.
     */
    private String category;
    /**
     * Media type of the generated file or response content.
     */
    private String contentType;
    /**
     * Human-readable file name associated with this Leadping user data export file.
     */
    private String fileName;
    /**
     * Total number of row records represented by this Leadping user data export file.
     */
    private Integer rowCount;
    /**
     * Instantiates a new {@link UserDataExportFile} and sets the default values.
     */
    public UserDataExportFile() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserDataExportFile}
     */
    @jakarta.annotation.Nonnull
    public static UserDataExportFile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserDataExportFile();
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
     * Gets the category property value. Category classification for this Leadping user data export file.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategory() {
        return this.category;
    }
    /**
     * Gets the contentType property value. Media type of the generated file or response content.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("category", (n) -> { this.setCategory(n.getStringValue()); });
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getStringValue()); });
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("rowCount", (n) -> { this.setRowCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileName property value. Human-readable file name associated with this Leadping user data export file.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.fileName;
    }
    /**
     * Gets the rowCount property value. Total number of row records represented by this Leadping user data export file.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRowCount() {
        return this.rowCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("category", this.getCategory());
        writer.writeStringValue("contentType", this.getContentType());
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeIntegerValue("rowCount", this.getRowCount());
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
     * Sets the category property value. Category classification for this Leadping user data export file.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final String value) {
        this.category = value;
    }
    /**
     * Sets the contentType property value. Media type of the generated file or response content.
     * @param value Value to set for the contentType property.
     */
    public void setContentType(@jakarta.annotation.Nullable final String value) {
        this.contentType = value;
    }
    /**
     * Sets the fileName property value. Human-readable file name associated with this Leadping user data export file.
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.fileName = value;
    }
    /**
     * Sets the rowCount property value. Total number of row records represented by this Leadping user data export file.
     * @param value Value to set for the rowCount property.
     */
    public void setRowCount(@jakarta.annotation.Nullable final Integer value) {
        this.rowCount = value;
    }
}
