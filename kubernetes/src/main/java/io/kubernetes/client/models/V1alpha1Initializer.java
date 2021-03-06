/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.11.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1alpha1Rule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Initializer describes the name and the failure policy of an initializer, and what resources it applies to.
 */
@ApiModel(description = "Initializer describes the name and the failure policy of an initializer, and what resources it applies to.")

public class V1alpha1Initializer {
  @SerializedName("name")
  private String name = null;

  @SerializedName("rules")
  private List<V1alpha1Rule> rules = null;

  public V1alpha1Initializer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name is the identifier of the initializer. It will be added to the object that needs to be initialized. Name should be fully qualified, e.g., alwayspullimages.kubernetes.io, where \&quot;alwayspullimages\&quot; is the name of the webhook, and kubernetes.io is the name of the organization. Required
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is the identifier of the initializer. It will be added to the object that needs to be initialized. Name should be fully qualified, e.g., alwayspullimages.kubernetes.io, where \"alwayspullimages\" is the name of the webhook, and kubernetes.io is the name of the organization. Required")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1alpha1Initializer rules(List<V1alpha1Rule> rules) {
    this.rules = rules;
    return this;
  }

  public V1alpha1Initializer addRulesItem(V1alpha1Rule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<V1alpha1Rule>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Rules describes what resources/subresources the initializer cares about. The initializer cares about an operation if it matches _any_ Rule. Rule.Resources must not include subresources.
   * @return rules
  **/
  @ApiModelProperty(value = "Rules describes what resources/subresources the initializer cares about. The initializer cares about an operation if it matches _any_ Rule. Rule.Resources must not include subresources.")
  public List<V1alpha1Rule> getRules() {
    return rules;
  }

  public void setRules(List<V1alpha1Rule> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1Initializer v1alpha1Initializer = (V1alpha1Initializer) o;
    return Objects.equals(this.name, v1alpha1Initializer.name) &&
        Objects.equals(this.rules, v1alpha1Initializer.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1Initializer {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

