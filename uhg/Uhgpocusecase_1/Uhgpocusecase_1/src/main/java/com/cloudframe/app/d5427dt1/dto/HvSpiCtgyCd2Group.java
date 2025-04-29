package com.cloudframe.app.d5427dt1.dto;

/**
*  The class HvSpiCtgyCd2Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class HvSpiCtgyCd2Group extends HvSpiCtgyCd2GroupSerialized { 
   

						@Getter @Setter private char[] hvSpiCtgyCd2 = new char[2];
	
	/**
	* Constructor for HvSpiCtgyCd2Group
	**/
    public HvSpiCtgyCd2Group() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for HvSpiCtgyCd2Group. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvSpiCtgyCd2Group(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHvSpiCtgyCd2(fillSpace(2));
    } 



}
  
