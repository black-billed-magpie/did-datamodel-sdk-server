package org.omnione.did.data.model.zkp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotEmpty;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.omnione.did.data.model.DataObject;
import org.omnione.did.data.model.util.json.GsonWrapper;

@Getter
@Setter
public class ZKPCredentialSchema extends DataObject {

  @SerializedName("id")
  @Expose
  @NotEmpty
  private String id;

  @SerializedName("name")
  @Expose
  @NotEmpty
  private String name;

  @SerializedName("version")
  @Expose
  @NotEmpty
  private String version;

  @SerializedName("attrNames")
  @Expose
  @NotEmpty
  private List<String> attrNames;

  @SerializedName("tag")
  @Expose
  @NotEmpty
  private String tag;

  @Override
  public void fromJson(String val) {
    GsonWrapper gson = new GsonWrapper();
    ZKPCredentialSchema data = gson.fromJson(
        val,
        ZKPCredentialSchema.class
    );

    id = data.id;
    name = data.name;
    version = data.version;
    attrNames = data.attrNames;
    tag = data.tag;
  }
}
