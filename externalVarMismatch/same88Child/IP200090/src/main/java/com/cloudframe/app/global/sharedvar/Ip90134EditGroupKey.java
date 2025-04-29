package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip90134EditGroupKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip90134EditGroupKey extends Ip90134EditGroupKeySerialized { 
   

						@Getter @Setter private char[] ip90134EditGroup = Field.fillLowValue(1);

						@Getter @Setter private char[] ip90134AccBrand = Field.fillLowValue(3);

								@Getter @Setter private int ip90134ElementType;

								@Getter @Setter private int ip90134ElementNum;

								@Getter @Setter private int ip90134ElementSubNum;

								@Getter @Setter private int ip90134EditNumber;
	
	/**
	* Constructor for Ip90134EditGroupKey
	**/
    public Ip90134EditGroupKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip90134EditGroupKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip90134EditGroupKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip90134EditGroupKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp90134EditGroup(CONSTANTS.SPACE);
         setIp90134AccBrand(CONSTANTS.SPACE_3);
                     setIp90134ElementType(0);
                     setIp90134ElementNum(0);
                     setIp90134ElementSubNum(0);
                     setIp90134EditNumber(0);
   }


}
  
