package com.cloudframe.app.casecb00.dto;

/**
*  The class Getinventory is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:45. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Getinventory extends GetinventorySerialized { 
   
				@Getter @Setter private Inventoryrequested inventoryrequested = new Inventoryrequested();
	
	/**
	* Constructor for Getinventory
	**/
    public Getinventory() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Getinventory. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Getinventory(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getInventoryrequested().setParent(this,getStartOffset() + 0);
    } 



}
  
