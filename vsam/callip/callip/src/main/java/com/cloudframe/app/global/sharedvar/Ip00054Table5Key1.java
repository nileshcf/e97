package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00054Table5Key1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip00054Table5Key1 extends Ip00054Table5Key1Serialized { 
   

						@Getter @Setter private char[] ip00054KeyTableId = Field.fillLowValue(8);

								@Getter @Setter private long ip00054KeySeqNo;
	
	/**
	* Constructor for Ip00054Table5Key1
	**/
    public Ip00054Table5Key1() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00054Table5Key1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00054Table5Key1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00054Table5Key1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00054KeyTableId(CONSTANTS.SPACE_8);
                     setIp00054KeySeqNo(0);
   }


}
  
