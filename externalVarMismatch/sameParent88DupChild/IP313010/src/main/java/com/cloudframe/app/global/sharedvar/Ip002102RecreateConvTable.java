package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip002102RecreateConvTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip002102RecreateConvTable")

@Data
public class Ip002102RecreateConvTable extends Ip002102RecreateConvTableSerialized  implements InitializingBean {
   

								@Getter @Setter private int ip002102RowCount;
			@Getter @Setter private List<Ip002102TableData> ip002102TableData = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip002102RecreateConvTable
	**/
    public Ip002102RecreateConvTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_002102_TABLE_DATA_SIZE;arrayIndex++) {
						getIp002102TableData().add(new Ip002102TableData(this, beginIp002102TableData + 
						arrayIndex * Ip002102TableData.getIp002102TableDataFieldLength()));
				}
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip002102RecreateConvTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp002102RowCount(0);
     if (ip002102TableData.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_002102_TABLE_DATA_SIZE;index++) {
              Ip002102TableData  newElement = new Ip002102TableData(this,beginIp002102TableData + index * Ip002102TableData.getIp002102TableDataFieldLength());
              newElement.initialize();
              getIp002102TableData().add(newElement);
          }
     } else {
        if (ip002102TableData.size() < IP_002102_TABLE_DATA_SIZE) {
          // prefill it first
          for (int index = ip002102TableData.size();index <  IP_002102_TABLE_DATA_SIZE;index++) {
              Ip002102TableData  newElement = new Ip002102TableData(this,beginIp002102TableData + index * Ip002102TableData.getIp002102TableDataFieldLength());
              getIp002102TableData().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_002102_TABLE_DATA_SIZE;index++) {
     		Ip002102TableData ip002102TableDataVar = ip002102TableData.get(index);
 			if (ip002102TableDataVar == null) {
                ip002102TableDataVar = new Ip002102TableData(this,beginIp002102TableData + index * Ip002102TableData.getIp002102TableDataFieldLength());
                  getIp002102TableData().set(index, ip002102TableDataVar);
			} 
			ip002102TableDataVar.initialize();
		}
     }
   }


}
  
