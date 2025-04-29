package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip90354TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip90354TableData extends Ip90354TableDataSerialized { 
   
				@Getter @Setter private Ip90354TableDataKey ip90354TableDataKey = new Ip90354TableDataKey();
	
	/**
	* Constructor for Ip90354TableData
	**/
    public Ip90354TableData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip90354TableData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip90354TableData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp90354TableDataKey().setParent(this,getStartOffset() + 0);
    } 



}
  
