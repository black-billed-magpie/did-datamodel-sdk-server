package org.omnione.did.data.model.zkp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotEmpty;
import org.omnione.did.data.model.DataObject;
import org.omnione.did.data.model.util.json.GsonWrapper;

public class ZKPValue extends DataObject {


  @SerializedName("zkpsex")
  @Expose
  @NotEmpty
  private String zkpSex;

  @SerializedName("zkpbirth")
  @Expose
  @NotEmpty
  private String zkpBirthday;

  @SerializedName("zkpasort")
  @Expose
  @NotEmpty
  private String zkpasort;

  @SerializedName("zkpaddr")
  @Expose
  @NotEmpty
  private String zkpAddress;

  @SerializedName("zkpphone")
  @Expose
  @NotEmpty
  private String zkpPhone;

  @SerializedName("mastersecret")
  @Expose
  @NotEmpty
  private String masterSecret;

  @Override
  public void fromJson(String val) {
    GsonWrapper gson = new GsonWrapper();
    ZKPValue data = gson.fromJson(
        val,
        ZKPValue.class
    );

    zkpSex = data.zkpSex;
    zkpBirthday = data.zkpBirthday;
    zkpasort = data.zkpasort;
    zkpAddress = data.zkpAddress;
    zkpPhone = data.zkpPhone;
    masterSecret = data.masterSecret;
  }
}
