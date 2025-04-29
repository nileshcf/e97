package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FIssSurchrgRvPos is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class X360FIssSurchrgRvPos extends X360FIssSurchrgRvPosSerialized { 
   

								@Getter @Setter private int x360FIssSurchrgRvCntCrP;

								@Getter @Setter private int x360FIssSurchrgRvCntDbP;

								@Getter @Setter private BigDecimal x360FIssSurchrgRvAmtCrP = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal x360FIssSurchrgRvAmtDbP = BigDecimal.ZERO;
	
	/**
	* Constructor for X360FIssSurchrgRvPos
	**/
    public X360FIssSurchrgRvPos() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360FIssSurchrgRvPos. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FIssSurchrgRvPos(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
