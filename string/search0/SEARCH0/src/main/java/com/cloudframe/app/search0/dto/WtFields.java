package com.cloudframe.app.search0.dto;

/**
*  The class WtFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class WtFields extends WtFieldsSerialized {
   
			@Getter @Setter private List<WtCodeCtrl> wtCodeCtrl = new ArrayList<>();
    	
	
	/**
	* Constructor for WtFields
	**/
    public WtFields() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < WT_CODE_CTRL_SIZE;arrayIndex++) {
						getWtCodeCtrl().add(new WtCodeCtrl(this, beginWtCodeCtrl + 
						arrayIndex * WtCodeCtrl.getWtCodeCtrlFieldLength()));
				}
	   	/*  end of offset */
    }





}
  
