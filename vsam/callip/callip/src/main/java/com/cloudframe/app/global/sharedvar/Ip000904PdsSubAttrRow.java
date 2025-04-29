package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip000904PdsSubAttrRow is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip000904PdsSubAttrRow extends Ip000904PdsSubAttrRowSerialized { 
   

								@Getter @Setter private short ip000904PdsNo;

								@Getter @Setter private short ip000904PdsSubNo;

						@Getter @Setter private char[] ip000904PdsSubName = Field.fillLowValue(57);

						@Getter @Setter private char[] ip000904PdsSubFormat = Field.fillLowValue(3);

								@Getter @Setter private short ip000904PdsSubStart;

								@Getter @Setter private short ip000904PdsSubMinLngth;

								@Getter @Setter private short ip000904PdsSubMaxLngth;
	
	/**
	* Constructor for Ip000904PdsSubAttrRow
	**/
    public Ip000904PdsSubAttrRow() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip000904PdsSubAttrRow. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip000904PdsSubAttrRow(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip000904PdsSubAttrRow
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp000904PdsNo((short)0);
         	setIp000904PdsSubNo((short)0);
         setIp000904PdsSubName(CONSTANTS.SPACE_57);
         setIp000904PdsSubFormat(CONSTANTS.SPACE_3);
         	setIp000904PdsSubStart((short)0);
         	setIp000904PdsSubMinLngth((short)0);
         	setIp000904PdsSubMaxLngth((short)0);
   }


}
  
