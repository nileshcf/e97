package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00404GrpCode is used to handle fields declared in it
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
public class Ip00404GrpCode extends Ip00404GrpCodeSerialized { 
   
      private List<char[]> ip00404GrpCodeDtl; 

	
	/**
	* Constructor for Ip00404GrpCode
	**/
    public Ip00404GrpCode() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00404GrpCode. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404GrpCode(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00404GrpCode
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < IP_00404_GRP_CODE_DTL_SIZE;index++) {
             setIp00404GrpCodeDtl(index, CONSTANTS.SPACE_2);
         }
   }


}
  
