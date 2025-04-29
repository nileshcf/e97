package com.cloudframe.app.ip989010.dto;

/**
*  The class TblEntry5001644697 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TblEntry5001644697 extends TblEntry5001644697Serialized { 
   
				@Getter @Setter private TagKey5001644697 tagKey5001644697 = new TagKey5001644697();
				@Getter @Setter private TagData5001644697 tagData5001644697 = new TagData5001644697();
	
	/**
	* Constructor for TblEntry5001644697
	**/
    public TblEntry5001644697() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TblEntry5001644697. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TblEntry5001644697(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getTagKey5001644697().setParent(this,getStartOffset() + 0);
					getTagData5001644697().setParent(this,getStartOffset() + 13);
    } 



}
  
