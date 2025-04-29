package com.cloudframe.app.ip989010.dto;

/**
*  The class TblEntry5001240200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TblEntry5001240200 extends TblEntry5001240200Serialized { 
   
				@Getter @Setter private TagKey5001240200 tagKey5001240200 = new TagKey5001240200();
				@Getter @Setter private TagData5001240200 tagData5001240200 = new TagData5001240200();
	
	/**
	* Constructor for TblEntry5001240200
	**/
    public TblEntry5001240200() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TblEntry5001240200. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TblEntry5001240200(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getTagKey5001240200().setParent(this,getStartOffset() + 0);
					getTagData5001240200().setParent(this,getStartOffset() + 13);
    } 



}
  
