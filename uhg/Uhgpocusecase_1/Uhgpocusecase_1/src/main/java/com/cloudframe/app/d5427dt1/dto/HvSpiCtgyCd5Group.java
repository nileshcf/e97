package com.cloudframe.app.d5427dt1.dto;

/**
*  The class HvSpiCtgyCd5Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class HvSpiCtgyCd5Group extends HvSpiCtgyCd5GroupSerialized { 
   

						@Getter @Setter private char[] hvSpiCtgyCd5 = new char[2];
	
	/**
	* Constructor for HvSpiCtgyCd5Group
	**/
    public HvSpiCtgyCd5Group() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for HvSpiCtgyCd5Group. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvSpiCtgyCd5Group(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHvSpiCtgyCd5(fillSpace(2));
    } 



}
  
