package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip00911BsBinMaster is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip00911BsBinMaster extends Ip00911BsBinMasterSerialized {
   

						@Getter @Setter private char[] ip00911EffectiveDate = Field.fillLowValue(10);

						@Getter @Setter private char[] ip00911ActiveInactive = Field.fillLowValue(1);
				@Getter @Setter private Ip00911ParameterMasterData ip00911ParameterMasterData = new Ip00911ParameterMasterData();
				@Getter @Setter private Ip00911TableData ip00911TableData = new Ip00911TableData();
	
	/**
	* Constructor for Ip00911BsBinMaster
	**/
    public Ip00911BsBinMaster() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIp00911ParameterMasterData().setParent(this,getStartOffset() + 11);
					getIp00911TableData().setParent(this,getStartOffset() + 19);
	   	/*  end of offset */
    }



	/**
	 * 	initializes Ip00911BsBinMaster
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00911EffectiveDate(CONSTANTS.SPACE_10);
         setIp00911ActiveInactive(CONSTANTS.SPACE);
          getIp00911ParameterMasterData().initialize();
     
          getIp00911TableData().initialize();
     
   }


}
  
