package com.cloudframe.app.global.sharedvar;

/**
*  The class MiscData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_miscData")

@Data
public class MiscData extends MiscDataSerialized  implements InitializingBean {
   

								@Getter @Setter private int xmlStat;

								@Getter @Setter private long recLenIn;

								@Getter @Setter private short eofFlag;
	
	/**
	* Constructor for MiscData
	**/
    public MiscData() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


	/**
	 * 	initializes MiscData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setXmlStat(0);
                     setRecLenIn(0);
         	setEofFlag((short)0);
   }


}
  
