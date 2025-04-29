package com.cloudframe.app.o529351u.dto;

/**
*  The class SavProviderArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SavProviderArea extends SavProviderAreaSerialized { 
   

								@Getter @Setter private long savProviderTinNumber;
				@Getter @Setter private SavProviderTinNumber15 savProviderTinNumber15 = new SavProviderTinNumber15();
	
	/**
	* Constructor for SavProviderArea
	**/
    public SavProviderArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SavProviderArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavProviderArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSavProviderTinNumber15().setParent(this,getStartOffset() + 0);
    } 



}
  
