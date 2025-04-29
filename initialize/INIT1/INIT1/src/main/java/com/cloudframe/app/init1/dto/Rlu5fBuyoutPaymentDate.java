package com.cloudframe.app.init1.dto;

/**
*  The class Rlu5fBuyoutPaymentDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Rlu5fBuyoutPaymentDate extends Rlu5fBuyoutPaymentDateSerialized { 
   

								@Getter @Setter private int rlu5fBuyoutOnDateMm;

								@Getter @Setter private int rlu5fBuyoutOnDateDd;

								@Getter @Setter private int rlu5fBuyoutOnDateCc;

								@Getter @Setter private int rlu5fBuyoutOnDateYy;
	
	/**
	* Constructor for Rlu5fBuyoutPaymentDate
	**/
    public Rlu5fBuyoutPaymentDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Rlu5fBuyoutPaymentDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fBuyoutPaymentDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Rlu5fBuyoutPaymentDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setRlu5fBuyoutOnDateMm(0);
                     setRlu5fBuyoutOnDateDd(0);
                     setRlu5fBuyoutOnDateCc(0);
                     setRlu5fBuyoutOnDateYy(0);
   }


}
  
