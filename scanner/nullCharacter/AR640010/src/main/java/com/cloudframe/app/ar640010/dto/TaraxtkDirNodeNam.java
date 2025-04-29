package com.cloudframe.app.ar640010.dto;

/**
*  The class TaraxtkDirNodeNam is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class TaraxtkDirNodeNam extends TaraxtkDirNodeNamSerialized { 
   

								@Getter @Setter private short taraxtkDirNodeNamLen;

						@Getter @Setter private char[] taraxtkDirNodeNamTxt = Field.fillLowValue(256);
	
	/**
	* Constructor for TaraxtkDirNodeNam
	**/
    public TaraxtkDirNodeNam() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TaraxtkDirNodeNam. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaraxtkDirNodeNam(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes TaraxtkDirNodeNam
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setTaraxtkDirNodeNamLen((short)0);
         setTaraxtkDirNodeNamTxt(CONSTANTS.SPACE_256);
   }


}
  
