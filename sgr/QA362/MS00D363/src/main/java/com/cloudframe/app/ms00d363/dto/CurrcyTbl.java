package com.cloudframe.app.ms00d363.dto;

/**
*  The class CurrcyTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class CurrcyTbl extends CurrcyTblSerialized {
   
			@Getter @Setter private List<CurcyTable2> curcyTable2 = new ArrayList<>();
    	
	
	/**
	* Constructor for CurrcyTbl
	**/
    public CurrcyTbl() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < CURCY_TABLE_2_SIZE;arrayIndex++) {
						getCurcyTable2().add(new CurcyTable2(this, beginCurcyTable2 + 
						arrayIndex * CurcyTable2.getCurcyTable2FieldLength()));
				}
	   	/*  end of offset */
    }





}
  
