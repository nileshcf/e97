package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip00901BsArMaster is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip00901BsArMaster extends Ip00901BsArMasterSerialized {
   

						@Getter @Setter private char[] ip00901EffectiveDate = Field.fillLowValue(10);

						@Getter @Setter private char[] ip00901ActiveInactive = Field.fillLowValue(1);
				@Getter @Setter private Ip00901ParameterMasterData ip00901ParameterMasterData = new Ip00901ParameterMasterData();
				@Getter @Setter private Ip00901TableData ip00901TableData = new Ip00901TableData();
	
	/**
	* Constructor for Ip00901BsArMaster
	**/
    public Ip00901BsArMaster() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIp00901ParameterMasterData().setParent(this,getStartOffset() + 11);
					getIp00901TableData().setParent(this,getStartOffset() + 19);
	   	/*  end of offset */
    }



	/**
	 * 	initializes Ip00901BsArMaster
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00901EffectiveDate(CONSTANTS.SPACE_10);
         setIp00901ActiveInactive(CONSTANTS.SPACE);
          getIp00901ParameterMasterData().initialize();
     
          getIp00901TableData().initialize();
     
   }


}
  
