package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip3oo8o1EditsPerfTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip3oo8o1EditsPerfTbl")

@Data
public class Ip3oo8o1EditsPerfTbl extends Ip3oo8o1EditsPerfTblSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip3oo8o1EditsHolder = Field.fillLowValue(4000);
				@Getter @Setter private Ip3oo8o1EditsPerfEntry ip3oo8o1EditsPerfEntry = new Ip3oo8o1EditsPerfEntry();

						@Getter @Setter private char[] ip3oo8o1EditsInitStr = Field.fillLowValue(4000);
	
	/**
	* Constructor for Ip3oo8o1EditsPerfTbl
	**/
    public Ip3oo8o1EditsPerfTbl() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp3oo8o1EditsPerfEntry().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip3oo8o1EditsPerfTbl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp3oo8o1EditsHolder(CONSTANTS.SPACE_4000);
         setIp3oo8o1EditsInitStr(CONSTANTS.SPACE_4000);
   }


}
  
