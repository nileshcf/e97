package com.cloudframe.app.ip989010.dto;

/**
*  The class ElementsTable5001644695 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class ElementsTable5001644695 extends ElementsTable5001644695Serialized {
   
			@Getter @Setter private List<TblEntry5001644695> tblEntry5001644695 = new ArrayList<>();
    	
	
	/**
	* Constructor for ElementsTable5001644695
	**/
    public ElementsTable5001644695() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < TBL_ENTRY_5001644695_SIZE;arrayIndex++) {
						getTblEntry5001644695().add(new TblEntry5001644695(this, beginTblEntry5001644695 + 
						arrayIndex * TblEntry5001644695.getTblEntry5001644695FieldLength()));
				}
	   	/*  end of offset */
    }





}
  
