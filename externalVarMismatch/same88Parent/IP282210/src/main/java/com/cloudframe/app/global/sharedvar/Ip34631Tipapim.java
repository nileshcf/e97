package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip34631Tipapim is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip34631Tipapim")

@Data
public class Ip34631Tipapim extends Ip34631TipapimSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip34631VirtualAccountNbr = Field.fillLowValue(19);
				@Getter @Setter private Ip34631CreateUpdateTs ip34631CreateUpdateTs = new Ip34631CreateUpdateTs();

						@Getter @Setter private char[] ip34631PrimAccountNbr = Field.fillLowValue(19);

						@Getter @Setter private char[] ip34631ActionCode = Field.fillLowValue(1);

						@Getter @Setter private char[] ip34631ObsAccessTs = Field.fillLowValue(26);

						@Getter @Setter private char[] ip34631ObsAccessTsN = Field.fillLowValue(1);

						@Getter @Setter private char[] ip34631EntRsnCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip34631StatCd = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip34631Tipapim
	**/
    public Ip34631Tipapim() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp34631CreateUpdateTs().setParent(this,getStartOffset() + 19);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip34631Tipapim
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp34631VirtualAccountNbr(CONSTANTS.SPACE_19);
          getIp34631CreateUpdateTs().initialize();
     
         setIp34631PrimAccountNbr(CONSTANTS.SPACE_19);
         setIp34631ActionCode(CONSTANTS.SPACE);
         setIp34631ObsAccessTs(CONSTANTS.SPACE_26);
         setIp34631ObsAccessTsN(CONSTANTS.SPACE);
         setIp34631EntRsnCd(CONSTANTS.SPACE);
         setIp34631StatCd(CONSTANTS.SPACE);
   }


}
  
