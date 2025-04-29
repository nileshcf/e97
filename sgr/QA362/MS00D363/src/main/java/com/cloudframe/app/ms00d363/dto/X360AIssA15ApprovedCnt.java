package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360AIssA15ApprovedCnt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class X360AIssA15ApprovedCnt extends X360AIssA15ApprovedCntSerialized { 
   

								@Getter @Setter private long x360AIssA15ApprovedCntCr;

								@Getter @Setter private long x360AIssA15ApprovedCntDb;
	
	/**
	* Constructor for X360AIssA15ApprovedCnt
	**/
    public X360AIssA15ApprovedCnt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360AIssA15ApprovedCnt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360AIssA15ApprovedCnt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
