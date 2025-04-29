package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FAcqSurchrgRvPos is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class X360FAcqSurchrgRvPos extends X360FAcqSurchrgRvPosSerialized { 
   

								@Getter @Setter private int x360FAcqSurchrgRvCntCrP;

								@Getter @Setter private int x360FAcqSurchrgRvCntDbP;

								@Getter @Setter private BigDecimal x360FAcqSurchrgRvAmtCrP = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal x360FAcqSurchrgRvAmtDbP = BigDecimal.ZERO;
	
	/**
	* Constructor for X360FAcqSurchrgRvPos
	**/
    public X360FAcqSurchrgRvPos() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360FAcqSurchrgRvPos. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FAcqSurchrgRvPos(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
