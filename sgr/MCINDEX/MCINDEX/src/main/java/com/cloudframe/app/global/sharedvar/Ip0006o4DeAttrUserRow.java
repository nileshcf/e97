package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0006o4DeAttrUserRow is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip0006o4DeAttrUserRow extends Ip0006o4DeAttrUserRowSerialized { 
   

						@Getter @Setter private char[] ip0006o4DeAb = Field.fillLowValue(3);

								@Getter @Setter private int ip0006o4DeNo;

						@Getter @Setter private char[] ip0006o4DeName = Field.fillLowValue(57);

						@Getter @Setter private char[] ip0006o4DeFormat = Field.fillLowValue(3);

								@Getter @Setter private short ip0006o4DeMinLngth;

								@Getter @Setter private short ip0006o4DeMcMaxLngth;

								@Getter @Setter private short ip0006o4DeIsoMaxLngth;

								@Getter @Setter private short ip0006o4DeLllSize;

								@Getter @Setter private short ip0006o4DeSubflds;

								@Getter @Setter private int ip0006o4DeFirstSubfld;

						@Getter @Setter private char[] ip0006o4DeFirstSubfldRedefined = Field.fillLowValue(4);
	
	/**
	* Constructor for Ip0006o4DeAttrUserRow
	**/
    public Ip0006o4DeAttrUserRow() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip0006o4DeAttrUserRow. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0006o4DeAttrUserRow(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip0006o4DeAttrUserRow
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp0006o4DeAb(CONSTANTS.SPACE_3);
                     setIp0006o4DeNo(0);
         setIp0006o4DeName(CONSTANTS.SPACE_57);
         setIp0006o4DeFormat(CONSTANTS.SPACE_3);
         	setIp0006o4DeMinLngth((short)0);
         	setIp0006o4DeMcMaxLngth((short)0);
         	setIp0006o4DeIsoMaxLngth((short)0);
         	setIp0006o4DeLllSize((short)0);
         	setIp0006o4DeSubflds((short)0);
                     setIp0006o4DeFirstSubfld(0);
   }


}
  
