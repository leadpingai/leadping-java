package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Describes lead status change export data returned by Leadping.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadStatusChangeExportResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * MIME content type of the exported document.
     */
    private String contentType;
    /**
     * Complete comma-separated values content encoded as text.
     */
    private String csv;
    /**
     * Suggested file name for the exported CSV document.
     */
    private String fileName;
    /**
     * The rows included with this lead status change export.
     */
    private java.util.List<LeadStatusChangeExportRow> rows;
    /**
     * Instantiates a new {@link LeadStatusChangeExportResponse} and sets the default values.
     */
    public LeadStatusChangeExportResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LeadStatusChangeExportResponse}
     */
    @jakarta.annotation.Nonnull
    public static LeadStatusChangeExportResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LeadStatusChangeExportResponse();
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
     * Gets the contentType property value. MIME content type of the exported document.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentType() {
        return this.contentType;
    }
    /**
     * Gets the csv property value. Complete comma-separated values content encoded as text.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCsv() {
        return this.csv;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getStringValue()); });
        deserializerMap.put("csv", (n) -> { this.setCsv(n.getStringValue()); });
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("rows", (n) -> { this.setRows(n.getCollectionOfObjectValues(LeadStatusChangeExportRow::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fileName property value. Suggested file name for the exported CSV document.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.fileName;
    }
    /**
     * Gets the rows property value. The rows included with this lead status change export.
     * @return a {@link java.util.List<LeadStatusChangeExportRow>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LeadStatusChangeExportRow> getRows() {
        return this.rows;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("contentType", this.getContentType());
        writer.writeStringValue("csv", this.getCsv());
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeCollectionOfObjectValues("rows", this.getRows());
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
     * Sets the contentType property value. MIME content type of the exported document.
     * @param value Value to set for the contentType property.
     */
    public void setContentType(@jakarta.annotation.Nullable final String value) {
        this.contentType = value;
    }
    /**
     * Sets the csv property value. Complete comma-separated values content encoded as text.
     * @param value Value to set for the csv property.
     */
    public void setCsv(@jakarta.annotation.Nullable final String value) {
        this.csv = value;
    }
    /**
     * Sets the fileName property value. Suggested file name for the exported CSV document.
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.fileName = value;
    }
    /**
     * Sets the rows property value. The rows included with this lead status change export.
     * @param value Value to set for the rows property.
     */
    public void setRows(@jakarta.annotation.Nullable final java.util.List<LeadStatusChangeExportRow> value) {
        this.rows = value;
    }
}
