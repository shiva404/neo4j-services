package com.campusconnect.neo4j.akka.goodreads.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"@start",
"@end",
"@total",
"user"
})
public class Friends {

@JsonProperty("@start")
private String Start;
@JsonProperty("@end")
private String End;
@JsonProperty("@total")
private String Total;
@JsonProperty("user")
private List<User> user = new ArrayList<User>();
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The Start
*/
@JsonProperty("@start")
public String getStart() {
return Start;
}

/**
* 
* @param Start
* The @start
*/
@JsonProperty("@start")
public void setStart(String Start) {
this.Start = Start;
}

/**
* 
* @return
* The End
*/
@JsonProperty("@end")
public String getEnd() {
return End;
}

/**
* 
* @param End
* The @end
*/
@JsonProperty("@end")
public void setEnd(String End) {
this.End = End;
}

/**
* 
* @return
* The Total
*/
@JsonProperty("@total")
public String getTotal() {
return Total;
}

/**
* 
* @param Total
* The @total
*/
@JsonProperty("@total")
public void setTotal(String Total) {
this.Total = Total;
}

/**
* 
* @return
* The user
*/
@JsonProperty("user")
public List<User> getUser() {
return user;
}

/**
* 
* @param user
* The user
*/
@JsonProperty("user")
public void setUser(List<User> user) {
this.user = user;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}