package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02044ArPa is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip02044ArPa")

@Data
public class Ip02044ArPa extends Ip02044ArPaSerialized  implements InitializingBean {
   
				@Getter @Setter private Ip02044TableDataKey ip02044TableDataKey = new Ip02044TableDataKey();
				@Getter @Setter private Ip02044TableDataFields ip02044TableDataFields = new Ip02044TableDataFields();
	
	/**
	* Constructor for Ip02044ArPa
	**/
    public Ip02044ArPa() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp02044TableDataKey().setParent(this,getStartOffset() + 0);
					getIp02044TableDataFields().setParent(this,getStartOffset() + 19);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip02044ArPa
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp02044TableDataKey().initialize();
     
          getIp02044TableDataFields().initialize();
     
   }


}
  
