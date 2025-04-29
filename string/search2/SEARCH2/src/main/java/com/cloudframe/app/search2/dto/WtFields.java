package com.cloudframe.app.search2.dto;

/**
*  The class WtFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class WtFields extends WtFieldsSerialized {
   
			@Getter @Setter private List<CodeCtrl> codeCtrl = new ArrayList<>();
    	
	
	/**
	* Constructor for WtFields
	**/
    public WtFields() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < CODE_CTRL_SIZE;arrayIndex++) {
						getCodeCtrl().add(new CodeCtrl(this, beginCodeCtrl + 
						arrayIndex * CodeCtrl.getCodeCtrlFieldLength()));
				}
	   	/*  end of offset */
    }





}
  
