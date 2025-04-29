package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdWrntsExpMmddccyy is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdWrntsExpMmddccyy extends MsdWrntsExpMmddccyySerialized { 
   

								@Getter @Setter private int msdWrntsExpMm;

								@Getter @Setter private int msdWrntsExpDd;

								@Getter @Setter private int msdWrntsExpCc;

								@Getter @Setter private int msdWrntsExpYy;
	
	/**
	* Constructor for MsdWrntsExpMmddccyy
	**/
    public MsdWrntsExpMmddccyy() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdWrntsExpMmddccyy. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdWrntsExpMmddccyy(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdWrntsExpMmddccyy
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdWrntsExpMm(0);
                     setMsdWrntsExpDd(0);
                     setMsdWrntsExpCc(0);
                     setMsdWrntsExpYy(0);
   }


}
  
