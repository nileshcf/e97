package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip000604DeAttrRow is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip000604DeAttrRow extends Ip000604DeAttrRowSerialized { 
   

								@Getter @Setter private int ip000604DeFirstAb;

						@Getter @Setter private char[] ip000604DeFirstAbRedefined = Field.fillLowValue(4);

						@Getter @Setter private char[] ip000604DeAb = Field.fillLowValue(3);

								@Getter @Setter private int ip000604DeNo;

						@Getter @Setter private char[] ip000604DeName = Field.fillLowValue(57);

						@Getter @Setter private char[] ip000604DeFormat = Field.fillLowValue(3);

								@Getter @Setter private short ip000604DeMinLngth;

								@Getter @Setter private short ip000604DeMcMaxLngth;

								@Getter @Setter private short ip000604DeIsoMaxLngth;

								@Getter @Setter private short ip000604DeLllSize;

								@Getter @Setter private short ip000604DeSubflds;

								@Getter @Setter private int ip000604DeFirstSubfld;

						@Getter @Setter private char[] ip000604DeFirstSubfldRedefined = Field.fillLowValue(4);
	
	/**
	* Constructor for Ip000604DeAttrRow
	**/
    public Ip000604DeAttrRow() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip000604DeAttrRow. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip000604DeAttrRow(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip000604DeAttrRow
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp000604DeFirstAb(0);
         setIp000604DeAb(CONSTANTS.SPACE_3);
                     setIp000604DeNo(0);
         setIp000604DeName(CONSTANTS.SPACE_57);
         setIp000604DeFormat(CONSTANTS.SPACE_3);
         	setIp000604DeMinLngth((short)0);
         	setIp000604DeMcMaxLngth((short)0);
         	setIp000604DeIsoMaxLngth((short)0);
         	setIp000604DeLllSize((short)0);
         	setIp000604DeSubflds((short)0);
                     setIp000604DeFirstSubfld(0);
   }


}
  
