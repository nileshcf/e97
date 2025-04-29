package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0007o4DeSubAttrRow is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip0007o4DeSubAttrRow extends Ip0007o4DeSubAttrRowSerialized { 
   

								@Getter @Setter private short ip0007o4DeNo;

								@Getter @Setter private short ip0007o4DeSubNo;

						@Getter @Setter private char[] ip0007o4DeSubName = Field.fillLowValue(57);

						@Getter @Setter private char[] ip0007o4DeSubFormat = Field.fillLowValue(3);

								@Getter @Setter private short ip0007o4DeSubStart;

								@Getter @Setter private short ip0007o4DeSubMinLngth;

								@Getter @Setter private short ip0007o4DeSubMaxLngth;
	
	/**
	* Constructor for Ip0007o4DeSubAttrRow
	**/
    public Ip0007o4DeSubAttrRow() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip0007o4DeSubAttrRow. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0007o4DeSubAttrRow(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip0007o4DeSubAttrRow
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp0007o4DeNo((short)0);
         	setIp0007o4DeSubNo((short)0);
         setIp0007o4DeSubName(CONSTANTS.SPACE_57);
         setIp0007o4DeSubFormat(CONSTANTS.SPACE_3);
         	setIp0007o4DeSubStart((short)0);
         	setIp0007o4DeSubMinLngth((short)0);
         	setIp0007o4DeSubMaxLngth((short)0);
   }


}
  
