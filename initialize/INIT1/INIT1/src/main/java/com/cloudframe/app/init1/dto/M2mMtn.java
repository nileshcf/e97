package com.cloudframe.app.init1.dto;

/**
*  The class M2mMtn is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class M2mMtn extends M2mMtnSerialized { 
   

						@Getter @Setter private char[] m2mMtnNpa = new char[3];

						@Getter @Setter private char[] m2mMtnNxx = new char[3];

						@Getter @Setter private char[] m2mMtnTln = new char[4];
	
	/**
	* Constructor for M2mMtn
	**/
    public M2mMtn() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for M2mMtn. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public M2mMtn(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setM2mMtnNpa(fillSpace(3));
								setM2mMtnNxx(fillSpace(3));
								setM2mMtnTln(fillSpace(4));
    } 

	/**
	 * 	initializes M2mMtn
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setM2mMtnNpa(CONSTANTS.SPACE_3);
         setM2mMtnNxx(CONSTANTS.SPACE_3);
         setM2mMtnTln(CONSTANTS.SPACE_4);
   }


}
  
