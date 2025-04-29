package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip000704DeSubAttrRow is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip000704DeSubAttrRow extends Ip000704DeSubAttrRowSerialized { 
   

								@Getter @Setter private short ip000704DeNo;

								@Getter @Setter private short ip000704DeSubNo;

						@Getter @Setter private char[] ip000704DeSubName = Field.fillLowValue(57);

						@Getter @Setter private char[] ip000704DeSubFormat = Field.fillLowValue(3);

								@Getter @Setter private short ip000704DeSubStart;

								@Getter @Setter private short ip000704DeSubMinLngth;

								@Getter @Setter private short ip000704DeSubMaxLngth;
	
	/**
	* Constructor for Ip000704DeSubAttrRow
	**/
    public Ip000704DeSubAttrRow() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip000704DeSubAttrRow. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip000704DeSubAttrRow(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip000704DeSubAttrRow
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp000704DeNo((short)0);
         	setIp000704DeSubNo((short)0);
         setIp000704DeSubName(CONSTANTS.SPACE_57);
         setIp000704DeSubFormat(CONSTANTS.SPACE_3);
         	setIp000704DeSubStart((short)0);
         	setIp000704DeSubMinLngth((short)0);
         	setIp000704DeSubMaxLngth((short)0);
   }


}
  
