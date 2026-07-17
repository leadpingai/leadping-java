package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Response model containing user data export data returned by the Leadping API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserDataExportResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Date and time when the user data export completed.
     */
    private OffsetDateTime completedAt;
    /**
     * Media type of the generated file or response content.
     */
    private String contentType;
    /**
     * Total number of download records represented by this Leadping user data export.
     */
    private Integer downloadCount;
    /**
     * Temporary URL for downloading the completed Leadping data export.
     */
    private String downloadUrl;
    /**
     * Date and time when the user data export expires.
     */
    private OffsetDateTime expiresAt;
    /**
     * Date and time when the user data export failed.
     */
    private OffsetDateTime failedAt;
    /**
     * Human-readable file name associated with this Leadping user data export.
     */
    private String fileName;
    /**
     * Collection of files included with this Leadping user data export.
     */
    private java.util.List<UserDataExportFile> files;
    /**
     * Unique Leadping identifier for the user data export.
     */
    private String id;
    /**
     * Total number of max download records represented by this Leadping user data export.
     */
    private Integer maxDownloadCount;
    /**
     * Human-readable message for this Leadping user data export.
     */
    private String message;
    /**
     * Date and time when the user data export was requested.
     */
    private OffsetDateTime requestedAt;
    /**
     * File size in bytes.
     */
    private UntypedNode sizeBytes;
    /**
     * Date and time when the user data export started.
     */
    private OffsetDateTime startedAt;
    /**
     * Current status for this Leadping user data export.
     */
    private UserDataExportStatuses status;
    /**
     * Instantiates a new {@link UserDataExportResponse} and sets the default values.
     */
    public UserDataExportResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserDataExportResponse}
     */
    @jakarta.annotation.Nonnull
    public static UserDataExportResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserDataExportResponse();
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
     * Gets the completedAt property value. Date and time when the user data export completed.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedAt() {
        return this.completedAt;
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
     * Gets the downloadCount property value. Total number of download records represented by this Leadping user data export.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDownloadCount() {
        return this.downloadCount;
    }
    /**
     * Gets the downloadUrl property value. Temporary URL for downloading the completed Leadping data export.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDownloadUrl() {
        return this.downloadUrl;
    }
    /**
     * Gets the expiresAt property value. Date and time when the user data export expires.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpiresAt() {
        return this.expiresAt;
    }
    /**
     * Gets the failedAt property value. Date and time when the user data export failed.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFailedAt() {
        return this.failedAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("completedAt", (n) -> { this.setCompletedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getStringValue()); });
        deserializerMap.put("downloadCount", (n) -> { this.setDownloadCount(n.getIntegerValue()); });
        deserializerMap.put("downloadUrl", (n) -> { this.setDownloadUrl(n.getStringValue()); });
        deserializerMap.put("expiresAt", (n) -> { this.setExpiresAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("failedAt", (n) -> { this.setFailedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("files", (n) -> { this.setFiles(n.getCollectionOfObjectValues(UserDataExportFile::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("maxDownloadCount", (n) -> { this.setMaxDownloadCount(n.getIntegerValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("requestedAt", (n) -> { this.setRequestedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sizeBytes", (n) -> { this.setSizeBytes(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("startedAt", (n) -> { this.setStartedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(UserDataExportStatuses::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fileName property value. Human-readable file name associated with this Leadping user data export.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.fileName;
    }
    /**
     * Gets the files property value. Collection of files included with this Leadping user data export.
     * @return a {@link java.util.List<UserDataExportFile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserDataExportFile> getFiles() {
        return this.files;
    }
    /**
     * Gets the id property value. Unique Leadping identifier for the user data export.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the maxDownloadCount property value. Total number of max download records represented by this Leadping user data export.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaxDownloadCount() {
        return this.maxDownloadCount;
    }
    /**
     * Gets the message property value. Human-readable message for this Leadping user data export.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the requestedAt property value. Date and time when the user data export was requested.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRequestedAt() {
        return this.requestedAt;
    }
    /**
     * Gets the sizeBytes property value. File size in bytes.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getSizeBytes() {
        return this.sizeBytes;
    }
    /**
     * Gets the startedAt property value. Date and time when the user data export started.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartedAt() {
        return this.startedAt;
    }
    /**
     * Gets the status property value. Current status for this Leadping user data export.
     * @return a {@link UserDataExportStatuses}
     */
    @jakarta.annotation.Nullable
    public UserDataExportStatuses getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("completedAt", this.getCompletedAt());
        writer.writeStringValue("contentType", this.getContentType());
        writer.writeIntegerValue("downloadCount", this.getDownloadCount());
        writer.writeStringValue("downloadUrl", this.getDownloadUrl());
        writer.writeOffsetDateTimeValue("expiresAt", this.getExpiresAt());
        writer.writeOffsetDateTimeValue("failedAt", this.getFailedAt());
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeCollectionOfObjectValues("files", this.getFiles());
        writer.writeStringValue("id", this.getId());
        writer.writeIntegerValue("maxDownloadCount", this.getMaxDownloadCount());
        writer.writeStringValue("message", this.getMessage());
        writer.writeOffsetDateTimeValue("requestedAt", this.getRequestedAt());
        writer.writeObjectValue("sizeBytes", this.getSizeBytes());
        writer.writeOffsetDateTimeValue("startedAt", this.getStartedAt());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the completedAt property value. Date and time when the user data export completed.
     * @param value Value to set for the completedAt property.
     */
    public void setCompletedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.completedAt = value;
    }
    /**
     * Sets the contentType property value. Media type of the generated file or response content.
     * @param value Value to set for the contentType property.
     */
    public void setContentType(@jakarta.annotation.Nullable final String value) {
        this.contentType = value;
    }
    /**
     * Sets the downloadCount property value. Total number of download records represented by this Leadping user data export.
     * @param value Value to set for the downloadCount property.
     */
    public void setDownloadCount(@jakarta.annotation.Nullable final Integer value) {
        this.downloadCount = value;
    }
    /**
     * Sets the downloadUrl property value. Temporary URL for downloading the completed Leadping data export.
     * @param value Value to set for the downloadUrl property.
     */
    public void setDownloadUrl(@jakarta.annotation.Nullable final String value) {
        this.downloadUrl = value;
    }
    /**
     * Sets the expiresAt property value. Date and time when the user data export expires.
     * @param value Value to set for the expiresAt property.
     */
    public void setExpiresAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expiresAt = value;
    }
    /**
     * Sets the failedAt property value. Date and time when the user data export failed.
     * @param value Value to set for the failedAt property.
     */
    public void setFailedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.failedAt = value;
    }
    /**
     * Sets the fileName property value. Human-readable file name associated with this Leadping user data export.
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.fileName = value;
    }
    /**
     * Sets the files property value. Collection of files included with this Leadping user data export.
     * @param value Value to set for the files property.
     */
    public void setFiles(@jakarta.annotation.Nullable final java.util.List<UserDataExportFile> value) {
        this.files = value;
    }
    /**
     * Sets the id property value. Unique Leadping identifier for the user data export.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the maxDownloadCount property value. Total number of max download records represented by this Leadping user data export.
     * @param value Value to set for the maxDownloadCount property.
     */
    public void setMaxDownloadCount(@jakarta.annotation.Nullable final Integer value) {
        this.maxDownloadCount = value;
    }
    /**
     * Sets the message property value. Human-readable message for this Leadping user data export.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the requestedAt property value. Date and time when the user data export was requested.
     * @param value Value to set for the requestedAt property.
     */
    public void setRequestedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.requestedAt = value;
    }
    /**
     * Sets the sizeBytes property value. File size in bytes.
     * @param value Value to set for the sizeBytes property.
     */
    public void setSizeBytes(@jakarta.annotation.Nullable final UntypedNode value) {
        this.sizeBytes = value;
    }
    /**
     * Sets the startedAt property value. Date and time when the user data export started.
     * @param value Value to set for the startedAt property.
     */
    public void setStartedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startedAt = value;
    }
    /**
     * Sets the status property value. Current status for this Leadping user data export.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final UserDataExportStatuses value) {
        this.status = value;
    }
}
