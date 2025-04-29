package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip655o4CurrentTagTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip655o4CurrentTagTable")

@Data
public class Ip655o4CurrentTagTable extends Ip655o4CurrentTagTableSerialized  implements InitializingBean {
   
			@Getter @Setter private List<Ip655o4TagArea> ip655o4TagArea = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip655o4CurrentTagTable
	**/
    public Ip655o4CurrentTagTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_655O_4_TAG_AREA_SIZE;arrayIndex++) {
						getIp655o4TagArea().add(new Ip655o4TagArea(this, beginIp655o4TagArea + 
						arrayIndex * Ip655o4TagArea.getIp655o4TagAreaFieldLength()));
				}
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip655o4CurrentTagTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip655o4TagArea.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_655O_4_TAG_AREA_SIZE;index++) {
              Ip655o4TagArea  newElement = new Ip655o4TagArea(this,beginIp655o4TagArea + index * Ip655o4TagArea.getIp655o4TagAreaFieldLength());
              newElement.initialize();
              getIp655o4TagArea().add(newElement);
          }
     } else {
        if (ip655o4TagArea.size() < IP_655O_4_TAG_AREA_SIZE) {
          // prefill it first
          for (int index = ip655o4TagArea.size();index <  IP_655O_4_TAG_AREA_SIZE;index++) {
              Ip655o4TagArea  newElement = new Ip655o4TagArea(this,beginIp655o4TagArea + index * Ip655o4TagArea.getIp655o4TagAreaFieldLength());
              getIp655o4TagArea().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_655O_4_TAG_AREA_SIZE;index++) {
     		Ip655o4TagArea ip655o4TagAreaVar = ip655o4TagArea.get(index);
 			if (ip655o4TagAreaVar == null) {
                ip655o4TagAreaVar = new Ip655o4TagArea(this,beginIp655o4TagArea + index * Ip655o4TagArea.getIp655o4TagAreaFieldLength());
                  getIp655o4TagArea().set(index, ip655o4TagAreaVar);
			} 
			ip655o4TagAreaVar.initialize();
		}
     }
   }


}
  
