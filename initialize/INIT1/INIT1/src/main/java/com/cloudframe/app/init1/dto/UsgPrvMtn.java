package com.cloudframe.app.init1.dto;

/**
*  The class UsgPrvMtn is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class UsgPrvMtn extends UsgPrvMtnSerialized { 
   

						@Getter @Setter private char[] usgPrvNpa = new char[3];

						@Getter @Setter private char[] usgPrvNxx = new char[3];

						@Getter @Setter private char[] usgPrvTln = new char[4];
	
	/**
	* Constructor for UsgPrvMtn
	**/
    public UsgPrvMtn() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for UsgPrvMtn. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public UsgPrvMtn(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setUsgPrvNpa(fillSpace(3));
								setUsgPrvNxx(fillSpace(3));
								setUsgPrvTln(fillSpace(4));
    } 

	/**
	 * 	initializes UsgPrvMtn
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setUsgPrvNpa(CONSTANTS.SPACE_3);
         setUsgPrvNxx(CONSTANTS.SPACE_3);
         setUsgPrvTln(CONSTANTS.SPACE_4);
   }


}
  
