
package entities.gismeteo.searchCity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import lombok.Data;

import javax.validation.constraints.Null;

@Data
public class ItemJson {

    @JsonSchema(required = true)
    private CountryJson country;

    @JsonSchema(required = true)
    private DistrictJson district;

    @JsonSchema(required = true)
    private Long id;

    @JsonSchema(required = true)
    private String kind;

    @JsonSchema(required = true)
    private String name;

    @Null
    @JsonSchema(required = true)
    private String nameP;

    @JsonSchema(required = true)
    private Long rate;

    @JsonSchema(required = true)
    @JsonProperty("sub_district")
    private SubDistrictJson subDistrict;

    @JsonSchema(required = true)
    private String url;

    @JsonSchema(required = true)
    private Long weight;
}
