package com.cloudframe.app.search3.dto;

/**
*  The class AccGrp500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class AccGrp500 extends AccGrp500Serialized {
   
			@Getter @Setter private List<AccFinTbl500> accFinTbl500 = new ArrayList<>();
    	
	
	/**
	* Constructor for AccGrp500
	**/
    public AccGrp500() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < ACC_FIN_TBL_500_SIZE;arrayIndex++) {
						getAccFinTbl500().add(new AccFinTbl500(this, beginAccFinTbl500 + 
						arrayIndex * AccFinTbl500.getAccFinTbl500FieldLength()));
				}
	   	/*  end of offset */
    }





}
  
