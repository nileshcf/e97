package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FIssSurchrgPos is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class X360FIssSurchrgPos extends X360FIssSurchrgPosSerialized { 
   

								@Getter @Setter private int x360FIssSurchrgCntCrP;

								@Getter @Setter private int x360FIssSurchrgCntDbP;

								@Getter @Setter private BigDecimal x360FIssSurchrgAmtCrP = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal x360FIssSurchrgAmtDbP = BigDecimal.ZERO;
	
	/**
	* Constructor for X360FIssSurchrgPos
	**/
    public X360FIssSurchrgPos() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360FIssSurchrgPos. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FIssSurchrgPos(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
