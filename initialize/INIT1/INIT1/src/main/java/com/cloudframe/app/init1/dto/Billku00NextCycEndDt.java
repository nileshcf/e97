package com.cloudframe.app.init1.dto;

/**
*  The class Billku00NextCycEndDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Billku00NextCycEndDt extends Billku00NextCycEndDtSerialized { 
   

								@Getter @Setter private int billku00NextCycEndDtMm;


								@Getter @Setter private int billku00NextCycEndDtDd;


								@Getter @Setter private int billku00NextCycEndDtYyyy;

								@Getter @Setter private int billku00Number;

								@Getter @Setter private int billku00Pointer;

								@Getter @Setter private int billku00Number1;

	
	/**
	* Constructor for Billku00NextCycEndDt
	**/
    public Billku00NextCycEndDt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Billku00NextCycEndDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Billku00NextCycEndDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Billku00NextCycEndDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBillku00NextCycEndDtMm(0);
                     setBillku00NextCycEndDtDd(0);
                     setBillku00NextCycEndDtYyyy(0);
                     setBillku00Number(0);
                     setBillku00Number1(0);
   }


}
  
