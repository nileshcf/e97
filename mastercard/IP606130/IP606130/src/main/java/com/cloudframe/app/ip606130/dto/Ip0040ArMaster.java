package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0040ArMaster is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip0040ArMaster extends Ip0040ArMasterSerialized {
   

						@Getter @Setter private char[] ip0040EffectiveDate = Field.fillLowValue(10);

						@Getter @Setter private char[] ip0040ActiveInactive = Field.fillLowValue(1);
				@Getter @Setter private Ip0040ParameterMasterData ip0040ParameterMasterData = new Ip0040ParameterMasterData();
				@Getter @Setter private Ip0040TableData ip0040TableData = new Ip0040TableData();

						@Getter @Setter private char[] ip0040Filler = Field.fillLowValue(5);
	
	/**
	* Constructor for Ip0040ArMaster
	**/
    public Ip0040ArMaster() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIp0040ParameterMasterData().setParent(this,getStartOffset() + 11);
					getIp0040TableData().setParent(this,getStartOffset() + 19);
	   	/*  end of offset */
    }



	/**
	 * 	initializes Ip0040ArMaster
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp0040EffectiveDate(CONSTANTS.SPACE_10);
         setIp0040ActiveInactive(CONSTANTS.SPACE);
          getIp0040ParameterMasterData().initialize();
     
          getIp0040TableData().initialize();
     
         setIp0040Filler(CONSTANTS.SPACE_5);
   }


}
  
