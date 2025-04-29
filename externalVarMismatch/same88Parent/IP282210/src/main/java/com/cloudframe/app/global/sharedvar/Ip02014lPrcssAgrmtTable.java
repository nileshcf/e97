package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014lPrcssAgrmtTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip02014lPrcssAgrmtTable")

@Data
public class Ip02014lPrcssAgrmtTable extends Ip02014lPrcssAgrmtTableSerialized  implements InitializingBean {
   
				@Getter @Setter private Ip02014lTableDataKey ip02014lTableDataKey = new Ip02014lTableDataKey();
				@Getter @Setter private Ip02014lTableDataFields ip02014lTableDataFields = new Ip02014lTableDataFields();
	
	/**
	* Constructor for Ip02014lPrcssAgrmtTable
	**/
    public Ip02014lPrcssAgrmtTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp02014lTableDataKey().setParent(this,getStartOffset() + 0);
					getIp02014lTableDataFields().setParent(this,getStartOffset() + 11);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip02014lPrcssAgrmtTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp02014lTableDataKey().initialize();
     
          getIp02014lTableDataFields().initialize();
     
   }


}
  
