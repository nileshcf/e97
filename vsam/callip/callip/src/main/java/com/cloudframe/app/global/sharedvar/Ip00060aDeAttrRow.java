package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00060aDeAttrRow is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip00060aDeAttrRow extends Ip00060aDeAttrRowSerialized { 
   

						@Getter @Setter private char[] ip00060aDeAb = Field.fillLowValue(3);

								@Getter @Setter private int ip00060aDeNo;

						@Getter @Setter private char[] ip00060aDeName = Field.fillLowValue(57);

						@Getter @Setter private char[] ip00060aDeFormat = Field.fillLowValue(3);

								@Getter @Setter private short ip00060aDeMinLngth;

								@Getter @Setter private short ip00060aDeMcMaxLngth;

								@Getter @Setter private short ip00060aDeIsoMaxLngth;

								@Getter @Setter private short ip00060aDeLllSize;

								@Getter @Setter private short ip00060aDeSubflds;

								@Getter @Setter private int ip00060aDeFirstSubfld;

						@Getter @Setter private char[] ip00060aDeFirstSubfldRedefined = Field.fillLowValue(4);
	
	/**
	* Constructor for Ip00060aDeAttrRow
	**/
    public Ip00060aDeAttrRow() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00060aDeAttrRow. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00060aDeAttrRow(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00060aDeAttrRow
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00060aDeAb(CONSTANTS.SPACE_3);
                     setIp00060aDeNo(0);
         setIp00060aDeName(CONSTANTS.SPACE_57);
         setIp00060aDeFormat(CONSTANTS.SPACE_3);
         	setIp00060aDeMinLngth((short)0);
         	setIp00060aDeMcMaxLngth((short)0);
         	setIp00060aDeIsoMaxLngth((short)0);
         	setIp00060aDeLllSize((short)0);
         	setIp00060aDeSubflds((short)0);
                     setIp00060aDeFirstSubfld(0);
   }


}
  
