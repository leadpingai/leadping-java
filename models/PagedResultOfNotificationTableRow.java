package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A generic container for paginated results returned to the client.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PagedResultOfNotificationTableRow implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Opaque storage continuation token.  `null`  the current page was the last page.
     */
    private String continuationToken;
    /**
     * The subset of items returned for the current page.
     */
    private java.util.List<NotificationTableRow> items;
    /**
     * The number of items returned per page in the response. This may reflect the client&apos;s requested page size, or a server-defined default or limit.
     */
    private Integer pageSize;
    /**
     * The total number of items that match the query across all pages. May be null if the count is not computed or not applicable (e.g., in continuation-based pagination).
     */
    private UntypedNode totalCount;
    /**
     * Instantiates a new {@link PagedResultOfNotificationTableRow} and sets the default values.
     */
    public PagedResultOfNotificationTableRow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PagedResultOfNotificationTableRow}
     */
    @jakarta.annotation.Nonnull
    public static PagedResultOfNotificationTableRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PagedResultOfNotificationTableRow();
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
     * Gets the continuationToken property value. Opaque storage continuation token.  `null`  the current page was the last page.
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
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(NotificationTableRow::createFromDiscriminatorValue)); });
        deserializerMap.put("pageSize", (n) -> { this.setPageSize(n.getIntegerValue()); });
        deserializerMap.put("totalCount", (n) -> { this.setTotalCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the items property value. The subset of items returned for the current page.
     * @return a {@link java.util.List<NotificationTableRow>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<NotificationTableRow> getItems() {
        return this.items;
    }
    /**
     * Gets the pageSize property value. The number of items returned per page in the response. This may reflect the client&apos;s requested page size, or a server-defined default or limit.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPageSize() {
        return this.pageSize;
    }
    /**
     * Gets the totalCount property value. The total number of items that match the query across all pages. May be null if the count is not computed or not applicable (e.g., in continuation-based pagination).
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getTotalCount() {
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
        writer.writeObjectValue("totalCount", this.getTotalCount());
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
     * Sets the continuationToken property value. Opaque storage continuation token.  `null`  the current page was the last page.
     * @param value Value to set for the continuationToken property.
     */
    public void setContinuationToken(@jakarta.annotation.Nullable final String value) {
        this.continuationToken = value;
    }
    /**
     * Sets the items property value. The subset of items returned for the current page.
     * @param value Value to set for the items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<NotificationTableRow> value) {
        this.items = value;
    }
    /**
     * Sets the pageSize property value. The number of items returned per page in the response. This may reflect the client&apos;s requested page size, or a server-defined default or limit.
     * @param value Value to set for the pageSize property.
     */
    public void setPageSize(@jakarta.annotation.Nullable final Integer value) {
        this.pageSize = value;
    }
    /**
     * Sets the totalCount property value. The total number of items that match the query across all pages. May be null if the count is not computed or not applicable (e.g., in continuation-based pagination).
     * @param value Value to set for the totalCount property.
     */
    public void setTotalCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.totalCount = value;
    }
}
