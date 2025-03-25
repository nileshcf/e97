package org.optum.uhg.rest.cics0009;

/**
*  The class DfhcommareaGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 23:15.
**/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;

public class DfhcommareaGroup { 	
   protected Logger logger = LoggerFactory.getLogger(DfhcommareaGroup.class);

   /*  Child Field declaration */
                  private String dfhcommarea = "";
   /*  End of Field declaration */
	
	
   
	/**
	 *	Returns the value of dfhcommarea
	 *	@return dfhcommarea
	 */
   public String getDfhcommarea() {           
   		return dfhcommarea;
   }

  
	/**
	*  set variable dfhcommarea
	*  @param value
	**/
   public void setDfhcommarea(String value) {
	dfhcommarea = value.trim(); 
   }   
 @JsonIgnore
public void setDfhcommareaGroup(org.optum.uhg.dto.cics0009.DfhcommareaGroup dfhcommareaGroup)  throws CFException{
            if (dfhcommarea != null && !dfhcommarea.isEmpty()) {
                dfhcommareaGroup.setDfhcommarea(dfhcommarea.toCharArray());
            }
 }
 
 @JsonIgnore
public void populateFrom(org.optum.uhg.dto.cics0009.DfhcommareaGroup dfhcommareaGroup)  throws CFException {
            setDfhcommarea(String.valueOf(dfhcommareaGroup.getDfhcommarea()));
  }

}
  
