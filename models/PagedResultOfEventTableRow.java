package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Returns one page of query results together with page-size, optional total-count, and opaque continuation-cursor metadata.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PagedResultOfEventTableRow implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Opaque cursor for requesting the next page, or null when no additional page is available; clients must not parse or modify it.
     */
    private String continuationToken;
    /**
     * Items included in the current page, in the order determined by the query.
     */
    private java.util.List<EventTableRow> items;
    /**
     * Effective page-size limit used for this response, which may differ from the requested size because of server defaults or limits.
     */
    private Integer pageSize;
    /**
     * Total number of records matching the query across all pages, or null when counting was not requested or computed.
     */
    private Integer totalCount;
    /**
     * Instantiates a new {@link PagedResultOfEventTableRow} and sets the default values.
     */
    public PagedResultOfEventTableRow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PagedResultOfEventTableRow}
     */
    @jakarta.annotation.Nonnull
    public static PagedResultOfEventTableRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PagedResultOfEventTableRow();
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
     * Gets the continuationToken property value. Opaque cursor for requesting the next page, or null when no additional page is available; clients must not parse or modify it.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContinuationToken() {
        return this.continuationToken;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("continuationToken", (n) -> { this.setContinuationToken(n.getStringValue()); });
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(EventTableRow::createFromDiscriminatorValue)); });
        deserializerMap.put("pageSize", (n) -> { this.setPageSize(n.getIntegerValue()); });
        deserializerMap.put("totalCount", (n) -> { this.setTotalCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the items property value. Items included in the current page, in the order determined by the query.
     * @return a {@link java.util.List<EventTableRow>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EventTableRow> getItems() {
        return this.items;
    }
    /**
     * Gets the pageSize property value. Effective page-size limit used for this response, which may differ from the requested size because of server defaults or limits.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPageSize() {
        return this.pageSize;
    }
    /**
     * Gets the totalCount property value. Total number of records matching the query across all pages, or null when counting was not requested or computed.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalCount() {
        return this.totalCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("continuationToken", this.getContinuationToken());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeIntegerValue("pageSize", this.getPageSize());
        writer.writeIntegerValue("totalCount", this.getTotalCount());
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
     * Sets the continuationToken property value. Opaque cursor for requesting the next page, or null when no additional page is available; clients must not parse or modify it.
     * @param value Value to set for the continuationToken property.
     */
    public void setContinuationToken(@jakarta.annotation.Nullable final String value) {
        this.continuationToken = value;
    }
    /**
     * Sets the items property value. Items included in the current page, in the order determined by the query.
     * @param value Value to set for the items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<EventTableRow> value) {
        this.items = value;
    }
    /**
     * Sets the pageSize property value. Effective page-size limit used for this response, which may differ from the requested size because of server defaults or limits.
     * @param value Value to set for the pageSize property.
     */
    public void setPageSize(@jakarta.annotation.Nullable final Integer value) {
        this.pageSize = value;
    }
    /**
     * Sets the totalCount property value. Total number of records matching the query across all pages, or null when counting was not requested or computed.
     * @param value Value to set for the totalCount property.
     */
    public void setTotalCount(@jakarta.annotation.Nullable final Integer value) {
        this.totalCount = value;
    }
}
