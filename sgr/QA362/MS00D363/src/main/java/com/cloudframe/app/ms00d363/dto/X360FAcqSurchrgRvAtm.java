package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FAcqSurchrgRvAtm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class X360FAcqSurchrgRvAtm extends X360FAcqSurchrgRvAtmSerialized { 
   

								@Getter @Setter private int x360FAcqSurchrgRvCntCrA;

								@Getter @Setter private int x360FAcqSurchrgRvCntDbA;

								@Getter @Setter private BigDecimal x360FAcqSurchrgRvAmtCrA = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal x360FAcqSurchrgRvAmtDbA = BigDecimal.ZERO;
	
	/**
	* Constructor for X360FAcqSurchrgRvAtm
	**/
    public X360FAcqSurchrgRvAtm() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360FAcqSurchrgRvAtm. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FAcqSurchrgRvAtm(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
