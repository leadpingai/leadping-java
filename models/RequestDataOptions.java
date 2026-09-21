package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Defines cursor pagination, sorting, search, exact-match filters, and range filters for a structured API query.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RequestDataOptions implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Opaque cursor returned by the previous paged response; omit it when requesting the first page and do not parse or modify it.
     */
    private String continuationToken;
    /**
     * Exact-match conditions that require each named field to equal its supplied value.
     */
    private java.util.List<ExactMatchFilter> filters;
    /**
     * Whether the response should include the total number of matching records; counting may increase query cost or latency.
     */
    private Boolean includeCount;
    /**
     * Sort instructions applied in priority order, with the first entry acting as the primary sort.
     */
    private java.util.List<OrderByOption> orderBy;
    /**
     * Maximum number of items requested for one page; the server may enforce a lower maximum or apply a default.
     */
    private Integer pageSize;
    /**
     * Range conditions that constrain comparable fields with inclusive or exclusive lower and upper bounds.
     */
    private java.util.List<RangeFilter> rangeFilters;
    /**
     * Free-text search term applied to the configured SearchFields.
     */
    private String search;
    /**
     * Serializable string field names searched for Search; supported names are determined by the queried resource.
     */
    private java.util.List<String> searchFields;
    /**
     * Instantiates a new {@link RequestDataOptions} and sets the default values.
     */
    public RequestDataOptions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RequestDataOptions}
     */
    @jakarta.annotation.Nonnull
    public static RequestDataOptions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RequestDataOptions();
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
     * Gets the continuationToken property value. Opaque cursor returned by the previous paged response; omit it when requesting the first page and do not parse or modify it.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("continuationToken", (n) -> { this.setContinuationToken(n.getStringValue()); });
        deserializerMap.put("filters", (n) -> { this.setFilters(n.getCollectionOfObjectValues(ExactMatchFilter::createFromDiscriminatorValue)); });
        deserializerMap.put("includeCount", (n) -> { this.setIncludeCount(n.getBooleanValue()); });
        deserializerMap.put("orderBy", (n) -> { this.setOrderBy(n.getCollectionOfObjectValues(OrderByOption::createFromDiscriminatorValue)); });
        deserializerMap.put("pageSize", (n) -> { this.setPageSize(n.getIntegerValue()); });
        deserializerMap.put("rangeFilters", (n) -> { this.setRangeFilters(n.getCollectionOfObjectValues(RangeFilter::createFromDiscriminatorValue)); });
        deserializerMap.put("search", (n) -> { this.setSearch(n.getStringValue()); });
        deserializerMap.put("searchFields", (n) -> { this.setSearchFields(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the filters property value. Exact-match conditions that require each named field to equal its supplied value.
     * @return a {@link java.util.List<ExactMatchFilter>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExactMatchFilter> getFilters() {
        return this.filters;
    }
    /**
     * Gets the includeCount property value. Whether the response should include the total number of matching records; counting may increase query cost or latency.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIncludeCount() {
        return this.includeCount;
    }
    /**
     * Gets the orderBy property value. Sort instructions applied in priority order, with the first entry acting as the primary sort.
     * @return a {@link java.util.List<OrderByOption>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OrderByOption> getOrderBy() {
        return this.orderBy;
    }
    /**
     * Gets the pageSize property value. Maximum number of items requested for one page; the server may enforce a lower maximum or apply a default.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPageSize() {
        return this.pageSize;
    }
    /**
     * Gets the rangeFilters property value. Range conditions that constrain comparable fields with inclusive or exclusive lower and upper bounds.
     * @return a {@link java.util.List<RangeFilter>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RangeFilter> getRangeFilters() {
        return this.rangeFilters;
    }
    /**
     * Gets the search property value. Free-text search term applied to the configured SearchFields.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSearch() {
        return this.search;
    }
    /**
     * Gets the searchFields property value. Serializable string field names searched for Search; supported names are determined by the queried resource.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSearchFields() {
        return this.searchFields;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("continuationToken", this.getContinuationToken());
        writer.writeCollectionOfObjectValues("filters", this.getFilters());
        writer.writeBooleanValue("includeCount", this.getIncludeCount());
        writer.writeCollectionOfObjectValues("orderBy", this.getOrderBy());
        writer.writeIntegerValue("pageSize", this.getPageSize());
        writer.writeCollectionOfObjectValues("rangeFilters", this.getRangeFilters());
        writer.writeStringValue("search", this.getSearch());
        writer.writeCollectionOfPrimitiveValues("searchFields", this.getSearchFields());
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
     * Sets the continuationToken property value. Opaque cursor returned by the previous paged response; omit it when requesting the first page and do not parse or modify it.
     * @param value Value to set for the continuationToken property.
     */
    public void setContinuationToken(@jakarta.annotation.Nullable final String value) {
        this.continuationToken = value;
    }
    /**
     * Sets the filters property value. Exact-match conditions that require each named field to equal its supplied value.
     * @param value Value to set for the filters property.
     */
    public void setFilters(@jakarta.annotation.Nullable final java.util.List<ExactMatchFilter> value) {
        this.filters = value;
    }
    /**
     * Sets the includeCount property value. Whether the response should include the total number of matching records; counting may increase query cost or latency.
     * @param value Value to set for the includeCount property.
     */
    public void setIncludeCount(@jakarta.annotation.Nullable final Boolean value) {
        this.includeCount = value;
    }
    /**
     * Sets the orderBy property value. Sort instructions applied in priority order, with the first entry acting as the primary sort.
     * @param value Value to set for the orderBy property.
     */
    public void setOrderBy(@jakarta.annotation.Nullable final java.util.List<OrderByOption> value) {
        this.orderBy = value;
    }
    /**
     * Sets the pageSize property value. Maximum number of items requested for one page; the server may enforce a lower maximum or apply a default.
     * @param value Value to set for the pageSize property.
     */
    public void setPageSize(@jakarta.annotation.Nullable final Integer value) {
        this.pageSize = value;
    }
    /**
     * Sets the rangeFilters property value. Range conditions that constrain comparable fields with inclusive or exclusive lower and upper bounds.
     * @param value Value to set for the rangeFilters property.
     */
    public void setRangeFilters(@jakarta.annotation.Nullable final java.util.List<RangeFilter> value) {
        this.rangeFilters = value;
    }
    /**
     * Sets the search property value. Free-text search term applied to the configured SearchFields.
     * @param value Value to set for the search property.
     */
    public void setSearch(@jakarta.annotation.Nullable final String value) {
        this.search = value;
    }
    /**
     * Sets the searchFields property value. Serializable string field names searched for Search; supported names are determined by the queried resource.
     * @param value Value to set for the searchFields property.
     */
    public void setSearchFields(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.searchFields = value;
    }
}
