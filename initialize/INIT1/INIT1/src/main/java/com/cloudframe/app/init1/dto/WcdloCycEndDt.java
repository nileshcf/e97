package com.cloudframe.app.init1.dto;

/**
*  The class WcdloCycEndDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WcdloCycEndDt extends WcdloCycEndDtSerialized { 
   

								@Getter @Setter private int wcdloCycEndDtMm;


								@Getter @Setter private int wcdloCycEndDtDd;


								@Getter @Setter private int wcdloCycEndDtYyyy;
	
	/**
	* Constructor for WcdloCycEndDt
	**/
    public WcdloCycEndDt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WcdloCycEndDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloCycEndDt(Field parent,int begin) {
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
	 * 	initializes WcdloCycEndDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWcdloCycEndDtMm(0);
                     setWcdloCycEndDtDd(0);
                     setWcdloCycEndDtYyyy(0);
   }


}
  
