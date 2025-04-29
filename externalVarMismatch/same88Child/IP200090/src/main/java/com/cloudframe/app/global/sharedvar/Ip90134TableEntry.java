package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip90134TableEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip90134TableEntry")

@Data
public class Ip90134TableEntry extends Ip90134TableEntrySerialized  implements InitializingBean {
   
				@Getter @Setter private Ip90134EditGroupKey ip90134EditGroupKey = new Ip90134EditGroupKey();

								@Getter @Setter private int ip90134PositionStart;

								@Getter @Setter private int ip90134PositionEnd;
	
	/**
	* Constructor for Ip90134TableEntry
	**/
    public Ip90134TableEntry() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp90134EditGroupKey().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip90134TableEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp90134EditGroupKey().initialize();
     
                     setIp90134PositionStart(0);
                     setIp90134PositionEnd(0);
   }


}
  
