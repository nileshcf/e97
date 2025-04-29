package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360AIssA09DeniedCnt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class X360AIssA09DeniedCnt extends X360AIssA09DeniedCntSerialized { 
   

								@Getter @Setter private int x360AIssA09DeniedCntCr;

								@Getter @Setter private int x360AIssA09DeniedCntDb;
	
	/**
	* Constructor for X360AIssA09DeniedCnt
	**/
    public X360AIssA09DeniedCnt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360AIssA09DeniedCnt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360AIssA09DeniedCnt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
