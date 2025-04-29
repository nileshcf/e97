package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0040iGrpCode is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip0040iGrpCode extends Ip0040iGrpCodeSerialized { 
   
      private List<char[]> ip0040iGrpCodeDtl; 

	
	/**
	* Constructor for Ip0040iGrpCode
	**/
    public Ip0040iGrpCode() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip0040iGrpCode. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040iGrpCode(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip0040iGrpCode
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < IP_0040I_GRP_CODE_DTL_SIZE;index++) {
             setIp0040iGrpCodeDtl(index, CONSTANTS.SPACE_2);
         }
   }


}
  
