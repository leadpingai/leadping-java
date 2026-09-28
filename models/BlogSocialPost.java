package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Records a social publication attempt. An attempt without a post ID must be reviewed before retrying.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BlogSocialPost implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The attemptedAt property
     */
    private OffsetDateTime attemptedAt;
    /**
     * The error property
     */
    private String error;
    /**
     * The platform property
     */
    private BlogSocialPlatform platform;
    /**
     * The postId property
     */
    private String postId;
    /**
     * Instantiates a new {@link BlogSocialPost} and sets the default values.
     */
    public BlogSocialPost() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BlogSocialPost}
     */
    @jakarta.annotation.Nonnull
    public static BlogSocialPost createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BlogSocialPost();
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
     * Gets the attemptedAt property value. The attemptedAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAttemptedAt() {
        return this.attemptedAt;
    }
    /**
     * Gets the error property value. The error property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getError() {
        return this.error;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("attemptedAt", (n) -> { this.setAttemptedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("error", (n) -> { this.setError(n.getStringValue()); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getEnumValue(BlogSocialPlatform::forValue)); });
        deserializerMap.put("postId", (n) -> { this.setPostId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the platform property value. The platform property
     * @return a {@link BlogSocialPlatform}
     */
    @jakarta.annotation.Nullable
    public BlogSocialPlatform getPlatform() {
        return this.platform;
    }
    /**
     * Gets the postId property value. The postId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPostId() {
        return this.postId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("attemptedAt", this.getAttemptedAt());
        writer.writeStringValue("error", this.getError());
        writer.writeEnumValue("platform", this.getPlatform());
        writer.writeStringValue("postId", this.getPostId());
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
     * Sets the attemptedAt property value. The attemptedAt property
     * @param value Value to set for the attemptedAt property.
     */
    public void setAttemptedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.attemptedAt = value;
    }
    /**
     * Sets the error property value. The error property
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final String value) {
        this.error = value;
    }
    /**
     * Sets the platform property value. The platform property
     * @param value Value to set for the platform property.
     */
    public void setPlatform(@jakarta.annotation.Nullable final BlogSocialPlatform value) {
        this.platform = value;
    }
    /**
     * Sets the postId property value. The postId property
     * @param value Value to set for the postId property.
     */
    public void setPostId(@jakarta.annotation.Nullable final String value) {
        this.postId = value;
    }
}
