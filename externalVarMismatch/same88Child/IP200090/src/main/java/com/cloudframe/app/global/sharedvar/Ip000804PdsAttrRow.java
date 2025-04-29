package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip000804PdsAttrRow is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip000804PdsAttrRow extends Ip000804PdsAttrRowSerialized { 
   

						@Getter @Setter private char[] ip000804PdsName = Field.fillLowValue(57);

						@Getter @Setter private char[] ip000804PdsFormat = Field.fillLowValue(3);

								@Getter @Setter private short ip000804PdsMinLngth;

								@Getter @Setter private short ip000804PdsMaxLngth;

								@Getter @Setter private short ip000804PdsSubflds;

								@Getter @Setter private int ip000804PdsFirstSubfld;

						@Getter @Setter private char[] ip000804PdsFirstSubfldRedefined = Field.fillLowValue(4);
	
	/**
	* Constructor for Ip000804PdsAttrRow
	**/
    public Ip000804PdsAttrRow() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip000804PdsAttrRow. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip000804PdsAttrRow(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip000804PdsAttrRow
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp000804PdsName(CONSTANTS.SPACE_57);
         setIp000804PdsFormat(CONSTANTS.SPACE_3);
         	setIp000804PdsMinLngth((short)0);
         	setIp000804PdsMaxLngth((short)0);
         	setIp000804PdsSubflds((short)0);
                     setIp000804PdsFirstSubfld(0);
   }


}
  
