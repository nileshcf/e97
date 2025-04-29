package com.cloudframe.app.db2funci.dto;

/**
*  The class HostAppCodeList is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class HostAppCodeList extends HostAppCodeListSerialized { 
   
				@Getter @Setter private HostAppCodeTbl hostAppCodeTbl = new HostAppCodeTbl();
	
	/**
	* Constructor for HostAppCodeList
	**/
    public HostAppCodeList() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for HostAppCodeList. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HostAppCodeList(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getHostAppCodeTbl().setParent(this,getStartOffset() + 0);
    } 



}
  
