package com.cloudframe.app.ip989010.dto;

/**
*  The class ElementsTable5001644697 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class ElementsTable5001644697 extends ElementsTable5001644697Serialized {
   
			@Getter @Setter private List<TblEntry5001644697> tblEntry5001644697 = new ArrayList<>();
    	
	
	/**
	* Constructor for ElementsTable5001644697
	**/
    public ElementsTable5001644697() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < TBL_ENTRY_5001644697_SIZE;arrayIndex++) {
						getTblEntry5001644697().add(new TblEntry5001644697(this, beginTblEntry5001644697 + 
						arrayIndex * TblEntry5001644697.getTblEntry5001644697FieldLength()));
				}
	   	/*  end of offset */
    }





}
  
