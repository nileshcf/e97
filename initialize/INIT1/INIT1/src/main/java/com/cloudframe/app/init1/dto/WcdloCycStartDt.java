package com.cloudframe.app.init1.dto;

/**
*  The class WcdloCycStartDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WcdloCycStartDt extends WcdloCycStartDtSerialized { 
   

								@Getter @Setter private int wcdloCycStartDtMm;


								@Getter @Setter private int wcdloCycStartDtDd;


								@Getter @Setter private int wcdloCycStartDtYyyy;
	
	/**
	* Constructor for WcdloCycStartDt
	**/
    public WcdloCycStartDt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WcdloCycStartDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloCycStartDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 2
             ,1
             );
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 5
             ,1
             );
    } 

	/**
	 * 	initializes WcdloCycStartDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWcdloCycStartDtMm(0);
                     setWcdloCycStartDtDd(0);
                     setWcdloCycStartDtYyyy(0);
   }


}
  
