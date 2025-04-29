package com.cloudframe.app.ip989010.dto;

/**
*  The class ElementsTable5001240200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class ElementsTable5001240200 extends ElementsTable5001240200Serialized {
   
			@Getter @Setter private List<TblEntry5001240200> tblEntry5001240200 = new ArrayList<>();
    	
	
	/**
	* Constructor for ElementsTable5001240200
	**/
    public ElementsTable5001240200() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < TBL_ENTRY_5001240200_SIZE;arrayIndex++) {
						getTblEntry5001240200().add(new TblEntry5001240200(this, beginTblEntry5001240200 + 
						arrayIndex * TblEntry5001240200.getTblEntry5001240200FieldLength()));
				}
	   	/*  end of offset */
    }





}
  
