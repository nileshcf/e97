package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504CurrentTagTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip65504CurrentTagTable")

@Data
public class Ip65504CurrentTagTable extends Ip65504CurrentTagTableSerialized  implements InitializingBean {
   
			@Getter @Setter private List<Ip65504TagArea> ip65504TagArea = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip65504CurrentTagTable
	**/
    public Ip65504CurrentTagTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_65504_TAG_AREA_SIZE;arrayIndex++) {
						getIp65504TagArea().add(new Ip65504TagArea(this, beginIp65504TagArea + 
						arrayIndex * Ip65504TagArea.getIp65504TagAreaFieldLength()));
				}
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip65504CurrentTagTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip65504TagArea.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_65504_TAG_AREA_SIZE;index++) {
              Ip65504TagArea  newElement = new Ip65504TagArea(this,beginIp65504TagArea + index * Ip65504TagArea.getIp65504TagAreaFieldLength());
              newElement.initialize();
              getIp65504TagArea().add(newElement);
          }
     } else {
        if (ip65504TagArea.size() < IP_65504_TAG_AREA_SIZE) {
          // prefill it first
          for (int index = ip65504TagArea.size();index <  IP_65504_TAG_AREA_SIZE;index++) {
              Ip65504TagArea  newElement = new Ip65504TagArea(this,beginIp65504TagArea + index * Ip65504TagArea.getIp65504TagAreaFieldLength());
              getIp65504TagArea().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_65504_TAG_AREA_SIZE;index++) {
     		Ip65504TagArea ip65504TagAreaVar = ip65504TagArea.get(index);
 			if (ip65504TagAreaVar == null) {
                ip65504TagAreaVar = new Ip65504TagArea(this,beginIp65504TagArea + index * Ip65504TagArea.getIp65504TagAreaFieldLength());
                  getIp65504TagArea().set(index, ip65504TagAreaVar);
			} 
			ip65504TagAreaVar.initialize();
		}
     }
   }


}
  
