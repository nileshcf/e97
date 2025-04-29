package com.cloudframe.app.comput3.dto;

/**
*  The class WcVolumeGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class WcVolumeGroup extends WcVolumeGroupSerialized { 
   
      private List<BigDecimal> wcVolumes; 

	
	/**
	* Constructor for WcVolumeGroup
	**/
    public WcVolumeGroup() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WcVolumeGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcVolumeGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
