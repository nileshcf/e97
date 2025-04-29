package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014PrcssAgrmtTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip02014PrcssAgrmtTable")

@Data
public class Ip02014PrcssAgrmtTable extends Ip02014PrcssAgrmtTableSerialized  implements InitializingBean {
   
				@Getter @Setter private Ip02014TableDataKey ip02014TableDataKey = new Ip02014TableDataKey();
				@Getter @Setter private Ip02014TableDataFields ip02014TableDataFields = new Ip02014TableDataFields();
	
	/**
	* Constructor for Ip02014PrcssAgrmtTable
	**/
    public Ip02014PrcssAgrmtTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp02014TableDataKey().setParent(this,getStartOffset() + 0);
					getIp02014TableDataFields().setParent(this,getStartOffset() + 11);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip02014PrcssAgrmtTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp02014TableDataKey().initialize();
     
          getIp02014TableDataFields().initialize();
     
   }


}
  
