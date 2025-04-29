package com.cloudframe.app.ip989010.dto;

/**
*  The class ComnElementsTable500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class ComnElementsTable500 extends ComnElementsTable500Serialized {
   
			@Getter @Setter private List<ComnTblEntry500> comnTblEntry500 = new ArrayList<>();
    	
	
	/**
	* Constructor for ComnElementsTable500
	**/
    public ComnElementsTable500() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < COMN_TBL_ENTRY_500_SIZE;arrayIndex++) {
						getComnTblEntry500().add(new ComnTblEntry500(this, beginComnTblEntry500 + 
						arrayIndex * ComnTblEntry500.getComnTblEntry500FieldLength()));
				}
	   	/*  end of offset */
    }





}
  
