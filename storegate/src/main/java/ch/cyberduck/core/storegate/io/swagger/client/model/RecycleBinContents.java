/*
 * Storegate.Web
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.storegate.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import ch.cyberduck.core.storegate.io.swagger.client.model.RecycleBinItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Contains a list of recyclebin items.
 */
@ApiModel(description = "Contains a list of recyclebin items.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-16T20:27:33.275+02:00")
public class RecycleBinContents {
  @JsonProperty("totalRowCount")
  private Integer totalRowCount = null;

  @JsonProperty("recycleBinItems")
  private List<RecycleBinItem> recycleBinItems = null;

  public RecycleBinContents totalRowCount(Integer totalRowCount) {
    this.totalRowCount = totalRowCount;
    return this;
  }

   /**
   * Total number of item.
   * @return totalRowCount
  **/
  @ApiModelProperty(value = "Total number of item.")
  public Integer getTotalRowCount() {
    return totalRowCount;
  }

  public void setTotalRowCount(Integer totalRowCount) {
    this.totalRowCount = totalRowCount;
  }

  public RecycleBinContents recycleBinItems(List<RecycleBinItem> recycleBinItems) {
    this.recycleBinItems = recycleBinItems;
    return this;
  }

  public RecycleBinContents addRecycleBinItemsItem(RecycleBinItem recycleBinItemsItem) {
    if (this.recycleBinItems == null) {
      this.recycleBinItems = new ArrayList<>();
    }
    this.recycleBinItems.add(recycleBinItemsItem);
    return this;
  }

   /**
   * The list of items.
   * @return recycleBinItems
  **/
  @ApiModelProperty(value = "The list of items.")
  public List<RecycleBinItem> getRecycleBinItems() {
    return recycleBinItems;
  }

  public void setRecycleBinItems(List<RecycleBinItem> recycleBinItems) {
    this.recycleBinItems = recycleBinItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecycleBinContents recycleBinContents = (RecycleBinContents) o;
    return Objects.equals(this.totalRowCount, recycleBinContents.totalRowCount) &&
        Objects.equals(this.recycleBinItems, recycleBinContents.recycleBinItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRowCount, recycleBinItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecycleBinContents {\n");
    
    sb.append("    totalRowCount: ").append(toIndentedString(totalRowCount)).append("\n");
    sb.append("    recycleBinItems: ").append(toIndentedString(recycleBinItems)).append("\n");
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

