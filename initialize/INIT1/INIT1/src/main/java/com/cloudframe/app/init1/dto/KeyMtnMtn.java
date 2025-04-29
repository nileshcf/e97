package com.cloudframe.app.init1.dto;

/**
*  The class KeyMtnMtn is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class KeyMtnMtn extends KeyMtnMtnSerialized { 
   

						@Getter @Setter private char[] keyMtnNpa = new char[3];

						@Getter @Setter private char[] keyMtnNxx = new char[3];

						@Getter @Setter private char[] keyMtnTln = new char[4];
	
	/**
	* Constructor for KeyMtnMtn
	**/
    public KeyMtnMtn() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for KeyMtnMtn. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyMtnMtn(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setKeyMtnNpa(fillSpace(3));
								setKeyMtnNxx(fillSpace(3));
								setKeyMtnTln(fillSpace(4));
    } 

	/**
	 * 	initializes KeyMtnMtn
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setKeyMtnNpa(CONSTANTS.SPACE_3);
         setKeyMtnNxx(CONSTANTS.SPACE_3);
         setKeyMtnTln(CONSTANTS.SPACE_4);
   }


}
  
