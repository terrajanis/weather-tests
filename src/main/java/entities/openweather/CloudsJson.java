
package entities.openweather;

import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import lombok.Data;

@Data
public class CloudsJson {

    @JsonSchema(required = true)
    private Long all;
}
