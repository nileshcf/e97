package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip00901TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip00901TableData extends Ip00901TableDataSerialized { 
   

						@Getter @Setter private char[] ip00901BsAccRngL = Field.fillLowValue(19);

						@Getter @Setter private char[] ip00901BsArBusSrvLvl = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00901BsArBusSrvId = Field.fillLowValue(6);

						@Getter @Setter private char[] ip00901BsArAccBrand = Field.fillLowValue(3);

						@Getter @Setter private char[] ip00901BsAccRngH = Field.fillLowValue(19);

								@Getter @Setter private int ip00901BsArBsPriority;

								@Getter @Setter private int ip00901BsArAbPriority;

						@Getter @Setter private char[] ip00901BsArLifecylInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00901BsArBsseCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00901Filler = Field.fillLowValue(7);
	
	/**
	* Constructor for Ip00901TableData
	**/
    public Ip00901TableData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00901TableData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00901TableData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00901TableData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00901BsAccRngL(CONSTANTS.SPACE_19);
         setIp00901BsArBusSrvLvl(CONSTANTS.SPACE);
         setIp00901BsArBusSrvId(CONSTANTS.SPACE_6);
         setIp00901BsArAccBrand(CONSTANTS.SPACE_3);
         setIp00901BsAccRngH(CONSTANTS.SPACE_19);
                     setIp00901BsArBsPriority(0);
                     setIp00901BsArAbPriority(0);
         setIp00901BsArLifecylInd(CONSTANTS.SPACE);
         setIp00901BsArBsseCd(CONSTANTS.SPACE);
         setIp00901Filler(CONSTANTS.SPACE_7);
   }


}
  
