package com.cloudframe.app.o529351u.dto;

/**
*  The class SaveRecType4Fixed is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SaveRecType4Fixed extends SaveRecType4FixedSerialized { 
   
				@Getter @Setter private SavProviderInfo savProviderInfo = new SavProviderInfo();
				@Getter @Setter private SavHcdsInfo savHcdsInfo = new SavHcdsInfo();
				@Getter @Setter private SavMcdsInfo savMcdsInfo = new SavMcdsInfo();
	
	/**
	* Constructor for SaveRecType4Fixed
	**/
    public SaveRecType4Fixed() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SaveRecType4Fixed. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SaveRecType4Fixed(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSavProviderInfo().setParent(this,getStartOffset() + 58);
					getSavHcdsInfo().setParent(this,getStartOffset() + 589);
					getSavMcdsInfo().setParent(this,getStartOffset() + 589);
    } 



}
  
