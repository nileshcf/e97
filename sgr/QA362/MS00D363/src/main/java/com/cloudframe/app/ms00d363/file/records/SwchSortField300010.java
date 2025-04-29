package com.cloudframe.app.ms00d363.file.records;

/**
*  The class SwchSortField300010 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SwchSortField300010 extends SwchSortField300010Serialized { 
   
				@Getter @Setter private SwchControlField300010 swchControlField300010 = new SwchControlField300010();

						@Getter @Setter private char[] swchDbCrInd300010 = Field.fillLowValue(1);
	
	/**
	* Constructor for SwchSortField300010
	**/
    public SwchSortField300010() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SwchSortField300010. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SwchSortField300010(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSwchControlField300010().setParent(this,getStartOffset() + 0);
    } 



}
  
