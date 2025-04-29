package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051pmrTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip7051pmrTable")

@Data
public class Ip7051pmrTable extends Ip7051pmrTableSerialized  implements InitializingBean {
   
				@Getter @Setter private Ip7051pmrTableKey ip7051pmrTableKey = new Ip7051pmrTableKey();

						@Getter @Setter private char[] ip7051pmrMqBypassSw = Field.fillLowValue(1);
				@Getter @Setter private Ip7051pmrRequestDetails ip7051pmrRequestDetails = new Ip7051pmrRequestDetails();
				@Getter @Setter private Ip7051pmrResponseDetails ip7051pmrResponseDetails = new Ip7051pmrResponseDetails();
	
	/**
	* Constructor for Ip7051pmrTable
	**/
    public Ip7051pmrTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp7051pmrTableKey().setParent(this,getStartOffset() + 0);
					getIp7051pmrRequestDetails().setParent(this,getStartOffset() + 33);
					getIp7051pmrResponseDetails().setParent(this,getStartOffset() + 129);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip7051pmrTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp7051pmrTableKey().initialize();
     
         setIp7051pmrMqBypassSw(CONSTANTS.SPACE);
          getIp7051pmrRequestDetails().initialize();
     
          getIp7051pmrResponseDetails().initialize();
     
   }


}
  
