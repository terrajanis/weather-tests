
package entities.gismeteo;

import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import lombok.Data;

@Data
public class MetaJson {

    @JsonSchema(required = true)
    private String code;

    @JsonSchema(required = true)
    private String message;
}
