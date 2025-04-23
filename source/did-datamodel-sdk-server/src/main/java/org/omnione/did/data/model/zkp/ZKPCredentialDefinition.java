package org.omnione.did.data.model.zkp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotEmpty;
import org.omnione.did.data.model.DataObject;
import org.omnione.did.data.model.util.json.GsonWrapper;

public class ZKPCredentialDefinition extends DataObject {

  @SerializedName("id")
  @Expose
  @NotEmpty
  private String id;

  @SerializedName("schemaId")
  @Expose
  @NotEmpty
  private String schemaId;

  @SerializedName("ver")
  @Expose
  @NotEmpty
  private String ver;

  @SerializedName("type")
  @Expose
  @NotEmpty
  private String type;

  @SerializedName("primary")
  @Expose
  @NotEmpty
  private Primary primary;

  @SerializedName("tag")
  @Expose
  @NotEmpty
  private String tag;


  @Override
  public void fromJson(String val) {
    GsonWrapper gson = new GsonWrapper();
    ZKPCredentialDefinition data = gson.fromJson(
        val,
        ZKPCredentialDefinition.class
    );

    id = data.id;
    schemaId = data.schemaId;
    ver = data.ver;
    type = data.type;
    primary = data.primary;
    tag = data.tag;
    
  }
}
