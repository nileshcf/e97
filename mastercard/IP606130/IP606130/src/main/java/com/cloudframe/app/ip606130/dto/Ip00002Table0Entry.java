package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip00002Table0Entry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip00002Table0Entry extends Ip00002Table0EntrySerialized { 
   
				@Getter @Setter private Ip00002TableIdData ip00002TableIdData = new Ip00002TableIdData();
	
	/**
	* Constructor for Ip00002Table0Entry
	**/
    public Ip00002Table0Entry() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00002Table0Entry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00002Table0Entry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp00002TableIdData().setParent(this,getStartOffset() + 19);
    } 



}
  
