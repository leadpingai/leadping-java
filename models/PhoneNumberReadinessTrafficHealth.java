package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Hourly local reputation-risk estimate using 24-hour, seven-day, and thirty-day traffic evidence.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumberReadinessTrafficHealth extends PhoneNumberTrafficHealth implements Parsable {
    /**
     * Instantiates a new {@link PhoneNumberReadinessTrafficHealth} and sets the default values.
     */
    public PhoneNumberReadinessTrafficHealth() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneNumberReadinessTrafficHealth}
     */
    @jakarta.annotation.Nonnull
    public static PhoneNumberReadinessTrafficHealth createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneNumberReadinessTrafficHealth();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
}
