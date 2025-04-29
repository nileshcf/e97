package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FIssSurchrgRvAtm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class X360FIssSurchrgRvAtm extends X360FIssSurchrgRvAtmSerialized { 
   

								@Getter @Setter private int x360FIssSurchrgRvCntCrA;

								@Getter @Setter private int x360FIssSurchrgRvCntDbA;

								@Getter @Setter private BigDecimal x360FIssSurchrgRvAmtCrA = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal x360FIssSurchrgRvAmtDbA = BigDecimal.ZERO;
	
	/**
	* Constructor for X360FIssSurchrgRvAtm
	**/
    public X360FIssSurchrgRvAtm() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360FIssSurchrgRvAtm. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FIssSurchrgRvAtm(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
