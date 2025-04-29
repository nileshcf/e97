package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0041BinTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip0041BinTable extends Ip0041BinTableSerialized {
   

						@Getter @Setter private char[] ip0041EffectiveDate = Field.fillLowValue(10);

						@Getter @Setter private char[] ip0041ActiveInactive = Field.fillLowValue(1);
				@Getter @Setter private Ip0041ParameterMasterData ip0041ParameterMasterData = new Ip0041ParameterMasterData();
				@Getter @Setter private Ip0041TableData ip0041TableData = new Ip0041TableData();
	
	/**
	* Constructor for Ip0041BinTable
	**/
    public Ip0041BinTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIp0041ParameterMasterData().setParent(this,getStartOffset() + 11);
					getIp0041TableData().setParent(this,getStartOffset() + 19);
	   	/*  end of offset */
    }



	/**
	 * 	initializes Ip0041BinTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp0041EffectiveDate(CONSTANTS.SPACE_10);
         setIp0041ActiveInactive(CONSTANTS.SPACE);
          getIp0041ParameterMasterData().initialize();
     
          getIp0041TableData().initialize();
     
   }


}
  
