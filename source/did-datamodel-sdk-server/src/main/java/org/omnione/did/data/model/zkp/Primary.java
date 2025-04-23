package org.omnione.did.data.model.zkp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.omnione.did.data.model.DataObject;
import org.omnione.did.data.model.util.json.GsonWrapper;

@Getter
@Setter
public class Primary extends DataObject {


  @SerializedName("n")
  @Expose
  @NotEmpty
  private String n;

  @SerializedName("z")
  @Expose
  @NotEmpty
  private String z;

  @SerializedName("s")
  @Expose
  @NotEmpty
  private String s;

  @SerializedName("r")
  @Expose
  @NotEmpty
  private ZKPValue r;

  @SerializedName("rctxt")
  @Expose
  @NotEmpty
  private String rctxt;

  @Override
  public void fromJson(String val) {
    GsonWrapper gson = new GsonWrapper();
    Primary data = gson.fromJson(
        val,
        Primary.class
    );

    n = data.n;
    z = data.z;
    s = data.s;
    r = data.r;
    rctxt = data.rctxt;
  }
}
