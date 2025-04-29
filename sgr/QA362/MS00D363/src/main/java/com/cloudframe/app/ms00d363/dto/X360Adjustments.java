package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360Adjustments is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class X360Adjustments extends X360AdjustmentsSerialized { 
   
				@Getter @Setter private X360ASurchrgFields x360ASurchrgFields = new X360ASurchrgFields();
				@Getter @Setter private X360AMcsMdsBase x360AMcsMdsBase = new X360AMcsMdsBase();
				@Getter @Setter private X360AMcsAcqSetl x360AMcsAcqSetl = new X360AMcsAcqSetl();
				@Getter @Setter private X360AMcsIssSetl x360AMcsIssSetl = new X360AMcsIssSetl();
	
	/**
	* Constructor for X360Adjustments
	**/
    public X360Adjustments() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360Adjustments. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360Adjustments(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getX360ASurchrgFields().setParent(this,getStartOffset() + 0);
					getX360AMcsMdsBase().setParent(this,getStartOffset() + 5);
					getX360AMcsAcqSetl().setParent(this,getStartOffset() + 148);
					getX360AMcsIssSetl().setParent(this,getStartOffset() + 148);
    } 



}
  
