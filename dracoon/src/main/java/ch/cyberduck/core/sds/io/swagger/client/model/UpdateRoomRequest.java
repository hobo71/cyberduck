/*
 * DRACOON
 * REST Web Services for DRACOON<br>Version: 4.10.7-LTS  - built at: 2019-03-19 14:24:35<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a>
 *
 * OpenAPI spec version: 4.10.7-LTS
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * UpdateRoomRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-13T14:25:40.305+02:00")
public class UpdateRoomRequest {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("quota")
  private Long quota = null;

  @JsonProperty("notes")
  private String notes = null;

  public UpdateRoomRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateRoomRequest quota(Long quota) {
    this.quota = quota;
    return this;
  }

   /**
   * Quota in byte
   * @return quota
  **/
  @ApiModelProperty(value = "Quota in byte")
  public Long getQuota() {
    return quota;
  }

  public void setQuota(Long quota) {
    this.quota = quota;
  }

  public UpdateRoomRequest notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * User notes (limited to 255 characters) Use empty string to remove.
   * @return notes
  **/
  @ApiModelProperty(value = "User notes (limited to 255 characters) Use empty string to remove.")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRoomRequest updateRoomRequest = (UpdateRoomRequest) o;
    return Objects.equals(this.name, updateRoomRequest.name) &&
        Objects.equals(this.quota, updateRoomRequest.quota) &&
        Objects.equals(this.notes, updateRoomRequest.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, quota, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRoomRequest {\n");

      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

