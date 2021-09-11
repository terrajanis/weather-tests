
package entities.openweather;

import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import javax.validation.constraints.Null;
import lombok.Data;

@Data
public class WindJson {

    @JsonSchema(required = true)
    private Long deg;

    @Null
    @JsonSchema
    private Double gust;

    @JsonSchema(required = true)
    private Double speed;
}
