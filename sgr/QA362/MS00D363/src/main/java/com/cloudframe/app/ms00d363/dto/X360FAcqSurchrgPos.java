package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FAcqSurchrgPos is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class X360FAcqSurchrgPos extends X360FAcqSurchrgPosSerialized { 
   

								@Getter @Setter private int x360FAcqSurchrgCntCrP;

								@Getter @Setter private int x360FAcqSurchrgCntDbP;

								@Getter @Setter private BigDecimal x360FAcqSurchrgAmtCrP = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal x360FAcqSurchrgAmtDbP = BigDecimal.ZERO;
	
	/**
	* Constructor for X360FAcqSurchrgPos
	**/
    public X360FAcqSurchrgPos() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360FAcqSurchrgPos. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FAcqSurchrgPos(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
