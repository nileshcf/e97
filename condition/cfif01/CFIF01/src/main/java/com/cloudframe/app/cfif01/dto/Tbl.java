package com.cloudframe.app.cfif01.dto;

/**
*  The class Tbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Tbl extends TblSerialized { 
   

						@Getter @Setter private char[] charA = new char[1];

								@Getter @Setter private int intA;

						@Getter @Setter private char[] char2A = new char[5];
	
	/**
	* Constructor for Tbl
	**/
    public Tbl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Tbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Tbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCharA(fillSpace(1));
								setIntA(0);
								setChar2A(fillSpace(5));
    } 

	/**
	 * 	initializes Tbl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCharA(CONSTANTS.SPACE);
                     setIntA(0);
         setChar2A(CONSTANTS.SPACE_5);
   }


}
  
