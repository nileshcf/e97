package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip66601UserTagTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


@Data
public class Ip66601UserTagTable extends Ip66601UserTagTableSerialized { 
   
			@Getter @Setter private List<Ip66601UserTag> ip66601UserTag = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip66601UserTagTable
	**/
    public Ip66601UserTagTable() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip66601UserTagTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66601UserTagTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip66601UserTagTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip66601UserTag.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_66601_USER_TAG_SIZE;index++) {
              Ip66601UserTag  newElement = new Ip66601UserTag(this,beginIp66601UserTag + index * Ip66601UserTag.getIp66601UserTagFieldLength());
              newElement.initialize();
              getIp66601UserTag().add(newElement);
          }
     } else {
        if (ip66601UserTag.size() < IP_66601_USER_TAG_SIZE) {
          // prefill it first
          for (int index = ip66601UserTag.size();index <  IP_66601_USER_TAG_SIZE;index++) {
              Ip66601UserTag  newElement = new Ip66601UserTag(this,beginIp66601UserTag + index * Ip66601UserTag.getIp66601UserTagFieldLength());
              getIp66601UserTag().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_66601_USER_TAG_SIZE;index++) {
     		Ip66601UserTag ip66601UserTagVar = ip66601UserTag.get(index);
 			if (ip66601UserTagVar == null) {
                ip66601UserTagVar = new Ip66601UserTag(this,beginIp66601UserTag + index * Ip66601UserTag.getIp66601UserTagFieldLength());
                  getIp66601UserTag().set(index, ip66601UserTagVar);
			} 
			ip66601UserTagVar.initialize();
		}
     }
   }


}
  
