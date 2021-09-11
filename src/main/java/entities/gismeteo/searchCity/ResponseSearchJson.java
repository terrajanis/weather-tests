
package entities.gismeteo.searchCity;

import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import entities.gismeteo.searchCity.ItemJson;
import lombok.Data;

import java.util.List;

@Data
public class ResponseSearchJson {

    @JsonSchema(required = true)
    private List<ItemJson> items;

    @JsonSchema(required = true)
    private Long total;
}
